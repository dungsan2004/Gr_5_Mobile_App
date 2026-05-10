package com.example.dungsmobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import com.example.dungsmobileapp.data.WordRepository
import com.example.dungsmobileapp.model.Word
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavType
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF8FAFC)
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {
                        composable("home") {
                            HomeScreen(
                                onWordClick = { word ->
                                    navController.navigate("detail/$word")
                                }
                            )
                        }

                        composable(
                            route = "detail/{word}",
                            arguments = listOf(navArgument("word") { type = NavType.StringType })
                        ) { backStackEntry ->
                            val wordTerm = backStackEntry.arguments?.getString("word") ?: ""

                            WordDetailScreen(
                                wordTerm = wordTerm,
                                onBack = {
                                    navController.popBackStack()
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

fun getCefrExplanation(level: String): String {
    return when (level.uppercase()) {
        "A1" -> "A1 (Beginner): Người học có thể hiểu và sử dụng các biểu đạt quen thuộc hàng ngày và các câu rất cơ bản."
        "A2" -> "A2 (Elementary): Người học có thể hiểu các câu và cấu trúc thông dụng liên quan đến các lĩnh vực quen thuộc nhất."
        "B1" -> "B1 (Intermediate): Người học có thể hiểu các ý chính khi gặp các vấn đề quen thuộc thường xuyên xuất hiện trong công việc, trường học."
        "B2" -> "B2 (Upper-Intermediate): Người học có thể hiểu các ý chính trong văn bản phức tạp về cả đề tài cụ thể lẫn trừu tượng."
        "C1" -> "C1 (Advanced): Người học có thể hiểu nhiều loại văn bản dài và khắt khe, nhận biết được hàm ý. Diễn đạt trôi chảy."
        "C2" -> "C2 (Proficiency): Người học có thể hiểu dễ dàng hầu hết mọi thứ nghe hoặc đọc. Thể hiện khả năng ngôn ngữ tự nhiên, chính xác như người bản xứ."
        else -> "Hệ thống tham chiếu ngôn ngữ chung châu Âu (CEFR) chia người học thành 6 cấp độ từ A1 (thấp nhất) đến C2 (cao nhất)."
    }
}

@Composable
fun HomeScreen(onWordClick: (String) -> Unit) {
    var showCefrDialog by remember { mutableStateOf(false) }

    val wotd = remember { WordRepository.vocabularyList.random() }

    if (showCefrDialog) {
        AlertDialog(
            onDismissRequest = { showCefrDialog = false },
            title = {
                Text("Trình độ ${wotd.cefrLevel}", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            },
            text = {
                Text(getCefrExplanation(wotd.cefrLevel), style = MaterialTheme.typography.bodyMedium)
            },
            confirmButton = { TextButton(onClick = { showCefrDialog = false }) { Text("Đã hiểu") } },
            containerColor = Color.White,
            textContentColor = Color(0xFF1E293B),
            titleContentColor = wotd.cefrColor
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text("LexisNode", style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.ExtraBold, color = Color(0xFF1E293B)))
                Text("Học thuật & Chuyên sâu", style = MaterialTheme.typography.bodySmall, color = Color.Gray)
            }
            Surface(shape = CircleShape, color = Color(0xFFE2E8F0), modifier = Modifier.size(40.dp)) {
                Icon(Icons.Default.AccountCircle, "Profile", modifier = Modifier.padding(4.dp), tint = Color(0xFF64748B))
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        var searchQuery by remember { mutableStateOf("") }
        var isEnToVi by remember { mutableStateOf(true) }

        val searchResults = remember(searchQuery, isEnToVi) {
            if (searchQuery.isBlank()) emptyList()
            else WordRepository.vocabularyList.filter {
                if (isEnToVi) {
                    it.term.contains(searchQuery, ignoreCase = true) ||
                            it.shortDefinition.contains(searchQuery, ignoreCase = true)
                } else {
                    it.vietnameseDiff.contains(searchQuery, ignoreCase = true) ||
                            it.shortDefinition.contains(searchQuery, ignoreCase = true)
                }
            }
        }

        ElevatedCard(elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp), shape = RoundedCornerShape(16.dp), modifier = Modifier.fillMaxWidth()) {
            Column {
                TextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text(if (isEnToVi) "Tìm từ vựng (EN -> VI)..." else "Tìm từ vựng (VI -> EN)...") },
                    leadingIcon = { Icon(Icons.Default.Search, null, tint = Color(0xFF3B82F6)) },
                    trailingIcon = {
                        Row(
                            modifier = Modifier
                                .clickable { isEnToVi = !isEnToVi }
                                .padding(horizontal = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = if (isEnToVi) "🇬🇧 ➔ 🇻🇳" else "🇻🇳 ➔ 🇬🇧",
                                style = TextStyle(fontSize = 16.sp)
                            )
                        }
                    },
                    colors = TextFieldDefaults.colors(focusedContainerColor = Color.White, unfocusedContainerColor = Color.White, disabledContainerColor = Color.White, focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent)
                )

                if (searchResults.isNotEmpty()) {
                    HorizontalDivider()
                    Column(modifier = Modifier.background(Color.White)) {
                        searchResults.forEach { resultWord ->
                            ListItem(
                                headlineContent = { Text(resultWord.term, fontWeight = FontWeight.Bold) },
                                supportingContent = { Text(resultWord.shortDefinition, maxLines = 1, overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis) },
                                modifier = Modifier.clickable { onWordClick(resultWord.term) }
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text("Hôm nay học gì?", modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp), style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onWordClick(wotd.term) },
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brush.linearGradient(colors = listOf(Color(0xFF1E3A8A), Color(0xFF3B82F6))))
                    .padding(20.dp)
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.Star, null, tint = Color.White, modifier = Modifier.size(16.dp))
                        Spacer(Modifier.width(4.dp))
                        Text("WORD OF THE DAY", color = Color(0xFFBFDBFE), fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                    Spacer(Modifier.height(8.dp))
                    Text(wotd.term, style = MaterialTheme.typography.headlineMedium, color = Color.White, fontWeight = FontWeight.Bold)
                    Text(wotd.pronunciation, style = MaterialTheme.typography.bodyMedium, color = Color(0xFFDBEAFE), fontStyle = FontStyle.Italic)
                    Spacer(Modifier.height(12.dp))
                    Text(wotd.shortDefinition, style = MaterialTheme.typography.bodyLarge, color = Color.White)

                    Spacer(Modifier.height(12.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            color = wotd.cefrColor,
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier.clickable { showCefrDialog = true }
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text("${wotd.cefrLevel} - ${wotd.cefrDescription}", color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.width(6.dp))
                                Icon(
                                    Icons.Default.Info,
                                    contentDescription = "CEFR Info",
                                    tint = Color.White.copy(alpha = 0.9f),
                                    modifier = Modifier.size(14.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun WordDetailScreen(
    wordTerm: String,
    onBack: () -> Unit
) {
    BackHandler(onBack = onBack)

    val wordData = remember(wordTerm) { WordRepository.getWord(wordTerm) }

    if (wordData == null) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Không tìm thấy từ '$wordTerm'", style = MaterialTheme.typography.titleMedium, color = Color.Gray)
            Button(onClick = onBack, modifier = Modifier.padding(top = 16.dp)) {
                Text("Quay lại")
            }
        }
        return
    }

    var selectedTabIndex by remember { mutableIntStateOf(0) }
    var showLevelInfo by remember { mutableStateOf(false) }
    val tabs = listOf("Nghĩa & Ví dụ", "Sắc thái", "Họ từ")

    if (showLevelInfo) {
        AlertDialog(
            onDismissRequest = { showLevelInfo = false },
            title = {
                Text("Trình độ ${wordData.cefrLevel}", fontWeight = FontWeight.Bold)
            },
            text = {
                Text(getCefrExplanation(wordData.cefrLevel), style = MaterialTheme.typography.bodyMedium)
            },
            confirmButton = {
                TextButton(onClick = { showLevelInfo = false }) { Text("Đóng") }
            },
            containerColor = Color.White,
            titleContentColor = wordData.cefrColor
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8FAFC))
            .safeDrawingPadding()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBack) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { /* TODO: Bookmark logic */ }) {
                Icon(Icons.Default.FavoriteBorder, contentDescription = "Bookmark", tint = Color.Gray)
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = wordData.term,
                style = MaterialTheme.typography.displaySmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E3A8A)
                )
            )
            Spacer(Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = wordData.pronunciation,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color(0xFF64748B),
                    fontStyle = FontStyle.Italic
                )
                Spacer(Modifier.width(12.dp))
                Icon(
                    Icons.Default.PlayArrow,
                    contentDescription = "Listen",
                    tint = Color(0xFF3B82F6),
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { }
                )
            }
            Spacer(Modifier.height(16.dp))


            Surface(
                color = wordData.cefrColor,
                shape = RoundedCornerShape(50),
                modifier = Modifier.clickable { showLevelInfo = true }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text(
                        "${wordData.cefrLevel} ${wordData.cefrDescription}",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.width(8.dp))
                    Icon(
                        Icons.Default.Info,
                        contentDescription = "Info",
                        tint = Color.White,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }

        Spacer(Modifier.height(24.dp))


        TabRow(
            selectedTabIndex = selectedTabIndex,
            containerColor = Color.Transparent,
            contentColor = Color(0xFF1E3A8A),
            indicator = { tabPositions ->
                TabRowDefaults.SecondaryIndicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                    color = Color(0xFF1E3A8A)
                )
            }
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = { Text(title, fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal) }
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            when (selectedTabIndex) {
                0 -> MeaningTabContent(wordData)
                1 -> NuanceTabContent(wordData)
                2 -> WordFamilyTabContent(wordData)
            }
        }
    }
}

@Composable
fun MeaningTabContent(word: Word) {
    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
        DetailSection(title = "Định nghĩa (English)") {
            Text(word.englishDiff, style = MaterialTheme.typography.bodyLarge)
        }
        DetailSection(title = "Nghĩa tiếng Việt") {
            Text(word.vietnameseDiff, style = MaterialTheme.typography.bodyLarge)
        }
        DetailSection(title = "Ví dụ ngữ cảnh") {
            Card(colors = CardDefaults.cardColors(containerColor = Color(0xFFEFF6FF)), modifier = Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp)) {
                    Text(text = "\"${word.term}\"", fontWeight = FontWeight.Bold, color = Color(0xFF1E3A8A))
                    Spacer(Modifier.height(4.dp))
                    Text("Ex: ${word.exampleSentence}", style = MaterialTheme.typography.bodyMedium, fontStyle = FontStyle.Italic)
                }
            }
        }
    }
}

@Composable
fun NuanceTabContent(word: Word) {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        DetailSection(title = "Sắc thái (Nuance)") {
            Text(word.nuanceInfo, style = MaterialTheme.typography.bodyLarge)
        }
        DetailSection(title = "Collocations (Kết hợp từ)") {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                word.collocations.forEach { collocation -> Text("• $collocation") }
            }
        }
    }
}

@Composable
fun WordFamilyTabContent(word: Word) {
    Column {
        DetailSection(title = "Họ từ & Liên quan") {
            if (word.relatedWords.isEmpty()) {
                Text("Không có từ liên quan nào được tìm thấy.", style = MaterialTheme.typography.bodyMedium, color = Color.Gray)
            } else {
                Text("Các từ liên quan hoặc cùng gia đình từ:", style = MaterialTheme.typography.bodyMedium)
                Spacer(Modifier.height(16.dp))
                word.relatedWords.forEach { related ->
                    ListItem(
                        headlineContent = { Text(related.word, fontWeight = FontWeight.Bold) },
                        supportingContent = { Text(related.meaning) },
                        leadingContent = { Icon(Icons.Default.Menu, contentDescription = null, tint = Color.Gray) }
                    )
                    HorizontalDivider()
                }
            }
        }
    }
}

@Composable
fun DetailSection(title: String, content: @Composable () -> Unit) {
    Column {
        Text(text = title, style = MaterialTheme.typography.titleSmall, color = Color(0xFF64748B), fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 8.dp))
        content()
    }
}
