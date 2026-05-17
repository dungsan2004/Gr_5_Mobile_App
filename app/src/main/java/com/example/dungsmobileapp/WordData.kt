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
        Word(
            id = "resilience",
            term = "Resilience",
            pronunciation = "/rɪˈzɪliəns/",
            shortDefinition = "Sự kiên cường, khả năng phục hồi nhanh chóng.",
            cefrLevel = "C1",
            cefrDescription = "Advanced",
            cefrColor = Color(0xFFFF9800), // Màu cam báo hiệu cấp độ C1
            englishDiff = "The capacity to withstand or to recover quickly from difficulties.",
            vietnameseDiff = "Khả năng chống chịu khó khăn hoặc phục hồi nhanh chóng sau những biến cố (sự kiên cường, sức bật).",
            exampleSentence = "The people of this city showed remarkable resilience after the earthquake.",
            nuanceInfo = "Thường mang sắc thái rất tích cực, khen ngợi phẩm chất mạnh mẽ vươn lên từ nghịch cảnh.",
            collocations = listOf("Build resilience", "Display resilience", "Emotional resilience"),
            relatedWords = listOf(
                RelatedWord("Toughness", "Sự cứng cỏi, chịu đựng tốt"),
                RelatedWord("Flexibility", "Sự dẻo dai, linh hoạt")
            )
        ),

        Word(
            id = "ubiquitous",
            term = "Ubiquitous",
            pronunciation = "/juːˈbɪkwɪtəs/",
            shortDefinition = "Có mặt ở khắp mọi nơi.",
            cefrLevel = "C2",
            cefrDescription = "Proficiency",
            cefrColor = Color(0xFFFF4D4D), // Cấp độ C2 màu đỏ
            englishDiff = "Present, appearing, or found everywhere.",
            vietnameseDiff = "Thấy ở khắp mọi nơi, rất thịnh hành hoặc phổ biến.",
            exampleSentence = "Smartphones have become ubiquitous in daily life.",
            nuanceInfo = "Một từ mang tính học thuật cao (formal), thường xuất hiện trong các bài luận văn, IELTS, TOEFL.",
            collocations = listOf("Ubiquitous presence", "Ubiquitous computing"),
            relatedWords = listOf(
                RelatedWord("Omnipresent", "Hiện diện ở mọi nơi (thường dùng cho thánh thần/quyền lực)"),
                RelatedWord("Pervasive", "Lan tỏa khắp nơi (Đôi khi mang nghĩa tiêu cực)")
            )
        ),

        Word(
            id = "empathy",
            term = "Empathy",
            pronunciation = "/ˈempəθi/",
            shortDefinition = "Sự thấu cảm, đồng cảm.",
            cefrLevel = "B2",
            cefrDescription = "Upper-Intermediate",
            cefrColor = Color(0xFFFFC107), // Vàng cam cho cấp độ B2
            englishDiff = "The ability to understand and share the feelings of another.",
            vietnameseDiff = "Khả năng đặt mình vào vị trí của người khác để thấu hiểu và chia sẻ cảm xúc của họ.",
            exampleSentence = "Nurses must have a lot of empathy for their patients.",
            nuanceInfo = "Sâu sắc hơn 'Sympathy'. Sympathy là thương cảm, còn Empathy là hiểu thấu cảm xúc đối phương như cảm xúc của chính mình.",
            collocations = listOf("Have empathy for", "Deep empathy", "Show empathy"),
            relatedWords = listOf(
                RelatedWord("Sympathy", "Sự thông cảm (Thiên về thương hại hơn)"),
                RelatedWord("Compassion", "Lòng trắc ẩn (Muốn giúp đỡ sau khi thấu cảm)")
            )
        ),
        Word(
            id = "practice_makes_perfect",
            term = "Practice makes perfect",
            pronunciation = "/ˈpræktɪs meɪks ˈpɜːrfɪkt/",
            shortDefinition = "[Thành ngữ] Có công mài sắt, có ngày nên kim",
            cefrLevel = "A2",
            cefrDescription = "Elementary",
            cefrColor = Color(0xFF4CAF50),
            englishDiff = "Regular exercise of an activity or skill is the way to become proficient in it.",
            vietnameseDiff = "Thường xuyên luyện tập sẽ giúp bạn trở nên thành thạo trong một kỹ năng nào đó.",
            exampleSentence = "Don't worry if you can't do it now, practice makes perfect!",
            nuanceInfo = "Thành ngữ phổ biến, mang ý nghĩa khuyến khích sự kiên trì và nỗ lực trong việc học tập hoặc rèn luyện một kỹ năng nào đó.",
            collocations = listOf(),
            relatedWords = listOf(
                RelatedWord("Repetition", "Sự lặp lại (Cần thiết cho việc luyện tập)")
            ),
            isIdiom = true
        ),
        Word(
            id = "bite_the_hand_that_bites_you",
            term = "Bite the hand that bites you",
            pronunciation = "/baɪt ðə hænd ðæt baɪts juː/",
            shortDefinition = "[Thành ngữ] Ăn cháo đá bát",
            cefrLevel = "B2",
            cefrDescription = "Upper-Intermediate",
            cefrColor = Color(0xFFFFC107),
            englishDiff = "To harm someone who has helped you or is helping you.",
            vietnameseDiff = "Làm hại người đã giúp đỡ bạn hoặc đang giúp đỡ bạn (Ăn cháo đá bát).",
            exampleSentence = "He bit the hand that bites him by criticizing his boss after receiving a promotion.",
            nuanceInfo = "Thành ngữ mang sắc thái tiêu cực, thường dùng để chỉ hành động phản bội hoặc không biết ơn đối với người đã giúp đỡ mình.",
            collocations = listOf(),
            relatedWords = listOf(
                RelatedWord("Ingratitude", "Sự vô ơn (Tính cách, thái độ)"),
                RelatedWord("Betrayal", "Sự phản bội (Hành động cụ thể)"),
                RelatedWord("Backstab", "Đâm sau lưng (Hành động phản bội một cách lén lút)"),
                RelatedWord("Ungrateful", "Vô ơn (Tính cách, thái độ)"),
                RelatedWord("Turn against", "Quay lưng lại (Hành động phản bội)"),
                RelatedWord("Kick down the ladder", "Ăn cháo đá bát (Phiên bản khác)")
            ),
            isIdiom = true
        ),
        Word(
            id = "you_reap_what_you_sow",
            term = "You're reap what you sow",
            pronunciation = "/jʊər riːp wɒt juː səʊ/",
            shortDefinition = "[Thành ngữ] Gieo gió gặt bão",
            cefrLevel = "B2",
            cefrDescription = "Upper-Intermediate",
            cefrColor = Color(0xFFFFC107),
            englishDiff = "Your actions will have consequences, and you will be affected by the results of your actions.",
            vietnameseDiff = "Hành động của bạn sẽ có hậu quả, và bạn sẽ phải chịu ảnh hưởng từ kết quả của những hành động đó (Gieo gió gặt bão).",
            exampleSentence = "If you treat people badly, you'll reap what you sow.",
            nuanceInfo = "Thành ngữ mang sắc thái cảnh báo, nhấn mạnh rằng hành động xấu sẽ dẫn đến hậu quả xấu, và hành động tốt sẽ dẫn đến hậu quả tốt.",
            collocations = listOf(),
            relatedWords = listOf(
                RelatedWord("Karma", "Nghiệp báo (Khái niệm tương tự trong triết học và tôn giáo)"),
                RelatedWord("Cause and effect", "Nguyên nhân và kết quả (Khái niệm tương tự trong triết học và khoa học)")
            ),
            isIdiom = true
        ),
    )

    fun getWord(term: String): Word? {
        return vocabularyList.find { it.term == term }
    }
}
