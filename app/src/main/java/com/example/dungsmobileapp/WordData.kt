package com.example.dungsmobileapp.data

import com.example.dungsmobileapp.model.Word
import com.example.dungsmobileapp.model.RelatedWord
import androidx.compose.ui.graphics.Color

object WordRepository {
    val vocabularyList = listOf(
        Word(
            id = "armageddon",
            term = "Armageddon",
            pronunciation = "/ˌɑːrməˈɡedn/",
            shortDefinition = "Trận chiến cuối cùng quyết định vận mệnh thế giới.",
            cefrLevel = "C2",
            cefrDescription = "Proficiency",
            cefrColor = Color(0xFFFF4D4D),
            englishDiff = "In traditional usage: The battle of the end of time.",
            vietnameseDiff = "Trận chiến quyết định giữa thiện và ác (trong Kinh Thánh); hoặc dùng để chỉ sự hủy diệt thảm khốc.",
            exampleSentence = "Ideally, we want to solve this conflict without triggering a nuclear armageddon.",
            nuanceInfo = "Từ này mang sắc thái cực kỳ mạnh (Very Intense). Không dùng cho các rắc rối nhỏ hàng ngày.",
            collocations = listOf("Nuclear armageddon", "Economic armageddon", "The road to armageddon"),
            relatedWords = listOf(
                RelatedWord("Apocalypse", "Sự tận thế (Thường dùng rộng rãi hơn)"),
                RelatedWord("Cataclysm", "Biến động lớn, thảm họa (Địa chất/Xã hội)")
            )
        ),

        Word(
            id = "serendipity",
            term = "Serendipity",
            pronunciation = "/ˌserənˈdɪpəti/",
            shortDefinition = "Sự tình cờ tìm thấy những điều thú vị hoặc may mắn.",
            cefrLevel = "C1",
            cefrDescription = "Advanced",
            cefrColor = Color(0xFFFF9800),
            englishDiff = "The occurrence and development of events by chance in a happy or beneficial way.",
            vietnameseDiff = "Sự may mắn tình cờ, duyên may.",
            exampleSentence = "Meeting her there was pure serendipity.",
            nuanceInfo = "Mang sắc thái tích cực, lãng mạn nhẹ nhàng.",
            collocations = listOf("A stroke of serendipity", "Pure serendipity"),
            relatedWords = listOf(
                RelatedWord("Fluke", "Sự may ăn rùa (Tự nhiên mà có)"),
                RelatedWord("Fate", "Định mệnh")
            )
        ),

        Word(
            id = "like",
            term = "Like",
            pronunciation = "/laɪk/",
            shortDefinition = "Giống như, thích",
            cefrLevel = "A1",
            cefrDescription = "Beginner",
            cefrColor = Color(0xFF4CAF50),
            englishDiff = "Used to indicate similarity or preference.",
            vietnameseDiff = "Dùng để chỉ sự giống nhau hoặc sở thích.",
            exampleSentence = "I like chocolate.",
            nuanceInfo = "Rất phổ biến, mang sắc thái thân thiện, không trang trọng.",
            collocations = listOf("Like a boss", "Like a pro", "Like an idiot"),
            relatedWords = listOf(
                RelatedWord("Love", "Yêu thích hơn"),
                RelatedWord("Enjoy", "Thích nhưng trang trọng hơn")
            )
        ),

        Word(
            id = "miracle",
            term = "Miracle",
            pronunciation = "/ˈmɪrəkəl/",
            shortDefinition = "Điều kỳ diệu, phép màu",
            cefrLevel = "B2",
            cefrDescription = "Upper-Intermediate",
            cefrColor = Color(0xFFFFC107),
            englishDiff = "An extraordinary event that is not explicable by natural or scientific laws.",
            vietnameseDiff = "Điều kỳ diệu, phép màu không thể giải thích bằng khoa học hoặc tự nhiên.",
            exampleSentence = "It was a miracle that he survived the accident.",
            nuanceInfo = "Mang sắc thái thần kỳ, thường dùng trong ngữ cảnh tôn giáo hoặc những sự kiện phi thường.",
            collocations = listOf("Work a miracle", "Perform a miracle", "A miracle happens"),
            relatedWords = listOf(
                RelatedWord("Wonder", "Điều kỳ diệu nhưng có thể giải thích được"),
                RelatedWord("Phenomenon", "Hiện tượng đặc biệt, không nhất thiết phải là kỳ diệu")
            )
        ),

         Word(
            id = "dilemma",
            term = "Dilemma",
            pronunciation = "/dɪˈlɛmə/",
            shortDefinition = "Tình huống khó xử, tiến thoái lưỡng nan",
            cefrLevel = "B1",
            cefrDescription = "Intermediate",
            cefrColor = Color(0xFF009688),
            englishDiff = "A situation in which a difficult choice has to be made between two or more alternatives.",
            vietnameseDiff = "Tình huống khó xử, phải lựa chọn giữa hai hoặc nhiều phương án khó khăn.",
            exampleSentence = "She faced a dilemma when offered two great job opportunities at the same time.",
            nuanceInfo = "Mang sắc thái khó xử, thường dùng khi cả hai lựa chọn đều có ưu và nhược điểm rõ ràng.",
            collocations = listOf("Moral dilemma", "Ethical dilemma", "A dilemma arises"),
            relatedWords = listOf(
                RelatedWord("Predicament", "Tình huống khó khăn nhưng không nhất thiết phải là lựa chọn"),
                RelatedWord("Quandary", "Tình trạng bối rối, không biết phải làm gì")
            )
        ),

        Word(
            id = "erudition",
            term = "Erudition",
            pronunciation = "/ˌɛrʊˈdɪʃən/",
            shortDefinition = "Sự uyên bác, học rộng",
            cefrLevel = "C2",
            cefrDescription = "Proficiency",
            cefrColor = Color(0xFFFF4D4D),
            englishDiff = "The quality of having or showing great knowledge or learning.",
            vietnameseDiff = "Sự uyên bác, sự học rộng, thường dùng để chỉ người có kiến thức sâu rộng trong một lĩnh vực nào đó.",
            exampleSentence = "His erudition in classical literature is impressive.",
            nuanceInfo = "Mang sắc thái trang trọng, thường dùng trong ngữ cảnh học thuật hoặc khi nói về người có kiến thức sâu rộng.",
            collocations = listOf("Display erudition", "Show erudition", "An erudition of knowledge"),
            relatedWords = listOf(
                RelatedWord("Scholarship", "Học bổng, nhưng cũng có thể chỉ sự uyên bác trong một lĩnh vực cụ thể"),
                RelatedWord("Knowledge", "Kiến thức chung, không nhất thiết phải sâu rộng")
            )
        ),

        Word(
            id = "disillusion",
            term = "Disillusion",
            pronunciation = "/ˌdɪsɪˈluːʒən/",
            shortDefinition = "Sự vỡ mộng, mất niềm tin",
            cefrLevel = "B2",
            cefrDescription = "Upper-Intermediate",
            cefrColor = Color(0xFF3F51B5),
            englishDiff = "A feeling of disappointment resulting from the discovery that something is not as good as one believed it to be.",
            vietnameseDiff = "Sự vỡ mộng, mất niềm tin khi nhận ra rằng điều gì đó không tốt đẹp như mình tưởng.",
            exampleSentence = "The disillusion of the public with the government led to protests.",
            nuanceInfo = "Mang sắc thái tiêu cực, thường dùng khi nói về sự thất vọng sâu sắc hoặc mất niềm tin vào một người, tổ chức hoặc ý tưởng nào đó.",
            collocations = listOf("Public disillusion", "Political disillusion", "A sense of disillusion"),
            relatedWords = listOf(
                RelatedWord("Disappointment", "Sự thất vọng, nhưng có thể nhẹ hơn disillusion"),
                RelatedWord("Cynicism", "Sự hoài nghi, thường đi kèm với mất niềm tin vào động cơ của người khác")
            )
        ),

        Word(
            id = "adaptability",
            term = "Adaptability",
            pronunciation = "/əˌdæptəˈbɪləti/",
            shortDefinition = "Khả năng thích nghi",
            cefrLevel = "B1",
            cefrDescription = "Intermediate",
            cefrColor = Color(0xFF009688),
            englishDiff = "The ability to adjust to new conditions or environments.",
            vietnameseDiff = "Khả năng thích nghi với những điều kiện hoặc môi trường mới.",
            exampleSentence = "Adaptability is a key skill in today's rapidly changing world.",
            nuanceInfo = "Mang sắc thái tích cực, thường dùng để khen ngợi khả năng linh hoạt và sẵn sàng thay đổi của một người trong nhiều tình huống khác nhau.",
            collocations = listOf("Show adaptability", "Demonstrate adaptability", "Adaptability in the workplace"),
            relatedWords = listOf(RelatedWord("Flexibility", "Sự linh hoạt, có thể thay đổi dễ dàng nhưng không nhất thiết phải là sự thích nghi với môi trường mới")
            )
        ),
    )

    fun getWord(term: String): Word? {
        return vocabularyList.find { it.term == term }
    }
}
