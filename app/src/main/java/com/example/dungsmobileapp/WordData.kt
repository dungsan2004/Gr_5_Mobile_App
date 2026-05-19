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
        id = "altruism",
        term = "Altruism",
        pronunciation = "/ˈæltruɪzəm/",
        shortDefinition = "Lòng vị tha, chủ nghĩa vị tha.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The belief in or practice of disinterested and selfless concern for the well-being of others.",
        vietnameseDiff = "Sự quan tâm vô tư, không ích kỷ đến hạnh phúc và lợi ích của người khác.",
        exampleSentence = "Many choose to work in charity out of pure altruism.",
        nuanceInfo = "Ngược lại hoàn toàn với 'Egoism' (Chủ nghĩa vị kỷ). Altruism là hành động giúp đỡ người khác mà hoàn toàn không mưu cầu lợi ích hay danh tiếng cho bản thân.",
        collocations = listOf("Pure altruism", "Act of altruism", "Motivated by altruism"),
        relatedWords = listOf(
            RelatedWord("Unselfishness", "Sự không ích kỷ"),
            RelatedWord("Philanthropy", "Hoạt động từ thiện (Thường gắn với quyên góp tiền bạc lớn)")
        )
    ),
    Word(
        id = "ambivalent",
        term = "Ambivalent",
        pronunciation = "/æmˈbɪvələnt/",
        shortDefinition = "Cảm xúc lẫn lộn, mâu thuẫn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Having mixed feelings or contradictory ideas about something or someone.",
        vietnameseDiff = "Trạng thái vừa thích vừa ghét, hoặc vừa muốn vừa không muốn đối với một người/sự vật tại cùng một thời điểm.",
        exampleSentence = "He has an ambivalent attitude towards his career change.",
        nuanceInfo = "Khác với 'Indifferent' (Thờ ơ, không quan tâm). Ambivalent là có quan tâm rất nhiều, nhưng năng lượng bị chia làm hai hướng đối lập nhau (vừa yêu vừa hận, vừa sợ vừa phấn khích).",
        collocations = listOf("Feel ambivalent about", "Ambivalent attitude", "Ambivalent feelings"),
        relatedWords = listOf(
            RelatedWord("Equivocal", "Mập mờ, không rõ ràng"),
            RelatedWord("Conflicted", "Bị xung đột (trong tâm trí)")
        )
    ),
    Word(
        id = "apathy",
        term = "Apathy",
        pronunciation = "/ˈæpəθi/",
        shortDefinition = "Sự lãnh đạm, thờ ơ, vô cảm.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Lack of interest, enthusiasm, or concern.",
        vietnameseDiff = "Trạng thái không có cảm xúc, không quan tâm hay hào hứng đối với những việc xung quanh (thường do trầm cảm hoặc kiệt sức).",
        exampleSentence = "Widespread apathy among students is a major concern for teachers.",
        nuanceInfo = "Nặng nề hơn 'Boredom' (Sự chán nản nhất thời). Apathy là sự nguội lạnh sâu sắc về mặt cảm xúc, mất đi động lực sống hoặc không còn màng đến thế sự.",
        collocations = listOf("Widespread apathy", "Political apathy", "Feelings of apathy"),
        relatedWords = listOf(
            RelatedWord("Indifference", "Sự dửng dưng, bất cần"),
            RelatedWord("Lethargy", "Trạng thái lờ đờ, mệt mỏi không muốn làm gì")
        )
    ),
    Word(
        id = "assertive",
        term = "Assertive",
        pronunciation = "/əˈsɜːtɪv/",
        shortDefinition = "Quả quyết, quyết đoán (tự tin nhưng tôn trọng).",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Having or showing a confident and forceful personality.",
        vietnameseDiff = "Khả năng thể hiện ý kiến và nhu cầu của bản thân một cách tự tin, rõ ràng nhưng vẫn tôn trọng người khác.",
        exampleSentence = "You need to be more assertive if you want that promotion.",
        nuanceInfo = "Đây là 'điểm vàng' nằm giữa 'Passive' (Bị động, chịu đựng) và 'Aggressive' (Hung hăng, lấn lướt). Assertive là bảo vệ quyền lợi của mình mà không làm tổn thương người khác.",
        collocations = listOf("Be assertive", "Assertive behavior", "Assertive communication"),
        relatedWords = listOf(
            RelatedWord("Confident", "Tự tin"),
            RelatedWord("Decisive", "Dứt khoát, mang tính quyết định")
        )
    ),
    Word(
        id = "astute",
        term = "Astute",
        pronunciation = "/əˈstʃuːt/",
        shortDefinition = "Sắc sảo, tinh khôn, nhạy bén.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Having or showing an ability to accurately assess situations or people and turn this to one's advantage.",
        vietnameseDiff = "Khả năng đánh giá tình huống hoặc lòng người một cách chính xác để chuyển hóa thành lợi thế cho mình.",
        exampleSentence = "An astute businessman can spot an opportunity long before others do.",
        nuanceInfo = "Khác với 'Smart' hay 'Intelligent' (Thông minh chung chung). Astute nhấn mạnh vào sự tinh quái, sắc sảo thực tế, đặc biệt là trong việc nhìn thấu hành vi con người và kinh doanh.",
        collocations = listOf("Astute businessman", "Astute observation", "Astute politician"),
        relatedWords = listOf(
            RelatedWord("Shrewd", "Khôn ngoan, sắc sảo (hơi có xu hướng thực dụng)"),
            RelatedWord("Perceptive", "Mẫn cảm, có khả năng quan sát tốt")
        )
    ),
    Word(
        id = "affable",
        term = "Affable",
        pronunciation = "/ˈæfəbl/",
        shortDefinition = "Hòa nhã, lịch sự, dễ gần.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Friendly, good-natured, or easy to talk to.",
        vietnameseDiff = "Tính cách thân thiện, cởi mở, tạo cảm giác dễ chịu và dễ bắt chuyện cho người đối diện.",
        exampleSentence = "The host was an affable man who made everyone feel welcome.",
        nuanceInfo = "Cao cấp hơn 'Friendly'. Affable thường dùng để tả những người có phong thái lịch sự, ấm áp, có khả năng xóa tan bầu không khí ngượng ngùng một cách tự nhiên.",
        collocations = listOf("Affable manner", "Affable smile", "Warm and affable"),
        relatedWords = listOf(
            RelatedWord("Amiable", "Tử tế, dễ mến"),
            RelatedWord("Approachable", "Dễ tiếp cận, dễ gần")
        )
    ),
    Word(
        id = "aloof",
        term = "Aloof",
        pronunciation = "/əˈluːf/",
        shortDefinition = "Xa cách, lạnh lùng, khép kín.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Not friendly or forthcoming; cool and distant.",
        vietnameseDiff = "Thái độ không thân thiện, cố ý giữ khoảng cách và không muốn tham gia vào chuyện của người khác.",
        exampleSentence = "He remained aloof from the passion of the political debate.",
        nuanceInfo = "Khác với 'Shy' (Nhút nhát do sợ hãi). Một người 'Aloof' là do họ chủ động chọn cách đứng tách biệt, tỏ ra thờ ơ hoặc có phần tự cao, không muốn hòa nhập.",
        collocations = listOf("Keep aloof", "Remain aloof", "Aloof attitude"),
        relatedWords = listOf(
            RelatedWord("Distant", "Xa cách về tình cảm"),
            RelatedWord("Detached", "Thờ ơ, không can hệ")
        )
    ),
    Word(
        id = "alienation",
        term = "Alienation",
        pronunciation = "/ˌeɪliəˈneɪʃn/",
        shortDefinition = "Sự cô lập, cảm giác lạc lõng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "The state or experience of being isolated from a group or an activity to which one should belong or in which one should be involved.",
        vietnameseDiff = "Trạng thái tâm lý cảm thấy mình bị bỏ rơi, không thuộc về một cộng đồng, gia đình hoặc xã hội.",
        exampleSentence = "Many immigrants experience a sense of alienation when arriving in a new country.",
        nuanceInfo = "Nặng nề hơn 'Loneliness' (Sự cô đơn nhất thời). Alienation là một khái niệm tâm lý học xã hội, chỉ sự mất kết nối sâu sắc với thế giới xung quanh, cảm thấy mình như một 'người ngoài hành tinh'.",
        collocations = listOf("Sense of alienation", "Social alienation", "Feelings of alienation"),
        relatedWords = listOf(
            RelatedWord("Isolation", "Sự cô lập (vật lý hoặc tinh thần)"),
            RelatedWord("Estrangement", "Sự rạn nứt, làm lành lùng các mối quan hệ")
        )
    ),
    Word(
        id = "anxiety",
        term = "Anxiety",
        pronunciation = "/æŋˈzaɪəti/",
        shortDefinition = "Sự lo âu, bồn chồn.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "A feeling of worry, nervousness, or unease, typically about an imminent event or something with an uncertain outcome.",
        vietnameseDiff = "Cảm giác lo lắng, sợ hãi, bồn chồn mơ hồ về một điều gì đó sắp xảy ra hoặc một kết quả chưa rõ ràng.",
        exampleSentence = "Waiting for the exam results caused her a lot of anxiety.",
        nuanceInfo = "Khác với 'Fear' (Sợ hãi một mối nguy cụ thể trước mắt). Anxiety là nỗi sợ mang tính mơ hồ, hướng về tương lai, có thể tự suy diễn ra mà không có mối nguy thực tế.",
        collocations = listOf("Acute anxiety", "Suffer from anxiety", "Reduce anxiety"),
        relatedWords = listOf(
            RelatedWord("Apprehension", "Sự e sợ, lo ngại điều xấu xảy ra"),
            RelatedWord("Unease", "Sự bất an, khó chịu trong lòng")
        )
    ),
    Word(
        id = "apprehensive",
        term = "Apprehensive",
        pronunciation = "/ˌæprɪˈhensɪv/",
        shortDefinition = "E sợ, lo lắng về tương lai.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Anxious or fearful that something bad or unpleasant will happen.",
        vietnameseDiff = "Tâm trạng lo sợ, ngần ngại vì linh cảm rằng một điều không lành hoặc khó khăn sắp sửa xảy ra.",
        exampleSentence = "The student was apprehensive about her first job interview.",
        nuanceInfo = "Khác với 'Scared' (Sợ hãi nói chung). Apprehensive nhấn mạnh vào trạng thái tinh thần đang lo nghĩ, phấp phỏng trước một sự kiện cụ thể sắp tới (như đi khám bệnh, đi phỏng vấn).",
        collocations = listOf("Feel apprehensive about", "Apprehensive smile", "Deeply apprehensive"),
        relatedWords = listOf(
            RelatedWord("Fearful", "Sợ hãi"),
            RelatedWord("Anxious", "Lo lắng")
        )
    ),
    Word(
        id = "arrogant",
        term = "Arrogant",
        pronunciation = "/ˈærəɡənt/",
        shortDefinition = "Kiêu ngạo, ngạo mạn.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Having or showing an exaggerated opinion of one's own importance or abilities.",
        vietnameseDiff = "Tính cách tự cao tự đại, luôn cho mình là nhất và có thái độ coi thường, lấn lướt người khác.",
        exampleSentence = "I found him arrogant and rude during the meeting.",
        nuanceInfo = "Ngược lại với 'Humble' (Khiêm tốn). Arrogant khác với 'Confident' (Tự tin). Tự tin là tin vào năng lực bản thân nhưng tôn trọng người khác, còn Arrogant là sự tự tin thái quá đi kèm với sự khinh miệt người xung quanh.",
        collocations = listOf("Arrogant attitude", "Arrogant behavior", "Incredibly arrogant"),
        relatedWords = listOf(
            RelatedWord("Haughty", "Kiêu kỳ, ngạo nghễ (vẻ bề ngoài)"),
            RelatedWord("Conceited", "Tự phụ, tự mãn")
        )
    ),
    Word(
        id = "avarice",
        term = "Avarice",
        pronunciation = "/ˈævərɪs/",
        shortDefinition = "Sự tham lam của cải, tiền tài.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Extreme greed for wealth or material gain.",
        vietnameseDiff = "Lòng tham lam vô độ, cực đoan đối với tiền bạc, tài sản (thường là muốn tích trữ chứ không muốn chia sẻ).",
        exampleSentence = "The corporate world is often driven by pure avarice.",
        nuanceInfo = "Mức độ nặng hơn 'Greed'. Greed có thể là tham ăn, tham quyền lực, còn Avarice ám chỉ đích xác lòng tham tiền tài, của cải đến mức bủn xỉn, ích kỷ một cách bệnh hoạn.",
        collocations = listOf("Motivated by avarice", "Pure avarice", "Human avarice"),
        relatedWords = listOf(
            RelatedWord("Greed", "Sự tham lam (chung)"),
            RelatedWord("Cupidity", "Lòng ham muốn vật chất quá độ")
        )
    ),
    Word(
        id = "audacious",
        term = "Audacious",
        pronunciation = "/ɔːˈdeɪʃəs/",
        shortDefinition = "Táo bạo, gan dạ (hoặc liều lĩnh, trơ trẽn).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Showing a willingness to take surprisingly bold risks; or showing a lack of respect.",
        vietnameseDiff = "Sẵn sàng chấp nhận những rủi ro cực lớn để làm điều chưa ai dám làm; hoặc hành vi liều lĩnh đến mức vô lễ, trơ trẽn.",
        exampleSentence = "It was an audacious plan to sneak into the enemy base.",
        nuanceInfo = "Từ này có 2 mặt nghĩa. Nghĩa tích cực: Khen ngợi một ý tưởng, kế hoạch cực kỳ táo bạo, đột phá (Bold). Nghĩa tiêu cực: Chỉ hành vi ngông cuồng, coi thường phép tắc, vô kỷ luật (Impudent).",
        collocations = listOf("Audacious plan", "Audacious move", "Audacious remark"),
        relatedWords = listOf(
            RelatedWord("Daring", "Táo bạo, liều lĩnh"),
            RelatedWord("Bold", "Dũng cảm, rõ nét")
        )
    ),
    Word(
        id = "autonomy",
        term = "Autonomy",
        pronunciation = "/ɔːˈtɒnəmi/",
        shortDefinition = "Quyền tự chủ, sự tự trị.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "The right or condition of self-government; freedom from external control or influence.",
        vietnameseDiff = "Khả năng hoặc quyền của một cá nhân (hoặc tổ chức) được tự đưa ra quyết định và kiểm soát cuộc đời mình mà không bị áp đặt.",
        exampleSentence = "Employees should be given more autonomy to do their work.",
        nuanceInfo = "Trong tâm lý học, Autonomy (Quyền tự chủ) là một trong ba nhu cầu tâm lý cơ bản của con người để có hạnh phúc. Nó cao cấp hơn 'Independence' (Sự độc lập) vì nhấn mạnh vào quyền tự quyết dựa trên ý chí tự do cá nhân.",
        collocations = listOf("Individual autonomy", "Grant autonomy", "Personal autonomy"),
        relatedWords = listOf(
            RelatedWord("Independence", "Sự độc lập, không phụ thuộc"),
            RelatedWord("Self-determination", "Sự tự quyết")
        )
    ),Word(
        id = "absurd",
        term = "Absurd",
        pronunciation = "/əbˈsɜːd/",
        shortDefinition = "Nực cười, ngớ ngẩn, phi lý.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Wildly unreasonable, illogical, or inappropriate.",
        vietnameseDiff = "Hoàn toàn phi lý, vô nghĩa hoặc không phù hợp với thực tế đến mức nực cười.",
        exampleSentence = "It is absurd to think that money can buy true happiness.",
        nuanceInfo = "Trong triết học và tâm lý học, 'Absurd' (Phi lý) chỉ sự mâu thuẫn giữa xu hướng tìm kiếm giá trị ý nghĩa của con người và sự im lặng vô định của vũ trụ. Khác với 'Silly' (Ngớ ngẩn kiểu trẻ con).",
        collocations = listOf("Absolutely absurd", "Absurd notion", "Border on the absurd"),
        relatedWords = listOf(
            RelatedWord("Ridiculous", "Lố bịch, nực cười"),
            RelatedWord("Preposterous", "Phi lý, dị hợm")
        )
    ),
    Word(
        id = "acrimonious",
        term = "Acrimonious",
        pronunciation = "/ˌækrɪˈməʊniəs/",
        shortDefinition = "Chua chát, gay gắt, thù hằn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Angry and bitter, typically in speech or a debate.",
        vietnameseDiff = "Lời nói, thái độ hoặc cuộc tranh luận diễn ra trong bầu không khí đầy giận dữ, chua chát và ác ý nhằm tổn thương nhau.",
        exampleSentence = "Their marriage ended in an acrimonious divorce.",
        nuanceInfo = "Thường dùng để mô tả các cuộc tranh chấp, ly hôn hoặc cãi vã. Từ này nhấn mạnh vào việc các bên dùng những lời lẽ đay nghiến, thù hằn làm tổn thương sâu sắc tinh thần đối phương.",
        collocations = listOf("Acrimonious dispute", "Acrimonious debate", "Acrimonious divorce"),
        relatedWords = listOf(
            RelatedWord("Bitter", "Cay đắng, phẫn uất"),
            RelatedWord("Rancorous", "Hằn học, thù dai")
        )
    ),
    Word(
        id = "adamant",
        term = "Adamant",
        pronunciation = "/ˈædəmənt/",
        shortDefinition = "Cứng rắn, kiên quyết, không lay chuyển.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Refusing to be persuaded or to change one's mind.",
        vietnameseDiff = "Trạng thái cực kỳ kiên định, giữ vững lập trường của mình và tuyệt đối không chịu khuất phục trước áp lực hay lời khuyên ngăn.",
        exampleSentence = "She was adamant that she would not sign the contract.",
        nuanceInfo = "Khác với 'Stubborn' (Bướng bỉnh, cố chấp một cách vô lý). Adamant thường mang sắc thái trung tính hoặc tích cực, chỉ một người có ý chí sắt đá, quyết tâm bảo vệ quan điểm hoặc nguyên tắc của mình.",
        collocations = listOf("Remain adamant", "Adamant opposition", "Adamant refusal"),
        relatedWords = listOf(
            RelatedWord("Inflexible", "Không linh hoạt, cứng nhắc"),
            RelatedWord("Unyielding", "Không chịu khuất phục")
        )
    ),
    Word(
        id = "adversity",
        term = "Adversity",
        pronunciation = "/ədˈvɜːsəti/",
        shortDefinition = "Nghịch cảnh, hoàn cảnh khó khăn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A difficult or unpleasant situation; hardship.",
        vietnameseDiff = "Hoàn cảnh ngặt nghèo, tai họa hoặc những trở ngại lớn thử thách ý chí sống của con người.",
        exampleSentence = "He showed great courage in the face of adversity.",
        nuanceInfo = "Từ này thường đi đôi với 'Resilience' (Sự kiên cường). Adversity không chỉ là khó khăn nhỏ (Difficulty) mà là những biến cố lớn trong đời (nghèo đói, mất mát, bệnh tật) ép con người phải vượt qua.",
        collocations = listOf("Face adversity", "Overcome adversity", "In the face of adversity"),
        relatedWords = listOf(
            RelatedWord("Hardship", "Sự gian khổ, thiếu thốn"),
            RelatedWord("Misfortune", "Vận rủi, điều không may")
        )
    ),
    Word(
        id = "advocate",
        term = "Advocate",
        pronunciation = "/ˈædvəkeɪt/",
        shortDefinition = "Biện hộ, ủng hộ nhiệt thành.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Publicly recommend or support a particular cause or policy.",
        vietnameseDiff = "Hành động công khai lên tiếng, bảo vệ hoặc thúc đẩy cho một ý tưởng, quyền lợi hay một nhóm đối tượng yếu thế.",
        exampleSentence = "The group advocates for the rights of mental health patients.",
        nuanceInfo = "Vừa là danh từ (người ủng hộ/luật sư) vừa là động từ. Khác với 'Support' (Ủng hộ chung chung), Advocate đòi hỏi hành động thực tế, lên tiếng đấu tranh mang tính hệ thống hoặc pháp lý.",
        collocations = listOf("Strongly advocate", "Advocate for rights", "Public advocate"),
        relatedWords = listOf(
            RelatedWord("Champion", "Đấu tranh cho (một lý tưởng)"),
            RelatedWord("Proponent", "Người đề xướng")
        )
    ),
    Word(
        id = "aesthetic",
        term = "Aesthetic",
        pronunciation = "/iːsˈθetɪk/",
        shortDefinition = "Có tính thẩm mỹ, gu thẩm mỹ.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Concerned with beauty or the appreciation of beauty.",
        vietnameseDiff = "Liên quan đến nhận thức về cái đẹp, nghệ thuật và sự nhạy cảm trong cách thưởng thức nghệ thuật của tâm trí.",
        exampleSentence = "The building was designed with great aesthetic appeal.",
        nuanceInfo = "Trong tâm lý học nhận thức, 'Aesthetic appreciation' là khả năng não bộ xử lý và tìm thấy niềm vui, sự thư thái từ cái đẹp. Hiện nay từ này cũng dùng như tiếng lóng để chỉ một phong cách nhìn trực quan (visual style) cá nhân.",
        collocations = listOf("Aesthetic value", "Aesthetic pleasure", "Purely aesthetic"),
        relatedWords = listOf(
            RelatedWord("Artistic", "Mang tính nghệ thuật"),
            RelatedWord("Beautiful", "Xinh đẹp")
        )
    ),
    Word(
        id = "affectionate",
        term = "Affectionate",
        pronunciation = "/əˈfekʃənət/",
        shortDefinition = "Trìu mến, giàu tình cảm.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Readily showing feelings of tenderness or love.",
        vietnameseDiff = "Thể hiện tình yêu thương, sự quan tâm ấm áp thông qua hành động, lời nói hoặc cử chỉ ôm ấp, vuốt ve.",
        exampleSentence = "He is very affectionate towards his children.",
        nuanceInfo = "Khác với 'Loving' (Yêu thương - có thể giấu kín trong lòng). Affectionate nhấn mạnh vào việc *thể hiện ra bên ngoài* (demonstrative) như nắm tay, ôm, nói lời ngọt ngào.",
        collocations = listOf("Affectionate hug", "Affectionate letter", "Warm and affectionate"),
        relatedWords = listOf(
            RelatedWord("Tender", "Dịu dàng, âu yếm"),
            RelatedWord("Demonstrative", "Hay bày tỏ tình cảm công khai")
        )
    ),
    Word(
        id = "affinity",
        term = "Affinity",
        pronunciation = "/əˈfɪnəti/",
        shortDefinition = "Sự đồng điệu, cuốn hút tự nhiên.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A spontaneous or natural liking or sympathy for someone or something.",
        vietnameseDiff = "Cảm giác gần gũi, thấu hiểu và bị cuốn hút một cách tự nhiên đối với một người, một thói quen hoặc một nền văn hóa ngay từ lần đầu tiếp xúc.",
        exampleSentence = "Humans share a natural affinity with nature.",
        nuanceInfo = "Không chỉ là thích (Like). Affinity là mối liên kết vô hình sâu sắc trong tâm hồn, giống như bạn cảm thấy mình và đối phương sinh ra là để dành cho nhau hoặc có cùng tần số năng lượng.",
        collocations = listOf("Natural affinity", "Feel an affinity", "Close affinity"),
        relatedWords = listOf(
            RelatedWord("Rapport", "Mối quan hệ hòa hợp, thấu hiểu"),
            RelatedWord("Connection", "Sự kết nối")
        )
    ),
    Word(
        id = "aggression",
        term = "Aggression",
        pronunciation = "/əˈɡreʃn/",
        shortDefinition = "Sự hung hăng, tính hiếu chiến.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Hostile or violent behavior or attitudes toward another; readiness to attack or confront.",
        vietnameseDiff = "Hành vi hoặc trạng thái tâm lý sẵn sàng tấn công, đe dọa hoặc lấn lướt người khác (bằng lời nói hoặc vũ lực).",
        exampleSentence = "The psychological roots of human aggression are complex.",
        nuanceInfo = "Trong tâm lý học, Aggression là một cơ chế phòng vệ hoặc phản ứng khi cái tôi bị đe dọa. Nó khác với 'Assertiveness' (Quả quyết) ở chỗ Aggression cố tình gây tổn thương hoặc vi phạm quyền lợi của người khác.",
        collocations = listOf("Physical aggression", "Verbal aggression", "Show aggression"),
        relatedWords = listOf(
            RelatedWord("Hostility", "Sự thù địch"),
            RelatedWord("Belligerence", "Tính hung hăng, hiếu chiến")
        )
    ),
    Word(
        id = "agile",
        term = "Agile",
        pronunciation = "/ˈædʒaɪl/",
        shortDefinition = "Nhanh nhẹn, nhạy bén (thể chất/tư duy).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Able to move quickly and easily; or able to think and understand quickly.",
        vietnameseDiff = "Khả năng vận động linh hoạt, nhanh nhẹn; hoặc khả năng tư duy nhanh chóng, ứng biến tốt trước các thay đổi.",
        exampleSentence = "An agile mind is essential for solving complex problems.",
        nuanceInfo = "Khi dùng cho tâm lý/nhận thức ('Agile mind' hoặc 'Mental agility'), từ này ca ngợi những người không bị lối mòn tư duy, có năng lực học hỏi cái mới cực nhanh và xoay chuyển chiến lược tức thì.",
        collocations = listOf("Agile mind", "Agile response", "Mentally agile"),
        relatedWords = listOf(
            RelatedWord("Nimble", "Nhanh nhẹn, tinh nhanh"),
            RelatedWord("Flexible", "Linh hoạt")
        )
    ),
    Word(
        id = "agitation",
        term = "Agitation",
        pronunciation = "/ˌædʒɪˈteɪʃn/",
        shortDefinition = "Trạng thái kích động, bồn chồn lo âu.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A state of anxiety or nervous excitement.",
        vietnameseDiff = "Trạng thái bồn chồn, đứng ngồi không yên, tâm trí rối bời vì lo lắng cực độ hoặc bị kích động mạnh.",
        exampleSentence = "She entered the room in a state of obvious agitation.",
        nuanceInfo = "Đây là biểu hiện vật lý rõ rệt của nỗi sợ hoặc tức giận (như đi đi lại lại, thở dốc, tay chân run rẩy). Khác với 'Anxiety' vốn có thể ẩn giấu kín bên trong.",
        collocations = listOf("State of agitation", "Extreme agitation", "Show agitation"),
        relatedWords = listOf(
            RelatedWord("Restlessness", "Sự thao thức, không yên"),
            RelatedWord("Turbulence", "Sự hỗn loạn, sóng gió")
        )
    ),
    Word(
        id = "agony",
        term = "Agony",
        pronunciation = "/ˈæɡəni/",
        shortDefinition = "Sự đau đớn tột cùng (thể xác/tinh thần).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Extreme physical or mental suffering.",
        vietnameseDiff = "Trạng thái phải chịu đựng sự giằng xé, đau đớn dữ dội đến mức kiệt quệ về cả thể xác lẫn tâm hồn.",
        exampleSentence = "Waiting for the medical results was sheer agony.",
        nuanceInfo = "Nặng nề hơn 'Pain' (Đau thông thường) hay 'Sadness' (Buồn). Agony là nỗi đau đớn mang tính tra tấn, bóp nghẹt, thường dùng khi đối mặt với sinh ly tử biệt hoặc tai nạn kinh hoàng.",
        collocations = listOf("Sheer agony", "In agony", "Agony of suspense"),
        relatedWords = listOf(
            RelatedWord("Anguish", "Nỗi đau khổ vò xé tâm can"),
            RelatedWord("Torment", "Sự dằn vặt, tra tấn")
        )
    ),
    Word(
        id = "altruistically",
        term = "Altruistically",
        pronunciation = "/ˌæltruˈɪstɪkli/",
        shortDefinition = "Một cách vị tha, không vị kỷ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "In a way that shows a selfless concern for the well-being of others.",
        vietnameseDiff = "Trạng từ mô tả hành động được thực hiện hoàn toàn vì lợi ích của người khác mà không nghĩ đến bản thân.",
        exampleSentence = "He altruistically risked his life to save the drowning child.",
        nuanceInfo = "Là trạng từ của 'Altruism'. Dùng để nhấn mạnh cách thức thực hiện một hành động đẹp: hoàn toàn vô tư, dũng cảm và hy sinh.",
        collocations = listOf("Act altruistically", "Live altruistically", "Behave altruistically"),
        relatedWords = listOf(
            RelatedWord("Selflessly", "Một cách quên mình"),
            RelatedWord("Generously", "Một cách rộng lượng")
        )
    ),
    Word(
        id = "ambition",
        term = "Ambition",
        pronunciation = "/æmˈbɪʃn/",
        shortDefinition = "Hoài bão, tham vọng.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "A strong desire to do or to achieve something, typically requiring determination and hard work.",
        vietnameseDiff = "Khao khát mãnh liệt muốn đạt được thành công, quyền lực, địa vị hoặc một mục tiêu lớn lao trong cuộc sống.",
        exampleSentence = "Her ambition is to become the CEO of the company.",
        nuanceInfo = "Từ này có tính hai mặt. Nghĩa tích cực: Hoài bão, động lực để tiến lên (Drive). Nghĩa tiêu cực: Lòng tham vọng quá độ, có thể bất chấp thủ đoạn để đạt mục đích.",
        collocations = listOf("Burn with ambition", "Achieve ambition", "Personal ambition"),
        relatedWords = listOf(
            RelatedWord("Aspiration", "Nguyện vọng, khát vọng thanh cao"),
            RelatedWord("Drive", "Động lực, sự quyết tâm")
        )
    ),
    Word(
        id = "amused",
        term = "Amused",
        pronunciation = "/əˈmjuːzd/",
        shortDefinition = "Thấy vui, thích thú (vì buồn cười).",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Finding something funny or entertaining.",
        vietnameseDiff = "Cảm xúc cảm thấy một sự việc, câu chuyện hoặc hành động nào đó hài hước, giải trí và làm mình muốn mỉm cười.",
        exampleSentence = "She look amused by his bad jokes.",
        nuanceInfo = "Khác với 'Happy' (Hạnh phúc chung chung) hay 'Excited' (Phấn khích). Amused kích hoạt khi có yếu tố hài hước nhẹ nhàng, khiến bạn thấy giải trí tinh thần.",
        collocations = listOf("Amused expression", "Highly amused", "Keep someone amused"),
        relatedWords = listOf(
            RelatedWord("Entertained", "Được giải trí"),
            RelatedWord("Cheerful", "Vui vẻ, hớn hở")
        )
    ),
    Word(
        id = "animosity",
        term = "Animosity",
        pronunciation = "/ˌænɪˈmɒsəti/",
        shortDefinition = "Sự oán hận, thù hằn sâu sắc.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Strong hostility or ill will.",
        vietnameseDiff = "Cảm giác căm ghét, thù hằn cá nhân sâu sắc tích tụ qua thời gian, khiến hai bên không thể nhìn mặt nhau.",
        exampleSentence = "There is no animosity between the two former business partners.",
        nuanceInfo = "Mạnh hơn 'Dislike' (Ghét). Animosity là ác cảm sâu đậm, thường bộc lộ qua hành động đối đầu trực diện hoặc ngấm ngầm phá hoại lẫn nhau.",
        collocations = listOf("Personal animosity", "Feel animosity towards", "Bitter animosity"),
        relatedWords = listOf(
            RelatedWord("Hostility", "Sự thù địch"),
            RelatedWord("Resentment", "Sự oán giận, bất mãn")
        )
    ),
    Word(
        id = "anomaly",
        term = "Anomaly",
        pronunciation = "/əˈnɒməli/",
        shortDefinition = "Sự dị thường, hiện tượng bất thường.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Something that deviates from what is standard, normal, or expected.",
        vietnameseDiff = "Một sự vật, hiện tượng hoặc hành vi tâm lý lệch chuẩn, khác biệt hoàn toàn so với số đông hoặc quy luật thông thường.",
        exampleSentence = "The psychological test result was an anomaly; he is usually very calm.",
        nuanceInfo = "Trong nghiên cứu hành vi, Anomaly là điểm dữ liệu bất thường cần được giải thích, nó không hẳn là xấu, chỉ là nó phá vỡ dự đoán thông thường.",
        collocations = listOf("Statistical anomaly", "Genetic anomaly", "Anomalous behavior"),
        relatedWords = listOf(
            RelatedWord("Abnormality", "Sự dị thường, khuyết tật"),
            RelatedWord("Irregularity", "Sự bất quy tắc")
        )
    ),
    Word(
        id = "anticipation",
        term = "Anticipation",
        pronunciation = "/ænˌtɪsɪˈpeɪʃn/",
        shortDefinition = "Sự mong đợi, phấp phỏng chờ đón.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "The action of anticipating something; expectation or prediction.",
        vietnameseDiff = "Trạng thái tâm lý háo hức, hồi hộp mong chờ một điều tốt đẹp hoặc chuẩn bị tinh thần đón nhận một sự kiện sắp diễn ra.",
        exampleSentence = "The children mumbles in anticipation of opening their gifts.",
        nuanceInfo = "Khác với 'Waiting' (Chờ đợi vô định). Anticipation đi kèm với cảm xúc (thường là tích cực, hào hứng) và có sự chuẩn bị chủ động trong tâm trí cho tương lai.",
        collocations = listOf("In anticipation of", "Sweet anticipation", "Anxious anticipation"),
        relatedWords = listOf(
            RelatedWord("Expectation", "Sự kỳ vọng"),
            RelatedWord("Forethought", "Sự tính toán trước")
        )
    ),
    Word(
        id = "appalled",
        term = "Appalled",
        pronunciation = "/əˈpɔːld/",
        shortDefinition = "Kinh hoàng, sửng sốt (vì quá tệ).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Greatly dismayed or horrified by something unpleasant.",
        vietnameseDiff = "Cảm giác bàng hoàng, bất bình và kinh hãi trước một hành vi phi đạo đức, một tin tức tồi tệ hoặc sự tàn nhẫn.",
        exampleSentence = "I was appalled by the lack of empathy shown by the staff.",
        nuanceInfo = "Khác với 'Scared' (Sợ hãi cho bản thân). Appalled là sự kết hợp giữa kinh hoàng (Shock) và ghê tởm, bất bình về mặt đạo đức (Moral disgust) trước hành vi của người khác.",
        collocations = listOf("Absolutely appalled", "Appalled at the behavior", "Look appalled"),
        relatedWords = listOf(
            RelatedWord("Horrified", "Kinh sợ, khiếp đảm"),
            RelatedWord("Dismayed", "Sửng sốt, sụp đổ tinh thần")
        )
    ),
    Word(
        id = "arousal",
        term = "Arousal",
        pronunciation = "/əˈraʊzl/",
        shortDefinition = "Sự thức tỉnh, kích thích (tâm sinh lý).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The state of being physiologically alert, awake, and attentive.",
        vietnameseDiff = "Trạng thái hệ thần kinh được kích hoạt, trở nên tỉnh táo, nhạy bén và sẵn sàng phản ứng với kích thích từ môi trường.",
        exampleSentence = "Emotional arousal can significantly affect our decision-making process.",
        nuanceInfo = "Thuật ngữ chuyên ngành tâm lý học hành vi. 'Emotional/Physiological arousal' không chỉ mang nghĩa kích thích tình dục, mà là mức độ năng lượng của não bộ (khi bạn cực kỳ phấn khích, tức giận, hay hoảng sợ, mức arousal đều tăng cao).",
        collocations = listOf("Emotional arousal", "Physiological arousal", "High level of arousal"),
        relatedWords = listOf(
            RelatedWord("Stimulation", "Sự kích thích"),
            RelatedWord("Awakening", "Sự thức tỉnh")
        )
    ),
        Word(
        id = "backlash",
        term = "Backlash",
        pronunciation = "/ˈbæklæʃ/",
        shortDefinition = "Sự phản ứng dữ dội, làn sóng phản đối.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A strong and adverse reaction by a large number of people, especially to a social or political development.",
        vietnameseDiff = "Làn sóng phản ứng, chỉ trích dữ dội từ dư luận hoặc một nhóm cộng đồng chống lại một quyết định, xu hướng hoặc hành vi sai lệch.",
        exampleSentence = "The celebrity faced a severe public backlash after making offensive remarks.",
        nuanceInfo = "Thường dùng trong bối cảnh truyền thông hoặc mạng xã hội. 'Backlash' giống như lực phản chấn, khi một cá nhân hoặc thương hiệu làm điều gì đó đi ngược lại số đông, họ sẽ hứng chịu dòng thác giận dữ dội từ công chúng.",
        collocations = listOf("Public backlash", "Severe backlash", "Face a backlash"),
        relatedWords = listOf(
            RelatedWord("Outcry", "Sự la ó, phản đối kịch liệt"),
            RelatedWord("Counteraction", "Hành động phản kháng")
        )
    ),
    Word(
        id = "beguile",
        term = "Beguile",
        pronunciation = "/bɪˈɡaɪl/",
        shortDefinition = "Mê hoặc, đánh lừa bằng sự quyến rũ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Charm or enchant someone, sometimes in a deceptive way.",
        vietnameseDiff = "Hành động dùng sự duyên dáng, lời nói ngọt ngào hoặc vẻ bề ngoài cuốn hút để làm ai đó mê muội, mất cảnh giác nhằm trục lợi hoặc thao túng.",
        exampleSentence = "She cunningly beguiled him into signing over his property.",
        nuanceInfo = "Đây là dạng động từ của 'Beguiling'. Sắc thái của từ này ám chỉ việc bạn giăng một chiếc bẫy bọc đường, khiến đối phương tự nguyện bước vào trong sự ngây ngất mà không biết mình đang bị dắt mũi.",
        collocations = listOf("Beguile someone into", "Beguiled by her beauty", "Completely beguile"),
        relatedWords = listOf(
            RelatedWord("Deceive", "Lừa dối, gian lận"),
            RelatedWord("Captivate", "Làm quyến rũ, thu hút tâm trí")
        )
    ),
    Word(
        id = "beholden",
        term = "Beholden",
        pronunciation = "/bɪˈhəʊldən/",
        shortDefinition = "Chịu ơn, mắc nợ (nghĩa bóng).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Owing thanks or having a duty to someone in return for a help or a service.",
        vietnameseDiff = "Trạng thái cảm thấy mình mang nợ, chịu ơn hoặc bị ràng buộc trách nhiệm với ai đó vì đã nhận sự giúp đỡ hoặc lợi ích từ họ.",
        exampleSentence = "As an independent creator, he didn't want to be beholden to big sponsors.",
        nuanceInfo = "Từ này mang sắc thái tâm lý khá nặng nề. Khi bạn 'beholden to someone', bạn mất đi một phần tự do hoặc sự tự chủ (Autonomy) vì lúc nào cũng phải cả nể, tìm cách trả ơn hoặc làm theo ý muốn của người đã giúp mình.",
        collocations = listOf("Beholden to no one", "Deeply beholden", "Feel beholden"),
        relatedWords = listOf(
            RelatedWord("Indebted", "Biết ơn sâu sắc / Mắc nợ"),
            RelatedWord("Obligated", "Bị bắt buộc, có bổn phận")
        )
    ),
    Word(
        id = "bellow",
        term = "Bellow",
        pronunciation = "/ˈbeləʊ/",
        shortDefinition = "Gầm lên, hét lớn (vì giận dữ/đau đớn).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Emit a deep loud roar, typically in pain or anger.",
        vietnameseDiff = "Hành động hét lên một tiếng thật to, trầm và vang dội, bộc phát từ cơn thịnh nộ lôi đình hoặc nỗi đau đớn tột cùng thể xác.",
        exampleSentence = "The angry boss bellowed at the staff for making a stupid mistake.",
        nuanceInfo = "Khác với 'Scream' (Tiếng thét chói tai, giọng cao thường do sợ hãi). Bellow là tiếng gầm có âm vực thấp, đục và đầy nội lực, thể hiện sự lấn lướt, áp đặt quyền lực hoặc cơn giận dữ hung hăng (Aggression).",
        collocations = listOf("Bellow in pain", "Bellow with rage", "Bellow out orders"),
        relatedWords = listOf(
            RelatedWord("Roar", "Gầm, rống lên"),
            RelatedWord("Shout", "La hét, nói to")
        )
    ),
    Word(
        id = "bemoan",
        term = "Bemoan",
        pronunciation = "/bɪˈməʊn/",
        shortDefinition = "Than vãn, xót thương, bất mãn.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Express discontent or sorrow over something.",
        vietnameseDiff = "Hành động bày tỏ sự tiếc nuối, xót xa hoặc liên tục phàn nàn, than vãn về một hoàn cảnh tồi tệ, một sự mất mát.",
        exampleSentence = "He spent hours bemoaning his lack of money instead of finding a job.",
        nuanceInfo = "Khác với 'Complain' (Phàn nàn thông thường để đòi quyền lợi). Bemoan mang sắc thái bất lực và chìm đắm trong cảm xúc tiêu cực, than thân trách phận hoặc nuối tiếc quá khứ vàng son một cách sầu não.",
        collocations = listOf("Bemoan one's fate", "Bemoan the lack of", "Constantly bemoan"),
        relatedWords = listOf(
            RelatedWord("Lament", "Thương tiếc, khóc than"),
            RelatedWord("Complain", "Phàn nàn, khiếu nại")
        )
    ),
    Word(
        id = "bemused",
        term = "Bemused",
        pronunciation = "/bɪˈmjuːzd/",
        shortDefinition = "Sửng sốt, ngơ ngác và hơi buồn cười.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Puzzled, confused, or bewildered.",
        vietnameseDiff = "Trạng thái tâm trí bị bối rối, ngơ ngác trước một tình huống kỳ lạ nhưng trong lòng lại cảm thấy có chút buồn cười hoặc thú vị chứ không hề hoảng sợ.",
        exampleSentence = "He turned around with a bemused expression upon hearing the weird story.",
        nuanceInfo = "Rất dễ nhầm với 'Amused' (Thấy hài hước) hoặc 'Confused' (Bối rối). Bemused là sự kết hợp của cả hai: Bạn không hiểu chuyện gì đang xảy ra, cái đầu hơi nghiêng ngơ ngác nhưng khóe miệng vẫn mỉm cười vì thấy nó khá thú vị.",
        collocations = listOf("Bemused expression", "Look bemused", "Slightly bemused"),
        relatedWords = listOf(
            RelatedWord("Puzzled", "Bị làm cho rối trí"),
            RelatedWord("Amused", "Thích thú, buồn cười")
        )
    ),
    Word(
        id = "benign",
        term = "Benign",
        pronunciation = "/bɪˈnaɪn/",
        shortDefinition = "Lành tính, nhân từ, không gây hại.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Gentle and kindly; or not harmful in effect.",
        vietnameseDiff = "Tính chất dịu dàng, tử tế (đối với con người) hoặc lành tính, an toàn và hoàn toàn không gây ra mối đe dọa nào (đối với môi trường/bệnh tật).",
        exampleSentence = "The old man had a benign smile that put everyone at ease.",
        nuanceInfo = "Ngược nghĩa với 'Malign' hoặc 'Malignant' (Ác tính, độc hại). Khi dùng để tả tính cách hoặc phong thái, một người 'benign' mang lại cảm giác vô hại, ấm áp và cực kỳ bao dung, khiến người xung quanh thấy an toàn.",
        collocations = listOf("Benign tumor", "Benign smile", "Benign influence"),
        relatedWords = listOf(
            RelatedWord("Harmless", "Vô hại"),
            RelatedWord("Gentle", "Dịu dàng, ôn hòa")
        )
    ),
    Word(
        id = "berate",
        term = "Berate",
        pronunciation = "/bɪˈreɪt/",
        shortDefinition = "Mắng mỏ, sỉ vả gay gắt.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Scold or criticize someone angrily.",
        vietnameseDiff = "Hành động nổi giận và buông những lời mắng mỏ, chỉ trích nặng nề vào mặt ai đó (thường là cấp trên mắng cấp dưới, cha mẹ mắng con cái) trong một thời gian dài.",
        exampleSentence = "The coach berated the players for their lazy defense after the match.",
        nuanceInfo = "Mạnh hơn 'Scold' (Mắng thông thường) hoặc 'Criticize' (Chỉ trích). Berate mang sắc thái lấn lướt, dùng uy quyền để dội một gáo nước lạnh vào lòng tự trọng của đối phương, khiến họ cảm thấy bị hạ thấp (Belittled).",
        collocations = listOf("Berate oneself", "Berated by the teacher", "Angrily berate"),
        relatedWords = listOf(
            RelatedWord("Scold", "Quở mắng, trách phạt"),
            RelatedWord("Upbraid", "Chê trách, trì triết")
        )
    ),
    Word(
        id = "bereaved",
        term = "Bereaved",
        pronunciation = "/bɪˈriːvd/",
        shortDefinition = "Tang quyến, chịu nỗi đau mất người thân.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Deprived of a close relation or friend through their death.",
        vietnameseDiff = "Trạng thái hoặc danh từ chỉ những người đang phải gánh chịu nỗi đau buồn thắt quặn sau khi một người thân yêu ruột thịt qua đời.",
        exampleSentence = "The council provides counseling services for bereaved families.",
        nuanceInfo = "Đây là tính từ/danh từ trang trọng gắn liền với cái chết. Nỗi đau của người 'bereaved' là sự kết hợp giữa sự mất mát tột cùng (Bereft) và quá trình để tang, u sầu kéo dài về mặt tâm lý.",
        collocations = listOf("Bereaved family", "Bereaved parents", "Comfort the bereaved"),
        relatedWords = listOf(
            RelatedWord("Grieving", "Đau buồn, thương tiếc"),
            RelatedWord("Mourning", "Sự để tang, u buồn")
        )
    ),
    Word(
        id = "betrayal",
        term = "Betrayal",
        pronunciation = "/bɪˈtreɪəl/",
        shortDefinition = "Sự phản bội, sự đâm sau lưng.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "An act of breaking or violating a trust, faith, or confidence.",
        vietnameseDiff = "Hành động phá vỡ lòng tin, sự trung thành hoặc bí mật mà đối phương đã giao phó cho mình, gây ra vết thương lòng sâu sắc.",
        exampleSentence = "Lying to your best friend is a total betrayal of trust.",
        nuanceInfo = "Trong tâm lý học mối quan hệ, 'Betrayal trauma' (Tổn thương do bị phản bội) là một trong những cú sốc khó chữa lành nhất, vì nó đập tan hoàn toàn cảm giác an toàn và niềm tin vào con người của nạn nhân.",
        collocations = listOf("Betrayal of trust", "Bitter betrayal", "Feel a sense of betrayal"),
        relatedWords = listOf(
            RelatedWord("Treachery", "Sự phản bội, phản quốc"),
            RelatedWord("Infidelity", "Sự ngoại tình, không chung thủy")
        )
    ),
    Word(
        id = "bewilderment",
        term = "Bewilderment",
        pronunciation = "/bɪˈwɪldəmənt/",
        shortDefinition = "Sự hoang mang, bối rối tột cùng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A feeling of being perplexed and confused.",
        vietnameseDiff = "Danh từ chỉ trạng thái đầu óc hoàn toàn mịt mù, rối loạn và choáng váng vì không thể giải thích hay thấu hiểu chuyện gì đang xảy ra.",
        exampleSentence = "She stared at the mathematical formula in sheer bewilderment.",
        nuanceInfo = "Là dạng danh từ của 'Bewildered'. Nó lột tả một khoảnh khắc mà mọi logic thông thường của bạn bị đánh sập, khiến bạn đứng hình, mắt chữ O miệng chữ A vì quá bất ngờ hoặc rắc rối.",
        collocations = listOf("In sheer bewilderment", "Look of bewilderment", "Utter bewilderment"),
        relatedWords = listOf(
            RelatedWord("Confusion", "Sự bối rối, nhầm lẫn"),
            RelatedWord("Perplexity", "Trạng thái phức tạp, rắc rối")
        )
    ),
    Word(
        id = "bizarre",
        term = "Bizarre",
        pronunciation = "/bɪˈzɑː(r)/",
        shortDefinition = "Kỳ quái, lập dị, dị hợm.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Very strange or unusual, especially so as to cause interest or amusement.",
        vietnameseDiff = "Sự việc, hành vi hoặc phong cách cực kỳ kỳ lạ, quái dị, nằm ngoài mọi quy chuẩn thông thường khiến người ta phải chú ý hoặc kinh ngạc.",
        exampleSentence = "He has a bizarre habit of talking to his shoes every morning.",
        nuanceInfo = "Mạnh hơn 'Strange' hoặc 'Weird'. Bizarre nhấn mạnh vào sự kỳ quái đến mức lập dị, quái đản (giống như các tình tiết trong phim viễn tưởng hoặc hành vi của một kẻ lập dị), đôi khi tạo cảm giác hơi rợn người hoặc nực cười.",
        collocations = listOf("Bizarre behavior", "Bizarre situation", "Truly bizarre"),
        relatedWords = listOf(
            RelatedWord("Eccentric", "Lập dị, kỳ cục (tính cách)"),
            RelatedWord("Outlandish", "Kỳ dị, xa lạ")
        )
    ),
    Word(
        id = "blunder",
        term = "Blunder",
        pronunciation = "/ˈblʌndə(r)/",
        shortDefinition = "Sai lầm ngớ ngẩn, ngốc nghếch.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A stupid or careless mistake.",
        vietnameseDiff = "Một lỗi lầm cực kỳ ngớ ngẩn, nghiêm trọng xảy ra do sự bất cẩn, cẩu thả hoặc thiếu suy nghĩ thấu đáo.",
        exampleSentence = "Leaking the customer's private information was a fatal blunder.",
        nuanceInfo = "Khác với 'Mistake' (Lỗi sai nói chung - có thể do khách quan). Blunder hoàn toàn là do sự chủ quan, ngốc nghếch hoặc cẩu thả của người thực hiện, và hậu quả của nó thường rất ê chề hoặc tai hại.",
        collocations = listOf("Make a blunder", "Fatal blunder", "Tactical blunder"),
        relatedWords = listOf(
            RelatedWord("Gaffe", "Sự lỡ lời, hớ hênh nơi công cộng"),
            RelatedWord("Oversight", "Sự sót, quên sót do vô ý")
        )
    ),
    Word(
        id = "boggle",
        term = "Boggle",
        pronunciation = "/ˈbɒɡl/",
        shortDefinition = "Kinh ngạc, không tài nào tưởng tượng nổi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Animate or bewilder the imagination or mind; hesitate as if in fear or doubt.",
        vietnameseDiff = "Động từ chỉ trạng thái tâm trí bị quá tải, khựng lại vì một con số, một ý tưởng hoặc một sự thật quá khổng lồ, vượt xa giới hạn tư duy thông thường.",
        exampleSentence = "The vastness of the universe simply boggles the human mind.",
        nuanceInfo = "Thường dùng nhất trong cấu trúc 'boggles the mind'. Khi một điều gì đó 'boggles your mind', nó khiến các nơ-ron thần kinh của bạn như bị 'chập mạch' nhất thời vì quy mô hoặc sự kỳ vĩ của nó.",
        collocations = listOf("Boggle the mind", "Mind-boggling statistics", "Boggle at the idea"),
        relatedWords = listOf(
            RelatedWord("Astonish", "Làm kinh ngạc"),
            RelatedWord("Overwhelm", "Làm quá tải, tràn ngập")
        )
    ),
    Word(
        id = "bravado",
        term = "Bravado",
        pronunciation = "/brəˈvɑːdəʊ/",
        shortDefinition = "Sự mạnh mẽ giả tạo, hào nhoáng bề ngoài.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A bold manner or a show of boldness intended to impress or intimidate.",
        vietnameseDiff = "Thái độ tỏ ra dũng cảm, nghênh ngang hoặc bất cần đời nhằm gây ấn tượng hoặc dọa giẫm người khác, dù bên trong đang vô cùng sợ hãi hoặc tự ti.",
        exampleSentence = "His aggressive behavior was just a display of youthful bravado.",
        nuanceInfo = "Đây là một cơ chế phòng vệ tâm lý (Defense mechanism). Khác với 'Courage' (Sự dũng cảm thực sự từ cốt lõi). Bravado chỉ là cái vỏ bọc, một màn kịch gồng mình lên để che giấu sự yếu đuối bên trong.",
        collocations = listOf("Show of bravado", "Empty bravado", "False bravado"),
        relatedWords = listOf(
            RelatedWord("Swagger", "Dáng điệu vênh váo, hợm hĩnh"),
            RelatedWord("Bluff", "Sự lừa gạt, dọa dẫm suông")
        )
    ),
        Word(
        id = "badger",
        term = "Badger",
        pronunciation = "/ˈbædʒə(r)/",
        shortDefinition = "Vòi vĩnh, làm phiền liên tục.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Repeatedly and annoyingly ask someone to do something.",
        vietnameseDiff = "Hành động liên tục làm phiền, lải nhải hoặc vòi vĩnh ai đó làm một việc gì đó cho đến khi họ phát cáu hoặc phải chịu thua.",
        exampleSentence = "The kids badgered their father into buying them ice cream.",
        nuanceInfo = "Khác với 'Ask' hay 'Request'. Badger mang sắc thái đeo bám dai dẳng gây khó chịu, dùng sự kiên trì phiền phức của mình để bào mòn sự kiên nhẫn của đối phương.",
        collocations = listOf("Badger someone into", "Badger someone for", "Constantly badger"),
        relatedWords = listOf(
            RelatedWord("Pester", "Làm phiền, quấy rầy"),
            RelatedWord("Harass", "Quấy rối, làm khổ")
        )
    ),
    Word(
        id = "baffle",
        term = "Baffle",
        pronunciation = "/ˈbæfl/",
        shortDefinition = "Làm rối trí, làm bế tắc hoàn toàn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Totally bewilder or perplex someone.",
        vietnameseDiff = "Hành động làm cho tâm trí ai đó hoàn toàn bối rối, bất lực vì một điều quá bí ẩn, phức tạp hoặc không có lời giải.",
        exampleSentence = "His strange psychological behavior baffles even the best doctors.",
        nuanceInfo = "Đây là dạng động từ của tính từ 'Baffled' (đã có ở trên). Nhấn mạnh vào chủ thể gây ra sự bế tắc tư duy cho người khác.",
        collocations = listOf("Baffle description", "Completely baffle", "Baffle scientists"),
        relatedWords = listOf(
            RelatedWord("Perplex", "Làm lúng túng"),
            RelatedWord("Puzzle", "Làm khó nghĩ, thách thức trí não")
        )
    ),
    Word(
        id = "balk",
        term = "Balk",
        pronunciation = "/bɔːk/",
        shortDefinition = "Do dự, khựng lại vì ngần ngại.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Hesitate or be unwilling to accept an idea or undertaking.",
        vietnameseDiff = "Trạng thái tâm lý khựng lại đột ngột, từ chối tiến tới hoặc ngần ngại không muốn chấp nhận một kế hoạch, một cái giá vì cảm thấy bất an hoặc không hợp lý.",
        exampleSentence = "Investors balked at the high cost of the marketing project.",
        nuanceInfo = "Hình ảnh ẩn dụ từ một con ngựa đang chạy đột ngột dừng phắt lại trước chướng ngại vật. Balk lột tả sự từ chối ngầm trong tâm lý khi đối mặt với rủi ro lớn.",
        collocations = listOf("Balk at the idea", "Balk at the price", "Balk at the prospect"),
        relatedWords = listOf(
            RelatedWord("Demur", "Ngần ngại, phản đối nhẹ"),
            RelatedWord("Hesitate", "Do dự, lưỡng lự")
        )
    ),
    Word(
        id = "barmy",
        term = "Barmy",
        pronunciation = "/ˈbɑːmi/",
        shortDefinition = "Điên rồ, gàn dở (từ lóng Anh-Anh).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Mad; crazy; foolish.",
        vietnameseDiff = "Tính từ mang sắc thái suồng sã, chỉ một ý tưởng, hành vi hoặc một người trông rất điên rồ, dại dột hoặc kỳ quặc.",
        exampleSentence = "That barmy plan will only get us into big trouble.",
        nuanceInfo = "Thuộc văn hóa khẩu ngữ của người Anh (British slang). Từ này nhẹ nhàng hơn 'Insane' hay 'Mad', dùng để trêu đùa hoặc nhận xét một cách bất lực trước sự ngớ ngẩn của ai đó.",
        collocations = listOf("Barmy idea", "Drive someone barmy", "Completely barmy"),
        relatedWords = listOf(
            RelatedWord("Crazy", "Điên khùng"),
            RelatedWord("Eccentric", "Lập dị, quái gở")
        )
    ),
    Word(
        id = "barren",
        term = "Barren",
        pronunciation = "/ˈbærən/",
        shortDefinition = "Cằn cỗi, trống rỗng cảm xúc.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Bleak and lifeless; devoid of ideas or feelings.",
        vietnameseDiff = "Nghĩa bóng trong tâm lý: Trạng thái tâm hồn trống rỗng, khô cằn, hoàn toàn mất đi nguồn cảm hứng sáng tạo hoặc khả năng rung động cảm xúc.",
        exampleSentence = "After months of burnout, his mind felt completely barren.",
        nuanceInfo = "Nghĩa gốc là đất đai cằn cỗi không thể trồng trọt. Khi dùng cho tâm trí ('Barren mind'), nó lột tả sự bế tắc cực độ, không sinh ra được bất kỳ ý tưởng (ideas) hay niềm vui sống nào.",
        collocations = listOf("Barren mind", "Barren of ideas", "Barren landscape"),
        relatedWords = listOf(
            RelatedWord("Empty", "Trống rỗng"),
            RelatedWord("Unproductive", "Không có năng suất, vô sinh")
        )
    ),
    Word(
        id = "begrudge",
        term = "Begrudge",
        pronunciation = "/bɪˈɡrʌdʒ/",
        shortDefinition = "Ghen tị, tiếc rẻ, hậm hực cho đi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Envy the possession or enjoyment of something; give or allow unwillingly.",
        vietnameseDiff = "Động từ chỉ việc nhìn thành quả của người khác với lòng ghen tị, hoặc bản thân phải cho đi cái gì đó trong sự ấm ức, không cam tâm.",
        exampleSentence = "You shouldn't begrudge her success; she worked incredibly hard.",
        nuanceInfo = "Đây là dạng động từ của 'Begrudging'. Nó phản ánh một cái tôi (ego) hẹp hòi, luôn so đo thiệt hơn và cảm thấy khó chịu khi người khác hạnh phúc hơn mình.",
        collocations = listOf("Begrudge someone's success", "Begrudge spending money", "Not begrudge"),
        relatedWords = listOf(
            RelatedWord("Envy", "Ghen tị, đố kỵ"),
            RelatedWord("Resent", "Phẫn uất, oán giận")
        )
    ),
    Word(
        id = "beguiled",
        term = "Beguiled",
        pronunciation = "/bɪˈɡaɪld/",
        shortDefinition = "Bị mê hoặc, bị sa vào lưới tình/bẫy.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Charmed, enchanted, or deceived by someone or something alluring.",
        vietnameseDiff = "Trạng thái một người bị cuốn hút, làm cho mê muội đến mức mờ mắt, mất hết khả năng phòng bị trước sự quyến rũ dối trá.",
        exampleSentence = "He stood there, completely beguiled by her mysterious aura.",
        nuanceInfo = "Dạng tính từ bị động. Khi bạn 'beguiled', lý trí của bạn tạm thời ngừng hoạt động vì sự chú ý đã bị thao túng hoàn toàn bởi một thứ quá hấp dẫn.",
        collocations = listOf("Completely beguiled", "Beguiled by a promise", "Feel beguiled"),
        relatedWords = listOf(
            RelatedWord("Enchanted", "Bị bỏ bùa, mê đắm"),
            RelatedWord("Captivated", "Bị thu hút, say đắm")
        )
    ),
    Word(
        id = "belittle",
        term = "Belittle",
        pronunciation = "/bɪˈlɪtl/",
        shortDefinition = "Coi thường, hạ thấp, dìm hàng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Dismiss someone or something as unimportant.",
        vietnameseDiff = "Hành động cố tình dùng lời nói để chê bai, làm nhẹ đi giá trị hoặc hạ thấp thành quả, năng lực của người khác để chứng tỏ mình thượng đẳng.",
        exampleSentence = "A good leader should never belittle the efforts of his team.",
        nuanceInfo = "Động từ của 'Belittled'. Đây là hành vi độc hại kinh điển trong giao tiếp (Toxic behavior) nhằm tấn công trực tiếp vào lòng tự trọng của đối phương.",
        collocations = listOf("Belittle someone's achievements", "Belittle oneself", "Tend to belittle"),
        relatedWords = listOf(
            RelatedWord("Depreciate", "Làm giảm giá trị, đánh giá thấp"),
            RelatedWord("Underestimate", "Đánh giá thấp (vô ý hoặc có ý)")
        )
    ),
    Word(
        id = "belligerence",
        term = "Belligerence",
        pronunciation = "/bəˈlɪdʒərəns/",
        shortDefinition = "Tính hung hăng, sự hiếu chiến dữ dội.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Aggressive or warlike behavior.",
        vietnameseDiff = "Danh từ chỉ xu hướng tính cách lầm lì, hung dữ, lúc nào cũng muốn gây sự, thách thức và sẵn sàng xung đột bằng bạo lực.",
        exampleSentence = "His sudden outburst of belligerence shocked everyone in the room.",
        nuanceInfo = "Dạng danh từ của 'Belligerent'. Thường dùng để phân tích tâm lý của những kẻ có xu hướng chống đối xã hội hoặc mất kiểm soát hành vi do chất kích thích.",
        collocations = listOf("Show belligerence", "Inherent belligerence", "Grow in belligerence"),
        relatedWords = listOf(
            RelatedWord("Aggression", "Sự hung hăng"),
            RelatedWord("Hostility", "Sự thù địch")
        )
    ),
    Word(
        id = "benevolence",
        term = "Benevolence",
        pronunciation = "/bəˈnevələns/",
        shortDefinition = "Lòng nhân từ, sự bác ái.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "The quality of being well meaning; kindness.",
        vietnameseDiff = "Danh từ chỉ phẩm chất đạo đức cao đẹp, lòng nhân ái, bao dung và luôn hướng thiện, muốn giúp đỡ chúng sinh.",
        exampleSentence = "The old king was remembered for his benevolence and justice.",
        nuanceInfo = "Dạng danh từ của 'Benevolent'. Đây là đỉnh cao của lòng tốt, mang tầm vóc của sự bao dung, đại lượng và làm phúc trên diện rộng.",
        collocations = listOf("Act of benevolence", "Pure benevolence", "Divine benevolence"),
        relatedWords = listOf(
            RelatedWord("Altruism", "Lòng vị tha"),
            RelatedWord("Kindness", "Sự tử tế, tốt bụng")
        )
    ),
    Word(
        id = "benighted",
        term = "Benighted",
        pronunciation = "/bɪˈnaɪtɪd/",
        shortDefinition = "U muội, dốt nát, lạc hậu.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "In a state of pitiful or contemptible intellectual or moral darkness.",
        vietnameseDiff = "Trạng thái tâm trí bị mê muội, thiếu tri thức hoặc suy đồi đạo đức một cách đáng thương hại do không được giáo dục.",
        exampleSentence = "They pity the benighted citizens who are cut off from the modern world.",
        nuanceInfo = "Một từ mang tính văn chương và triết học sâu sắc. Sống trong sự 'u muội' (intellectual darkness) có nghĩa là không có khả năng tự nhận thức đúng sai do bị nhồi sọ hoặc thiếu thông tin.",
        collocations = listOf("Benighted people", "Benighted state", "Morally benighted"),
        relatedWords = listOf(
            RelatedWord("Ignorant", "Ngu dốt, không biết"),
            RelatedWord("Unenlightened", "Không được khai sáng, lạc hậu")
        )
    ),
    Word(
        id = "benignly",
        term = "Benignly",
        pronunciation = "/bɪˈnaɪnli/",
        shortDefinition = "Một cách hiền từ, nhân hậu.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "In a kind, gentle, or harmless manner.",
        vietnameseDiff = "Trạng từ mô tả hành động, cái nhìn hoặc nụ cười được thực hiện một cách ấm áp, dịu dàng và đầy lòng bao dung.",
        exampleSentence = "The grandfather smiled benignly at the playing children.",
        nuanceInfo = "Là trạng từ của 'Benign'. Thường dùng để miêu tả phong thái của các bậc bề trên, người lớn tuổi nhìn thế hệ sau với ánh mắt đầy tình thương và sự bao dung vô bờ bến.",
        collocations = listOf("Smile benignly", "Look benignly", "Treat benignly"),
        relatedWords = listOf(
            RelatedWord("Gently", "Một cách dịu dàng"),
            RelatedWord("Kindly", "Một cách tử tế")
        )
    ),
    Word(
        id = "bent",
        term = "Bent",
        pronunciation = "/bent/",
        shortDefinition = "Năng khiếu, xu hướng tự nhiên.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A natural talent or inclination.",
        vietnameseDiff = "Danh từ chỉ một xu hướng, sở thích hoặc năng khiếu bẩm sinh của tâm trí hướng về một lĩnh vực cụ thể (nghệ thuật, công nghệ).",
        exampleSentence = "She has an artistic bent and loves to spend hours painting.",
        nuanceInfo = "Thường dùng trong cấu trúc 'have a [adjective] bent'. Cao cấp hơn 'Talent', từ này chỉ ra một cái khuôn tư duy vốn dĩ đã có xu hướng phát triển mạnh về một mặt nào đó từ bé.",
        collocations = listOf("Artistic bent", "Natural bent", "Bent for learning"),
        relatedWords = listOf(
            RelatedWord("Inclination", "Khuynh hướng, sự thiên về"),
            RelatedWord("Aptitude", "Năng lực, năng khiếu")
        )
    ),
    Word(
        id = "bereavement",
        term = "Bereavement",
        pronunciation = "/bɪˈriːvmənt/",
        shortDefinition = "Nỗi đau tang tóc, sự mất người thân.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "The period of grief and mourning after a death.",
        vietnameseDiff = "Danh từ chỉ giai đoạn u sầu, đau khổ quặn thắt về mặt tâm lý sau khi phải trải qua biến cố mất đi người ruột thịt.",
        exampleSentence = "The company offers paid leave for employees facing bereavement.",
        nuanceInfo = "Đây là danh từ cốt lõi trong tâm lý học về sự mất mát. 'Bereavement counseling' là tư vấn tâm lý giúp con người vượt qua cú sốc sinh ly tử biệt để không bị trầm cảm.",
        collocations = listOf("Suffer a bereavement", "Bereavement leave", "Period of bereavement"),
        relatedWords = listOf(
            RelatedWord("Grief", "Nỗi đau lòng, u sầu"),
            RelatedWord("Mourning", "Sự đau buồn, chịu tang")
        )
    ),
    Word(
        id = "berserk",
        term = "Berserk",
        pronunciation = "/bəˈsɜːk/",
        shortDefinition = "Nổi điên, mất kiểm soát, điên cuồng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Out of control with anger or excitement; wild or frenzied.",
        vietnameseDiff = "Trạng thái một người bỗng nhiên nổi điên, mất sạch lý trí và hành động cực kỳ cuồng loạn do quá giận dữ hoặc quá phấn khích.",
        exampleSentence = "The crowd went berserk when the rock star finally on stage.",
        nuanceInfo = "Nguồn gốc từ các chiến binh Viking hung tợn (Berserkers). Khi dùng cụm 'go berserk', nó mô tả một sự bùng nổ năng lượng nguyên thủy, điên cuồng mà không một kỷ luật nào ngăn lại được.",
        collocations = listOf("Go berserk", "Drive someone berserk", "Absolutely berserk"),
        relatedWords = listOf(
            RelatedWord("Frantic", "Điên cuồng, điên rồ vì sợ/giận"),
            RelatedWord("Frenzied", "Cuồng loạn, hỗn loạn")
        )
    ),
    Word(
        id = "beseech",
        term = "Beseech",
        pronunciation = "/bɪˈsiːtʃ/",
        shortDefinition = "Van xin, cầu khẩn thảm thiết.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Ask someone urgently and fervently to do something; implore.",
        vietnameseDiff = "Hành động hạ mình hạ giọng để cầu xin ai đó một cách khẩn thiết, tha thiết vì đang rơi vào bước đường cùng.",
        exampleSentence = "As she packed her bags, he besought her to stay.",
        nuanceInfo = "Nặng nề và mang tính van nài hơn 'Beg'. Beseech bộc lộ sự bất lực hoàn toàn của cái tôi, đặt hết hy vọng vào lòng thương hại của người đối diện.",
        collocations = listOf("Beseech someone to do", "Beseech forgiveness", "Look at someone beseechingly"),
        relatedWords = listOf(
            RelatedWord("Implore", "Cầu khẩn, van xin"),
            RelatedWord("Beg", "Ăn xin, van nài")
        )
    ),
    Word(
        id = "bestial",
        term = "Bestial",
        pronunciation = "/ˈbestiəl/",
        shortDefinition = "Dã man, súc vật, tàn bạo.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Of or like an animal or animals; savagely cruel and depraved.",
        vietnameseDiff = "Tính cách hoặc hành vi tàn ác, suy đồi đạo đức nghiêm trọng đến mức mất nhân tính, giống như phần con (thú tính) lấn át phần người.",
        exampleSentence = "The dictator was executed for his bestial crimes against humanity.",
        nuanceInfo = "Một từ cực kỳ nặng nề để lên án đạo đức. Không dùng để mắng mỏ trêu đùa, mà chỉ dùng để chỉ trích những tội ác man rợ, vô nhân đạo, chà đạp lên mọi luân thường đạo lý.",
        collocations = listOf("Bestial crime", "Bestial nature", "Bestial cruelty"),
        relatedWords = listOf(
            RelatedWord("Brutal", "Tàn bạo, độc ác"),
            RelatedWord("Savage", "Hoang dã, dã man")
        )
    ),
    Word(
        id = "betray",
        term = "Betray",
        pronunciation = "/bɪˈtreɪ/",
        shortDefinition = "Phản bội / Vô tình lộ ra.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Expose or be disloyal to someone; or unintentionally reveal a secret or feeling.",
        vietnameseDiff = "Hành động đâm sau lưng, phản bội lòng tin của người khác; hoặc vô tình để lộ ra một cảm xúc bí mật qua ánh mắt, cử chỉ.",
        exampleSentence = "Her trembling hands betrayed her extreme anxiety.",
        nuanceInfo = "Từ này có một nghĩa bóng rất hay trong tâm lý: Khi cơ thể bạn 'betray' cảm xúc của bạn, nghĩa là dù bạn cố dối lòng hay tỏ ra mạnh mẽ (Bravado), những phản ứng sinh lý vô điều kiện vẫn tố cáo bạn.",
        collocations = listOf("Betray trust", "Betray a secret", "Betray emotions"),
        relatedWords = listOf(
            RelatedWord("Deceive", "Lừa dối"),
            RelatedWord("Reveal", "Tiết lộ, bộc lộ")
        )
    ),
    Word(
        id = "bewitch",
        term = "Bewitch",
        pronunciation = "/bɪˈwɪtʃ/",
        shortDefinition = "Bỏ bùa mê, hớp hồn làm say đắm.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Cast a spell on someone; or charm and enchant someone utterly.",
        vietnameseDiff = "Hành động (nghĩa bóng) hớp hồn, thu hút ai đó một cách mãnh liệt khiến họ như bị trúng bùa mê thuốc lú, không thể rời mắt.",
        exampleSentence = "He was completely bewitched by her mesmerizing singing voice.",
        nuanceInfo = "Gốc từ 'Witch' (Phù thủy). Mang màu sắc lãng mạn nhưng ma mị. Một người bị 'bewitched' sẽ mất đi khả năng kiểm soát lý trí, hoàn toàn phục tùng theo sự cuốn hút của đối phương.",
        collocations = listOf("Bewitched by her beauty", "Utterly bewitch", "Bewitching smile"),
        relatedWords = listOf(
            RelatedWord("Enchant", "Làm say mê, quyến rũ"),
            RelatedWord("Fascinate", "Mê hoặc, cuốn hút lớn")
        )
    ),
    Word(
        id = "bias",
        term = "Bias",
        pronunciation = "/ˈbaɪəs/",
        shortDefinition = "Sự thiên vị, định kiến tâm lý.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Prejudice in favor of or against one thing, person, or group compared with another, usually in a way considered to be unfair.",
        vietnameseDiff = "Danh từ chỉ xu hướng lệch lạc trong nhận thức, luôn nghiêng về một phía một cách thiếu khách quan do tư tưởng cố hữu.",
        exampleSentence = "Psychologists study cognitive bias to understand human errors.",
        nuanceInfo = "Trong tâm lý học nhận thức, 'Cognitive bias' (Định kiến nhận thức) là một lỗi hệ thống trong cách con người suy nghĩ và lọc thông tin, dẫn đến những quyết định sai lầm.",
        collocations = listOf("Cognitive bias", "Gender bias", "Unconscious bias"),
        relatedWords = listOf(
            RelatedWord("Prejudice", "Định kiến, thành kiến"),
            RelatedWord("Partiality", "Sự thiên vị")
        )
    ),
    Word(
        id = "bicker",
        term = "Bicker",
        pronunciation = "/ˈbɪkə(r)/",
        shortDefinition = "Cãi vã vặt, tranh chấp nhỏ nhặt.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Argue about petty and trivial matters.",
        vietnameseDiff = "Hành động tranh cãi, đấu khẩu liên tục về những chuyện lông gà vỏ tỏi, không đâu vào đâu (thường xảy ra giữa các cặp đôi hoặc anh em).",
        exampleSentence = "The couple constantly bickered about who should wash the dishes.",
        nuanceInfo = "Khác với 'Quarrel' hay 'Argue' (Tranh cãi nghiêm trọng). Bicker chỉ là những đợt đấu khẩu nhẹ, nhặng xị, lặp đi lặp lại hằng ngày, tuy không gây thù hằn lớn nhưng dễ làm bào mòn bầu không khí gia đình.",
        collocations = listOf("Constantly bicker", "Bicker about money", "Bicker with each other"),
        relatedWords = listOf(
            RelatedWord("Squabble", "Cãi nhau om sòm vì chuyện vặt"),
            RelatedWord("Wrangle", "Tranh cãi dai dẳng, phức tạp")
        )
    ),
    Word(
        id = "bigoted",
        term = "Bigoted",
        pronunciation = "/ˈbɪɡətɪd/",
        shortDefinition = "Cố chấp, mù quáng bảo thủ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Obstinately or unreasonably attached to a belief, opinion, or faction, and intolerant of other people's views.",
        vietnameseDiff = "Tính cách cực đoan, bảo thủ mù quáng vào tư tưởng của mình và có thái độ bài xích, thù ghét gay gắt những ai có quan điểm khác biệt.",
        exampleSentence = "His bigoted attitude makes it impossible to have a rational debate with him.",
        nuanceInfo = "Mức độ nặng hơn 'Stubborn' rất nhiều. Kẻ 'bigoted' không chỉ giữ ý kiến mình mà còn có xu hướng phân biệt đối xử, kỳ thị chủng tộc, tôn giáo hoặc giới tính của người khác.",
        collocations = listOf("Bigoted view", "Bigoted person", "Incredibly bigoted"),
        relatedWords = listOf(
            RelatedWord("Intolerant", "Không bao dung, hẹp hòi"),
            RelatedWord("Prejudiced", "Có định kiến nặng")
        )
    ),
    Word(
        id = "binge",
        term = "Binge",
        pronunciation = "/bɪndʒ/",
        shortDefinition = "Sự sa đà, buông thả vô độ (ăn/xem).",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "A period of excessive indulgence in an activity, especially eating, drinking, or watching television.",
        vietnameseDiff = "Hành động buông thả bản thân, làm một việc gì đó quá mức kiểm soát trong một thời gian ngắn liên tục để giải tỏa tâm lý (như ăn vô độ, cày phim xuyên đêm).",
        exampleSentence = "Binge-watching TikTok videos late at night can ruin your sleep cycle.",
        nuanceInfo = "Trong y học tâm lý, 'Binge eating disorder' (Rối loạn ăn uống vô độ) là một bệnh lý khi con người dùng thức ăn để khỏa lấp nỗi buồn hoặc sự căng thẳng tinh thần.",
        collocations = listOf("Binge eating", "Binge watching", "Go on a binge"),
        relatedWords = listOf(
            RelatedWord("Indulgence", "Sự nuông chiều, sa đà"),
            RelatedWord("Spree", "Cuộc ăn chơi vui vẻ bùng nổ")
        )
    ),
    Word(
        id = "bitterly",
        term = "Bitterly",
        pronunciation = "/ˈbɪtəli/",
        shortDefinition = "Một cách cay đắng, xót xa phẫn uất.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "In an angry, hurt, or resentful resentment manner; or extremely cold.",
        vietnameseDiff = "Trạng từ thể hiện sự tức giận, đau đớn ngấm sâu vào lời nói, hoặc giọt nước mắt khóc trong sự tủi hờn bất công.",
        exampleSentence = "She bitterly regretted breaking up with her boyfriend after finding out the truth.",
        nuanceInfo = "Là trạng từ của 'Bitter'. Khi bạn 'bitterly regret' hay 'bitterly cry', hành động đó chứa đựng sự u uất, hối hận muộn màng và gặm nhấm nỗi đau qua năm tháng.",
        collocations = listOf("Bitterly regret", "Bitterly disappointed", "Weep bitterly"),
        relatedWords = listOf(
            RelatedWord("Resentfully", "Một cách oán hận"),
            RelatedWord("Churlishly", "Một cách gắt gỏng, thô lỗ")
        )
    ),
    Word(
        id = "bitterness",
        term = "Bitterness",
        pronunciation = "/ˈbɪtənəs/",
        shortDefinition = "Nỗi cay đắng, lòng phẫn uất tích tụ.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Anger and disappointment at being treated unfairly; resentment.",
        vietnameseDiff = "Danh từ chỉ cảm giác u uất, chua chát và oán hận đọng lại trong tâm hồn sau những đổ vỡ hoặc bất công dài đằng đẵng.",
        exampleSentence = "He kept his bitterness inside instead of talking to his family.",
        nuanceInfo = "Danh từ cốt lõi của 'Bitter'. Trạng thái tâm lý này giống như một liều thuốc độc ngầm, nếu không được xoa dịu, nó sẽ biến một người từ hiền lành trở nên hoài nghi và hận cả thế giới.",
        collocations = listOf("Feel bitterness", "Accumulate bitterness", "Voice of bitterness"),
        relatedWords = listOf(
            RelatedWord("Resentment", "Sự oán giận"),
            RelatedWord("Acrimony", "Sự chua chát, gay gắt")
        )
    ),
    Word(
        id = "blameworthy",
        term = "Blameworthy",
        pronunciation = "/ˈbleɪmwɜːði/",
        shortDefinition = "Đáng trách, có lỗi, đáng bị chỉ trích.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Responsible for wrongdoing and deserving of blame.",
        vietnameseDiff = "Tính từ đánh giá một hành vi hoặc một người hoàn toàn có lỗi và xứng đáng phải chịu sự khiển trách, phê phán từ người khác.",
        exampleSentence = "His careless behavior in managing the shop was highly blameworthy.",
        nuanceInfo = "Từ mang sắc thái trang trọng, thường dùng trong các bài phân tích hành vi đạo đức hoặc pháp lý để xác định xem một người có phải chịu trách nhiệm tinh thần cho hậu quả xấu hay không.",
        collocations = listOf("Blameworthy conduct", "Highly blameworthy", "Hold someone blameworthy"),
        relatedWords = listOf(
            RelatedWord("Culpable", "Có tội, đáng khiển trách"),
            RelatedWord("Guilty", "Có tội, cảm thấy tội lỗi")
        )
    ),
    Word(
        id = "bland",
        term = "Bland",
        pronunciation = "/blænd/",
        shortDefinition = "Nhạt nhẽo, vô vị, tẻ nhạt.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Lacking strong features or characteristics and therefore uninteresting.",
        vietnameseDiff = "Tính cách, câu chuyện hoặc cuộc sống hoàn toàn bình bình, nhạt nhẽo, thiếu điểm nhấn hay cá tính đến mức gây nhàm chán.",
        exampleSentence = "He has a rather bland personality; he never shows any strong emotions.",
        nuanceInfo = "Nghĩa gốc là đồ ăn nhạt, không có gia vị. Khi áp dụng vào tính cách ('Bland personality'), nó chỉ những người quá an toàn, không có chính kiến rõ rệt, nhạt hòa vào đám đông.",
        collocations = listOf("Bland personality", "Bland expression", "Bland statement"),
        relatedWords = listOf(
            RelatedWord("Dull", "Chán ngắt, tẻ nhạt"),
            RelatedWord("Insipid", "Vô vị, tẻ ngắt")
        )
    ),
    Word(
        id = "bleak",
        term = "Bleak",
        pronunciation = "/bliːk/",
        shortDefinition = "Ảm đạm, vô vọng, lạnh lẽo.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Charmless and inhospitable; completely untruthful or hopeless.",
        vietnameseDiff = "Cảm giác tương lai hoặc hoàn cảnh trước mắt vô cùng mịt mù, đen tối và hoàn toàn không có một tia hy vọng nào.",
        exampleSentence = "The psychological outlook for his recovery looked bleak.",
        nuanceInfo = "Thường đi kèm với từ 'Future' hoặc 'Outlook'. Bleak bóp nghẹt tâm trí con người bằng cảm giác cô độc và bất lực trước một tương lai xám xịt.",
        collocations = listOf("Bleak future", "Bleak outlook", "Look bleak"),
        relatedWords = listOf(
            RelatedWord("Hopeless", "Tuyệt vọng, vô vọng"),
            RelatedWord("Gloomy", "U ám, tối tăm")
        )
    ),
    Word(
        id = "blissfully",
        term = "Blissfully",
        pronunciation = "/ˈblɪsfəli/",
        shortDefinition = "Một cách hạnh phúc viên mãn, thanh thản.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "In a manner characterized by extreme happiness or joy.",
        vietnameseDiff = "Trạng từ mô tả một trạng thái sống hoàn toàn bình yên, ngập tràn niềm vui mà không bị vướng bận bởi thế sự.",
        exampleSentence = "They lived blissfully in their small house near the beach.",
        nuanceInfo = "Thường xuất hiện trong cụm từ cực hay: 'Blissfully ignorant' (Hạnh phúc trong sự vô tri). Nghĩa là đôi khi không biết gì về mặt tối của thế giới lại khiến tâm hồn thanh thản nhất.",
        collocations = listOf("Blissfully ignorant", "Blissfully happy", "Live blissfully"),
        relatedWords = listOf(
            RelatedWord("Happily", "Một cách hạnh phúc"),
            RelatedWord("Ecstatically", "Một cách đầy ngây ngất, sướng điên")
        )
    ),
    Word(
        id = "bloodthirsty",
        term = "Bloodthirsty",
        pronunciation = "/ˈblʌdtɜːsti/",
        shortDefinition = "Khát máu, tàn bạo, cuồng bạo.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Having or showing a desire to kill and see blood spilled.",
        vietnameseDiff = "Trạng thái tâm lý cực đoan, hung tợn, thèm khát bạo lực, giết chóc và muốn nhìn thấy đối phương phải đổ máu.",
        exampleSentence = "The dictator was a bloodthirsty tyrant who killed thousands.",
        nuanceInfo = "Mức độ tàn bạo tối cao của tính hiếu chiến. Thường dùng trong lịch sử để tả các bạo chúa hoặc trong tâm lý học tội phạm để nghiên cứu những kẻ sát nhân hàng loạt.",
        collocations = listOf("Bloodthirsty tyrant", "Bloodthirsty regime", "Bloodthirsty nature"),
        relatedWords = listOf(
            RelatedWord("Savage", "Man rợ"),
            RelatedWord("Ruthless", "Tàn nhẫn, không nương tay")
        )
    ),
        Word(
        id = "callous",
        term = "Callous",
        pronunciation = "/ˈkæləs/",
        shortDefinition = "Nhẫn tâm, thờ ơ trước nỗi đau của người khác.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Showing or having an insensitive and cruel disregard for others.",
        vietnameseDiff = "Trạng thái tâm lý trơ lì cảm xúc, thờ ơ, máu lạnh và hoàn toàn không mảy may quan tâm đến sự đau khổ hay tổn thương của những người xung quanh.",
        exampleSentence = "His callous remarks about the victims shocked the community.",
        nuanceInfo = "Nghĩa gốc là da bị chai sần. Trong tâm lý học, một 'callous personality' mang lớp màng bảo vệ cái tôi quá dày, khiến họ mất đi năng lực đồng cảm (Empathy) tối thiểu, nhìn nỗi đau của người khác bằng con mắt dửng dưng.",
        collocations = listOf("Callous disregard", "Callous attitude", "Callous behavior"),
        relatedWords = listOf(
            RelatedWord("Heartless", "Vô tình, nhẫn tâm"),
            RelatedWord("Unfeeling", "Không có cảm xúc, lạnh lùng")
        )
    ),
    Word(
        id = "camouflaged",
        term = "Camouflaged",
        pronunciation = "/ˈkæməflɑːʒd/",
        shortDefinition = "Được ngụy trang, che giấu bản chất.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Hidden or disguised to fit in with the surroundings.",
        vietnameseDiff = "Trạng thái được bao bọc, hòa lẫn vào môi trường xung quanh nhằm che giấu đi sự hiện diện hoặc bản chất thật sự của mình.",
        exampleSentence = "He walked around with a camouflaged sadness behind his bright smile.",
        nuanceInfo = "Nghĩa gốc dùng cho quân sự hoặc thế giới động vật ngụy trang. Nghĩa bóng trong tâm lý học chỉ việc một người cố tình tạo ra một chiếc mặt nạ cảm xúc (Persona) để che giấu những tổn thương hoặc ý đồ thật sự bên trong.",
        collocations = listOf("Heavily camouflaged", "Camouflaged intent", "Camouflaged weapon"),
        relatedWords = listOf(
            RelatedWord("Disguised", "Bị cải trang, ngụy trang"),
            RelatedWord("Concealed", "Bị giấu kín")
        )
    ),
    Word(
        id = "candid",
        term = "Candid",
        pronunciation = "/ˈkændɪd/",
        shortDefinition = "Thẳng thắn, thật thà, không che giấu.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Truthful and straightforward; frank.",
        vietnameseDiff = "Thái độ chia sẻ, trò chuyện cực kỳ thẳng thắn, bộc trực, nghĩ gì nói nấy một cách chân thành mà không hề quanh co hay giấu diếm.",
        exampleSentence = "To be candid, I don't think your current business model will work.",
        nuanceInfo = "Khác với 'Rudely honest' (Thô lỗ). 'Candid' mang lại cảm giác tin cậy giữa hai người bạn thân hoặc đối tác: Tôi nói thật vì tôi tôn trọng bạn, dù sự thật đó có thể hơi mất lòng lúc đầu.",
        collocations = listOf("Candid discussion", "Candid opinion", "To be candid"),
        relatedWords = listOf(
            RelatedWord("Frank", "Thẳng thắn, thành thật"),
            RelatedWord("Straightforward", "Bộc trực, dễ hiểu")
        )
    ),
    Word(
        id = "capricious",
        term = "Capricious",
        pronunciation = "/kəˈprɪʃəs/",
        shortDefinition = "Thất thường, sáng nắng chiều mưa, dễ thay đổi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Given to sudden and unaccountable changes of mood or behavior.",
        vietnameseDiff = "Tính khí hoặc hành vi thay đổi đột ngột, vô cớ, hoàn toàn dựa theo cảm xúc nhất thời khiến người xung quanh không tài nào lường trước được.",
        exampleSentence = "Working with a capricious boss can be mentally exhausting.",
        nuanceInfo = "Từ này lột tả một kiểu tính cách cực kỳ thiếu ổn định về mặt tâm lý. Quyết định của họ đưa ra dựa trên cảm xúc thăng trầm (Mood swings) chứ không tuân theo logic hay nguyên tắc cố định nào.",
        collocations = listOf("Capricious weather", "Capricious mood", "Capricious nature"),
        relatedWords = listOf(
            RelatedWord("Fickle", "Hay thay đổi, không chung thủy"),
            RelatedWord("Unpredictable", "Không thể đoán trước")
        )
    ),
    Word(
        id = "captivated",
        term = "Captivated",
        pronunciation = "/ˈkæptɪveɪtɪd/",
        shortDefinition = "Bị cuốn hút, say đắm, không rời mắt được.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Attracted and holding the interest of; charmed.",
        vietnameseDiff = "Trạng thái tâm trí bị chinh phục và thu hút hoàn toàn bởi vẻ đẹp, tài năng hoặc sự duyên dáng của một người hay một tác phẩm nghệ thuật.",
        exampleSentence = "The entire audience sat in silence, captivated by his performance.",
        nuanceInfo = "Nhẹ nhàng và tích cực hơn 'Bewitched' hay 'Beguiled'. Khi bạn 'captivated', tâm trí bạn hướng về đối phương trong sự ngưỡng mộ, say mê lành mạnh và tràn đầy cảm hứng.",
        collocations = listOf("Completely captivated", "Captivated by the view", "Captivated audience"),
        relatedWords = listOf(
            RelatedWord("Enchanted", "Bị mê hoặc"),
            RelatedWord("Fascinated", "Bị cuốn hút sâu sắc")
        )
    ),
    Word(
        id = "castigate",
        term = "Castigate",
        pronunciation = "/ˈkæstɪɡeɪt/",
        shortDefinition = "Trừng phạt, chỉ trích công khai nặng nề.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Reprimand someone severely.",
        vietnameseDiff = "Hành động khiển trách, lên án hoặc trừng phạt ai đó một cách vô cùng gay gắt trước công chúng nhằm mục đích răn đe.",
        exampleSentence = "The director was castigated by the media for his dynamic failure.",
        nuanceInfo = "Mạnh hơn 'Criticize' hay 'Berate'. Castigate mang màu sắc của sự phán xét chính thức hoặc luật pháp, dội một làn sóng búa rìu dư luận nặng nề vào sai lầm của đối tượng.",
        collocations = listOf("Severely castigate", "Castigate oneself for", "Castigated by the press"),
        relatedWords = listOf(
            RelatedWord("Reprimand", "Khiển trách, quở trách nặng"),
            RelatedWord("Chastise", "Trừng phạt, nghiêm trị")
        )
    ),
    Word(
        id = "catastrophic",
        term = "Catastrophic",
        pronunciation = "/ˌkætəˈstrɒfɪk/",
        shortDefinition = "Thảm khốc, gây thiệt hại nặng nề.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Involving or causing sudden great damage or suffering.",
        vietnameseDiff = "Tính chất của một sự việc gây ra hậu quả hủy diệt, sụp đổ hoàn toàn hoặc để lại những tổn thương không thể cứu vãn.",
        exampleSentence = "The failure of the project had a catastrophic effect on his mental health.",
        nuanceInfo = "Thường dùng để mô tả những thất bại mang tính hệ thống hoặc những cú sốc tinh thần lớn (Mental breakdown). Từ này nhấn mạnh quy mô tàn phá cực rộng và sâu.",
        collocations = listOf("Catastrophic failure", "Catastrophic effect", "Catastrophic injury"),
        relatedWords = listOf(
            RelatedWord("Disastrous", "Tai hại, thảm khốc"),
            RelatedWord("Devastating", "Tàn phá, rụng rời")
        )
    ),
    Word(
        id = "catharsis",
        term = "Catharsis",
        pronunciation = "/kəˈθɑːsɪs/",
        shortDefinition = "Sự thanh lọc tâm hồn, giải tỏa cảm xúc dồn nén.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The process of releasing, and thereby providing relief from, strong or repressed emotions.",
        vietnameseDiff = "Danh từ chỉ khoảnh khắc vỡ òa, khóc nức nở hoặc xả hết mọi u uất, uất hận tích tụ bấy lâu nay ra ngoài, giúp tâm hồn tìm lại sự nhẹ nhõm, trống rỗng và bình yên.",
        exampleSentence = "Writing poetry served as a form of catharsis for his deep trauma.",
        nuanceInfo = "Thuật ngữ cực kỳ nổi tiếng trong tâm lý học trị liệu (Psychotherapy) và nghệ thuật kịch nghệ. Ví dụ sau một bộ phim quá buồn, bạn khóc hết nước mắt và thấy lòng nhẹ nhõm – đó chính là trải nghiệm Catharsis.",
        collocations = listOf("Emotional catharsis", "Achieve catharsis", "Sense of catharsis"),
        relatedWords = listOf(
            RelatedWord("Purification", "Sự thanh lọc, rửa sạch"),
            RelatedWord("Release", "Sự giải thoát, phóng thích")
        )
    ),
    Word(
        id = "chagrin",
        term = "Chagrin",
        pronunciation = "/ˈʃæɡrɪn/",
        shortDefinition = "Sự thất vọng xen lẫn ê chề, ngượng ngùng.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Distress or embarrassment at having failed or been humiliated.",
        vietnameseDiff = "Danh từ chỉ cảm giác bực bội, muối mặt, vừa giận bản thân vừa xấu hổ vì bị bêu rếu hoặc thất bại ê chề trước mặt người khác.",
        exampleSentence = "To his great chagrin, he forgot the words to the song on stage.",
        nuanceInfo = "Không chỉ là buồn (Sadness). Chagrin là sự tổn thương sâu sắc vào lòng tự ái (Wounded pride) khi bạn làm một điều ngớ ngẩn và biết rằng mọi người đang nhìn mình cười thầm.",
        collocations = listOf("To someone's chagrin, ...", "Much to my chagrin", "Feel chagrin"),
        relatedWords = listOf(
            RelatedWord("Mortification", "Sự nhục nhã, muối mặt"),
            RelatedWord("Annoyance", "Sự bực mình, quấy rầy")
        )
    ),
    Word(
        id = "charismatic",
        term = "Charismatic",
        pronunciation = "/ˌkærɪzˈmætɪk/",
        shortDefinition = "Có sức hút lôi cuốn quần chúng, hào quang cá nhân.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Exercising a compelling charm which inspires devotion in others.",
        vietnameseDiff = "Tính cách sở hữu một nguồn năng lượng, thần thái cuốn hút đặc biệt làm mê hoặc lòng người, khiến người khác tự nguyện lắng nghe và đi theo.",
        exampleSentence = "The young content creator has a highly charismatic screen presence.",
        nuanceInfo = "Trong tâm lý học xã hội, 'Charisma' là loại quyền lực vô hình phát ra từ phong thái, giọng nói và ánh mắt. Một người 'charismatic' bước vào phòng sẽ tự động làm chủ bầu không khí mà không cần gồng mình lên.",
        collocations = listOf("Charismatic leader", "Charismatic personality", "Highly charismatic"),
        relatedWords = listOf(
            RelatedWord("Charming", "Duyên dáng, quyến rũ"),
            RelatedWord("Magnetic", "Có sức hút như nam châm")
        )
    ),
    Word(
        id = "chastise",
        term = "Chastise",
        pronunciation = "/tʃæsˈtaɪz/",
        shortDefinition = "Trừng phạt, nghiêm trị, mắng mỏ để dạy dỗ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Rebuke or reprimand someone severely, typically for doing something wrong.",
        vietnameseDiff = "Hành động phạt nặng (có thể bằng đòn roi hoặc lời mắng mỏ cực gắt) với mục đích uốn nắn, sửa đổi hành vi sai trái của cấp dưới hoặc con cái.",
        exampleSentence = "He was chastised by his father for neglecting his duties at the shop.",
        nuanceInfo = "Khác với 'Castigate' (thiên về sỉ vả, bêu rếu). Chastise mang mục đích 'giáo dục' nhiều hơn – phạt để cho chừa, phạt để người đó tỉnh ngộ ra sai lầm của mình.",
        collocations = listOf("Chastise oneself for", "Chastise a child", "Severely chastise"),
        relatedWords = listOf(
            RelatedWord("Scold", "Mắng mỏ"),
            RelatedWord("Discipline", "Đưa vào kỷ luật, xử phạt")
        )
    ),
    Word(
        id = "chauvinistic",
        term = "Chauvinistic",
        pronunciation = "/ˌʃəʊvɪˈnɪstɪk/",
        shortDefinition = "Cực đoan, thượng đẳng, tự tôn mù quáng.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Displaying aggressive or exaggerated patriotism, or excessive loyalty to one's gender/group.",
        vietnameseDiff = "Thái độ tự cao, định kiến cực đoan cho rằng giới tính, quốc gia hoặc hội nhóm của mình là ưu việt nhất, đồng thời coi khinh các nhóm khác.",
        exampleSentence = "His chauvinistic comments about female drivers provoked a severe backlash.",
        nuanceInfo = "Từ này thường gặp nhất trong cụm 'Male chauvinistic' (tư tưởng nam quyền thượng đẳng). Đây là một dạng thiên kiến nhóm (In-group bias) cực đoan, chặn đứng mọi tư duy khách quan và bình đẳng.",
        collocations = listOf("Chauvinistic attitude", "Male chauvinistic", "Chauvinistic views"),
        relatedWords = listOf(
            RelatedWord("Prejudiced", "Có định kiến"),
            RelatedWord("Bigoted", "Cố chấp, bảo thủ mù quáng")
        )
    ),
    Word(
        id = "chronically",
        term = "Chronically",
        pronunciation = "/ˈkrɒnɪkli/",
        shortDefinition = "Một cách kinh niên, bám riết lâu dài không dứt.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "In a slowly developing or long-lasting manner.",
        vietnameseDiff = "Trạng từ chỉ một thói quen, căn bệnh hoặc trạng thái tâm lý tiêu cực kéo dài dai dẳng từ tháng này qua năm khác, cực kỳ khó chữa dứt điểm.",
        exampleSentence = "He is chronically late to every single meeting.",
        nuanceInfo = "Thường dùng trong y học và tâm lý học hành vi ('Chronically stressed' - căng thẳng kinh niên). Nó lột tả một vòng lặp độc hại đã ăn sâu vào nếp sống hoặc cơ địa của chủ thể.",
        collocations = listOf("Chronically ill", "Chronically stressed", "Chronically unemployed"),
        relatedWords = listOf(
            RelatedWord("Persistently", "Một cách kiên trì, dai dẳng"),
            RelatedWord("Constantly", "Liên tục, không đổi")
        )
    ),
    Word(
        id = "churlish",
        term = "Churlish",
        pronunciation = "/ˈtʃɜːlɪʃ/",
        shortDefinition = "Thô lỗ, cộc cằn, thiếu giáo dục.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Rude in a mean-spirited and surly way.",
        vietnameseDiff = "Cách cư xử hẹp hòi, cộc cằn và thô lỗ, đặc biệt là khi từ chối một lòng tốt hoặc không biết cách cư xử lịch sự tối thiểu nơi công cộng.",
        exampleSentence = "It would be churlish to refuse their invitation after all their help.",
        nuanceInfo = "Từ này nhấn mạnh vào sự *thiếu văn hóa nền tảng* trong ứng xử. Không chỉ là nóng tính nhất thời, một hành vi 'churlish' phản ánh sự ích kỷ và không tôn trọng các quy chuẩn xã hội.",
        collocations = listOf("Churlish behavior", "Churlish remark", "It seems churlish to..."),
        relatedWords = listOf(
            RelatedWord("Ill-mannered", "Thiếu giáo dục, vô lễ"),
            RelatedWord("Boorish", "Cục mịch, thô lỗ")
        )
    ),
    Word(
        id = "clamor",
        term = "Clamor",
        pronunciation = "/ˈklæmə(r)/",
        shortDefinition = "Sự la ó om sòm, tiếng đòi hỏi gào thét.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A loud and confused noise, especially that of people shouting vehemently.",
        vietnameseDiff = "Danh từ chỉ một đống âm thanh hỗn loạn, náo động từ đám đông đang la hét cự cãi hoặc đồng thanh đòi hỏi một quyền lợi nào đó.",
        exampleSentence = "The public clamor for lower food prices grew louder.",
        nuanceInfo = "Nghĩa bóng rất hay dùng trong truyền thông: Khi dư luận 'clamor for something', tức là có hàng ngàn tiếng nói cùng lúc tạo áp lực khổng lồ lên một cá nhân hoặc chính quyền để bắt họ thực hiện yêu sách.",
        collocations = listOf("Public clamor", "Clamor for reform", "Clamor of voices"),
        relatedWords = listOf(
            RelatedWord("Outcry", "Sự phản đối kịch liệt"),
            RelatedWord("Uproar", "Sự om sòm, náo động")
        )
    ),
    Word(
        id = "clandestine",
        term = "Clandestine",
        pronunciation = "/klænˈdestɪn/",
        shortDefinition = "Bí mật, lén lút, giấu giếm (thường là bất hợp pháp).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Kept secret or done secretively, especially because illicit.",
        vietnameseDiff = "Tính chất của một cuộc gặp gỡ, kế hoạch hoặc hành động được thực hiện trong bóng tối, lén lút giấu giếm vì nó đi ngược lại quy định hoặc đạo đức.",
        exampleSentence = "They had a clandestine meeting to discuss the land division details.",
        nuanceInfo = "Mạnh và mang sắc thái kịch tính hơn 'Secret'. Clandestine gợi lên hình ảnh của những điệp viên, những thương vụ ngầm dưới bàn hoặc những mối quan hệ bất chính phải giấu kín tuyệt đối trước ánh sáng.",
        collocations = listOf("Clandestine meeting", "Clandestine operation", "Clandestine affair"),
        relatedWords = listOf(
            RelatedWord("Surreptitious", "Lén lút, gian lận"),
            RelatedWord("Furtive", "Lén lút, sợ sệt")
        )
    ),
    Word(
        id = "coax",
        term = "Coax",
        pronunciation = "/kəʊks/",
        shortDefinition = "Dỗ dành, nịnh ngọt, thuyết phục nhẹ nhàng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Gently and persistently persuade someone to do something.",
        vietnameseDiff = "Hành động dùng những lời nói ngọt ngào, cử chỉ dịu dàng để kiên trì dỗ dành, thuyết phục ai đó (hoặc một đứa trẻ) làm điều mình muốn.",
        exampleSentence = "She managed to coax her child into eating the vegetables.",
        nuanceInfo = "Ngược lại hoàn toàn với 'Coerce' (Ép buộc). Coax tôn trọng tâm lý đối phương, dùng sự mềm mỏng, vuốt ve để đưa họ vào trạng thái thoải mái rồi tự nguyện đồng ý.",
        collocations = listOf("Coax someone into doing", "Coax a smile from", "Gently coax"),
        relatedWords = listOf(
            RelatedWord("Cajole", "Tán tỉnh, phỉnh phờ"),
            RelatedWord("Wheedle", "Nịnh nọt, dỗ ngọt")
        )
    ),
    Word(
        id = "coerce",
        term = "Coerce",
        pronunciation = "/kəʊˈɜːs/",
        shortDefinition = "Cưỡng ép, ép buộc bằng vũ lực/đe dọa.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Persuade an unwilling person to do something by using force or threats.",
        vietnameseDiff = "Hành động dùng quyền lực, bạo lực hoặc những lời đe dọa để bắt buộc một người phải làm điều họ hoàn toàn không muốn.",
        exampleSentence = "The confession was coerced out of him during the interrogation.",
        nuanceInfo = "Trong tâm lý học tội phạm và pháp lý, 'Coercion' (Sự cưỡng bức) hủy diệt hoàn toàn quyền tự quyết (Free will) của nạn nhân, ép họ vào thế chân tường để phục tùng.",
        collocations = listOf("Coerce someone into", "Coerced confession", "Coercive power"),
        relatedWords = listOf(
            RelatedWord("Compel", "Bắt buộc, thúc ép"),
            RelatedWord("Force", "Ép buộc, cưỡng bức")
        )
    ),
    Word(
        id = "cognizant",
        term = "Cognizant",
        pronunciation = "/ˈkɒɡnɪzənt/",
        shortDefinition = "Nhận thức được, hiểu rõ, có ý thức về.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Having knowledge or being aware of.",
        vietnameseDiff = "Trạng thái tâm trí hoàn toàn tỉnh táo, nhận biết sâu sắc và nắm rõ thông tin, rủi ro hoặc thực trạng của một vấn đề.",
        exampleSentence = "As a shop owner, you must be cognizant of customer preferences.",
        nuanceInfo = "Trang trọng hơn nhiều so với 'Aware'. Khi bạn 'cognizant of something', nghĩa là bạn đã qua quá trình tư duy, phân tích logic và lưu giữ sự hiểu biết đó trong đầu để định hình hành vi tiếp theo.",
        collocations = listOf("Cognizant of the facts", "Fully cognizant", "Become cognizant"),
        relatedWords = listOf(
            RelatedWord("Aware", "Có nhận thức, biết"),
            RelatedWord("Conscious", "Tỉnh táo, có ý thức")
        )
    ),
    Word(
        id = "coherent",
        term = "Coherent",
        pronunciation = "/kəʊˈhɪərənt/",
        shortDefinition = "Mạch lạc, chặt chẽ, logic.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Logical and consistent; clear and easy to understand.",
        vietnameseDiff = "Tính chất của một lập luận, câu chuyện hoặc kế hoạch cực kỳ mạch lạc, các phần kết nối với nhau một cách logic, dễ hiểu và không mâu thuẫn.",
        exampleSentence = "He was too drunk to give a coherent account of the accident.",
        nuanceInfo = "Trong tâm lý học nhận thức, 'Coherent thinking' (Tư duy mạch lạc) là biểu hiện của một bộ não khỏe mạnh. Khi một người bị khủng hoảng tâm lý nặng, tư duy của họ sẽ bị phân mảnh và mất đi tính Coherent.",
        collocations = listOf("Coherent argument", "Coherent strategy", "Perfectly coherent"),
        relatedWords = listOf(
            RelatedWord("Logical", "Hợp lý, logic"),
            RelatedWord("Articulate", "Khéo ăn nói, lưu loát")
        )
    ),
    Word(
        id = "cohesive",
        term = "Cohesive",
        pronunciation = "/kəʊˈhiːsɪv/",
        shortDefinition = "Có tính gắn kết, đoàn kết chặt chẽ.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Characterized by or causing cohesion; tending to stick together.",
        vietnameseDiff = "Đặc điểm của một tập thể, một đội ngũ hoặc các thành phần có sự liên kết keo sơn, phối hợp ăn ý và thống nhất thành một khối.",
        exampleSentence = "A cohesive team is the key to managing a successful business.",
        nuanceInfo = "Thường dùng trong cụm từ 'Cohesive group' (Nhóm gắn kết). Lực kết dính này đến từ lòng tin và những mục tiêu chung, giúp nhóm vượt qua các xung đột nội bộ dễ dàng.",
        collocations = listOf("Cohesive group", "Cohesive unit", "Create a cohesive culture"),
        relatedWords = listOf(
            RelatedWord("Unified", "Thống nhất"),
            RelatedWord("Connected", "Được kết nối")
        )
    ),
    Word(
        id = "collusion",
        term = "Collusion",
        pronunciation = "/kəˈluːʒn/",
        shortDefinition = "Sự cấu kết, thông đồng làm bậy.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Secret or illegal cooperation or conspiracy, especially in order to cheat or deceive others.",
        vietnameseDiff = "Danh từ chỉ việc hai hoặc nhiều bên ngấm ngầm bắt tay, cấu kết với nhau dưới bối cảnh mờ ám để lừa gạt hoặc trục lợi bất chính.",
        exampleSentence = "The corruption plot involved collusion between officials and developers.",
        nuanceInfo = "Mang sắc thái tiêu cực và tội phạm. Khác với 'Collaboration' (Hợp tác lành mạnh công khai), Collusion diễn ra hoàn toàn trong bóng tối (Clandestine) để gây hại cho bên thứ ba.",
        collocations = listOf("In collusion with", "Secret collusion", "Prove collusion"),
        relatedWords = listOf(
            RelatedWord("Conspiracy", "Âm mưu, sự đồng mưu"),
            RelatedWord("Complicity", "Sự đồng lõa")
        )
    ),
    Word(
        id = "complacency",
        term = "Complacency",
        pronunciation = "/kəmˈpleɪsnsi/",
        shortDefinition = "Sự tự mãn, ngủ quên trên chiến thắng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A feeling of smug or uncritical satisfaction with oneself or one's achievements, often accompanied by unawareness of impending danger.",
        vietnameseDiff = "Trạng thái tâm lý tự mãn, quá hài lòng với vị trí hiện tại của bản thân mà mất đi ý chí phấn đấu và lơ là cảnh giác trước các rủi ro sắp tới.",
        exampleSentence = "Business success can easily lead to complacency and eventual failure.",
        nuanceInfo = "Đây là một cái bẫy tâm lý cực kỳ nguy hiểm. Complacency khiến bạn ngừng học hỏi, ngừng đổi mới tư duy, tạo cơ hội cho đối thủ vượt lên dìm mình xuống.",
        collocations = listOf("Stave off complacency", "Dangerous complacency", "Feel a sense of complacency"),
        relatedWords = listOf(
            RelatedWord("Smugness", "Sự tự mãn, vẻ đắc ý"),
            RelatedWord("Self-satisfaction", "Sự tự thỏa mãn")
        )
    ),
    Word(
        id = "complicity",
        term = "Complicity",
        pronunciation = "/kəmˈplɪsəti/",
        shortDefinition = "Sự đồng lõa, tiếp tay cho cái ác/sai trái.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The state of being involved with others in an illegal activity or wrongdoing.",
        vietnameseDiff = "Danh từ chỉ trách nhiệm đạo đức hoặc pháp lý khi bạn biết chuyện xấu đang xảy ra nhưng lại im lặng, chấp nhận hoặc ngầm tiếp tay cho kẻ xấu.",
        exampleSentence = "By remaining silent, she was accused of complicity in the fraud.",
        nuanceInfo = "Ngay cả khi bạn không trực tiếp gây án, sự im lặng phớt lờ (Callous disregard) của bạn cũng biến bạn thành một phần của tội ác đó về mặt tâm lý xã hội.",
        collocations = listOf("Complicity in a crime", "Suspected complicity", "Deny complicity"),
        relatedWords = listOf(
            RelatedWord("Connivance", "Sự nhắm mắt làm ngơ, đồng lõa"),
            RelatedWord("Involvement", "Sự dính líu, liên quan")
        )
    ),
    Word(
        id = "compulsion",
        term = "Compulsion",
        pronunciation = "/kəmˈpʌlʃn/",
        shortDefinition = "Sự thôi thúc mãnh liệt, hành vi cưỡng chế (tâm lý).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "An irresistible urge to behave in a certain way, especially against one's conscious wishes.",
        vietnameseDiff = "Một xung năng, sự thôi thúc cực mạnh bên trong tâm trí ép buộc bạn phải thực hiện một hành động nào đó, dù lý trí biết thừa nó vô lý hoặc có hại.",
        exampleSentence = "He felt a sudden compulsion to check his TikTok phone notifications every five minutes.",
        nuanceInfo = "Thuật ngữ cốt lõi trong hội chứng tâm lý OCD (Obsessive-Compulsive Disorder - Rối loạn ám ảnh cưỡng chế). Người bệnh thực hiện 'compulsion' như một cơ chế phòng vệ tạm thời để giảm bớt sự lo âu (Anxiety) bóp nghẹt bên trong.",
        collocations = listOf("Irresistible compulsion", "Internal compulsion", "Feel a compulsion to"),
        relatedWords = listOf(
            RelatedWord("Urge", "Sự thúc giục, thèm khát"),
            RelatedWord("Obsession", "Sự ám ảnh")
        )
    ),
    Word(
        id = "compulsive",
        term = "Compulsive",
        pronunciation = "/kəmˈpʌlsɪv/",
        shortDefinition = "Có tính chất điên cuồng, không thể kiểm soát hành vi.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Resulting from or relating to an irresistible urge, especially one that is against one's conscious wishes.",
        vietnameseDiff = "Tính từ mô tả một hành vi nghiện ngập, lặp đi lặp lại một cách vô thức nhằm giải tỏa một áp lực tinh thần vô hình.",
        exampleSentence = "Her compulsive shopping habits left her heavily in debt.",
        nuanceInfo = "Ví dụ một 'compulsive liar' (kẻ nói dối cuồng quẩn) là người nói dối như một bản năng tự nhiên để tự vệ, ngay cả khi câu chuyện đó chẳng mang lại lợi ích thực tế nào cho họ.",
        collocations = listOf("Compulsive liar", "Compulsive gambler", "Compulsive eating"),
        relatedWords = listOf(
            RelatedWord("Obsessive", "Ám ảnh, cố chấp"),
            RelatedWord("Uncontrollable", "Không thể kiểm soát")
        )
    ),
    Word(
        id = "compunction",
        term = "Compunction",
        pronunciation = "/kəmˈpʌŋkʃn/",
        shortDefinition = "Sự cắn rứt lương tâm, cảm giác tội lỗi băn khoăn.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A feeling of guilt or moral scruple that prevents or follows the doing of something bad.",
        vietnameseDiff = "Nỗi đau xót, băn khoăn thoáng qua trong thâm tâm khi bạn chuẩn bị hoặc đã làm một điều gì đó có lỗi với người khác.",
        exampleSentence = "The scammer spent all the stolen money without the slightest compunction.",
        nuanceInfo = "Khác với 'Remorse' (Hối hận sâu sắc sau khi sự đã rồi). Compunction giống như một cái thắng tay của đạo đức (Moral compass): Nó khều nhẹ vào vai bạn *trước hoặc trong khi* bạn làm bậy, khiến bạn thấy chột dạ.",
        collocations = listOf("Without compunction", "Feel no compunction", "Slightest compunction"),
        relatedWords = listOf(
            RelatedWord("Qualm", "Mối lo ngại, sự e dè lương tâm"),
            RelatedWord("Scruple", "Sự đắn đo đạo đức")
        )
    ),
    Word(
        id = "conceded",
        term = "Conceded",
        pronunciation = "/kənˈsiːdɪd/",
        shortDefinition = "Thừa nhận (sau khi đã cố gắng phủ nhận).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Admitted that something is true or valid after a struggle or hesitation.",
        vietnameseDiff = "Hành động chấp nhận một sự thật, một thất bại hoặc nhượng bộ quan điểm của đối phương sau một hồi tranh luận gay gắt.",
        exampleSentence = "After hours of heavy debate, he finally conceded that his strategy was wrong.",
        nuanceInfo = "Dạng quá khứ/tính từ của 'Concede'. Từ này lột tả khoảnh khắc cái tôi (Ego) của một người phải cúi đầu trước logic hoặc bằng chứng đanh thép từ đối phương, chấp nhận thua cuộc một cách chính thức.",
        collocations = listOf("Conceded defeat", "Conceded a point", "Finally conceded"),
        relatedWords = listOf(
            RelatedWord("Admitted", "Đã thừa nhận"),
            RelatedWord("Yielded", "Đã nhượng bộ, đầu hàng")
        )
    ),
    Word(
        id = "confrontational",
        term = "Confrontational",
        pronunciation = "/ˌkɒnfrʌnˈteɪʃənl/",
        shortDefinition = "Thích đối đầu, dễ gây hấn, gắt gỏng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Tending to deal with situations in an aggressive or hostile way; combative.",
        vietnameseDiff = "Xu hướng giải quyết các vấn đề, bất đồng bằng thái độ hung hăng, muốn ba mặt một lời cãi vã tay đôi chứ không chịu thương lượng hòa nhã.",
        exampleSentence = "His confrontational communication style always ruins potential partnerships.",
        nuanceInfo = "Đây là một phong cách ứng xử (Communication style) chứa nhiều năng lượng thù địch (Aggression). Những người này coi mọi sự bất đồng ý kiến là một trận chiến cần phải thắng bằng cách lấn lướt đối phương.",
        collocations = listOf("Confrontational style", "Highly confrontational", "Avoid confrontational situations"),
        relatedWords = listOf(
            RelatedWord("Combative", "Hiếu chiến, thích đánh nhau"),
            RelatedWord("Aggressive", "Hung hăng")
        )
    ),
    Word(
        id = "conundrum",
        term = "Conundrum",
        pronunciation = "/kəˈnʌndrəm/",
        shortDefinition = "Câu đố búa bổ, bài toán hóc búa khó giải.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A confusing and difficult problem or question.",
        vietnameseDiff = "Một tình huống tiến thoái lưỡng nan hoặc một vấn đề cực kỳ rắc rối, mâu thuẫn chồng chéo khiến tâm trí rơi vào ngõ cụt.",
        exampleSentence = "Balancing business expansion and personal life privacy is a classic conundrum.",
        nuanceInfo = "Khác với 'Problem' (Khó khăn thông thường). Conundrum là kiểu bài toán mà bạn chọn cách giải nào cũng có vết gợn rủi ro, bắt buộc bộ não phải vận dụng tư duy nhạy bén (Agile mind) ở mức tối đa để tìm điểm cân bằng.",
        collocations = listOf("Ethical conundrum", "Classic conundrum", "Solve a conundrum"),
        relatedWords = listOf(
            RelatedWord("Dilemma", "Thế tiến thoái lưỡng nan"),
            RelatedWord("Paradox", "Sự nghịch lý")
        )
    ),
        Word(
        id = "conscientious",
        term = "Conscientious",
        pronunciation = "/ˌkɒnʃiˈenʃəs/",
        shortDefinition = "Tận tâm, chu đáo, có trách nhiệm cao.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Wishing to do what is right, especially to do one's work or duty well and thoroughly.",
        vietnameseDiff = "Tính cách làm việc cực kỳ cẩn thận, tỉ mỉ, luôn đặt hết cái tâm và tinh thần trách nhiệm vào công việc để đảm bảo không xảy ra sai sót.",
        exampleSentence = "A conscientious shop owner always keeps track of every detail.",
        nuanceInfo = "Trong mô hình tính cách Big Five, 'Conscientiousness' là thước đo sự tự giác và kỷ luật. Người mang tính cách này không làm việc qua loa, họ luôn hoàn thành nghĩa vụ vì lòng tự trọng.",
        collocations = listOf("Conscientious worker", "Conscientious effort", "Highly conscientious"),
        relatedWords = listOf(
            RelatedWord("Scrupulous", "Cẩn thận, cực kỳ chu đáo"),
            RelatedWord("Meticulous", "Tỉ mỉ, kỹ lưỡng")
        )
    ),
    Word(
        id = "conspicuous",
        term = "Conspicuous",
        pronunciation = "/kənˈspɪkjuəs/",
        shortDefinition = "Dễ thấy, đập vào mắt, nổi bật.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Standing out so as to be clearly visible; attracting notice or attention.",
        vietnameseDiff = "Tính chất cực kỳ nổi bật, lộ liễu, dễ dàng thu hút sự chú ý của mọi người xung quanh ngay từ cái nhìn đầu tiên.",
        exampleSentence = "The brand logo was placed in a conspicuous position on the product.",
        nuanceInfo = "Có thể mang nghĩa tích cực hoặc tiêu cực. 'Conspicuous consumption' là thuật ngữ chỉ việc cố tình mua sắm xa xỉ để khoe khoang sự giàu có cho thiên hạ trầm trồ.",
        collocations = listOf("Conspicuous success", "Conspicuous by its absence", "Conspicuous position"),
        relatedWords = listOf(
            RelatedWord("Noticeable", "Đáng chú ý"),
            RelatedWord("Prominent", "Nổi bật, xuất chúng")
        )
    ),
    Word(
        id = "contemptuous",
        term = "Contemptuous",
        pronunciation = "/kənˈtemptʃuəs/",
        shortDefinition = "Khinh bỉ, coi thường, ra vẻ thượng đẳng.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Showing contempt; scornful.",
        vietnameseDiff = "Thái độ bộc lộ rõ sự coi thường, hạ thấp và khinh miệt đối phương vì cho rằng họ không xứng tầm hoặc kém cỏi hơn mình.",
        exampleSentence = "He gave a contemptuous laugh when asked about his competitor.",
        nuanceInfo = "Mạnh hơn 'Disrespectful'. Trong tâm lý học hôn nhân của Gottman, 'Contempt' (Sự khinh miệt) là một trong bốn tác nhân phá hủy mối quan hệ nhanh nhất, vì nó triệt tiêu sự tôn trọng tối thiểu.",
        collocations = listOf("Contemptuous look", "Contemptuous disregard", "Contemptuous smile"),
        relatedWords = listOf(
            RelatedWord("Scornful", "Khinh miệt, dè bỉu"),
            RelatedWord("Disdainful", "Kiêu căng, coi khinh")
        )
    ),
    Word(
        id = "contentious",
        term = "Contentious",
        pronunciation = "/kənˈtenʃəs/",
        shortDefinition = "Hay gây tranh cãi, dễ dẫn đến xung đột.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Causing or likely to cause an argument; controversial.",
        vietnameseDiff = "Một chủ đề, vấn đề hoặc quyết định cực kỳ nhạy cảm, dễ châm ngòi cho những cuộc tranh luận nảy lửa và chia rẽ ý kiến số đông.",
        exampleSentence = "The new policy regarding land division became a highly contentious issue.",
        nuanceInfo = "Cũng có thể dùng để mô tả một người có tính khí 'thích cự cãi'. Khi một vấn đề là 'contentious', điều đó có nghĩa là các bên liên quan đều có lập trường rất gắt và khó nhượng bộ.",
        collocations = listOf("Contentious issue", "Contentious topic", "Highly contentious"),
        relatedWords = listOf(
            RelatedWord("Controversial", "Gây tranh cãi"),
            RelatedWord("Disputable", "Có thể tranh chấp")
        )
    ),
    Word(
        id = "contingent",
        term = "Contingent",
        pronunciation = "/kənˈtɪndʒənt/",
        shortDefinition = "Còn tùy thuộc vào, phụ thuộc vào điều kiện.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Subject to chance; dependent on.",
        vietnameseDiff = "Trạng thái một kế hoạch hoặc sự việc có xảy ra hay không còn phải chờ xem một điều kiện khác có được thỏa mãn trước hay không.",
        exampleSentence = "The success of the app is contingent on our marketing strategy.",
        nuanceInfo = "Cấu trúc thường gặp là 'Contingent on/upon'. Từ này giúp tư duy của bạn mang tính phòng ngừa rủi ro cao, không khẳng định 100% khi mọi thứ chưa ngã ngũ.",
        collocations = listOf("Contingent on", "Contingent plan", "Contingent factors"),
        relatedWords = listOf(
            RelatedWord("Dependent", "Phụ thuộc vào"),
            RelatedWord("Conditional", "Có điều kiện")
        )
    ),
    Word(
        id = "contrite",
        term = "Contrite",
        pronunciation = "/kənˈtraɪt/",
        shortDefinition = "Ăn năn hối lỗi, hối hận chân thành.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Feeling or expressing remorse or penitence; affected by guilt.",
        vietnameseDiff = "Trạng thái tâm lý dằn vặt, nhận thức sâu sắc cái sai của mình và thực lòng muốn sửa đổi, chuộc lỗi với người bị hại.",
        exampleSentence = "He wrote a long, contrite letter to apologize for his behavior.",
        nuanceInfo = "Mạnh và sâu sắc hơn 'Sorry'. Một người 'contrite' không chỉ xin lỗi đầu môi chóp lưỡi để xoa dịu tình hình, mà họ thực sự trải qua sự cắn rứt lương tâm và thay đổi hành vi.",
        collocations = listOf("Contrite apology", "Contrite heart", "Look contrite"),
        relatedWords = listOf(
            RelatedWord("Penitent", "Sám hối, ăn năn"),
            RelatedWord("Remorseful", "Hối hận, dằn vặt")
        )
    ),
    Word(
        id = "copious",
        term = "Copious",
        pronunciation = "/ˈkəʊpiəs/",
        shortDefinition = "Phong phú, dồi dào, số lượng lớn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Abundant in supply or quantity.",
        vietnameseDiff = "Tính chất có rất nhiều, tràn trề, cung cấp vượt mức mong đợi về mặt số lượng hoặc thông tin.",
        exampleSentence = "The student took copious notes during the computer science lecture.",
        nuanceInfo = "Thường dùng cho những thứ không cầm nắm trực tiếp được như thông tin, dữ liệu, hoặc chất lỏng (Copious amounts of water/tears). Gợi cảm giác một sự tuôn trào không ngớt.",
        collocations = listOf("Copious notes", "Copious amounts", "Copious supply"),
        relatedWords = listOf(
            RelatedWord("Abundant", "Dồi dào, phong phú"),
            RelatedWord("Plentiful", "Nhiều, sung túc")
        )
    ),
    Word(
        id = "corroborate",
        term = "Corroborate",
        pronunciation = "/kəˈrɒbəreɪt/",
        shortDefinition = "Chứng thực, làm tăng tính xác thực.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Confirm or give support to (a statement, theory, or finding).",
        vietnameseDiff = "Hành động cung cấp thêm bằng chứng, số liệu hoặc lời khai để củng cố và xác nhận một giả thuyết hoặc lời nói của ai đó là đúng sự thật.",
        exampleSentence = "We need more data structures evidence to corroborate this algorithm theory.",
        nuanceInfo = "Dùng nhiều trong nghiên cứu khoa học, lập trình hoặc pháp lý. Khi một thông tin được 'corroborated', độ tin cậy của nó tăng lên đáng kể vì có sự đồng thuận từ nhiều nguồn độc lập.",
        collocations = listOf("Corroborate evidence", "Corroborate a story", "Fully corroborate"),
        relatedWords = listOf(
            RelatedWord("Confirm", "Xác nhận"),
            RelatedWord("Substantiate", "Chứng minh, làm cho có căn cứ")
        )
    ),
    Word(
        id = "covet",
        term = "Covet",
        pronunciation = "/ˈkʌvət/",
        shortDefinition = "Thèm muốn, khao khát (thứ thuộc về người khác).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Yearn to possess or have (something).",
        vietnameseDiff = "Hành động thầm khao khát, thèm nhỏ dãi một món đồ, một danh hiệu hoặc vị trí mà người khác đang sở hữu.",
        exampleSentence = "He coveted the lifestyle of successful, wealthy influencers.",
        nuanceInfo = "Mang một chút sắc thái đố kỵ (Envy). Nó phản ánh một ham muốn mãnh liệt từ bên trong, đôi khi khiến chủ thể mất đi sự tập trung vào những giá trị nội tại của chính mình.",
        collocations = listOf("Covet success", "Highly coveted prize", "Covet power"),
        relatedWords = listOf(
            RelatedWord("Desire", "Khao khát, thèm muốn"),
            RelatedWord("Crave", "Thèm thuồng, khao khát mãnh liệt")
        )
    ),
    Word(
        id = "credulous",
        term = "Credulous",
        pronunciation = "/ˈkredjʊləs/",
        shortDefinition = "Cả tin, nhẹ dạ, dễ bị dắt mũi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Having or showing too great a readiness to believe things.",
        vietnameseDiff = "Tính cách quá ngây thơ, ai nói gì cũng tin sái cổ mà không chịu suy nghĩ thấu đáo hoặc kiểm tra lại thông tin.",
        exampleSentence = "Scammers often target credulous people on social media platforms.",
        nuanceInfo = "Khác với 'Trusting' (Tin tưởng lành mạnh). 'Credulous' mang tính tiêu cực, lột tả sự thiếu hụt tư duy phản biện (Critical thinking), biến chủ thể thành miếng mồi ngon cho những kẻ lừa đảo.",
        collocations = listOf("Credulous nature", "Credulous audience", "Too credulous"),
        relatedWords = listOf(
            RelatedWord("Gullible", "Dễ tin, khờ khạo"),
            RelatedWord("Naive", "Ngây thơ, chất phác")
        )
    ),
    Word(
        id = "cryptic",
        term = "Cryptic",
        pronunciation = "/ˈkrɪptɪk/",
        shortDefinition = "Bí ẩn, khó hiểu, mang ẩn ý ngầm.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Having a meaning that is mysterious or obscure.",
        vietnameseDiff = "Tính chất của một lời nói, thông điệp hoặc trạng thái ẩn chứa mật mã ngầm, khiến người nghe phải đau đầu suy đoán chứ không nói toạc ra.",
        exampleSentence = "She posted a cryptic message on her TikTok story after the breakup.",
        nuanceInfo = "Nghĩa gốc liên quan đến mật mã (Cryptography). Nghĩa bóng dùng cho hành vi giao tiếp: Cố tình nói lấp lửng để tạo sự tò mò hoặc để tự bảo vệ mình, ép đối phương phải tự đọc vị.",
        collocations = listOf("Cryptic message", "Cryptic remark", "Cryptic smile"),
        relatedWords = listOf(
            RelatedWord("Mysterious", "Bí ẩn, huyền bí"),
            RelatedWord("Enigmatic", "Bí ẩn, như một câu đố")
        )
    ),
    Word(
        id = "culminate",
        term = "Culminate",
        pronunciation = "/ˈkʌlmɪneɪt/",
        shortDefinition = "Đạt đến đỉnh điểm, kết thúc bằng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Reach a climax or highest point of development.",
        vietnameseDiff = "Hành động tích lũy qua một chuỗi sự kiện dài để rồi cuối cùng bùng nổ hoặc kết thúc tại một điểm đỉnh cao, một kết quả rực rỡ.",
        exampleSentence = "Years of hard work will culminate in a highly successful business.",
        nuanceInfo = "Thường đi với giới từ 'in'. Từ này gợi cảm giác về một hành trình leo núi kiên trì: Mọi nỗ lực bỏ ra từ trước đến nay đều là bước đệm cho khoảnh khắc tỏa sáng cuối cùng.",
        collocations = listOf("Culminate in success", "Culminate in a final exam", "Long process culminating in"),
        relatedWords = listOf(
            RelatedWord("Climax", "Đạt đến cao trào"),
            RelatedWord("Peak", "Đạt đỉnh điểm")
        )
    ),
    Word(
        id = "culpable",
        term = "Culpable",
        pronunciation = "/ˈkʌlpəbl/",
        shortDefinition = "Có tội, đáng bị khiển trách/trừng phạt.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Deserving blame.",
        vietnameseDiff = "Trạng thái một cá nhân phải chịu trách nhiệm pháp lý hoặc đạo đức cho một sai lầm, tổn thất đã xảy ra do hành vi cố tình hoặc lơ là của họ.",
        exampleSentence = "The manager was held culpable for the financial deficit of the shop.",
        nuanceInfo = "Dùng nhiều trong văn bản luật và tranh biện cấp cao. 'Culpability' (Trách nhiệm hình sự/đạo đức) được xác định dựa trên việc chủ thể có nhận thức được hành vi sai trái của mình hay không.",
        collocations = listOf("Culpable homicide", "Held culpable", "Culpable negligence"),
        relatedWords = listOf(
            RelatedWord("Blameworthy", "Đáng trách"),
            RelatedWord("Guilty", "Có tội, tội lỗi")
        )
    ),
    Word(
        id = "cursory",
        term = "Cursory",
        pronunciation = "/ˈkɜːsəri/",
        shortDefinition = "Lướt qua, qua loa, đại khái.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Hasty and therefore not thorough or detailed.",
        vietnameseDiff = "Hành động kiểm tra, đọc hoặc xem xét một thứ gì đó cực kỳ nhanh chóng, hời hợt nên chắc chắn sẽ bỏ sót những chi tiết quan trọng.",
        exampleSentence = "A cursory glance at the legal document is not enough; you must read it line by line.",
        nuanceInfo = "Ngược lại hoàn toàn với 'Meticulous'. Từ này lột tả thói quen làm việc vội vã, cẩu thả do thiếu thời gian hoặc thiếu sự nghiêm túc, dễ dẫn đến những sai lầm chết người.",
        collocations = listOf("Cursory glance", "Cursory inspection", "Cursory look"),
        relatedWords = listOf(
            RelatedWord("Superficial", "Hời hợt, bề nổi"),
            RelatedWord("Perfunctory", "Lấy lệ, đại khái")
        )
    ),
    Word(
        id = "curt",
        term = "Curt",
        pronunciation = "/kɜːt/",
        shortDefinition = "Cộc lốc, ngắn gọn đến mức thô lỗ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Rudely brief.",
        vietnameseDiff = "Cách trả lời hoặc giao tiếp cực kỳ ngắn, trống không, tạo cảm giác lạnh lùng, thiếu tôn trọng hoặc đang bực bội với người nghe.",
        exampleSentence = "The customer gave a curt nod and left without saying thank you.",
        nuanceInfo = "Khác với 'Concise' (Ngắn gọn súc tích một cách lịch sự). 'Curt' mang theo một luồng năng lượng tiêu cực (Passive-aggressive), báo hiệu rằng chủ thể không muốn kéo dài cuộc trò chuyện.",
        collocations = listOf("Curt reply", "Curt nod", "Curt response"),
        relatedWords = listOf(
            RelatedWord("Abrupt", "Đột ngột, cộc lốc"),
            RelatedWord("Blunt", "Thẳng thừng, không kiêng nể")
        )
    ),
    Word(
        id = "cynical",
        term = "Cynical",
        pronunciation = "/ˈsɪnɪkl/",
        shortDefinition = "Hoài nghi, nhìn đời bằng con mắt tiêu cực.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Believing that people are motivated purely by self-interest; distrustful of human sincerity or integrity.",
        vietnameseDiff = "Thái độ luôn nghi ngờ lòng tốt của người khác, cho rằng ai làm việc gì cũng chỉ vì lợi ích cá nhân ích kỷ chứ chẳng có ai tử tế thật lòng.",
        exampleSentence = "He has become cynical about relationships after going through hard breakups.",
        nuanceInfo = "Một 'cynical mind' là cơ chế phòng vệ tâm lý tự động sau khi trải qua nhiều tổn thương hoặc lừa dối. Họ thà tin rằng thế giới này xấu xa ngay từ đầu để không bao giờ phải thất vọng nữa.",
        collocations = listOf("Cynical view", "Cynical attitude", "Deeply cynical"),
        relatedWords = listOf(
            RelatedWord("Skeptical", "Hoài nghi, ngờ vực"),
            RelatedWord("Pessimistic", "Bi quan")
        )
    ),
        Word(
        id = "dauntless",
        term = "Dauntless",
        pronunciation = "/ˈdɔːntləs/",
        shortDefinition = "Gan dạ, kiên cường, không biết sợ hãi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Showing fearlessness and determination.",
        vietnameseDiff = "Tính cách dũng cảm, ngoan cường, không bao giờ lùi bước hay tỏ ra sợ hãi trước bất kỳ hiểm nguy hay thử thách cực đại nào.",
        exampleSentence = "A dauntless entrepreneur views every business failure as a valuable lesson.",
        nuanceInfo = "Mạnh hơn 'Brave' thông thường. Từ này lột tả một tinh thần thép, dù đối mặt với sóng gió hay áp lực bóp nghẹt vẫn giữ vững ý chí tiến về phía trước.",
        collocations = listOf("Dauntless spirit", "Dauntless courage", "Dauntless warrior"),
        relatedWords = listOf(
            RelatedWord("Fearless", "Không sợ hãi"),
            RelatedWord("Intrepid", "Gan dạ, dũng cảm")
        )
    ),
    Word(
        id = "dearth",
        term = "Dearth",
        pronunciation = "/dɜːθ/",
        shortDefinition = "Sự khan hiếm, thiếu thốn nghiêm trọng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A scarcity or lack of something.",
        vietnameseDiff = "Danh từ chỉ tình trạng thiếu hụt trầm trọng một nguồn lực, thông tin hoặc nhân sự cần thiết, gây ra nhiều khó khăn cho việc phát triển.",
        exampleSentence = "There is a dearth of reliable data regarding this local land division.",
        nuanceInfo = "Thường đi với cấu trúc 'Dearth of something'. Khác với 'Lack', 'Dearth' nhấn mạnh rằng thứ này đáng lẽ phải có hoặc cần phải có để vận hành một hệ thống ổn định.",
        collocations = listOf("Dearth of evidence", "Dearth of talent", "Serious dearth"),
        relatedWords = listOf(
            RelatedWord("Scarcity", "Sự khan hiếm"),
            RelatedWord("Shortage", "Tình trạng thiếu hụt")
        )
    ),
    Word(
        id = "debilitating",
        term = "Debilitating",
        pronunciation = "/dɪˈbɪlɪteɪtɪŋ/",
        shortDefinition = "Làm suy nhược, làm kiệt quệ (thể chất/tâm lý).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Making someone very weak and infirm.",
        vietnameseDiff = "Tính chất của một căn bệnh, một thói quen hoặc trạng thái lo âu kéo dài làm bào mòn, hút cạn năng lượng và sức sống của một người.",
        exampleSentence = "Chronically toxic thoughts can have a debilitating effect on your mental health.",
        nuanceInfo = "Dùng nhiều trong cả y học và tâm lý học. Ví dụ một 'debilitating anxiety' là chứng lo âu nặng đến mức khiến bạn bất động, không thể bước ra ngoài hay làm việc bình thường.",
        collocations = listOf("Debilitating illness", "Debilitating effect", "Debilitating condition"),
        relatedWords = listOf(
            RelatedWord("Weakening", "Làm yếu đi"),
            RelatedWord("Crippling", "Làm tê liệt, tàn phế")
        )
    ),
    Word(
        id = "debunk",
        term = "Debunk",
        pronunciation = "/ˌdiːˈbʌŋk/",
        shortDefinition = "Bóc trần, vạch trần (sự thật, tin đồn nhảm).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Expose the falseness or hollowness of a myth, idea, or belief.",
        vietnameseDiff = "Hành động sử dụng bằng chứng logic, khoa học hoặc dữ liệu thực tế để đập tan, vạch trần những thông tin sai lệch hoặc tin đồn nhảm nhí.",
        exampleSentence = "The algorithm expert completely debunked the myth about instant view hacks.",
        nuanceInfo = "Xuất hiện cực kỳ phổ biến trên môi trường mạng xã hội hiện đại. Khi bạn 'debunk' một thứ gì đó, bạn mang ánh sáng khoa học và tư duy phản biện để quét sạch sự credulous (cả tin) của đám đông.",
        collocations = listOf("Debunk a myth", "Debunk a theory", "Completely debunk"),
        relatedWords = listOf(
            RelatedWord("Expose", "Vạch trần, phơi bày"),
            RelatedWord("Disprove", "Bác bỏ")
        )
    ),
    Word(
        id = "decorum",
        term = "Decorum",
        pronunciation = "/dɪˈkɔːrəm/",
        shortDefinition = "Sự trang trọng, lịch thiệp, đúng mực.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Behavior in keeping with good taste and propriety.",
        vietnameseDiff = "Danh từ chỉ những quy chuẩn hành vi ứng xử lịch sự, có văn hóa, phù hợp với thuần phong mỹ tục hoặc bầu không khí trang trọng của một buổi lễ.",
        exampleSentence = "You should maintain a sense of decorum when speaking with senior business partners.",
        nuanceInfo = "Ngược lại hoàn toàn với 'Churlish' hay 'Boorish'. Decorum không chỉ là phép lịch sự xã giao, nó là sự tự tôn và tôn trọng môi trường xung quanh thông qua trang phục, lời nói và hành động.",
        collocations = listOf("Maintain decorum", "Sense of decorum", "Strict decorum"),
        relatedWords = listOf(
            RelatedWord("Propriety", "Sự đúng đắn, lễ độ"),
            RelatedWord("Etiquette", "Phép xã giao, nghi thức")
        )
    ),
    Word(
        id = "deference",
        term = "Deference",
        pronunciation = "/ˈdefərəns/",
        shortDefinition = "Sự tôn kính, tôn trọng và nhượng bộ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Humble submission and respect.",
        vietnameseDiff = "Thái độ tôn trọng sâu sắc, sẵn sàng lắng nghe và nhún nhường trước ý kiến, quyết định của những người có bề dày kinh nghiệm hoặc bậc bề trên.",
        exampleSentence = "He bowed his head in deference to his father's final decision on property division.",
        nuanceInfo = "Cấu trúc kinh điển là 'In deference to someone/something'. Đây là một dạng hành vi ứng xử thông minh, thể hiện cái tôi đã được kiềm chế để tôn vinh giá trị của người đi trước.",
        collocations = listOf("In deference to", "Show deference", "Out of deference"),
        relatedWords = listOf(
            RelatedWord("Respect", "Sự tôn trọng"),
            RelatedWord("Reverence", "Sự tôn kính, sùng kính")
        )
    ),
    Word(
        id = "defiance",
        term = "Defiance",
        pronunciation = "/dɪˈfaɪəns/",
        shortDefinition = "Sự thách thức, ngang tàng, chống đối.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Open resistance; bold disobedience.",
        vietnameseDiff = "Hành động hoặc thái độ công khai ngẩng cao đầu chống đối, không tuân thủ mệnh lệnh hoặc thách thức chính quyền, luật lệ.",
        exampleSentence = "His dynamic content was an act of open defiance against traditional styles.",
        nuanceInfo = "Mang năng lượng nổi loạn mạnh mẽ. Khác với sự chống đối lén lút (Clandestine), 'Defiance' là bước ra ánh sáng, chấp nhận va chạm ba mặt một lời (Confrontational) để bảo vệ bản sắc của mình.",
        collocations = listOf("Act of defiance", "In defiance of", "Open defiance"),
        relatedWords = listOf(
            RelatedWord("Resistance", "Sự kháng cự, chống cự"),
            RelatedWord("Disobedience", "Sự không vâng lời")
        )
    ),
    Word(
        id = "deleterious",
        term = "Deleterious",
        pronunciation = "/ˌdeləˈtɪəriəs/",
        shortDefinition = "Gây hại, có hại cho sức khỏe/sự phát triển.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Causing harm or damage.",
        vietnameseDiff = "Tính chất gây ra những tổn hại ngầm, từ từ nhưng cực kỳ nguy hiểm cho sự phát triển lâu dài của một cá nhân hay một tập thể.",
        exampleSentence = "Spending too much time reading cynical comments can have a deleterious effect on your mind.",
        nuanceInfo = "Trang trọng hơn 'Harmful'. Từ này thường dùng để mô tả những tác động tiêu cực tích tụ theo thời gian mà giai đoạn đầu chủ thể khó lòng nhận biết được (như thói quen xấu, hóa chất độc hại).",
        collocations = listOf("Deleterious effect", "Deleterious impact", "Highly deleterious"),
        relatedWords = listOf(
            RelatedWord("Harmful", "Có hại"),
            RelatedWord("Detrimental", "Thiệt hại, bất lợi")
        )
    ),
    Word(
        id = "delusion",
        term = "Delusion",
        pronunciation = "/dɪˈluːʒn/",
        shortDefinition = "Sự hoang tưởng, ảo tưởng nặng nề.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "An idiosyncratic belief or impression that is firmly maintained despite being contradicted by what is generally accepted as reality.",
        vietnameseDiff = "Một niềm tin sai lệch, hoang tưởng ăn sâu vào tâm trí, khiến chủ thể bám chặt lấy nó dù thực tế và bằng chứng logic đã chứng minh điều ngược lại.",
        exampleSentence = "Thinking you can build a massive app in two days without code knowledge is a pure delusion.",
        nuanceInfo = "Trong tâm thần học, 'Delusion' là triệu chứng của việc mất kết nối với thực tại. Khác với 'Illusion' (Ảo ảnh thị giác thoáng qua), Delusion là một cấu trúc niềm tin độc hại bọc lấy cái tôi để né tránh sự thật.",
        collocations = listOf("Under the delusion that", "Grandeur delusion", "Pure delusion"),
        relatedWords = listOf(
            RelatedWord("Illusion", "Ảo tưởng, ảo ảnh"),
            RelatedWord("Hallucination", "Ảo giác")
        )
    ),
    Word(
        id = "demeanor",
        term = "Demeanor",
        pronunciation = "/dɪˈmiːnə(r)/",
        shortDefinition = "Thần thái, phong thái, cách hành xử bề ngoài.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Outward behavior or bearing.",
        vietnameseDiff = "Toàn bộ phong thái, nét mặt, cách đi đứng và biểu cảm lộ ra bên ngoài của một người, giúp người khác đọc vị được tâm lý của họ.",
        exampleSentence = "A calm and professional demeanor will automatically attract high-value clients.",
        nuanceInfo = "Thần thái (Demeanor) chính là chiếc gương phản chiếu thế giới nội tâm hoặc sự gồng mình kiểm soát cảm xúc của bạn. Một người charismatic luôn sở hữu một demeanor cực kỳ cuốn hút và vững chãi.",
        collocations = listOf("Calm demeanor", "Professional demeanor", "General demeanor"),
        relatedWords = listOf(
            RelatedWord("Bearing", "Dáng bộ, tác phong"),
            RelatedWord("Behavior", "Hành vi, cách ứng xử")
        )
    ),
    Word(
        id = "demoralize",
        term = "Demoralize",
        pronunciation = "/dɪˈmɒrəlaɪz/",
        shortDefinition = "Làm nản lòng, đánh sập ý chí chiến đấu.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Cause someone to lose confidence or hope; dispirit.",
        vietnameseDiff = "Hành động dội một gáo nước lạnh vào tinh thần, khiến ai đó hoàn toàn mất đi sự tự tin, lòng nhiệt huyết và ý chí phấn đấu.",
        exampleSentence = "Severe, non-constructive criticism will easily demoralize young content creators.",
        nuanceInfo = "Đánh thẳng vào tâm lý (Morale - Tinh thần chiến đấu). Khi một đội ngũ bị 'demoralized', họ sẽ làm việc lấy lệ, buông xuôi và không còn khát vọng cống hiến.",
        collocations = listOf("Completely demoralize", "Demoralize the team", "Demoralizing effect"),
        relatedWords = listOf(
            RelatedWord("Dishearten", "Làm ngã lòng, nản lòng"),
            RelatedWord("Discourage", "Làm mất can đảm, ngăn cản")
        )
    ),
    Word(
        id = "denounce",
        term = "Denounce",
        pronunciation = "/dɪˈnaʊns/",
        shortDefinition = "Lên án, tố cáo công khai.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Publicly declare to be wrong or evil.",
        vietnameseDiff = "Hành động thẳng thừng chỉ trích, lên án hoặc đứng ra tố cáo một hành vi sai trái, bất công trước công luận một cách mạnh mẽ.",
        exampleSentence = "The community stepped up to denounce the scammer's clandestine activities.",
        nuanceInfo = "Mạnh hơn 'Criticize'. Denounce mang màu sắc của công lý và đạo đức, vạch một đường ranh giới rõ ràng giữa đúng và sai, ép đối tượng phải đối mặt với làn sóng phán xét từ xã hội.",
        collocations = listOf("Publicly denounce", "Denounce violence", "Denounce a treaty"),
        relatedWords = listOf(
            RelatedWord("Condemn", "Kết án, kết tội"),
            RelatedWord("Accuse", "Buộc tội, tố cáo")
        )
    ),
    Word(
        id = "deplorable",
        term = "Deplorable",
        pronunciation = "/dɪˈplɔːrəbl/",
        shortDefinition = "Đáng kinh tởm, tồi tệ, không thể chấp nhận được.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Deserving strong condemnation; completely unacceptable.",
        vietnameseDiff = "Tính chất của một hành vi, trạng thái hoặc điều kiện sống quá tồi tệ, rách nát hoặc suy đồi đạo đức ở mức nghiêm trọng đáng bị xã hội lên án.",
        exampleSentence = "The callous treatment of the animals was in a deplorable state.",
        nuanceInfo = "Thường dùng để lột tả sự phẫn nộ đạo đức sâu sắc. Khi bạn gọi hành vi của ai đó là 'deplorable', nghĩa là nó đã chạm đến đáy của sự vô văn hóa hoặc tàn nhẫn.",
        collocations = listOf("Deplorable conditions", "Deplorable behavior", "Deplorable lack of"),
        relatedWords = listOf(
            RelatedWord("Disgraceful", "Nhục nhã, hổ thẹn"),
            RelatedWord("Shameful", "Đáng xấu hổ")
        )
    ),
    Word(
        id = "depravity",
        term = "Depravity",
        pronunciation = "/dɪˈprævəti/",
        shortDefinition = "Sự suy đồi đạo đức, sự sa đọa biến chất.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Moral corruption; wickedness.",
        vietnameseDiff = "Danh từ chỉ sự băng hoại, biến chất hoàn toàn về mặt nhân cách và đạo đức, sa đà vào những hành vi độc hại vô luân.",
        exampleSentence = "The dark web hidden rooms revealed the shocking depths of human depravity.",
        nuanceInfo = "Đây là một trong những từ mạnh nhất để mô tả bóng tối trong tâm lý con người. Nó không còn là sai lầm nhất thời nữa, mà là một lối sống quay lưng hoàn toàn với các giá trị nhân văn tối thiểu.",
        collocations = listOf("Moral depravity", "Depths of depravity", "Act of depravity"),
        relatedWords = listOf(
            RelatedWord("Corruption", "Sự tham nhũng, suy đồi"),
            RelatedWord("Wickedness", "Tính độc ác, tính xấu xa")
        )
    ),
    Word(
        id = "deprecate",
        term = "Deprecate",
        pronunciation = "/ˈdeprəkeɪt/",
        shortDefinition = "Phản đối, tự hạ thấp (khiêm tốn).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Express disapproval of; (self-deprecating) modest about or critical of oneself.",
        vietnameseDiff = "Hành động thể hiện sự không tán thành; đặc biệt phổ biến trong cụm 'Self-deprecating' (tự giễu, tự lôi khuyết điểm của mình ra đùa một cách duyên dáng).",
        exampleSentence = "He used self-deprecating humor on his TikTok channel to build a soft boy persona.",
        nuanceInfo = "Trong tâm lý học giao tiếp, 'Self-deprecating humor' là một vũ khí tối thượng của người có trí tuệ cảm xúc cao (EQ). Nó giúp xóa bỏ khoảng cách, làm giảm sự đố kỵ của người khác và tạo cảm giác gần gũi.",
        collocations = listOf("Self-deprecating humor", "Deprecate the value of", "Self-deprecating remark"),
        relatedWords = listOf(
            RelatedWord("Disapprove", "Không tán thành"),
            RelatedWord("Belittle", "Xem nhẹ, hạ thấp")
        )
    ),
    Word(
        id = "derelict",
        term = "Derelict",
        pronunciation = "/ˈderəlɪkt/",
        shortDefinition = "Bị bỏ hoang, vô chủ, xơ xác.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "In a very poor condition as a result of disuse and neglect.",
        vietnameseDiff = "Trạng thái hoang tàn, rách nát của một ngôi nhà, mảnh đất hoặc tài sản do lâu ngày không có người ngó ngàng, chăm sóc.",
        exampleSentence = "They turned the old, derelict building into a trendy, modern coffee shop.",
        nuanceInfo = "Gợi hình ảnh rất rõ ràng về mặt không gian (Aesthetic). Nghĩa bóng trong công việc, 'Dereliction of duty' có nghĩa là sự trốn tránh, bỏ bê trách nhiệm công việc một cách vô kỷ luật.",
        collocations = listOf("Derelict building", "Derelict site", "Dereliction of duty"),
        relatedWords = listOf(
            RelatedWord("Abandoned", "Bị bỏ rơi, ruồng bỏ"),
            RelatedWord("Dilapidated", "Đổ nát, xiêu vẹo")
        )
    ),
        Word(
        id = "deride",
        term = "Deride",
        pronunciation = "/dɪˈraɪd/",
        shortDefinition = "Chế giễu, nhạo báng, cười cợt khinh bỉ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Express contempt for; ridicule or mock.",
        vietnameseDiff = "Hành động buông lời cay đắng, cười nhạo hoặc đem sai lầm, ngoại hình của người khác ra làm trò hề trước đám đông với thái độ coi thường.",
        exampleSentence = "Critics began to deride his early data structure formulas, calling them overly simplistic.",
        nuanceInfo = "Mạnh hơn 'Mock' hay 'Laugh at'. Deride chứa đựng hàm lượng định kiến và sự ác ý cao, nhằm mục đích hạ bệ uy tín hoặc làm bêu rếu lòng tự trọng của đối phương trước công chúng.",
        collocations = listOf("Deride someone's efforts", "Derided by critics", "Openly deride"),
        relatedWords = listOf(
            RelatedWord("Ridicule", "Nhạo báng, giễu cợt"),
            RelatedWord("Mock", "Chế nhạo, giả giọng giễu cợt")
        )
    ),
    Word(
        id = "derivative",
        term = "Derivative",
        pronunciation = "/dɪˈrɪvətɪv/",
        shortDefinition = "Bắt chước, rập khuôn, không có tính sáng tạo.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Imitative of the work of another person, and usually disapproved of for that reason.",
        vietnameseDiff = "Tính chất của một tác phẩm nghệ thuật, video hoặc ý tưởng kinh doanh bị xào nấu, sao chép lại từ nguồn khác mà không có bất kỳ dấu ấn cá nhân đột phá nào.",
        exampleSentence = "His early video concepts were criticized for being too derivative of Western trends.",
        nuanceInfo = "Trong ngành sáng tạo nội dung hoặc nghệ thuật, đây là một lời chê khá nặng. Nó ám chỉ chủ thể chỉ biết chạy theo xu hướng (Trend-follower) một cách máy móc thay vì tự định hình phong cách riêng.",
        collocations = listOf("Highly derivative", "Derivative work", "Derivative style"),
        relatedWords = listOf(
            RelatedWord("Imitative", "Có tính chất bắt chước"),
            RelatedWord("Unoriginal", "Không nguyên bản, không độc đáo")
        )
    ),
    Word(
        id = "desolate",
        term = "Desolate",
        pronunciation = "/ˈdesələt/",
        shortDefinition = "Hoang vắng, tiêu điều, cô độc lạnh lẽo.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Deserted of people and in a state of bleak and dismal emptiness.",
        vietnameseDiff = "Trạng thái không gian trống rỗng, tiêu điều không một bóng người; hoặc trạng thái tâm lý cô đơn, buồn tủi đến mức ruột gan trống rỗng sau một biến cố lớn.",
        exampleSentence = "The old land lot looked completely desolate in the heavy rain.",
        nuanceInfo = "Vừa dùng cho ngoại cảnh (phong cảnh hoang vu, xơ xác) vừa dùng cho tâm cảnh (lòng buồn rười rượi, tan nát). Nó gợi lên một cảm giác mất mát, thiếu vắng sự sống và hơi ấm.",
        collocations = listOf("Desolate landscape", "Feel desolate", "Desolate street"),
        relatedWords = listOf(
            RelatedWord("Bleak", "Trống trải, ảm đạm"),
            RelatedWord("Barren", "Cằn cỗi, xơ xác")
        )
    ),
    Word(
        id = "despondent",
        term = "Despondent",
        pronunciation = "/dɪˈspɒndənt/",
        shortDefinition = "Nản lòng, tuyệt vọng, mất sạch nhuệ khí.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "In low spirits from loss of hope or courage.",
        vietnameseDiff = "Trạng thái tinh thần suy sụp, buồn bã và buông xuôi hoàn toàn vì cảm thấy mọi nỗ lực của mình đều đổ sông đổ biển và không còn cơ hội lật ngược thế cờ.",
        exampleSentence = "He grew despondent after his secondary channel was permanently banned.",
        nuanceInfo = "Nặng hơn 'Sad' hay 'Discouraged'. Người rơi vào trạng thái 'despondent' thường có xu hướng thu mình lại, tắt hết mọi liên lạc và chìm đắm vào cảm giác bất lực (Helplessness) một thời gian dài.",
        collocations = listOf("Deeply despondent", "Become despondent", "Despondent mood"),
        relatedWords = listOf(
            RelatedWord("Dejected", "Chán nản, thất vọng"),
            RelatedWord("Hopeless", "Tuyệt vọng, không còn hy vọng")
        )
    ),
    Word(
        id = "despot",
        term = "Despot",
        pronunciation = "/ˈdespɒt/",
        shortDefinition = "Kẻ bạo chúa, kẻ độc tài chuyên quyền.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A ruler or other person who holds absolute power, typically one who exercises it in a cruel or oppressive way.",
        vietnameseDiff = "Danh từ chỉ một người nắm giữ quyền lực tuyệt đối trong tay và luôn vận dụng nó một cách độc đoán, tàn nhẫn để ép buộc cấp dưới phải phục tùng không điều kiện.",
        exampleSentence = "The manager behaved like a minor despot, controlling every small task in the shop.",
        nuanceInfo = "Nghĩa gốc dùng cho các quân chủ độc tài thời xưa. Nghĩa bóng trong quản trị hiện đại dùng để ám chỉ những người sếp mắc hội chứng 'Micromanagement' (quản lý vi mô) cực đoan, bóp nghẹt quyền tự quyết của nhân viên.",
        collocations = listOf("Benevolent despot", "Enlightened despot", "Cruel despot"),
        relatedWords = listOf(
            RelatedWord("Tyrant", "Bạo chúa, kẻ bạo ngược"),
            RelatedWord("Dictator", "Kẻ độc tài")
        )
    ),
    Word(
        id = "detached",
        term = "Detached",
        pronunciation = "/dɪˈtætʃt/",
        shortDefinition = "Thờ ơ, vô can, giữ khoảng cách cảm xúc.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Aloof and objective; separate or disconnected.",
        vietnameseDiff = "Thái độ cố tình đứng ngoài cuộc, không để bản thân bị cuốn vào các drama cảm xúc hoặc xung đột xung quanh nhằm giữ sự tỉnh táo, khách quan.",
        exampleSentence = "He maintained a detached attitude during the heated family argument.",
        nuanceInfo = "Có thể mang nghĩa tích cực hoặc tiêu cực. Trong tranh luận, 'detached judgment' (phán quyết khách quan) là một điểm cộng lớn. Nhưng trong các mối quan hệ tình cảm, sự 'detached' quá mức lại biến bạn thành kẻ callous (lạnh lùng, thờ ơ).",
        collocations = listOf("Detached house", "Detached attitude", "Remain detached"),
        relatedWords = listOf(
            RelatedWord("Aloof", "Hờ hững, lạnh lùng"),
            RelatedWord("Indifferent", "Lãnh đạm, thờ ơ")
        )
    ),
    Word(
        id = "deterrent",
        term = "Deterrent",
        pronunciation = "/dɪˈterənt/",
        shortDefinition = "Biện pháp răn đe, cái vạch ra để ngăn chặn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A thing that discourages or is intended to discourage someone from doing something.",
        vietnameseDiff = "Một hình phạt, quy định hoặc rào cản được dựng lên nhằm mục đích đánh vào tâm lý sợ hãi của đối phương, khiến họ từ bỏ ý định làm bậy.",
        exampleSentence = "Installing visible cameras acts as an effective deterrent against shoplifting.",
        nuanceInfo = "Ý tưởng cốt lõi của 'Deterrence' là phòng bệnh hơn chữa bệnh. Khi hình phạt đủ nặng và rõ ràng, người ta sẽ tự động cân nhắc rủi ro (Risk assessment) mà chột dạ dừng lại (Compunction).",
        collocations = listOf("Nuclear deterrent", "Effective deterrent", "Serve as a deterrent"),
        relatedWords = listOf(
            RelatedWord("Obstacle", "Trở ngại, vướng mắc"),
            RelatedWord("Disincentive", "Sự triệt tiêu động lực")
        )
    ),
    Word(
        id = "detrimental",
        term = "Detrimental",
        pronunciation = "/ˌdetrɪˈmentl/",
        shortDefinition = "Gây thiệt hại, bất lợi, có hại.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Tending to cause harm.",
        vietnameseDiff = "Tính chất gây ra những tác động tiêu cực, làm giảm sút chất lượng hoặc gây thiệt hại trực tiếp đến quyền lợi và sức khỏe của chủ thể.",
        exampleSentence = "Lack of sleep is highly detrimental to a programmer's cognitive functions.",
        nuanceInfo = "Thường đi với cấu trúc 'Detrimental to something'. Gần nghĩa với 'Deleterious' nhưng từ này được dùng rộng rãi hơn trong cả đời sống, kinh tế và sức khỏe thông thường.",
        collocations = listOf("Detrimental effect", "Detrimental impact", "Highly detrimental"),
        relatedWords = listOf(
            RelatedWord("Harmful", "Có hại"),
            RelatedWord("Damaging", "Gây tổn hại, thiệt hại")
        )
    ),
    Word(
        id = "deviate",
        term = "Deviate",
        pronunciation = "/ˈdiːvieɪt/",
        shortDefinition = "Chệch hướng, đi lệch khỏi quỹ đạo/quy chuẩn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Depart from an established course or common norm.",
        vietnameseDiff = "Hành động tự ý rẽ hướng, làm khác đi hoặc đi lệch khỏi kế hoạch ban đầu, tiêu chuẩn xã hội hoặc thuật toán đã được thiết lập sẵn.",
        exampleSentence = "Do not deviate from the original source code structure during this update.",
        nuanceInfo = "Thường đi với giới từ 'from'. Trong xã hội, 'deviant behavior' (hành vi lệch chuẩn) dùng để chỉ những người có lối sống đi ngược lại hoàn toàn với số đông, chấp nhận bị dính nhãn nổi loạn.",
        collocations = listOf("Deviate from the norm", "Deviate from the plan", "Slightly deviate"),
        relatedWords = listOf(
            RelatedWord("Diverge", "Phân nhánh, rẽ ra"),
            RelatedWord("Stray", "Lầm đường, lạc lối")
        )
    ),
    Word(
        id = "devious",
        term = "Devious",
        pronunciation = "/ˈdiːviəs/",
        shortDefinition = "Láu cá, quỷ quyệt, quanh co đầy mưu mô.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Showing a skillful use of underhanded tactics to achieve goals.",
        vietnameseDiff = "Tính cách hoặc thủ đoạn sử dụng những mánh khóe ngầm, không trung thực một cách khôn khéo để đạt được lợi ích cá nhân mà không bị phát hiện.",
        exampleSentence = "He came up with a devious plan to outsmart his business rivals.",
        nuanceInfo = "Khác với 'Smart' hay 'Clever'. 'Devious' luôn có mùi vị của sự gian lận lén lút (Clandestine) và thông đồng (Collusion). Người mang tính cách này rất giỏi đọc vị tâm lý để thao túng người khác.",
        collocations = listOf("Devious plan", "Devious mind", "Devious method"),
        relatedWords = listOf(
            RelatedWord("Underhanded", "Lén lút, giấu giếm"),
            RelatedWord("Crafty", "Xảo quyệt, láu cá")
        )
    ),
    Word(
        id = "devoid",
        term = "Devoid",
        pronunciation = "/dɪˈvɔɪd/",
        shortDefinition = "Trống rỗng, hoàn toàn không có chút nào.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Entirely lacking or free from.",
        vietnameseDiff = "Trạng thái một sự vật, lời nói hoặc gương mặt hoàn toàn trống rỗng, không chứa đựng một chút đặc tính hay cảm xúc nào đáng lẽ phải có.",
        exampleSentence = "His voice was completely devoid of emotion when he delivered the bad news.",
        nuanceInfo = "Bắt buộc phải đi với giới từ 'of' ('Devoid of something'). Nó nhấn mạnh một sự trống rỗng tuyệt đối, giống như một căn phòng bị hút sạch không khí hoặc một bài viết hoàn toàn thiếu tính logic (Coherent).",
        collocations = listOf("Devoid of emotion", "Devoid of interest", "Completely devoid"),
        relatedWords = listOf(
            RelatedWord("Lacking", "Thiếu thốn"),
            RelatedWord("Empty", "Trống rỗng, trống không")
        )
    ),
    Word(
        id = "dexterity",
        term = "Dexterity",
        pronunciation = "/dekˈsterəti/",
        shortDefinition = "Sự khéo léo, nhanh nhẹn (tay chân/đầu óc).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Skill in performing tasks, especially with the hands.",
        vietnameseDiff = "Danh từ chỉ sự dẻo dai, khéo léo tuyệt vời của đôi bàn tay khi làm các công việc tỉ mỉ, hoặc sự nhạy bén, linh hoạt của bộ não khi xử lý tình huống hóc búa.",
        exampleSentence = "Playing musical instruments or practicing martial arts requires high physical dexterity.",
        nuanceInfo = "Nghĩa gốc thiên về sự khéo tay (như bác sĩ phẫu thuật, nghệ sĩ múa). Nghĩa bóng 'Mental dexterity' chỉ một tư duy nhạy bén (Agile mind), có khả năng chuyển đổi chiến lược cực nhanh khi gặp conundrum (bài toán hóc búa).",
        collocations = listOf("Manual dexterity", "Mental dexterity", "Physical dexterity"),
        relatedWords = listOf(
            RelatedWord("Agility", "Sự nhanh nhẹn, lanh lẹ"),
            RelatedWord("Skillfulness", "Sự khéo léo, tài tình")
        )
    ),
    Word(
        id = "diatribe",
        term = "Diatribe",
        pronunciation = "/ˈdaɪətraɪb/",
        shortDefinition = "Bài chỉ trích kịch liệt, bài chửi bới om sòm.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A forceful and bitter verbal attack against someone or something.",
        vietnameseDiff = "Một bài văn, bài nói hoặc chuỗi bình luận dài dằng dặc đầy cay độc, giận dữ nhằm mục đích lăng mạ, sỉ vả công khai một cá nhân hoặc tổ chức.",
        exampleSentence = "The angry customer launched into a long diatribe against the shop's service.",
        nuanceInfo = "Khác với một lời phê bình mang tính xây dựng (Constructive criticism). Diatribe hoàn toàn là sự trút giận cảm xúc (Emotional dumping) mang năng lượng thù địch mạnh mẽ, nhằm làm nhục nhã (Humiliate) đối phương.",
        collocations = listOf("Bitter diatribe", "Launch into a diatribe", "Vicious diatribe"),
        relatedWords = listOf(
            RelatedWord("Harangue", "Bài diễn văn dài dòng chán ngắt/gắt gỏng"),
            RelatedWord("Tirade", "Tràng đả kích, tràng chửi rủa")
        )
    ),
    Word(
        id = "didactic",
        term = "Didactic",
        pronunciation = "/daɪˈdæktɪk/",
        shortDefinition = "Có tính chất giáo điều, thích lên lớp dạy đời.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Intended to teach, particularly in having moral instruction as an ulterior motive.",
        vietnameseDiff = "Tính chất của một nội dung, lời nói cố tình lồng ghép các bài học đạo đức một cách quá đà, tạo cảm giác bề trên, thích dạy đời khiến người nghe khó chịu.",
        exampleSentence = "Audiences online prefer authentic stories over preachy, didactic videos.",
        nuanceInfo = "Nghĩa gốc trong giáo dục học là 'thuộc về giảng dạy' (trung tính). Nhưng trong văn cảnh giao tiếp hiện đại, từ này mang sắc thái hơi tiêu cực: Chỉ những kẻ thích gồng lên làm thầy thiên hạ, thiếu đi sự tinh tế và lắng nghe.",
        collocations = listOf("Didactic approach", "Didactic tone", "Highly didactic"),
        relatedWords = listOf(
            RelatedWord("Preachy", "Thích lên lớp, thuyết giáo"),
            RelatedWord("Instructional", "Có tính chất hướng dẫn")
        )
    ),
        Word(
        id = "diffident",
        term = "Diffident",
        pronunciation = "/ˈdɪfɪdənt/",
        shortDefinition = "Nhút nhát, rụt rè, thiếu tự tin vào bản thân.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Modest or shy because of a lack of self-confidence.",
        vietnameseDiff = "Trạng thái tâm lý e dè, rụt rè, không dám lên tiếng hoặc thể hiện tài năng trước đám đông vì luôn tự ti về năng lực hoặc ngoại hình của mình.",
        exampleSentence = "Behind his bold TikTok persona, he was actually a diffident young man in real life.",
        nuanceInfo = "Ngược lại với 'Confident'. Một người 'diffident' thường có xu hướng đứng nép vào góc phòng, ngại va chạm cảm xúc và liên tục hoài nghi giá trị nội tại của chính mình.",
        collocations = listOf("Diffident manner", "Diffident smile", "Highly diffident"),
        relatedWords = listOf(
            RelatedWord("Shy", "Nhút nhát, bẽn lẽn"),
            RelatedWord("Timorous", "Rụt rè, sợ sệt")
        )
    ),
    Word(
        id = "digress",
        term = "Digress",
        pronunciation = "/daɪˈɡres/",
        shortDefinition = "Lạc đề, nói giông dài rời xa chủ đề chính.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Leave the main subject temporarily in speech or writing.",
        vietnameseDiff = "Hành động vô tình hoặc cố ý lái câu chuyện, bài viết sang một hướng hoàn toàn khác, không liên quan gì đến nội dung cốt lõi đang tranh luận.",
        exampleSentence = "To focus on the land division certificate, let us not digress into past family dramas.",
        nuanceInfo = "Cụm từ cửa miệng kinh điển là 'But I digress' (Nhưng tôi đã lạc đề rồi - dùng khi sực nhận ra mình đang nói nhảm và muốn quay lại ý chính). Giúp giữ cho tư duy giao tiếp mang tính coherent (mạch lạc).",
        collocations = listOf("Digress from the subject", "But I digress", "Tend to digress"),
        relatedWords = listOf(
            RelatedWord("Deviate", "Chệch hướng"),
            RelatedWord("Stray", "Lạc lối, đi tản mát")
        )
    ),
    Word(
        id = "diligent",
        term = "Diligent",
        pronunciation = "/ˈdɪlɪdʒənt/",
        shortDefinition = "Siêng năng, cần cù, làm việc có hệ thống.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Having or showing care and conscientiousness in one's work or duties.",
        vietnameseDiff = "Tính cẩn trọng, siêng năng và kiên trì bám đuổi công việc cho đến khi ra kết quả, không làm việc theo kiểu tùy hứng hay bỏ cuộc giữa chừng.",
        exampleSentence = "A diligent student will easily master complex data structures over time.",
        nuanceInfo = "Hay hơn 'Hard-working'. Diligent không chỉ là bán mạng làm việc chân tay, nó nhấn mạnh vào một nỗ lực thông minh, có kỷ luật tự giác cao (Conscientious) và cực kỳ bền bỉ.",
        collocations = listOf("Diligent student", "Diligent effort", "Highly diligent"),
        relatedWords = listOf(
            RelatedWord("Industrious", "Cần cù, siêng năng"),
            RelatedWord("Assiduous", "Chăm chỉ, cần mẫn")
        )
    ),
    Word(
        id = "diminish",
        term = "Diminish",
        pronunciation = "/dɪˈmɪnɪʃ/",
        shortDefinition = "Giảm bớt, làm suy giảm giá trị/uy tín.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Make or become less.",
        vietnameseDiff = "Hành động làm cho số lượng, mức độ hoặc tầm ảnh hưởng của một sự vật, cá nhân bị hao mòn và co hẹp lại rõ rệt.",
        exampleSentence = "Cynical updates will slowly diminish the trust of your app users.",
        nuanceInfo = "Vừa dùng cho vật lý (năng lượng giảm) vừa dùng cho tâm lý/xã hội (uy tín bị hạ bệ). Nó lột tả một quá trình đi xuống dần dần, làm lu mờ đi hào quang ban đầu.",
        collocations = listOf("Diminish the value of", "Diminish rapidly", "Nothing can diminish"),
        relatedWords = listOf(
            RelatedWord("Decrease", "Giảm đi"),
            RelatedWord("Dwindle", "Thu nhỏ lại, teo tóp lại")
        )
    ),
    Word(
        id = "discern",
        term = "Discern",
        pronunciation = "/dɪˈsɜːn/",
        shortDefinition = "Nhìn thấu, nhận thức rõ bằng trí tuệ.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Distinguish with difficulty by sight or with the other senses.",
        vietnameseDiff = "Hành động vận dụng nhãn quan sắc bén hoặc tư duy logic sâu sắc để nhìn ra bản chất thật sự ẩn giấu sau một đống thông tin hỗn loạn.",
        exampleSentence = "An experienced owner can easily discern genuine client feedback from malicious comments.",
        nuanceInfo = "Mạnh hơn 'See' hay 'Notice'. Discern đòi hỏi một sự tập trung cao độ và trải nghiệm sống dày dặn để lọc bỏ lớp sương mù ngụy trang (Camouflaged) bên ngoài, chạm vào cốt lõi vấn đề.",
        collocations = listOf("Discern the truth", "Difficult to discern", "Discern a pattern"),
        relatedWords = listOf(
            RelatedWord("Distinguish", "Phân biệt"),
            RelatedWord("Perceive", "Nhận thức, cảm nhận")
        )
    ),
    Word(
        id = "discrepancy",
        term = "Discrepancy",
        pronunciation = "/dɪˈskrepənsi/",
        shortDefinition = "Sự mâu thuẫn, lệch pha giữa các số liệu/thông tin.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "An illogical lack of compatibility or similarity between two or more facts.",
        vietnameseDiff = "Danh từ chỉ sự bất nhất, chênh lệch vô lý giữa hai nguồn thông tin, số liệu hoặc lời khai đáng lẽ ra phải trùng khớp hoàn toàn với nhau.",
        exampleSentence = "We found a major discrepancy between the physical land layout and the official red book description.",
        nuanceInfo = "Thường dùng trong kế toán, kiểm toán, lập trình hoặc pháp lý. Khi xuất hiện một 'discrepancy', hệ thống lập tức báo động vì có dấu hiệu của sai sót hoặc sự devious (quỷ quyệt, gian lận) ngầm.",
        collocations = listOf("Major discrepancy", "Discrepancy between", "Resolve a discrepancy"),
        relatedWords = listOf(
            RelatedWord("Inconsistency", "Sự bất nhất, không đồng đều"),
            RelatedWord("Disparity", "Sự chênh lệch, khác biệt")
        )
    ),
    Word(
        id = "disdain",
        term = "Disdain",
        pronunciation = "/dɪsˈdeɪn/",
        shortDefinition = "Sự khinh miệt, coi rẻ vì cho rằng không xứng tầm.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The feeling that someone or something is unworthy of one's consideration or respect.",
        vietnameseDiff = "Cảm xúc hoặc thái độ nhìn nhận đối phương như một kẻ thấp kém, vô giá trị và hoàn toàn không xứng đáng để mình bận tâm hay tôn trọng.",
        exampleSentence = "He treated the copycat creators with utter disdain.",
        nuanceInfo = "Đồng hạng nặng với 'Contempt'. Disdain thể hiện một cái tôi kiêu ngạo thượng đẳng. Người bộc lộ sự disdain thường dùng ánh mắt lạnh lùng, nụ cười nhếch mép để tạo khoảng cách xã hội.",
        collocations = listOf("With utter disdain", "Treat with disdain", "Disdain for authority"),
        relatedWords = listOf(
            RelatedWord("Contempt", "Sự khinh bỉ, coi thường"),
            RelatedWord("Scorn", "Sự dè bỉu, khinh miệt")
        )
    ),
    Word(
        id = "disillusioned",
        term = "Disillusioned",
        pronunciation = "/ˌdɪsɪˈluːʒnd/",
        shortDefinition = "Vỡ mộng, tỉnh ngộ sau khi nhận ra sự thật phũ phàng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Disappointed in someone or something that one discovers to be less good than one had believed.",
        vietnameseDiff = "Trạng thái tinh thần hụt hẫng, cay đắng khi chiếc mặt nạ màu hồng của một thần tượng, một mối quan hệ hoặc một lý tưởng bị sụp đổ trước thực tế trần trụi.",
        exampleSentence = "He became completely disillusioned with romance after the sudden breakup.",
        nuanceInfo = "Đây là bước ngoặt tâm lý quan trọng. Khi bạn bị 'disillusioned', bạn thoát khỏi vùng ảo tưởng (Delusion), chấp nhận đau một lần để nhìn thế giới bằng con mắt thực tế và trưởng thành hơn.",
        collocations = listOf("Completely disillusioned", "Disillusioned with life", "Become disillusioned"),
        relatedWords = listOf(
            RelatedWord("Disenchanted", "Hết ảo tưởng, tỉnh mộng"),
            RelatedWord("Disappointed", "Thất vọng")
        )
    ),
    Word(
        id = "disingenuous",
        term = "Disingenuous",
        pronunciation = "/ˌdɪsɪnˈdʒenjuəs/",
        shortDefinition = "Giả tạo, không thành thật, nói một đằng làm một nẻo.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Not candid or sincere, typically by pretending that one knows less about something than one really does.",
        vietnameseDiff = "Thái độ giả vờ ngây ngô, thảo mai, tỏ ra tử tế chân thành nhưng thực chất bên trong lại ẩn giấu mưu đồ cá nhân ích kỷ.",
        exampleSentence = "Her sudden, sweet apology felt highly disingenuous to everyone in the room.",
        nuanceInfo = "Ngược lại hoàn toàn với 'Candid'. Một hành vi 'disingenuous' là sự xúc phạm vào lòng tin của người khác, vì chủ thể cố tình thao túng cảm xúc đối phương bằng một bộ mặt giả tạo (Persona).",
        collocations = listOf("Disingenuous remarks", "Highly disingenuous", "Disingenuous excuse"),
        relatedWords = listOf(
            RelatedWord("Insincere", "Không chân thành, giả dối"),
            RelatedWord("Deceitful", "Dối trá, lừa lọc")
        )
    ),
    Word(
        id = "disparage",
        term = "Disparage",
        pronunciation = "/dɪˈspærɪdʒ/",
        shortDefinition = "Hạ thấp giá trị, gièm pha, coi nhẹ năng lực.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Regard or represent as being of little worth.",
        vietnameseDiff = "Hành động buông lời gièm pha, hạ bệ hoặc nói xấu nhằm làm giảm uy tín và giá trị những thành quả mà người khác đã cật lực đạt được.",
        exampleSentence = "Never disparage a competitor's business just to make yourself look better.",
        nuanceInfo = "Khác với phê bình khách quan. Disparage mang động cơ dìm hàng dơ bẩn, cố tình bóp méo sự thật để thỏa mãn sự đố kỵ (Covet) hoặc để thao túng tâm lý số đông.",
        collocations = listOf("Disparage someone's achievements", "Tend to disparage", "Publicly disparage"),
        relatedWords = listOf(
            RelatedWord("Belittle", "Hạ thấp, xem nhẹ"),
            RelatedWord("Deprecate", "Phản đối, coi thường")
        )
    ),
    Word(
        id = "disparity",
        term = "Disparity",
        pronunciation = "/dɪˈspærəti/",
        shortDefinition = "Sự chênh lệch lớn, sự bất bình đẳng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A great difference, especially one of unfair treatment.",
        vietnameseDiff = "Danh từ chỉ một khoảng cách, sự phân hóa sâu sắc và bất công giữa hai nhóm đối tượng (ví dụ: giàu nghèo, quyền lực, cơ hội).",
        exampleSentence = "The wealth disparity between macro and micro influencers is expanding rapidly.",
        nuanceInfo = "Nhấn mạnh vào tính chất *bất hợp lý hoặc bất công* của khoảng cách đó. Thuật ngữ này xuất hiện liên tục trong các bài viết nghị luận xã hội về vĩ mô hoặc phân tích thị trường kinh tế.",
        collocations = listOf("Economic disparity", "Huge disparity", "Disparity between"),
        relatedWords = listOf(
            RelatedWord("Inequality", "Sự bất bình đẳng"),
            RelatedWord("Imbalance", "Sự mất cân bằng")
        )
    ),
    Word(
        id = "disruptive",
        term = "Disruptive",
        pronunciation = "/dɪsˈrʌptɪv/",
        shortDefinition = "Mang tính đột phá, hoặc gây náo loạn phá vỡ trật tự.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Causing trouble and stopping something from continuing as usual; or radically innovative.",
        vietnameseDiff = "Tính chất làm đảo lộn, phá vỡ cấu trúc truyền thống cũ; mang nghĩa tích cực trong kinh doanh (đột phá thị trường) hoặc tiêu cực (gây rối phá đám).",
        exampleSentence = "Our language learning formula aims to be a highly disruptive force in the app market.",
        nuanceInfo = "Trong kinh doanh hiện đại, 'Disruptive technology' (Công nghệ mang tính cách mạng) là một lời khen tối thượng: Bạn tạo ra một luật chơi mới phá tan nếp cũ, buộc các đối thủ lâu đời phải thay đổi hoặc chấp nhận sụp đổ.",
        collocations = listOf("Disruptive technology", "Disruptive behavior", "Highly disruptive"),
        relatedWords = listOf(
            RelatedWord("Troublesome", "Gây phiền hà, rắc rối"),
            RelatedWord("Revolutionary", "Mang tính cách mạng, đột phá")
        )
    ),
    Word(
        id = "disseminate",
        term = "Disseminate",
        pronunciation = "/dɪˈsemɪneɪt/",
        shortDefinition = "Gieo rắc, lan truyền rộng rãi (thông tin, kiến thức).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Spread (something, especially information) widely.",
        vietnameseDiff = "Hành động phát tán, phủ sóng thông tin, tri thức hoặc các giá trị văn hóa đến một số lượng lớn quần chúng một cách có hệ thống.",
        exampleSentence = "TikTok is a powerful tool to quickly disseminate marketing hooks to millions of viewers.",
        nuanceInfo = "Nghĩa gốc liên quan đến gieo hạt giống (Seed). Nghĩa bóng dùng cho truyền thông: Bạn chủ động phân phối nội dung để nó bén rễ sâu vào tâm trí cộng đồng, tạo ra một làn sóng nhận thức rộng khắp.",
        collocations = listOf("Disseminate information", "Disseminate knowledge", "Widely disseminate"),
        relatedWords = listOf(
            RelatedWord("Spread", "Lan truyền, truyền bá"),
            RelatedWord("Broadcast", "Phát thanh, quảng bá rộng rãi")
        )
    ),
    Word(
        id = "divergent",
        term = "Divergent",
        pronunciation = "/daɪˈvɜːdʒənt/",
        shortDefinition = "Khác biệt, rẽ theo các hướng đối lập.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Tending to be different or develop in different directions.",
        vietnameseDiff = "Tính chất phân nhánh, tách rời và phát triển theo những con đường hoàn toàn trái ngược nhau từ một điểm chung ban đầu.",
        exampleSentence = "The two business partners eventually split up due to their divergent visions.",
        nuanceInfo = "Trong tư duy, 'Divergent thinking' (Tư duy phân kỳ) là năng lực đầu óc cực kỳ quan trọng của các nhà sáng tạo: Từ một bài toán duy nhất, bộ não nảy ra hàng trăm ý tưởng độc đáo khác nhau mà không bị bó hẹp.",
        collocations = listOf("Divergent thinking", "Divergent paths", "Divergent views"),
        relatedWords = listOf(
            RelatedWord("Different", "Khác biệt"),
            RelatedWord("Conflicting", "Mâu thuẫn, xung đột")
        )
    ),
    Word(
        id = "dogmatic",
        term = "Dogmatic",
        pronunciation = "/dɒɡˈmætɪk/",
        shortDefinition = "Độc đoán, bảo thủ, coi quan điểm của mình là chân lý.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Inclined to lay down principles as incontrovertibly true, without consideration of evidence or the opinions of others.",
        vietnameseDiff = "Thái độ cố chấp, áp đặt tư duy đạo đức hoặc nguyên tắc cá nhân lên người khác, khăng khăng mình luôn đúng mà hoàn toàn chặn đứng mọi bằng chứng khách quan.",
        exampleSentence = "Avoid a dogmatic approach when teaching language formulas; keep it adaptive.",
        nuanceInfo = "Gần nghĩa với 'Didactic' nhưng nặng nề hơn về tính chất áp đặt quyền lực. Một tư duy 'dogmatic' bóp chết mọi sự sáng tạo và linh hoạt (Agility), tạo ra một môi trường làm việc ngột ngạt.",
        collocations = listOf("Dogmatic attitude", "Dogmatic approach", "Highly dogmatic"),
        relatedWords = listOf(
            RelatedWord("Inflexible", "Cứng nhắc, không linh hoạt"),
            RelatedWord("Opinionated", "Cố chấp, ngoan cố giữ ý kiến")
        )
    ),
    Word(
        id = "drastic",
        term = "Drastic",
        pronunciation = "/ˈdræstɪk/",
        shortDefinition = "Mạnh mẽ, quyết liệt, có tác động sâu rộng.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Likely to have a strong or far-reaching effect; radical and extreme.",
        vietnameseDiff = "Tính chất của một hành động, biện pháp cực kỳ dứt khoát, mạnh tay nhằm giải quyết triệt để một cuộc khủng hoảng ngay lập tức.",
        exampleSentence = "We need to make a drastic change to the pricing strategy to attract more local clients.",
        nuanceInfo = "Thường dùng khi tình hình đã rơi vào thế chân tường. 'Drastic measures' (Biện pháp mạnh) đòi hỏi chủ thể phải chấp nhận rủi ro và đánh đổi lớn để đổi lấy một sự lột xác hoàn toàn.",
        collocations = listOf("Drastic action", "Drastic changes", "Take drastic measures"),
        relatedWords = listOf(
            RelatedWord("Radical", "Triệt để, tận gốc"),
            RelatedWord("Extreme", "Cực đoan, tột cùng")
        )
    ),
        Word(
        id = "dubious",
        term = "Dubious",
        pronunciation = "/ˈdjuːbiəs/",
        shortDefinition = "Mơ hồ, đáng nghi ngại, không đáng tin cậy.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Hesitating or doubting; not to be relied upon; suspect.",
        vietnameseDiff = "Tính chất của một thông tin, kế hoạch làm giàu hoặc hành vi mờ ám khiến người khác cảm thấy hoài nghi, bất an và không dám đặt lòng tin.",
        exampleSentence = "He was highly dubious about the shady agency's promise to clear photo watermarks instantly.",
        nuanceInfo = "Vừa chỉ trạng thái tâm lý nghi ngờ của chủ thể ('I am dubious about this plan'), vừa chỉ bản chất đáng ngờ của sự vật ('a dubious source'). Nó đóng vai trò như một hồi chuông cảnh báo trực giác (Intuition) trước khi bạn bị sập bẫy thao túng.",
        collocations = listOf("Dubious honor", "Highly dubious", "Dubious source"),
        relatedWords = listOf(
            RelatedWord("Doubtful", "Nghi ngờ, bất định"),
            RelatedWord("Suspicious", "Khả nghi, đáng ngờ")
        )
    ),
    Word(
        id = "duplicity",
        term = "Duplicity",
        pronunciation = "/djuːˈplɪsəti/",
        shortDefinition = "Sự lừa dối, gian trá, chơi trò hai mặt.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Deceitfulness in speech or conduct, as by speaking or acting in two different ways concerning the same matter.",
        vietnameseDiff = "Danh từ chỉ hành vi dối trá tinh vi, cố tình sống hai mặt, nói trước mặt một đằng nhưng sau lưng lại ngầm đâm chọc hoặc phá hoại người khác.",
        exampleSentence = "The sudden exposure of his rival's duplicity completely ruined their business relationship.",
        nuanceInfo = "Nặng hơn 'Lying' thông thường. Duplicity mang đậm tính chiến lược và cấu trúc: Bạn dựng lên một bộ mặt Persona thánh thiện để ru ngủ đối phương trong khi tay kia đang thực hiện một âm mưu quỷ quyệt (Devious).",
        collocations = listOf("Act of duplicity", "Uncover the duplicity", "Shocking duplicity"),
        relatedWords = listOf(
            RelatedWord("Deceitfulness", "Sự dối trá, xảo trá"),
            RelatedWord("Double-dealing", "Sự chơi trò hai mặt, lật lọng")
        )
    ),
    Word(
        id = "dwindle",
        term = "Dwindle",
        pronunciation = "/ˈdwɪndl/",
        shortDefinition = "Thu nhỏ lại, teo tóp, hao mòn dần dần.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Diminish gradually in size, amount, or strength.",
        vietnameseDiff = "Trạng thái số lượng, nguồn lực tài chính hoặc niềm đam mê bị co hẹp, cạn kiệt từ từ theo thời gian cho đến khi gần như không còn lại gì.",
        exampleSentence = "Without continuous viral hooks, your organic traffic will slowly dwindle.",
        nuanceInfo = "Khác với 'Plummet' (lao dốc thẳng đứng). Dwindle mô tả một sự xói mòn âm ỉ (Erosion), giống như một ngọn nến cháy lụi dần hoặc một tài khoản ngân hàng bị rút tỉa mỗi ngày một ít do quản lý kém.",
        collocations = listOf("Dwindle away", "Dwindling resources", "Dwindle rapidly"),
        relatedWords = listOf(
            RelatedWord("Diminish", "Làm giảm bớt, suy giảm"),
            RelatedWord("Shrink", "Co lại, rút lại")
        )
    ),
    Word(
        id = "earnest",
        term = "Earnest",
        pronunciation = "/ˈɜːnɪst/",
        shortDefinition = "Nghiêm túc, đứng đắn, chân thành tha thiết.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Resulting from or showing sincere and intense conviction.",
        vietnameseDiff = "Thái độ làm việc hoặc giao tiếp cực kỳ nghiêm túc, đặt trọn vẹn sự chân thành và tâm huyết vào đó, hoàn toàn không có chút cợt nhả hay hời hợt.",
        exampleSentence = "She made an earnest attempt to resolve the property division without going to court.",
        nuanceInfo = "Cụm từ kinh điển 'In earnest' nghĩa là bắt đầu làm một việc gì đó một cách thực sự nghiêm túc và quyết liệt sau giai đoạn chuẩn bị. Đây là phẩm chất của một người có tính kỷ luật cao (Conscientious).",
        collocations = listOf("In earnest", "Earnest desire", "Earnest request"),
        relatedWords = listOf(
            RelatedWord("Sincere", "Chân thành, thành thật"),
            RelatedWord("Solemn", "Trang trọng, nghiêm trang")
        )
    ),
    Word(
        id = "ebullient",
        term = "Ebullient",
        pronunciation = "/ɪˈbʌliənt/",
        shortDefinition = "Sôi nổi, tràn đầy năng lượng và nhiệt huyết.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Cheerful and full of energy.",
        vietnameseDiff = "Trạng thái tinh thần rực lửa, luôn tỏa ra nguồn năng lượng tích cực, hào hứng và sôi động khiến bầu không khí xung quanh bừng sáng.",
        exampleSentence = "His ebullient personality makes him perfect for hosting short-form entertainment videos.",
        nuanceInfo = "Mạnh hơn 'Happy' rất nhiều. Ebullient giống như một dòng nước sôi sùng sục đầy sức sống. Người sở hữu nét tính cách này thường có sức hút tự nhiên (Charismatic), dễ dàng khuấy động và lôi cuốn đám đông.",
        collocations = listOf("Ebullient mood", "Ebullient personality", "Ebullient style"),
        relatedWords = listOf(
            RelatedWord("Exuberant", "Cởi mở, dồi dào sức sống"),
            RelatedWord("Enthusiastic", "Hăng hái, nhiệt tình")
        )
    ),
    Word(
        id = "eccentric",
        term = "Eccentric",
        pronunciation = "/ɪkˈsentrɪk/",
        shortDefinition = "Lập dị, kỳ quặc, độc lạ khác người.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Unconventional and slightly strange.",
        vietnameseDiff = "Tính chất của một cá nhân có lối sống, tư duy hoặc phong cách ăn mặc khác người, không tuân theo các quy chuẩn thông thường nhưng thường mang tính giải trí hoặc sáng tạo cao.",
        exampleSentence = "The tech community loved the developer's eccentric but brilliant app formulas.",
        nuanceInfo = "Mang sắc thái trung tính hoặc hơi tích cực. Khác với 'Weird' (kỳ quặc gây khó chịu), một người 'eccentric' thường được coi là một thiên tài lập dị, một kẻ phá cách dám sống thật với bản sắc (Identity) của mình.",
        collocations = listOf("Eccentric behavior", "Eccentric genius", "Highly eccentric"),
        relatedWords = listOf(
            RelatedWord("Unconventional", "Trái với thói thường, độc đáo"),
            RelatedWord("Quirky", "Độc lạ, tinh nghịch")
        )
    ),
    Word(
        id = "eclectic",
        term = "Eclectic",
        pronunciation = "/ɪˈklektɪk/",
        shortDefinition = "Pha trộn nhiều phong cách, đa dạng, chọn lọc.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Deriving ideas, style, or taste from a broad and diverse range of sources.",
        vietnameseDiff = "Gu thẩm mỹ hoặc tư duy kết hợp hài hòa từ nhiều nguồn, nhiều trường phái và xu hướng khác nhau thay vì bó buộc trong một khuôn mẫu duy nhất.",
        exampleSentence = "His TikTok channel features an eclectic mix of modern street fashion and martial arts elements.",
        nuanceInfo = "Trong nghệ thuật và thiết kế, 'eclectic style' là một đỉnh cao của sự tinh tế: Bạn lấy những phần tinh túy nhất từ các nền văn hóa hoặc thời kỳ khác nhau để nhào nặn thành một tổng thể độc bản, không đụng hàng.",
        collocations = listOf("Eclectic mix", "Eclectic taste", "Eclectic approach"),
        relatedWords = listOf(
            RelatedWord("Diverse", "Phong phú, đa dạng"),
            RelatedWord("Wide-ranging", "Trải rộng, biên độ lớn")
        )
    ),
    Word(
        id = "efficacy",
        term = "Efficacy",
        pronunciation = "/ˈefɪkəsi/",
        shortDefinition = "Tính hiệu quả, năng lực tạo ra kết quả như ý.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The ability to produce a desired or intended result.",
        vietnameseDiff = "Danh từ trang trọng chỉ mức độ thành công và công hiệu thực tế của một phương pháp dạy học, một loại thuốc hoặc một chiến dịch marketing.",
        exampleSentence = "We need to test the technical efficacy of this algorithm before updating the core structure.",
        nuanceInfo = "Khác với 'Efficiency' (sự tối ưu hóa năng suất, thời gian). 'Efficacy' tập trung hoàn toàn vào câu hỏi: 'Phương pháp này có thực sự giải quyết được tận gốc vấn đề hay không?' (đặc biệt dùng nhiều trong y học và nghiên cứu khoa học).",
        collocations = listOf("Self-efficacy", "Prove the efficacy", "Efficacy of the drug"),
        relatedWords = listOf(
            RelatedWord("Effectiveness", "Sự hiệu quả, tính hữu hiệu"),
            RelatedWord("Potency", "Hiệu lực, sức mạnh ngầm")
        )
    ),
    Word(
        id = "effrontery",
        term = "Effrontery",
        pronunciation = "/ɪˈfrʌntəri/",
        shortDefinition = "Sự trơ trẽn, vô liêm sỉ, xấc xược.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Insolent or impertinent behavior.",
        vietnameseDiff = "Thái độ ngang ngược, trơ trẽn đến mức thản nhiên làm điều sai trái hoặc đưa ra những đòi hỏi vô lý trước mặt mọi người mà không biết xấu hổ.",
        exampleSentence = "He had the effrontery to demand half of the land ownership without signing any family agreements.",
        nuanceInfo = "Đồng hạng với 'Audacity'. Từ này lột tả một cái tôi quá ngạo mạn, chà đạp lên quy chuẩn đúng mực (Decorum) và phép lịch sự tối thiểu, khiến những người xung quanh phải phẫn nộ.",
        collocations = listOf("Have the effrontery to", "Sheer effrontery", "Matchless effrontery"),
        relatedWords = listOf(
            RelatedWord("Audacity", "Sự táo bạo, gu liều lĩnh"),
            RelatedWord("Insolence", "Sự lăng mạ, xấc láo")
        )
    ),
    Word(
        id = "egregious",
        term = "Egregious",
        pronunciation = "/ɪˈɡriːdʒəs/",
        shortDefinition = "Tồi tệ một cách trắng trợn, sai lầm nghiêm trọng.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Outstandingly bad; shocking.",
        vietnameseDiff = "Tính chất của một lỗi lầm, sự gian lận hoặc hành vi sai trái quá rõ ràng và nghiêm trọng, không thể dùng bất kỳ lý do gì để bao biện.",
        exampleSentence = "Copying someone else's source code line-by-line is an egregious violation of copyright.",
        nuanceInfo = "Thường đi kèm với các danh từ như 'error', 'mistake', 'violation'. Từ này nhấn mạnh rằng cái sai đó nổi bần bật lên giữa đám đông (như một vết mực đen trên tờ giấy trắng), khiến ai nhìn vào cũng thấy chướng mắt.",
        collocations = listOf("Egregious mistake", "Egregious lie", "Egregious violation"),
        relatedWords = listOf(
            RelatedWord("Shocking", "Gây sửng sốt, kinh hoàng"),
            RelatedWord("Flagrant", "Trắng trợn, hiển nhiên")
        )
    ),
    Word(
        id = "elated",
        term = "Elated",
        pronunciation = "/ɪˈleɪtɪd/",
        shortDefinition = "Vui sướng tột cùng, hạnh phúc ngập tràn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Ecstatically happy.",
        vietnameseDiff = "Trạng thái cảm xúc bay bổng, hạnh phúc đến phát điên sau khi đạt được một thành tựu lớn hoặc nhận được một tin cực kỳ tốt lành.",
        exampleSentence = "The young shop owner was elated when his new dish went viral on local food blogs.",
        nuanceInfo = "Mạnh hơn 'Glad' hay 'Happy'. Khi bạn 'elated', hormone dopamine trong não bộ tăng vọt, tạo cảm giác như đang đi trên mây. Thường dùng cho những cột mốc chiến thắng lớn trong đời.",
        collocations = listOf("Feel elated", "Elated at the news", "Elated by the success"),
        relatedWords = listOf(
            RelatedWord("Ecstatic", "Ngây ngất, mê ly"),
            RelatedWord("Overjoyed", "Vui mừng khôn xiết")
        )
    ),
    Word(
        id = "eloquent",
        term = "Eloquent",
        pronunciation = "/ˈeləkwənt/",
        shortDefinition = "Hùng biện, có tài ăn nói lưu loát cuốn hút.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Fluent or persuasive in speaking or writing.",
        vietnameseDiff = "Năng lực sử dụng ngôn từ một cách sắc bén, mượt mà và có sức thuyết phục mạnh mẽ, dễ dàng thao túng tâm lý và chạm đến cảm xúc người nghe.",
        exampleSentence = "An eloquent social media host can turn a simple portable fan description into an irresistible offer.",
        nuanceInfo = "Không chỉ là nói nhanh hay nói nhiều. 'Eloquent' đòi hỏi tư duy ngôn ngữ có cấu trúc mạch lạc (Coherent), cách nhấn nhá có nhịp điệu và khả năng dùng từ ngữ tinh tế để làm lay động lòng người.",
        collocations = listOf("Eloquent speaker", "Eloquent speech", "Highly eloquent"),
        relatedWords = listOf(
            RelatedWord("Articulate", "Phát âm rõ ràng, ngôn từ lưu loát"),
            RelatedWord("Persuasive", "Có tính thuyết phục")
        )
    ),
    Word(
        id = "elusive",
        term = "Elusive",
        pronunciation = "/ɪˈluːsɪv/",
        shortDefinition = "Khó nắm bắt, hay lảng tránh, khó định hình.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Difficult to find, catch, or achieve; difficult to remember or express.",
        vietnameseDiff = "Tính chất của một mục tiêu, một ý tưởng sáng tạo hoặc một con người liên tục tuột khỏi tầm tay, rất khó để nắm bắt hoặc thấu hiểu hoàn toàn.",
        exampleSentence = "Perfect search engine algorithms remain elusive for most small business web apps.",
        nuanceInfo = "Thường dùng cho những thứ vô hình như 'elusive dream' (giấc mơ xa vời) hoặc 'elusive answer' (câu trả lời mông lung). Nó gợi cảm giác khao khát muốn đuổi theo nhưng đối tượng luôn biết cách lẩn trốn (Evasion) vào phút chót.",
        collocations = listOf("Elusive target", "Elusive concept", "Remain elusive"),
        relatedWords = listOf(
            RelatedWord("Evasive", "Lảng tránh, thoái thác"),
            RelatedWord("Slippery", "Trơn trượt, khó nắm giữ")
        )
    ),
    Word(
        id = "embellish",
        term = "Embellish",
        pronunciation = "/ɪmˈbelɪʃ/",
        shortDefinition = "Tô điểm, trang trí, thêu dệt câu chuyện.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Make (something) more attractive by the addition of decorative details or features; exaggerate a story.",
        vietnameseDiff = "Hành động thêm thắt các chi tiết trang trí để đồ vật đẹp hơn; hoặc thêm mắm dặm muối, thổi phồng câu chuyện đời tư để thu hút sự chú ý của dư luận.",
        exampleSentence = "He decided to embellish his store's interior with aesthetic neon lights to suit Gen Z tastes.",
        nuanceInfo = "Vừa dùng cho không gian vật lý (decor cửa hàng), vừa dùng cho ngôn từ (chém gió, nói quá). Khi dùng cho lời nói, 'embellish the truth' là một dạng nói giảm nói tránh của việc ngầm bóp méo sự thật để tăng tính drama.",
        collocations = listOf("Embellish a story", "Embellish with details", "Highly embellished"),
        relatedWords = listOf(
            RelatedWord("Decorate", "Trang hoàng, trang trí"),
            RelatedWord("Exaggerate", "Phóng đại, cường điệu")
        )
    ),
        Word(
        id = "embezzle",
        term = "Embezzle",
        pronunciation = "/ɪmˈbezl/",
        shortDefinition = "Tham ô, thụt két, biển thủ công quỹ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Steal or misappropriate money placed in one's trust or belonging to the organization for which one works.",
        vietnameseDiff = "Hành động lợi dụng chức vụ, quyền hạn hoặc lòng tin để lén lút tuồn tiền bạc, tài sản của công ty, cửa hàng hoặc quỹ chung vào túi riêng.",
        exampleSentence = "A devious manager can easily embezzle funds if the shop owner lacks a tight accounting system.",
        nuanceInfo = "Khác với trộm cắp thông thường (Steal/Rob). 'Embezzle' bắt buộc phải gắn liền với yếu tố phản bội lòng tin (Breach of trust). Đối tượng thường dùng các thủ đoạn tinh vi như làm giả hóa đơn hoặc xào nấu số liệu (Discrepancy) để che giấu.",
        collocations = listOf("Embezzle money", "Embezzle funds from", "Accused of embezzling"),
        relatedWords = listOf(
            RelatedWord("Misappropriate", "Chiếm dụng bất hợp pháp"),
            RelatedWord("Defalcate", "Biển thủ, thụt két")
        )
    ),
    Word(
        id = "eminent",
        term = "Eminent",
        pronunciation = "/ˈemɪnənt/",
        shortDefinition = "Xuất chúng, lỗi lạc, có địa vị cao quý.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Famous and respected within a particular sphere.",
        vietnameseDiff = "Tính chất của một cá nhân nổi tiếng, có tầm ảnh hưởng lớn và nhận được sự tôn trọng sâu sắc từ cộng đồng nhờ vào tài năng hoặc cống hiến vượt bậc trong ngành.",
        exampleSentence = "The tech startup invited an eminent computer science professor to review their new application formulas.",
        nuanceInfo = "Cần phân biệt với 'Imminent' (Sắp xảy ra đến nơi). 'Eminent' là tính từ dùng để tôn vinh những bộ óc đại thụ, những người sở hữu uy tín đỉnh cao khiến số đông luôn phải ngước nhìn và lắng nghe.",
        collocations = listOf("Eminent scholar", "Eminent scientist", "Eminent authority"),
        relatedWords = listOf(
            RelatedWord("Distinguished", "Phân biệt, ưu tú"),
            RelatedWord("Prominent", "Nổi bật, xuất chúng")
        )
    ),
    Word(
        id = "empathy",
        term = "Empathy",
        pronunciation = "/ˈempəθi/",
        shortDefinition = "Sự thấu cảm, khả năng đặt mình vào vị trí người khác.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "The ability to understand and share the feelings of another.",
        vietnameseDiff = "Năng lực trí tuệ cảm xúc (EQ) cao, giúp bạn thực sự cảm nhận và thấu hiểu được nỗi đau, niềm vui hay áp lực của đối phương như chính bản thân mình đang trải qua.",
        exampleSentence = "Showing true empathy to your customers will build an incredibly loyal local client base.",
        nuanceInfo = "Mạnh và sâu sắc hơn 'Sympathy' (Sự thương hại, cảm thông đứng từ bên ngoài nhìn vào). Empathy đòi hỏi bạn phải hạ cái tôi xuống, bước vào thế giới nội tâm của người khác để lắng nghe mà không phán xét (Dogmatic).",
        collocations = listOf("Deep empathy", "Show empathy", "Feel empathy for"),
        relatedWords = listOf(
            RelatedWord("Compassion", "Lòng trắc ẩn"),
            RelatedWord("Understanding", "Sự hiểu biết, thông cảm")
        )
    ),
    Word(
        id = "empirical",
        term = "Empirical",
        pronunciation = "/ɪmˈpɪrɪkl/",
        shortDefinition = "Dựa trên kinh nghiệm thực tế và số liệu khách quan.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Based on, concerned with, or verifiable by observation or experience rather than theory or pure logic.",
        vietnameseDiff = "Tính chất của thông tin, kiến thức được đúc kết từ quá trình quan sát thực địa, làm thí nghiệm và đo đạc số liệu thực tế chứ không phải suy đoán lý thuyết suông.",
        exampleSentence = "We need empirical data from actual users to improve this word segmentation algorithm.",
        nuanceInfo = "Đối nghịch với 'Theoretical' (Mang tính lý thuyết). Trong lập trình, kinh doanh hay nghiên cứu, 'empirical evidence' (bằng chứng thực tế) luôn là vũ khí tối thượng để bác bỏ (Debunk) những giả thuyết hoang tưởng (Delusion).",
        collocations = listOf("Empirical evidence", "Empirical study", "Empirical data"),
        relatedWords = listOf(
            RelatedWord("Experimental", "Dựa trên thí nghiệm"),
            RelatedWord("Observational", "Dựa trên quan sát")
        )
    ),
    Word(
        id = "emulate",
        term = "Emulate",
        pronunciation = "/ˈemjuleɪt/",
        shortDefinition = "Nỗ lực bắt chước, noi gương để đuổi kịp hoặc vượt qua.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Match or surpass (a person or achievement), typically by imitation.",
        vietnameseDiff = "Hành động lấy một hình mẫu lý tưởng hoặc một đàn anh thành công làm mục tiêu phấn đấu, từ đó học hỏi và sao chép phương pháp làm việc của họ một cách có tư duy.",
        exampleSentence = "Many amateur creators try to emulate the editing style of major TikTok influencers.",
        nuanceInfo = "Mang sắc thái tích cực hơn 'Copy' hay 'Imitate'. Khi bạn 'emulate' một ai đó, động lực của bạn xuất phát từ sự tôn kính (Deference) và khát khao tự nâng cấp bản thân chứ không phải là sự đạo nhái rập khuôn (Derivative).",
        collocations = listOf("Emulate the success of", "Try to emulate", "Eager to emulate"),
        relatedWords = listOf(
            RelatedWord("Imitate", "Bắt chước, mô phỏng"),
            RelatedWord("Surpass", "Vượt trội, vượt qua")
        )
    ),
    Word(
        id = "endorse",
        term = "Endorse",
        pronunciation = "/ɪnˈdɔːs/",
        shortDefinition = "Công khai ủng hộ, xác nhận bảo chứng (chất lượng).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Declare one's public approval or support of; sign a check.",
        vietnameseDiff = "Hành động một người có tầm ảnh hưởng đứng ra tuyên bố ủng hộ một quan điểm, hoặc ký tên bảo chứng chất lượng cho một sản phẩm trong các chiến dịch quảng cáo.",
        exampleSentence = "Celebrities were paid high fees to endorse the portable fan line on social media.",
        nuanceInfo = "Khi bạn 'endorse' một cái gì đó, bạn đang đem chính uy tín cá nhân của mình ra để đặt cược. Do đó, nếu sản phẩm đó lừa đảo (Dubious), làn sóng phẫn nộ từ dư luận sẽ lập tức quay xe đập nát danh tiếng của bạn.",
        collocations = listOf("Publicly endorse", "Endorse a product", "Official endorsement"),
        relatedWords = listOf(
            RelatedWord("Approve", "Tán thành, chấp thuận"),
            RelatedWord("Sanction", "Phê chuẩn, thừa nhận")
        )
    ),
    Word(
        id = "endure",
        term = "Endure",
        pronunciation = "/ɪnˈdjʊə(r)/",
        shortDefinition = "Chịu đựng gian khổ, cam chịu; tồn tại bền vững.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Suffer (something painful or difficult) patiently; remain in existence.",
        vietnameseDiff = "Khả năng cắn răng chịu đựng áp lực, nỗi đau thể xác hoặc biến cố tâm lý mà không bỏ cuộc; hoặc tính chất kiên cường, trường tồn mãi với thời gian.",
        exampleSentence = "A business must endure initial financial dry spells before becoming profitable.",
        nuanceInfo = "Bản chất của từ này chứa đựng năng lượng ngoan cường (Dauntless). Khác với sự cam chịu bất lực, 'endure' nhấn mạnh một tinh thần thép, giữ vững ngọn lửa hy vọng trong khi bước qua giông bão cuộc đời.",
        collocations = listOf("Endure the pain", "Endure hardships", "Enduring popularity"),
        relatedWords = listOf(
            RelatedWord("Withstand", "Chống chọi, kháng cự"),
            RelatedWord("Tolerate", "Tha thứ, chịu đựng")
        )
    ),
    Word(
        id = "enervate",
        term = "Enervate",
        pronunciation = "/ˈenəveɪt/",
        shortDefinition = "Làm kiệt quệ, bào mòn hết sinh lực và nhuệ khí.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Cause someone to feel drained of energy or vitality; weaken.",
        vietnameseDiff = "Hành động hoặc môi trường độc hại hút cạn năng lượng, sức chịu đựng và ý chí phấn đấu của một người, khiến họ trở nên rệu rã và bất động.",
        exampleSentence = "The humid, suffocating summer heat can easily enervate the kitchen staff.",
        nuanceInfo = "Rất hay bị nhầm với 'Energize' (Tiếp năng lượng) do phát âm gần giống, nhưng nghĩa thì ngược lại 180 độ. 'Enervate' giống như việc bạn bị cắm một chiếc vòi tâm lý, rút sạch mọi hào quang sống và nhiệt huyết bên trong.",
        collocations = listOf("Enervating heat", "Completely enervate", "Enervating effect"),
        relatedWords = listOf(
            RelatedWord("Exhaust", "Làm kiệt sức, mệt lả"),
            RelatedWord("Debilitate", "Làm suy nhược, kiệt quệ")
        )
    ),
    Word(
        id = "enigma",
        term = "Enigma",
        pronunciation = "/ɪˈnɪɡmə/",
        shortDefinition = "Bí ẩn lớn, người/sự vật khó hiểu, huyền bí.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A person or thing that is mysterious, puzzling, or difficult to understand.",
        vietnameseDiff = "Danh từ chỉ một hiện tượng, một bài toán hóc búa hoặc một con người có hành tung kỳ lạ, khép kín khiến người xung quanh không thể nào đọc vị hay giải mã được.",
        exampleSentence = "His sudden disappearance from the online community remained a total enigma.",
        nuanceInfo = "Một người mang phong cách 'soft boy' bí ẩn, ít nói, hành tung clandestine thường tạo ra một sức hút tự nhiên (Charisma) lớn vì họ đóng vai trò như một chiếc 'enigma' kích thích bản năng tò mò của đám đông.",
        collocations = listOf("Total enigma", "Wrap in an enigma", "Remain an enigma"),
        relatedWords = listOf(
            RelatedWord("Mystery", "Điều bí ẩn, huyền bí"),
            RelatedWord("Conundrum", "Câu đố hóc búa, câu hỏi suy ngẫm")
        )
    ),
    Word(
        id = "enmity",
        term = "Enmity",
        pronunciation = "/ˈenməti/",
        shortDefinition = "Sự thù hằn, lòng căm ghét sâu sắc.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The state or feeling of being actively opposed or hostile to someone or something.",
        vietnameseDiff = "Trạng thái oán hận, thù hằn tích tụ lâu ngày giữa hai cá nhân hoặc hai gia tộc, sẵn sàng bùng phát thành xung đột công khai bất cứ lúc nào.",
        exampleSentence = "The long-standing enmity between the two local business rivals led to continuous legal battles.",
        nuanceInfo = "Nặng và mang tính thâm căn cố đế hơn 'Dislike' hay 'Anger'. 'Enmity' là một cấu trúc cảm xúc độc hại, nơi cả hai bên đều nhìn nhau bằng ánh mắt khinh miệt (Disdain) và luôn tìm cách triệt hạ uy tín của đối phương.",
        collocations = listOf("Personal enmity", "Bitter enmity", "State of enmity"),
        relatedWords = listOf(
            RelatedWord("Hostility", "Sự thù địch, thái độ hung hăng"),
            RelatedWord("Animosity", "Lòng oán hận, thù hằn")
        )
    ),
    Word(
        id = "envisage",
        term = "Envisage",
        pronunciation = "/ɪnˈvɪzɪdʒ/",
        shortDefinition = "Tưởng tượng, mường tượng về một viễn cảnh tương lai.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Contemplate or conceive of as a possibility or a desirable future event.",
        vietnameseDiff = "Hành động vận dụng trí óc để vẽ ra một bức tranh toàn cảnh, một kế hoạch hoặc xu hướng phát triển trong tương lai để chuẩn bị lộ trình thực hiện.",
        exampleSentence = "I envisage this simple mobile app becoming a global platform for structured language learning.",
        nuanceInfo = "Trang trọng hơn 'Imagine'. Khi bạn 'envisage' một điều gì đó, bạn không chỉ mơ mộng hão huyền (Delusion), mà bạn đang đóng vai trò một nhà chiến lược, phân tích các biến số để định hình tương lai.",
        collocations = listOf("Envisage a future", "Difficult to envisage", "Envisage that"),
        relatedWords = listOf(
            RelatedWord("Visualize", "Hình dung, mường tượng"),
            RelatedWord("Anticipate", "Dự đoán, lường trước")
        )
    ),
    Word(
        id = "ephemeral",
        term = "Ephemeral",
        pronunciation = "/ɪˈfemərəl/",
        shortDefinition = "Phù du, chóng tàn, chỉ tồn tại trong thời gian cực ngắn.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Lasting for a very short time.",
        vietnameseDiff = "Tính chất của những sự vật, hiện tượng hoặc cảm xúc bùng lên rất nhanh nhưng cũng lụi tàn ngay lập tức, không để lại giá trị bền vững.",
        exampleSentence = "Social media fame is often ephemeral; today you are viral, tomorrow you are forgotten.",
        nuanceInfo = "Một từ cực kỳ đắt giá trong văn chương và phân tích xu hướng. 'Ephemeral trends' (xu hướng chóng tàn) cảnh báo các nhà làm nội dung không nên quá sa đà vào việc bú trend nhất thời mà quên đi việc xây dựng giá trị cốt lõi.",
        collocations = listOf("Ephemeral fame", "Ephemeral nature", "Ephemeral pleasure"),
        relatedWords = listOf(
            RelatedWord("Transient", "Ngắn ngủi, nhất thời"),
            RelatedWord("Fleeting", "Thoáng qua, vùn vụt")
        )
    ),
        Word(
        id = "epitome",
        term = "Epitome",
        pronunciation = "/ɪˈpɪtəmi/",
        shortDefinition = "Hình mẫu thu nhỏ, biểu tượng hoàn hảo của một đặc tính.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A person or thing that is a perfect example of a particular quality or type.",
        vietnameseDiff = "Danh từ chỉ một cá nhân hoặc sự vật được coi là đại diện tiêu biểu, chuẩn mực và hoàn hảo nhất cho một phong cách, lối sống hoặc phẩm chất nào đó.",
        exampleSentence = "With his neat linen shirt and polite manners, he was the absolute epitome of a soft boy aesthetic.",
        nuanceInfo = "Cấu trúc phổ biến là 'The epitome of something'. Phát âm từ này khá đặc biệt (không đọc là epi-tôm). Khi gọi ai đó là epitome của sự thanh lịch, nghĩa là bạn không thể tìm ra ai đại diện xuất sắc hơn họ.",
        collocations = listOf("The absolute epitome", "Epitome of elegance", "Epitome of success"),
        relatedWords = listOf(
            RelatedWord("Embodiment", "Sự hiện thân, hình mẫu"),
            RelatedWord("Quintessence", "Tinh hoa, tinh túy")
        )
    ),
    Word(
        id = "equanimity",
        term = "Equanimity",
        pronunciation = "/ˌekwəˈnɪməti/",
        shortDefinition = "Sự bình tĩnh, tâm trí định tĩnh trước giông bão.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Mental calmness, composure, and evenness of temper, especially in a difficult situation.",
        vietnameseDiff = "Trạng thái tâm lý cực kỳ vững chãi, giữ được sự điềm tĩnh, sáng suốt và không để cảm xúc tiêu cực làm lung lạc ngay cả khi đối mặt với khủng hoảng lớn.",
        exampleSentence = "A seasoned restaurant owner accepts chaotic dinner rushes with absolute equanimity.",
        nuanceInfo = "Đỉnh cao của trí tuệ cảm xúc (EQ). Khác với sự thờ ơ lạnh lùng (Detached), 'equanimity' là khi bạn nhận thức rõ sự hỗn loạn xung quanh nhưng chọn neo giữ tâm mình lại để đưa ra phán quyết sáng suốt nhất.",
        collocations = listOf("Accept with equanimity", "Maintain equanimity", "Perfect equanimity"),
        relatedWords = listOf(
            RelatedWord("Composure", "Sự điềm tĩnh, sự điềm đạm"),
            RelatedWord("Serenity", "Sự thanh thản, phong thái an nhiên")
        )
    ),
    Word(
        id = "equivocal",
        term = "Equivocal",
        pronunciation = "/ɪˈkwɪvəkl/",
        shortDefinition = "Mập mờ, nước đôi, cố tình gây khó hiểu.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Open to more than one interpretation; ambiguous; uncertain or questionable.",
        vietnameseDiff = "Tính chất của câu trả lời, thái độ hoặc bằng chứng mập mờ, không rõ ràng, có thể hiểu theo nhiều nghĩa nhằm mục đích lảng tránh việc cam kết.",
        exampleSentence = "The agency gave an equivocal response when asked about the leaked algorithms.",
        nuanceInfo = "Ngược lại với 'Unequivocal' (Rõ ràng, đanh thép). Người dùng ngôn từ 'equivocal' thường có động cơ che giấu sự thật (Disingenuous), cố tình tạo ra vùng xám để khi có biến cố xảy ra họ dễ dàng phủi bỏ trách nhiệm.",
        collocations = listOf("Equivocal answer", "Equivocal attitude", "Highly equivocal"),
        relatedWords = listOf(
            RelatedWord("Ambiguous", "Mơ hồ, nhập nhằng"),
            RelatedWord("Evasive", "Lảng tránh, thoái thác")
        )
    ),
    Word(
        id = "eradicate",
        term = "Eradicate",
        pronunciation = "/ɪˈrædɪkeɪt/",
        shortDefinition = "Nhổ cỏ tận gốc, xóa sổ hoàn toàn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Destroy completely; put an end to.",
        vietnameseDiff = "Hành động quyết liệt nhằm tiêu diệt, quét sạch tận gốc một căn bệnh, một tư duy độc hại hoặc một lỗi hệ thống nguy hiểm để nó không bao giờ tái diễn.",
        exampleSentence = "We need a thorough clean-up to eradicate all bugs from the data structure code.",
        nuanceInfo = "Nghĩa gốc là nhổ rễ cây (Root out). Dùng trong văn cảnh khi bạn muốn giải quyết triệt để một vấn nạn nhức nhối (như nghèo đói, tệ nạn, mã độc) chứ không chỉ là cắt tỉa phần ngọn (Diminish) tạm thời.",
        collocations = listOf("Eradicate poverty", "Completely eradicate", "Eradicate a disease"),
        relatedWords = listOf(
            RelatedWord("Eliminate", "Loại bỏ, bài tiết"),
            RelatedWord("Exterminate", "Hủy diệt, triệt hạ")
        )
    ),
    Word(
        id = "erratic",
        term = "Erratic",
        pronunciation = "/ɪˈrætɪk/",
        shortDefinition = "Thất thường, chập chờn, không thể lường trước.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Not even or regular in pattern or movement; unpredictable.",
        vietnameseDiff = "Tính chất của hành vi, tâm trạng hoặc đường đi của dữ liệu lên xuống thất thường, không theo bất kỳ một quy luật ổn định nào.",
        exampleSentence = "The erratic behavior of the algorithm made it difficult to predict video views.",
        nuanceInfo = "Một người có 'erratic mood' (tâm trạng nắng mưa thất thường) sẽ khiến những người xung quanh mệt mỏi vì không biết họ sẽ nổi điên hay vui vẻ vào phút kế tiếp. Gợi sự thiếu kỷ luật và mất kiểm soát.",
        collocations = listOf("Erratic behavior", "Erratic schedule", "Highly erratic"),
        relatedWords = listOf(
            RelatedWord("Unpredictable", "Không thể đoán trước"),
            RelatedWord("Inconsistent", "Bất nhất, chập chờn")
        )
    ),
    Word(
        id = "erroneous",
        term = "Erroneous",
        pronunciation = "/ɪˈrəʊniəs/",
        shortDefinition = "Sai lầm, dựa trên thông tin sai lệch.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Wrong; incorrect.",
        vietnameseDiff = "Tính chất của một giả thuyết, kết luận hoặc niềm tin hoàn toàn sai lệch do bạn dựa vào một nguồn dữ liệu không chuẩn xác ngay từ đầu.",
        exampleSentence = "The report was based on erroneous assumptions about local property laws.",
        nuanceInfo = "Trang trọng hơn 'Wrong'. Thường dùng để chỉ các lỗi về mặt tư duy, logic hệ thống hoặc nhận thức ('erroneous belief') cần được vạch trần và bác bỏ (Debunk) bằng các bằng chứng thực tế (Empirical data).",
        collocations = listOf("Erroneous assumption", "Erroneous belief", "Erroneous information"),
        relatedWords = listOf(
            RelatedWord("Incorrect", "Không đúng, sai"),
            RelatedWord("Flawed", "Có tì vết, có lỗi")
        )
    ),
    Word(
        id = "erudite",
        term = "Erudite",
        pronunciation = "/ˈerʊdaɪt/",
        shortDefinition = "Uyên bác, thông tuệ, học thức sâu rộng.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Having or showing great knowledge or learning.",
        vietnameseDiff = "Tính chất của một người sở hữu kho tàng tri thức khổng lồ, hiểu sâu biết rộng nhờ vào quá trình nghiên cứu, đọc sách và tích lũy học thuật nghiêm túc.",
        exampleSentence = "The professor delivered an erudite lecture on natural language processing algorithms.",
        nuanceInfo = "Một lời khen tặng trang trọng dành cho giới học giả hoặc những bậc thầy trong ngành. Khác với 'Smart' (thông minh lanh lợi), 'Erudite' toát ra hào quang của một bộ óc đại thụ, có chiều sâu nghiên cứu cực kỳ đáng nể.",
        collocations = listOf("Erudite scholar", "Erudite commentary", "Highly erudite"),
        relatedWords = listOf(
            RelatedWord("Scholarly", "Có tính chất học giả"),
            RelatedWord("Knowledgeable", "Có kiến thức, Am hiểu")
        )
    ),
    Word(
        id = "eschew",
        term = "Eschew",
        pronunciation = "/ɪsˈtʃuː/",
        shortDefinition = "Chủ động né tránh, tránh xa vì lý do đạo đức/nguyên tắc.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Deliberately avoid using; abstain from.",
        vietnameseDiff = "Hành động chủ động từ bỏ, quay lưng hoặc né tránh một thói quen xấu, một lối sống độc hại hoặc các thủ đoạn không chính trực dựa trên nguyên tắc sống của bản thân.",
        exampleSentence = "A high-value creator should eschew cheap drama and focus heavily on quality content.",
        nuanceInfo = "Mạnh và mang tính chủ đích cao hơn 'Avoid'. Khi bạn 'eschew' điều gì, bạn đang đưa ra một tuyên ngôn phong cách sống: Bạn từ chối dính dáng đến những thứ thấp kém để bảo vệ sự thuần khiết của bản sắc cá nhân.",
        collocations = listOf("Eschew violence", "Eschew publicity", "Deliberately eschew"),
        relatedWords = listOf(
            RelatedWord("Abstain", "Kiêng khem, tiết chế"),
            RelatedWord("Shun", "Xa lánh, tẩy chay")
        )
    ),
    Word(
        id = "esoteric",
        term = "Esoteric",
        pronunciation = "/ˌesəˈterɪk/",
        shortDefinition = "Thâm thúy, huyền bí, chỉ số ít người hiểu được.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Intended for or likely to be understood by only a small number of people with a specialized knowledge or interest.",
        vietnameseDiff = "Tính chất của các kiến thức chuyên sâu, mật mã hoặc trường phái nghệ thuật quá độc lạ, thâm thúy đến mức chỉ những chuyên gia đầu ngành hoặc một nhóm nhỏ người có duyên mới thấu cảm nổi.",
        exampleSentence = "Graph theory and complex FMM formulas can seem highly esoteric to outsiders.",
        nuanceInfo = "Đối nghịch với 'Popular' (Đại chúng). Những nội dung 'esoteric' thường không thích hợp để làm video viral đại trà trên TikTok vì nó kén người xem, nhưng lại là mỏ vàng để xây dựng uy tín cá nhân trong cộng đồng ngách (Niche).",
        collocations = listOf("Esoteric knowledge", "Esoteric philosophy", "Highly esoteric"),
        relatedWords = listOf(
            RelatedWord("Abstruse", "Sâu sắc, khó hiểu"),
            RelatedWord("Arcane", "Bí ẩn, kỳ bí")
        )
    ),
    Word(
        id = "espouse",
        term = "Espouse",
        pronunciation = "/ɪˈspaʊz/",
        shortDefinition = "Cổ xúy, nhiệt thành ủng hộ một lý tưởng/quan điểm.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Adopt or support (a cause, belief, or way of life).",
        vietnameseDiff = "Hành động đứng hẳn về một phía, nhận vơ lấy và tích cực truyền bá, đấu tranh để bảo vệ một học thuyết, quan điểm hoặc lối sống nào đó.",
        exampleSentence = "He actively espouses a minimalist lifestyle on his personal channel.",
        nuanceInfo = "Nghĩa cổ liên quan đến việc đính hôn (gắn kết cuộc đời). Nghĩa bóng mang năng lượng cam kết rất lớn: Khi bạn 'espouse a theory', bạn không chỉ gật đầu đồng ý (Approve) mà sẵn sàng trở thành đại sứ, chiến đấu vì nó.",
        collocations = listOf("Espouse a theory", "Espouse a cause", "Publicly espouse"),
        relatedWords = listOf(
            RelatedWord("Adopt", "Chấp nhận, nhận làm"),
            RelatedWord("Embrace", "Đón nhận nồng hậu, ôm chầm lấy")
        )
    ),
    Word(
        id = "esteem",
        term = "Esteem",
        pronunciation = "/ɪˈstiːm/",
        shortDefinition = "Sự kính trọng, lòng ngưỡng mộ cao quý.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Respect and admiration, typically for a person.",
        vietnameseDiff = "Danh từ chỉ vị thế danh giá, sự tôn kính và đánh giá cực kỳ cao của xã hội hoặc cộng đồng dành cho nhân cách hoặc thành tựu của một người.",
        exampleSentence = "The dynamic shop owner is held in high esteem by the local business community.",
        nuanceInfo = "Xuất hiện kinh điển trong cụm 'Self-esteem' (Lòng tự tôn, giá trị tự thân). Khi một người có 'high self-esteem', họ tự tin vào năng lực nội tại của mình, khó bị đánh gục bởi những lời gièm pha (Disparage) từ bên ngoài.",
        collocations = listOf("Hold in high esteem", "Self-esteem", "Earn the esteem of"),
        relatedWords = listOf(
            RelatedWord("Respect", "Sự tôn trọng"),
            RelatedWord("Admiration", "Sự khâm phục, ca ngợi")
        )
    ),
    Word(
        id = "euphemism",
        term = "Euphemism",
        pronunciation = "/ˈjuːfəmɪzəm/",
        shortDefinition = "Từ nói giảm nói tránh, cách nói hoa mỹ giảm nhẹ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A mild or indirect word or expression substituted for one considered to be too harsh or blunt when referring to something unpleasant or embarrassing.",
        vietnameseDiff = "Một từ ngữ hoặc cách diễn đạt nhẹ nhàng, lịch sự được dùng để thay thế cho những từ quá trần trụi, thô lỗ hoặc gây đau buồn (như chết chóc, chia tay, nghèo đói).",
        exampleSentence = "Using 'restructuring' instead of 'firing workers' is a common corporate euphemism.",
        nuanceInfo = "Một công cụ giao tiếp thể hiện tính tinh tế và khéo léo (Decorum). Tuy nhiên, nếu lạm dụng 'euphemism' quá mức trong kinh doanh, nó sẽ biến thành một bộ mặt giả tạo (Disingenuous), cố tình bóp méo thực tế phũ phàng.",
        collocations = listOf("Use a euphemism", "Common euphemism", "Euphemism for"),
        relatedWords = listOf(
            RelatedWord("Polite term", "Thuật ngữ lịch sự"),
            RelatedWord("Understatement", "Cách nói giảm nhẹ, nói bớt đi")
        )
    ),
        Word(
        id = "evade",
        term = "Evade",
        pronunciation = "/ɪˈveɪd/",
        shortDefinition = "Lảng tránh, né tránh (trách nhiệm, câu hỏi, pháp luật).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Escape or avoid, especially by cleverness or trickery.",
        vietnameseDiff = "Hành động cố tình lẩn trốn, dùng mánh khóe để né tránh việc thực hiện nghĩa vụ pháp lý, trả lời câu hỏi thẳng thắn hoặc đối mặt với trách nhiệm.",
        exampleSentence = "The shady partner tried every trick to evade tax duties on the restaurant's income.",
        nuanceInfo = "Mang sắc thái tiêu cực rõ rệt. Khác với 'Avoid' thông thường, 'Evade' ám chỉ việc dùng sự khôn lỏi hoặc thủ đoạn (Devious) để chạy trốn một thứ mà đáng ra bạn bắt buộc phải đối mặt.",
        collocations = listOf("Evade taxes", "Evade the question", "Evade responsibility"),
        relatedWords = listOf(
            RelatedWord("Elude", "Trốn tránh, lảng tránh"),
            RelatedWord("Dodge", "Né thính, né tránh nhanh")
        )
    ),
    Word(
        id = "evasive",
        term = "Evasive",
        pronunciation = "/ɪˈveɪsɪv/",
        shortDefinition = "Lảng tránh, quanh co, không thẳng thắn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Tending to avoid commitment or self-revelation, especially by responding indirectly.",
        vietnameseDiff = "Tính chất của một thái độ hoặc câu trả lời mập mờ, cố tình đánh trống lảng nhằm che giấu sự thật hoặc né tránh việc cam kết vào một vấn đề cụ thể.",
        exampleSentence = "She gave an evasive answer when asked directly about the true ownership of the land certificate.",
        nuanceInfo = "Đây là biểu hiện hành vi của sự thiếu thành thật (Disingenuous). Trong các mối quan hệ hay đàm phán kinh doanh, một đối tác liên tục 'evasive' là một báo động đỏ (Red flag) chứng tỏ họ đang có mưu đồ mờ ám (Clandestine).",
        collocations = listOf("Take evasive action", "Evasive answer", "Evasive reply"),
        relatedWords = listOf(
            RelatedWord("Equivocal", "Mập mờ, nước đôi"),
            RelatedWord("Ambiguous", "Mơ hồ, nhập nhằng")
        )
    ),
    Word(
        id = "evoke",
        term = "Evoke",
        pronunciation = "/ɪˈvəʊk/",
        shortDefinition = "Gợi lên, khơi gợi (ký ức, cảm xúc, phản ứng).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Bring or recall to the conscious mind; elicit a response.",
        vietnameseDiff = "Hành động của một tác phẩm, một mùi hương hoặc hình ảnh làm sống dậy một chuỗi ký ức, cảm xúc sâu kín hoặc phản ứng mãnh liệt trong tâm trí người khác.",
        exampleSentence = "The nostalgic visual setup was designed to evoke childhood memories of traditional family meals.",
        nuanceInfo = "Rất hay dùng trong nghệ thuật, marketing và sáng tạo nội dung. Khi một video có một chiếc hook đỉnh cao, nó sẽ 'evoke an emotional response' (gợi lên một phản ứng cảm xúc), khiến người xem lập tức dừng lại để tương tác.",
        collocations = listOf("Evoke memories", "Evoke emotions", "Evoke a response"),
        relatedWords = listOf(
            RelatedWord("Elicit", "Khơi ra, gợi ra"),
            RelatedWord("Awaken", "Đánh thức, làm thức tỉnh")
        )
    ),
    Word(
        id = "exacerbate",
        term = "Exacerbate",
        pronunciation = "/ɪɡˈzæsəbeɪt/",
        shortDefinition = "Làm trầm trọng thêm, đổ dầu vào lửa.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Make (a problem, bad situation, or negative feeling) worse.",
        vietnameseDiff = "Hành động hoặc yếu tố vô tình/cố ý khiến cho một vấn đề, một cuộc tranh đột hoặc một tình huống vốn đã tồi tệ lại càng trở nên nhức nhối và căng thẳng hơn.",
        exampleSentence = "Bringing up old relationship issues will only exacerbate the current family argument.",
        nuanceInfo = "Tuyệt đối không dùng cho nghĩa tích cực. Hãy hình dung nó giống như việc bạn cào vào một vết thương đang rỉ máu, hoặc mang một cái tôi bảo thủ (Dogmatic) vào một phòng ban đang có xung đột cao độ.",
        collocations = listOf("Exacerbate a problem", "Exacerbate the situation", "Further exacerbate"),
        relatedWords = listOf(
            RelatedWord("Aggravate", "Làm nặng thêm, làm tức giận"),
            RelatedWord("Worsen", "Làm cho tệ đi")
        )
    ),
    Word(
        id = "exasperate",
        term = "Exasperate",
        pronunciation = "/ɪɡˈzɑːspəreɪt/",
        shortDefinition = "Làm phát điên, chọc tức đến mức mất kiên nhẫn.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Irritate and frustrate (someone) intensely.",
        vietnameseDiff = "Hành động liên tục gây phiền nhiễu, làm lặp đi lặp lại một lỗi ngớ ngẩn khiến người khác hoàn toàn kiệt sức và bùng nổ cơn giận dữ.",
        exampleSentence = "The app users were thoroughly exasperated by the continuous structural bugs and crashes.",
        nuanceInfo = "Nặng hơn 'Annoy'. 'Exasperate' đẩy cảm xúc của đối phương lên đỉnh điểm của sự bất lực (Frustration), giống như việc bạn phải giải thích một công thức thuật toán cho một người cố tình không muốn hiểu.",
        collocations = listOf("Thoroughly exasperate", "Exasperating habit", "Exasperated sigh"),
        relatedWords = listOf(
            RelatedWord("Infuriate", "Làm tức điên lên"),
            RelatedWord("Irritate", "Làm phát cáu, kích ứng")
        )
    ),
    Word(
        id = "exemplary",
        term = "Exemplary",
        pronunciation = "/ɪɡˈzempləri/",
        shortDefinition = "Gương mẫu, chuẩn mực, đáng để noi theo.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Serving as a desirable model; representing the best of its kind.",
        vietnameseDiff = "Tính chất chuẩn chỉnh, hoàn hảo xuất sắc của một hành vi, thái độ phục vụ hoặc năng lực làm việc xứng đáng được đem ra làm tấm gương cho tập thể.",
        exampleSentence = "The head chef was praised for his exemplary hygiene standards in the kitchen.",
        nuanceInfo = "Khi một thứ được đánh giá là 'exemplary', nó trở thành một case study, một cái đích để những người khác cố gắng bắt chước và noi gương (Emulate). Toát ra năng lượng của một người có tính kỷ luật thép (Conscientious).",
        collocations = listOf("Exemplary behavior", "Exemplary conduct", "Exemplary service"),
        relatedWords = listOf(
            RelatedWord("Model", "Hình mẫu, tiêu chuẩn"),
            RelatedWord("Commendable", "Đáng khen ngợi, ca tụng")
        )
    ),
    Word(
        id = "exemplify",
        term = "Exemplify",
        pronunciation = "/ɪɡˈzemplɪfaɪ/",
        shortDefinition = "Minh họa bằng ví dụ điển hình, là hiện thân của.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Be a typical example of.",
        vietnameseDiff = "Hành động đóng vai trò là một minh chứng sống động, rõ nét nhất giúp người khác nhìn vào là hiểu ngay lập tức một học thuyết hoặc phong cách nào đó.",
        exampleSentence = "His dynamic and creative TikTok videos perfectly exemplify the modern content entrepreneur.",
        nuanceInfo = "Động từ của 'Example'. Thay vì giải thích giông dài (Digress) bằng lý thuyết suông, bạn đưa ra một sản phẩm cụ thể, hoặc chính bản thân bạn đứng ra để 'exemplify' tinh thần của toàn bộ dự án.",
        collocations = listOf("Perfectly exemplify", "Exemplify the trend", "Exemplify the spirit of"),
        relatedWords = listOf(
            RelatedWord("Illustrate", "Minh họa, làm rõ ý"),
            RelatedWord("Embody", "Hiện thân, bao gồm")
        )
    ),
    Word(
        id = "exhaustive",
        term = "Exhaustive",
        pronunciation = "/ɪɡˈzɔːstɪv/",
        shortDefinition = "Thấu chu đáo, toàn diện, không bỏ sót chi tiết nào.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Examining, including, or considering all elements or aspects; fully comprehensive.",
        vietnameseDiff = "Tính chất của một cuộc nghiên cứu, rà soát lỗi hoặc tìm kiếm thông tin cực kỳ kỹ lưỡng, lật đi lật lại từng ngóc ngách để đảm bảo độ chính xác tuyệt đối.",
        exampleSentence = "We carried out an exhaustive search for any internal data structure discrepancies.",
        nuanceInfo = "Rất dễ nhầm với 'Exhausted' (Kiệt sức). 'Exhaustive' là tính từ chủ động dành cho hệ thống hoặc tài liệu: Một 'exhaustive report' (báo cáo toàn diện) đòi hỏi bạn phải vắt kiệt mọi nguồn tài nguyên thông tin để làm ra nó.",
        collocations = listOf("Exhaustive search", "Exhaustive report", "Exhaustive research"),
        relatedWords = listOf(
            RelatedWord("Comprehensive", "Bao hàm toàn diện"),
            RelatedWord("Thorough", "Cẩn thận, chu đáo")
        )
    ),
    Word(
        id = "exhilarating",
        term = "Exhilarating",
        pronunciation = "/ɪɡˈzɪləreɪtɪŋ/",
        shortDefinition = "Làm phấn khích, vui sướng đến run người.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Making one feel very happy, animated, or elated; thrilling.",
        vietnameseDiff = "Tính chất của một trải nghiệm phóng khoáng, một cú lội ngược dòng trong kinh doanh hoặc một màn trình diễn bùng nổ khiến hormone adrenaline tăng vọt, mang lại cảm giác cực khoái.",
        exampleSentence = "Achieving one million organic views in a single day was an exhilarating experience.",
        nuanceInfo = "Mạnh hơn 'Exciting'. Từ này mô tả những khoảnh khắc mang tính high-energy (như chơi thể thao mạo hiểm, võ thuật, hoặc cảm giác chiến thắng một conundrum hóc búa), làm bừng tỉnh mọi giác quan của bạn.",
        collocations = listOf("Exhilarating experience", "Exhilarating feeling", "Highly exhilarating"),
        relatedWords = listOf(
            RelatedWord("Thrilling", "Kịch tính, ly kỳ"),
            RelatedWord("Breathtaking", "Nghẹt thở, hấp dẫn")
        )
    ),
    Word(
        id = "exonorated",
        term = "Exonerate",
        pronunciation = "/ɪɡˈzɒnəreɪt/",
        shortDefinition = "Minh oan, tuyên trắng án, rửa sạch tội danh.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Absolve (someone) from blame for a fault or wrongdoing, especially after due consideration of the case.",
        vietnameseDiff = "Hành động chính thức công bố một cá nhân hoàn toàn vô tội và sạch vết chàm sau khi đã tìm ra bằng chứng thực tế (Empirical data) đập tan mọi nghi ngờ trước đó.",
        exampleSentence = "The core algorithm logs completely exonerated the developer from the server hack accusation.",
        nuanceInfo = "Bước ngoặt cứu rỗi danh dự. Khi bạn được 'exonerated', toàn bộ gánh nặng tâm lý lo âu và những lời gièm pha (Disparage) từ đám đông xã hội sẽ lập tức bị quét sạch, trả lại vị thế trong sạch (Integrity) cho bạn.",
        collocations = listOf("Completely exonerate", "Exonerate someone from", "Exonerated by the court"),
        relatedWords = listOf(
            RelatedWord("Absolve", "Xóa tội, miễn xá"),
            RelatedWord("Acquit", "Tuyên trắng án")
        )
    ),
    Word(
        id = "exotic",
        term = "Exotic",
        pronunciation = "/ɪɡˈzɒtɪk/",
        shortDefinition = "Độc lạ, mang phong vị phương xa kỳ bí.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Originating in or characteristic of a distant foreign country, especially one that is foreign to the speaker.",
        vietnameseDiff = "Tính chất của một sự vật, món ăn hoặc phong cách thẩm mỹ mới lạ, bắt nguồn từ một nền văn hóa xa xôi, mang lại cảm giác kích thích thị giác và sự tò mò.",
        exampleSentence = "Adding exotic Chinese spices to the local broth created a completely unique taste profile.",
        nuanceInfo = "Trong thế giới hiện đại và visual marketing (TikTok), yếu tố 'exotic' (độc lạ, mang tính ngoại lai) là một thỏi nam châm hút view cực mạnh vì số đông luôn phát cuồng trước những thứ nằm ngoài vùng hiểu biết thông thường của họ.",
        collocations = listOf("Exotic spices", "Exotic location", "Exotic pets"),
        relatedWords = listOf(
            RelatedWord("Foreign", "Thuộc về nước ngoài"),
            RelatedWord("Unusual", "Bất thường, lạ mắt")
        )
    ),
    Word(
        id = "expedite",
        term = "Expedite",
        pronunciation = "/ˈekspədaɪt/",
        shortDefinition = "Xúc tiến, đẩy nhanh tiến độ xử lý.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Make (an action or process) happen sooner or be accomplished more quickly.",
        vietnameseDiff = "Hành động can thiệp bằng quyền lực, công nghệ hoặc tiền bạc để cắt bỏ các thủ tục rườm rà, ép hệ thống phải vận hành và ra kết quả nhanh gấp nhiều lần bình thường.",
        exampleSentence = "We need to hire an agency to expedite the legal transfer of this land division certificate.",
        nuanceInfo = "Một thuật ngữ cực kỳ phổ biến trong môi trường corporate và logistics. Khác với việc làm nhanh một cách cẩu thả, 'expedite' là sự tối ưu hóa quy trình (Efficiency) để đạt được tốc độ tên lửa mà vẫn giữ vững chất lượng.",
        collocations = listOf("Expedite the process", "Expedite delivery", "Expedite the update"),
        relatedWords = listOf(
            RelatedWord("Accelerate", "Làm tăng tốc, thúc mau"),
            RelatedWord("Hasten", "Thúc ép, vội vã")
        )
    ),
        Word(
        id = "expeditious",
        term = "Expeditious",
        pronunciation = "/ˌekspəˈdɪʃəs/",
        shortDefinition = "Nhanh chóng, mau lẹ và hiệu quả.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Done with speed and efficiency.",
        vietnameseDiff = "Tính chất của một quy trình xử lý công việc, phản hồi khách hàng hoặc giải quyết sự cố diễn ra cực kỳ tốc độ nhưng vẫn đảm bảo độ chuẩn xác và tính chuyên nghiệp cao.",
        exampleSentence = "An expeditious response to customer complaints can turn a bad review into a loyal client.",
        nuanceInfo = "Tính từ cao cấp của 'Expedite'. Từ này toát lên tác phong làm việc của một bộ máy chuyên nghiệp. Trong kinh doanh hay vận hành ứng dụng, sự 'expeditious execution' (thực thi mau lẹ) luôn là vũ khí để bóp nghẹt đối thủ cạnh tranh.",
        collocations = listOf("Expeditious handling", "Expeditious execution", "Most expeditious way"),
        relatedWords = listOf(
            RelatedWord("Speedy", "Nhanh chóng, tốc độ"),
            RelatedWord("Efficient", "Hiệu quả, tối ưu")
        )
    ),
    Word(
        id = "expel",
        term = "Expel",
        pronunciation = "/ɪkˈspel/",
        shortDefinition = "Trục xuất, đuổi học, tống khứ ra ngoài.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Deprive (someone) of membership of or involvement in a school or other organization; force out.",
        vietnameseDiff = "Hành động chính thức tước quyền thành viên, đuổi một cá nhân ra khỏi một tổ chức, trường học hoặc trục xuất một dị vật, khí độc ra khỏi cơ thể.",
        exampleSentence = "The management decided to expel the toxic group member to protect the shop's culture.",
        nuanceInfo = "Mang tính kỷ luật tối cao và cưỡng chế mạnh mẽ. Khác với 'Dismiss' (sa thải thông thường), 'Expel' mang một vết nhơ lớn về mặt lý lịch, tuyên cáo cho tập thể biết cá nhân đó đã phạm phải một sai lầm không thể dung thứ.",
        collocations = listOf("Expel from school", "Expel a member", "Expelled from the country"),
        relatedWords = listOf(
            RelatedWord("Eject", "Đẩy ra, tống ra"),
            RelatedWord("Banishing", "Trục xuất, lưu đày")
        )
    ),
    Word(
        id = "explicate",
        term = "Explicate",
        pronunciation = "/ˈeksplɪkeɪt/",
        shortDefinition = "Mổ xẻ, phân tích giảng giải chi tiết một khái niệm.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Analyze and develop (an idea or principle) in detail.",
        vietnameseDiff = "Hành động đi sâu vào từng tầng nghĩa, mổ xẻ cấu trúc logic của một thuật toán, một công thức phức tạp hoặc một văn bản pháp lý để người khác hiểu một cách thấu đáo.",
        exampleSentence = "In the next video, I will explicate the mathematical formula behind this language learning application.",
        nuanceInfo = "Trang trọng và học thuật hơn 'Explain'. Khi bạn 'explicate', bạn đóng vai trò như một chuyên gia đang giải phẫu một khối kiến thức đồ sộ, làm sáng tỏ (Elucidate) từng biến số nhỏ nhặt nhất.",
        collocations = listOf("Explicate a theory", "Explicate a text", "Fully explicate"),
        relatedWords = listOf(
            RelatedWord("Analyze", "Phân tích, nghiên cứu"),
            RelatedWord("Clarify", "Làm cho rõ ràng, dễ hiểu")
        )
    ),
    Word(
        id = "explicit",
        term = "Explicit",
        pronunciation = "/ɪkˈsplɪsɪt/",
        shortDefinition = "Rõ ràng, rành mạch, không hề úp mở.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Stated clearly and in detail, leaving no room for confusion or doubt.",
        vietnameseDiff = "Tính chất của một lời nói, điều khoản hợp đồng hoặc chỉ dẫn được viết cực kỳ rành mạch, chi tiết từng con số, không tạo ra bất kỳ một vùng xám hay sự mập mờ nào.",
        exampleSentence = "The father gave explicit instructions on how the 215 square meters of land should be divided.",
        nuanceInfo = "Ngược lại với 'Implicit' (Ngầm hiểu, ẩn ý). Trong lập trình hay ký kết văn bản đất đai, mọi thứ bắt buộc phải 'explicit' để tránh việc các bên tự diễn dịch sai lệch dẫn đến lỗi hệ thống hoặc tranh chấp (Enmity).",
        collocations = listOf("Explicit instructions", "Explicit consent", "Make it explicit"),
        relatedWords = listOf(
            RelatedWord("Definite", "Xác định, rõ ràng"),
            RelatedWord("Unambiguous", "Không mơ hồ, đanh thép")
        )
    ),
    Word(
        id = "exploit",
        term = "Exploit",
        pronunciation = "/ɪkˈsplɔɪt/",
        shortDefinition = "Khai thác tối đa; lợi dụng, bóc lột.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Make full use of and derive benefit from (a resource); benefit unfairly from the work of (someone).",
        vietnameseDiff = "Hành động tận dụng triệt để một nguồn tài nguyên/thuật toán để tạo ra dòng tiền; hoặc hành động chơi xấu, lợi dụng lỗ hổng/sức lao động của người khác cho mục đích trục lợi cá nhân.",
        exampleSentence = "Smart content creators know how to exploit the latest TikTok algorithm to gain organic reach.",
        nuanceInfo = "Từ này mang tính hai mặt. Trong kỹ thuật và kinh doanh, 'exploit a niche market' hay 'exploit a feature' mang nghĩa trung tính/tích cực (tối ưu hóa). Nhưng trong quan hệ nhân sự, 'exploit workers' lại mang sắc thái bóc lột độc hại.",
        collocations = listOf("Exploit a loophole", "Exploit resources", "Vulnerabilities exploited"),
        relatedWords = listOf(
            RelatedWord("Utilize", "Sử dụng hiệu quả, tận dụng"),
            RelatedWord("Manipulate", "Thao túng, điều khiển bằng mánh khóe")
        )
    ),
    Word(
        id = "exquisite",
        term = "Exquisite",
        pronunciation = "/ɪkˈskwɪzɪt/",
        shortDefinition = "Tinh tế, tuyệt mỹ, đạt đến độ hoàn hảo.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Extremely beautiful and delicate, typically including rare craftsmanship or intense quality.",
        vietnameseDiff = "Tính chất của một tác phẩm nghệ thuật, một bộ trang phục, một món ăn hoặc một nét đẹp visual được gọt giũa vô cùng tinh xảo, tỉ mỉ, khiến người xem phải trầm trồ vì sự sang trọng.",
        exampleSentence = "The plating of the traditional dish was so exquisite that customers immediately took photos for TikTok.",
        nuanceInfo = "Nâng cấp vượt bậc so với 'Beautiful'. 'Exquisite' miêu tả một vẻ đẹp có chiều sâu, đòi hỏi sự kỳ công (Conscientious) và gu thẩm mỹ đỉnh cao để tạo ra, mang lại một hào quang khó có thể sao chép rập khuôn.",
        collocations = listOf("Exquisite taste", "Exquisite craftsmanship", "Exquisite beauty"),
        relatedWords = listOf(
            RelatedWord("Magnificent", "Tráng lệ, lộng lẫy"),
            RelatedWord("Flawless", "Hoàn hảo, không tì vết")
        )
    ),
    Word(
        id = "extant",
        term = "Extant",
        pronunciation = "/ekˈstænt/",
        shortDefinition = "Hiện tồn, vẫn còn lưu giữ được đến ngày nay.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Still in existence; not destroyed or lost.",
        vietnameseDiff = "Tính chất của các tài liệu cổ, các công thức gia truyền hoặc bằng chứng lịch sử quý hiếm không bị thời gian hay chiến tranh tàn phá, hiện vẫn còn nằm trong tay chúng ta.",
        exampleSentence = "This is one of the few extant manuscripts detailing ancient word segmentation techniques.",
        nuanceInfo = "Rất hay bị viết nhầm thành 'Extent' (mức độ). 'Extant' chỉ dùng cho những thứ có tuổi đời lâu năm nhưng may mắn sống sót qua giông bão lịch sử, mang giá trị như một báu vật quý giá.",
        collocations = listOf("Extant documents", "Extant copies", "Oldest extant example"),
        relatedWords = listOf(
            RelatedWord("Surviving", "Còn sống sót, còn tồn tại"),
            RelatedWord("Existing", "Hiện có, hiện hành")
        )
    ),
    Word(
        id = "extenuating",
        term = "Extenuating",
        pronunciation = "/ɪkˈstenjueɪtɪŋ/",
        shortDefinition = "Giảm nhẹ, châm chước (hoàn cảnh phạm lỗi).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Serving to lessen the seriousness of an offense, making it more excusable.",
        vietnameseDiff = "Tính chất của một tình huống bất khả kháng, một nỗi khổ tâm thầm kín đứng sau một hành vi sai lầm, khiến cho hội đồng hoặc tòa án có lý do để châm chước, giảm nhẹ hình phạt.",
        exampleSentence = "The judge considered the young man's lack of legal experience as extenuating circumstances.",
        nuanceInfo = "Luôn xuất hiện trong cụm từ cố định 'Extenuating circumstances' (Hoàn cảnh giảm nhẹ). Nó không biến một hành vi sai trái thành đúng đắn, nhưng nó gỡ gạc lại một chút lòng trắc ẩn (Empathy) từ người thực thi công lý.",
        collocations = listOf("Extenuating circumstances", "Extenuating factors", "Argue extenuating"),
        relatedWords = listOf(
            RelatedWord("Mitigating", "Làm dịu bớt, giảm nhẹ"),
            RelatedWord("Justifying", "Biện minh, chứng minh là đúng")
        )
    ),
    Word(
        id = "extol",
        term = "Extol",
        pronunciation = "/ɪkˈstəʊl/",
        shortDefinition = "Tán dương, ca tụng hết lời lên tận mây xanh.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Praise enthusiastically.",
        vietnameseDiff = "Hành động công khai sử dụng những lời lẽ hoa mỹ, nhiệt thành nhất để ca ngợi tài năng của một người hoặc hiệu năng tuyệt vời của một sản phẩm trước đám đông.",
        exampleSentence = "Influencers love to extol the benefits of this portable fan during hot summer days.",
        nuanceInfo = "Mạnh hơn 'Praise' rất nhiều. Khi bạn 'extol' cái gì, bạn đang đặt trọn vẹn niềm tin và sự hào hứng vào đó, biến bài nói của mình thành một bài điếu văn tôn vinh hoặc một kịch bản bán hàng có sức công phá tâm lý cực lớn.",
        collocations = listOf("Extol the virtues of", "Publicly extol", "Extol the benefits"),
        relatedWords = listOf(
            RelatedWord("Laud", "Tán dương, khen ngợi"),
            RelatedWord("Acclaim", "Hoan nghênh, tôn vinh")
        )
    ),
    Word(
        id = "extraneous",
        term = "Extraneous",
        pronunciation = "/ɪkˈstreɪniəs/",
        shortDefinition = "Ngoại lai, không liên quan, thừa thãi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Irrelevant or unrelated to the subject being dealt with; of external origin.",
        vietnameseDiff = "Tính chất của thông tin rác, các dòng code thừa hoặc các yếu tố ngoại lai nhảy vào hệ thống làm nhiễu loạn luồng xử lý chính mà không đem lại giá trị gì.",
        exampleSentence = "To optimize the word segmentation algorithm, we must strip away all extraneous data.",
        nuanceInfo = "Một nhà làm phim, một lập trình viên tối ưu hóa hoặc một người viết kịch bản TikTok luôn phải chiến đấu để xóa bỏ 'extraneous details' (chi tiết thừa), giữ cho sản phẩm cốt lõi luôn cô đọng và sắc bén.",
        collocations = listOf("Extraneous information", "Extraneous details", "Extraneous factors"),
        relatedWords = listOf(
            RelatedWord("Irrelevant", "Không liên quan, lạc đề"),
            RelatedWord("Superfluous", "Dư thừa, vô dụng")
        )
    ),
    Word(
        id = "extravagant",
        term = "Extravagant",
        pronunciation = "/ɪkˈstrævəɡənt/",
        shortDefinition = "Phung phí, hoang phí, quá mức phóng đại.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Lacking restraint in spending money or using resources; exceeding what is reasonable or appropriate.",
        vietnameseDiff = "Tính chất của lối sống vung tay quá trán, chi tiêu vô tội vạ vào những thứ xa xỉ vượt quá nhu cầu thực tế; hoặc những lời khen ngợi phóng đại quá đà.",
        exampleSentence = "Spending a fortune on visual watermarks and dynamic edits for a single video felt a bit extravagant.",
        nuanceInfo = "Gợi cảm giác thiếu kiểm soát tài chính. Tuy nhiên, trong marketing, một chút 'extravagant style' (phong cách hoành tráng, lộng lẫy) lại là một chiêu trò thị giác (Visual) đắt giá để định vị thương hiệu ở phân khúc cao cấp.",
        collocations = listOf("Extravagant lifestyle", "Extravagant spending", "Extravagant praise"),
        relatedWords = listOf(
            RelatedWord("Profligate", "Hoang phí, phóng đãng"),
            RelatedWord("Lavish", "Hào phóng, xa hoa")
        )
    ),
    Word(
        id = "extricate",
        term = "Extricate",
        pronunciation = "/ˈekstrɪkeɪt/",
        shortDefinition = "Gỡ rối, giải thoát khỏi tình huống hiểm nghèo.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Free (someone or something) from a constraint or difficulty.",
        vietnameseDiff = "Hành động khôn khéo, dùng trí tuệ hoặc sự bình tĩnh để tự rút chân ra khỏi một mối quan hệ độc hại, một rắc rối pháp lý đất đai hoặc một mớ bòng bong dữ liệu.",
        exampleSentence = "It took months for him to completely extricate himself from that chaotic relationship drama.",
        nuanceInfo = "Nghĩa gốc là gỡ một nút thắt bị rối. Cấu trúc kinh điển là 'Extricate oneself from something'. Đòi hỏi bạn phải có một cái đầu lạnh (Equanimity) để phân tích các nút thắt thay vì giãy giụa làm tình hình tệ hơn (Exacerbate).",
        collocations = listOf("Extricate oneself from", "Extricate from difficulty", "Carefully extricate"),
        relatedWords = listOf(
            RelatedWord("Disentangle", "Gỡ rối, làm thông thoáng"),
            RelatedWord("Extract", "Trích xuất, nhổ ra")
        )
    ),
        Word(
        id = "exuberant",
        term = "Exuberant",
        pronunciation = "/ɪɡˈzjuːbərənt/",
        shortDefinition = "Tràn đầy sức sống, năng lượng dồi dào, hân hoan.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Filled with or characterized by a lively energy and excitement; growing luxuriantly.",
        vietnameseDiff = "Tính chất của một nguồn năng lượng sống bùng nổ, vui vẻ đến mức không thể kìm nén được; hoặc sự phát triển tươi tốt, rậm rạp của cây cối.",
        exampleSentence = "The dancer's exuberant performance captured the attention of everyone in the audience.",
        nuanceInfo = "Vượt xa mức độ 'Happy'. Từ này mô tả những người sở hữu nguồn hào quang tích cực, phóng khoáng, đi đến đâu là khuấy động bầu không khí đến đấy, rất thích hợp để làm các nội dung truyền cảm hứng high-energy.",
        collocations = listOf("Exuberant energy", "Exuberant youth", "Exuberant personality"),
        relatedWords = listOf(
            RelatedWord("Effervescent", "Sôi nổi, sủi bọt (nghĩa bóng)"),
            RelatedWord("Vibrant", "Sống động, đầy nghị lực")
        )
    ),
    Word(
        id = "fabricate",
        term = "Fabricate",
        pronunciation = "/ˈfæbrɪkeɪt/",
        shortDefinition = "Bịa đặt, làm giả (hồ sơ, câu chuyện); chế tạo.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Invent or concoct (something), typically with deceitful intent; construct or manufacture (an industrial product).",
        vietnameseDiff = "Hành động cố tình nhào nặn, xào nấu thông tin hoặc làm giả giấy tờ, hóa đơn tài chính với mưu đồ lừa đảo; hoặc nghĩa trung tính là gia công, chế tạo máy móc.",
        exampleSentence = "The devious manager tried to fabricate sales receipts to hide the discrepancy in the shop's budget.",
        nuanceInfo = "Trong văn cảnh đời sống và kinh doanh, 'Fabricate' mang sắc thái cực kỳ gian lận (Disingenuous). Một câu chuyện 'fabricated story' được dựng lên thường nhằm mục đích bú trend bẩn hoặc chạy trốn trách nhiệm (Evade).",
        collocations = listOf("Fabricate evidence", "Fabricate a story", "Fabricate documents"),
        relatedWords = listOf(
            RelatedWord("Concoct", "Bịa ra, pha chế"),
            RelatedWord("Counterfeit", "Làm giả (tiền, hàng hóa)")
        )
    ),
    Word(
        id = "facetious",
        term = "Facetious",
        pronunciation = "/fəˈsiːʃəs/",
        shortDefinition = "Khôi hài không đúng chỗ, cợt nhả thiếu nghiêm túc.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Treating serious issues with deliberately inappropriate humor; flippant.",
        vietnameseDiff = "Tính chất của những lời đùa cợt, thái độ giễu cợt mang tính xem nhẹ (Disparage) một vấn đề vốn đang cực kỳ nghiêm trọng hoặc nhạy cảm.",
        exampleSentence = "Making facetious remarks during a serious property law argument will only irritate your family.",
        nuanceInfo = "Rất dễ bị đánh giá là vô duyên hoặc thiếu EQ. Khi bạn 'facetious', bạn nghĩ mình đang mặn mà, hài hước, nhưng người đối diện lại cảm thấy bạn đang thiếu tôn trọng (Disdain) và không có tinh thần xây dựng.",
        collocations = listOf("Facetious remark", "Facetious comment", "Stop being facetious"),
        relatedWords = listOf(
            RelatedWord("Flippant", "Suồng sã, cợt nhả"),
            RelatedWord("Tongue-in-cheek", "Mỉa mai, nói đùa nhưng mặt nghiêm túc")
        )
    ),
    Word(
        id = "facile",
        term = "Facile",
        pronunciation = "/ˈfæsaɪl/",
        shortDefinition = "Hời hợt, quá đơn giản hóa; dễ dàng (nhưng thiếu chiều sâu).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Appearing neat and comprehensive only by ignoring the true complexities of an issue; superficial.",
        vietnameseDiff = "Tính chất của một giải pháp, nhận định hoặc lập luận nông cạn, bỏ qua toàn bộ các biến số phức tạp cốt lõi để đưa ra một kết luận dễ dãi.",
        exampleSentence = "A facile analysis of the algorithm will fail to explain why the video organic views suddenly dropped.",
        nuanceInfo = "Mang sắc thái chê bai rõ rệt. Đừng nhầm với 'Easy' (Dễ dàng tích cực). Một 'facile solution' (giải pháp hời hợt) giống như việc bạn chỉ biết uống thuốc giảm đau để trị một căn bệnh cần phải phẫu thuật tận gốc (Eradicate).",
        collocations = listOf("Facile argument", "Facile solution", "Facile generalization"),
        relatedWords = listOf(
            RelatedWord("Superficial", "Nông cạn, hời hợt"),
            RelatedWord("Simplistic", "Đơn giản hóa quá mức")
        )
    ),
    Word(
        id = "facilitate",
        term = "Facilitate",
        pronunciation = "/fəˈsɪlɪteɪt/",
        shortDefinition = "Tạo điều kiện thuận lợi, làm cho dễ dàng hơn.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Make (an action or process) easy or easier.",
        vietnameseDiff = "Hành động cung cấp công cụ, công nghệ hoặc quy trình chuẩn chỉnh giúp cho một công việc phức tạp trở nên mượt mà, tốn ít công sức hơn.",
        exampleSentence = "The new data structure was implemented to facilitate faster word segmentation queries.",
        nuanceInfo = "Động từ cực kỳ đắt giá trong viết CV, báo cáo hoặc mô tả tính năng ứng dụng. Thay vì nói 'Help' hay 'Make easy', dùng 'Facilitate' toát lên phong thái của một nhà thiết kế hệ thống chuyên nghiệp.",
        collocations = listOf("Facilitate learning", "Facilitate growth", "Facilitate communication"),
        relatedWords = listOf(
            RelatedWord("Assist", "Hỗ trợ, trợ giúp"),
            RelatedWord("Expedite", "Xúc tiến, đẩy nhanh")
        )
    ),
    Word(
        id = "fallacious",
        term = "Fallacious",
        pronunciation = "/fəˈleɪʃəs/",
        shortDefinition = "Sai lầm, ngụy biện, dựa trên logic lỗi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Based on a mistaken belief or unsound reasoning.",
        vietnameseDiff = "Tính chất của một lập luận, niềm tin hoặc giả thuyết toán học/kinh doanh thoạt nhìn có vẻ thuyết phục nhưng thực chất lại chứa đựng những lỗ hổng logic chết người.",
        exampleSentence = "It is fallacious to assume that high follower count automatically yields high restaurant revenue.",
        nuanceInfo = "Tính từ của 'Fallacy' (Nguỵ biện). Thường dùng để bác bỏ (Debunk) những tư duy rập khuôn, những nhận định sai lệch (Erroneous) do đám đông tự suy diễn mà không dựa trên bằng chứng thực tế (Empirical data).",
        collocations = listOf("Fallacious argument", "Fallacious reasoning", "Highly fallacious"),
        relatedWords = listOf(
            RelatedWord("Spurious", "Giả tạo, không căn cứ"),
            RelatedWord("Misleading", "Gây hiểu lầm, lạc hướng")
        )
    ),
    Word(
        id = "falter",
        term = "Falter",
        pronunciation = "/ˈfɔːltə(r)/",
        shortDefinition = "Loạng choạng, nao núng, bắt đầu suy yếu/mất đà.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Lose strength or momentum; speak hesitantly; move unsteadily.",
        vietnameseDiff = "Trạng thái một hệ thống kinh doanh, một thuật toán hoặc ý chí của một người bắt đầu có dấu hiệu chững lại, hụt hơi và chập chờn sau một giai đoạn phát triển nóng.",
        exampleSentence = "Even when facing financial dry spells, his resolve to build the application did not falter.",
        nuanceInfo = "Mô tả khoảnh khắc nhạy cảm trước khi một thứ sụp đổ hoặc lội ngược dòng. Sắc thái chứa đựng sự đấu tranh nội tâm. Một người kiên cường (Dauntless) sẽ không bao giờ để ngọn lửa đam mê của mình bị 'falter' trước biến cố.",
        collocations = listOf("Never falter", "Begin to falter", "Faltering economy"),
        relatedWords = listOf(
            RelatedWord("Waver", "Dao động, lung lay"),
            RelatedWord("Stumble", "Vấp ngã, trượt chân")
        )
    ),
    Word(
        id = "fanatical",
        term = "Fanatical",
        pronunciation = "/fəˈnætɪkl/",
        shortDefinition = "Cuồng tín, mê muội, cực đoan quá mức.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Filled with excessive and single-minded zeal, especially for an extreme religious or political cause.",
        vietnameseDiff = "Tính chất của sự đam mê, ủng hộ một thần tượng, một lý tưởng hoặc một thói quen đến mức mù quáng, cực đoan và không chấp nhận bất kỳ ý kiến trái chiều nào.",
        exampleSentence = "His fanatical devotion to clean coding standards made him a very strict lead developer.",
        nuanceInfo = "Nặng hơn 'Enthusiastic' (Nhiệt tình). Từ này thường gợi cảm giác hơi độc đoán (Dogmatic) và thiếu kiểm soát lý trí, sẵn sàng tấn công bất cứ ai dám động chạm đến đức tin hoặc hệ tư tưởng của họ.",
        collocations = listOf("Fanatical supporter", "Fanatical devotion", "Almost fanatical"),
        relatedWords = listOf(
            RelatedWord("Zealous", "Hăng hái, sốt sắng"),
            RelatedWord("Obsessive", "Ám ảnh, cố chấp")
        )
    ),
    Word(
        id = "fastidious",
        term = "Fastidious",
        pronunciation = "/fæˈstɪdiəs/",
        shortDefinition = "Khó tính, kỹ tính, đòi hỏi sự chỉn chu tuyệt đối.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Very attentive to and concerned about accuracy and detail; very concerned about matters of cleanliness.",
        vietnameseDiff = "Tính chất của một người cực kỳ để ý đến tiểu tiết, yêu cầu mọi thứ từ vệ sinh, cách sắp xếp layout cho đến từng dòng code phải đạt độ hoàn hảo, không chấp nhận bất kỳ một tì vết nào.",
        exampleSentence = "A fastidious video editor will spend hours fine-tuning the visual watermarks and color grading.",
        nuanceInfo = "Vừa là lời khen vừa là lời phàn nàn. Trong công việc kỹ thuật hoặc làm bếp, tính 'fastidious' (Conscientious) giúp tạo ra sản phẩm tinh tế (Exquisite); nhưng trong đời sống cá nhân, nó có thể khiến những người xung quanh ngột ngạt.",
        collocations = listOf("Fastidious attention to detail", "Fastidious cleanliness", "Highly fastidious"),
        relatedWords = listOf(
            RelatedWord("Meticulous", "Tỉ mỉ, kỹ càng"),
            RelatedWord("Scrupulous", "Thấu đáo, tận tâm")
        )
    ),
    Word(
        id = "fathom",
        term = "Fathom",
        pronunciation = "/ˈfæðəm/",
        shortDefinition = "Hiểu thấu, lý giải nổi (thường dùng trong câu phủ định).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Understand (a difficult problem or an enigmatic person) after much thought.",
        vietnameseDiff = "Hành động đào sâu suy nghĩ để có thể chạm tới bản chất, hiểu thấu được động cơ của một con người kỳ lạ hoặc tìm ra lời giải cho một bài toán hóc búa.",
        exampleSentence = "I cannot fathom why anyone would compromise their integrity for temporary online fame.",
        nuanceInfo = "Nghĩa gốc là đo độ sâu của nước biển. Thường dùng dưới dạng 'Cannot fathom...' (Không tài nào hiểu nổi). Nó nhấn mạnh rằng đối tượng được nhắc tới giống như một chiếc 'enigma' quá sâu thẳm, vượt ngoài logic thông thường.",
        collocations = listOf("Cannot fathom why", "Difficult to fathom", "Fathom the mystery"),
        relatedWords = listOf(
            RelatedWord("Comprehend", "Lĩnh hội, thấu hiểu"),
            RelatedWord("Grasp", "Nắm bắt (kiến thức/cơ hội)")
        )
    ),
    Word(
        id = "fatuous",
        term = "Fatuous",
        pronunciation = "/ˈfætʃuəs/",
        shortDefinition = "Ngu ngốc một cách tự mãn, ngớ ngẩn.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Silly and pointless; foolish and done without serious thought.",
        vietnameseDiff = "Tính chất của một hành vi, câu hỏi hoặc lời tuyên bố ngớ ngẩn, sáo rỗng nhưng người nói lại tỏ ra rất đắc ý và tự tin vào bản thân.",
        exampleSentence = "He regretted making such a fatuous comment during the formal land division meeting.",
        nuanceInfo = "Đỉnh cao của sự châm biếm. Khác với 'Stupid' (ngu ngốc thông thường), 'Fatuous' chứa đựng yếu tố tự mãn (Complacent). Người phạm lỗi 'fatuous' hoàn toàn không biết mình đang nực cười trong mắt đám đông.",
        collocations = listOf("Fatuous smile", "Fatuous remark", "Fatuous argument"),
        relatedWords = listOf(
            RelatedWord("Asinine", "Ngu xuẩn, lố bịch"),
            RelatedWord("Inane", "Vô nghĩa, ngớ ngẩn")
        )
    ),
    Word(
        id = "feasible",
        term = "Feasible",
        pronunciation = "/ˈfiːzəbl/",
        shortDefinition = "Khả thi, có thể thực hiện được trên thực tế.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Possible to do easily or conveniently; likely; probable.",
        vietnameseDiff = "Tính chất của một dự án, một thuật toán hoặc một phương án kinh doanh có đầy đủ tài nguyên, công nghệ và tính thực tiễn để triển khai thành công thay vì chỉ là bánh vẽ lý thuyết.",
        exampleSentence = "Building a simplified language application with specific formulas is highly feasible for a single developer.",
        nuanceInfo = "Xuất hiện kinh điển trong cụm 'Feasibility study' (Nghiên cứu tính khả thi). Trước khi vung tiền vào marketing hay code, một bộ óc chiến lược luôn phải tính toán xem biến số đó có 'feasible' hay không để tránh đốt tiền vô ích.",
        collocations = listOf("Highly feasible", "Feasible solution", "Commercially feasible"),
        relatedWords = listOf(
            RelatedWord("Viable", "Có thể tồn tại/phát triển, khả thi"),
            RelatedWord("Practicable", "Có thể thực hành được")
        )
    ),
        Word(
        id = "feign",
        term = "Feign",
        pronunciation = "/feɪn/",
        shortDefinition = "Giả vờ, giả bộ, vờ vịt (cảm xúc, bệnh tật).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Pretend to be affected by (a feeling, state, or injury).",
        vietnameseDiff = "Hành động cố tình diễn xuất, tạo ra một vẻ bề ngoài giả tạo nhằm che giấu cảm xúc thật hoặc lừa gạt người xung quanh để trục lợi hoặc né tránh trách nhiệm.",
        exampleSentence = "He tried to feign indifference when his sister-in-law brought up his ex-girlfriend in the conversation.",
        nuanceInfo = "Trang trọng hơn 'Pretend'. Thường đi kèm với các danh từ chỉ trạng thái cảm xúc như 'feign illness' (giả bệnh), 'feign surprise' (giả vờ bất ngờ). Hành vi này toát lên sự thiếu thành thật (Disingenuous) và có tính toán trước.",
        collocations = listOf("Feign ignorance", "Feign indifference", "Feign surprise"),
        relatedWords = listOf(
            RelatedWord("Pretend", "Giả vờ, làm bộ"),
            RelatedWord("Simulate", "Mô phỏng, giả cách")
        )
    ),
    Word(
        id = "felicitous",
        term = "Felicitous",
        pronunciation = "/fəˈlɪsɪtəs/",
        shortDefinition = "Rất phù hợp, đắc địa; đem lại may mắn, hạnh phúc.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Well chosen or suited to the circumstances; apt; marked by good fortune.",
        vietnameseDiff = "Tính chất của một lời nói, cách dùng từ cực kỳ tinh tế, gãi đúng chỗ ngứa của người nghe; hoặc một sự kiện diễn ra vô cùng đúng lúc mang lại kết quả tốt đẹp.",
        exampleSentence = "The host chose a felicitous phrase that immediately broke the ice and charmed the audience.",
        nuanceInfo = "Một từ rất sang trọng để khen ngợi kỹ năng giao tiếp. Một 'felicitous hook' trong kịch bản TikTok là một câu mở đầu được tính toán chuẩn xác đến từng chữ, khiến người xem không thể lướt qua vì nó quá hợp tâm lý của họ.",
        collocations = listOf("Felicitous combination", "Felicitous phrase", "Highly felicitous"),
        relatedWords = listOf(
            RelatedWord("Apt", "Thích hợp, thông minh"),
            RelatedWord("Appropriate", "Thích đáng, phù hợp")
        )
    ),
    Word(
        id = "fervent",
        term = "Fervent",
        pronunciation = "/ˈfɜːvənt/",
        shortDefinition = "Nồng nhiệt, nhiệt thành, cháy bỏng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Having or displaying a passionate intensity.",
        vietnameseDiff = "Tính chất của một niềm tin, sự ủng hộ hoặc tình cảm mãnh liệt, xuất phát từ tận đáy lòng và luôn rực cháy một cách kiên định.",
        exampleSentence = "His fervent hope is to create a language app that simplifies learning formulas for everyone.",
        nuanceInfo = "Mang năng lượng tích cực và sâu sắc hơn 'Enthusiastic'. 'Fervent' toát ra sự nghiêm túc, một ngọn lửa đam mê nội tại mãnh liệt (như 'fervent desire' - khao khát cháy bỏng) thúc đẩy hành động chứ không chỉ là sự hào hứng nhất thời (Ephemeral).",
        collocations = listOf("Fervent hope", "Fervent supporter", "Fervent desire"),
        relatedWords = listOf(
            RelatedWord("Passionate", "Đam mê, nồng nàn"),
            RelatedWord("Ardent", "Hăng hái, sôi nổi")
        )
    ),
    Word(
        id = "fickle",
        term = "Fickle",
        pronunciation = "/ˈfɪkl/",
        shortDefinition = "Hay thay đổi, không kiên định, sáng nắng chiều mưa.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Changing frequently, especially as regards one's loyalties, interests, or affections.",
        vietnameseDiff = "Tính chất của một người, một nhóm công chúng hoặc xu hướng thị trường liên tục thay đổi sở thích, lòng trung thành một cách vô cớ, không thể lường trước.",
        exampleSentence = "TikTok trends are notoriously fickle; what is viral today can be completely ignored tomorrow.",
        nuanceInfo = "Thường mang sắc thái chê bai sự thiếu chín chắn. 'Fickle fans' (người hâm mộ cả thèm chóng chán) hay 'fickle weather' (thời tiết thất thường) nhắc nhở các nhà kinh doanh không được phụ thuộc vào cảm xúc nhất thời của đám đông mà phải tập trung vào giá trị cốt lõi.",
        collocations = listOf("Fickle market", "Fickle nature", "Fickle public"),
        relatedWords = listOf(
            RelatedWord("Capricious", "Thất thường, hay thay đổi"),
            RelatedWord("Inconstant", "Bất định, không thủy chung")
        )
    ),
    Word(
        id = "fidelity",
        term = "Fidelity",
        pronunciation = "/fɪˈdeləti/",
        shortDefinition = "Lòng trung thành, sự thủy chung; độ chính xác cao.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Faithfulness to a person, cause, or belief, demonstrated by continuing loyalty and support; the degree of exactness with which something is copied or reproduced.",
        vietnameseDiff = "Sự gắn kết kiên định, không thay lòng đổi dạ trong tình cảm, nguyên tắc sống; hoặc độ trung thực, chính xác tuyệt đối của dữ liệu, âm thanh, hình ảnh so với bản gốc.",
        exampleSentence = "The algorithm guarantees high fidelity in word segmentation without losing contextual meaning.",
        nuanceInfo = "Trong các mối quan hệ, 'marital fidelity' là sự thủy chung son sắt. Trong công nghệ, thuật ngữ 'High-fidelity' (Hi-Fi) hoặc nguyên mẫu thiết kế 'high-fidelity prototype' chỉ sản phẩm có độ mô phỏng cực kỳ chi tiết, giống hệt thực tế.",
        collocations = listOf("High fidelity", "Fidelity to", "Brand fidelity"),
        relatedWords = listOf(
            RelatedWord("Loyalty", "Lòng trung thành, sự thành tín"),
            RelatedWord("Accuracy", "Độ chính xác, sự chuẩn xác")
        )
    ),
    Word(
        id = "finesse",
        term = "Finesse",
        pronunciation = "/fɪˈnes/",
        shortDefinition = "Sự khéo léo, tinh tế, xử lý nghệ thuật.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Intricate and refined delicacy; great skill in handling a difficult or highly sensitive situation.",
        vietnameseDiff = "Danh từ chỉ kỹ năng xử lý một tình huống cực kỳ nhạy cảm, hóc búa hoặc thực hiện một động tác kỹ thuật phức tạp một cách mượt mà, đẳng cấp, không để lại tì vết.",
        exampleSentence = "She managed the family property dispute with impressive diplomatic finesse.",
        nuanceInfo = "Vừa có thể là danh từ, vừa là động từ. Khi bạn 'finesse a situation', nghĩa là bạn không dùng cơ bắp hay bạo lực, mà dùng sự khôn khéo, trí tuệ cảm xúc (EQ) và tác phong chuẩn mực (Decorum) để xoay chuyển cục diện theo ý mình.",
        collocations = listOf("Diplomatic finesse", "Handle with finesse", "Technical finesse"),
        relatedWords = listOf(
            RelatedWord("Skillfulness", "Sự khéo tay, sự tài tình"),
            RelatedWord("Subtlety", "Sự tinh tế, khía cạnh tế nhị")
        )
    ),
    Word(
        id = "fiscal",
        term = "Fiscal",
        pronunciation = "/ˈfɪskl/",
        shortDefinition = "Thuộc về tài chính, ngân khố, thuế khóa.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Relating to government revenue, especially taxes, or financial matters in general.",
        vietnameseDiff = "Tính từ mang tính pháp lý và vĩ mô, dùng để chỉ các vấn đề liên quan đến doanh thu, ngân sách, thuế hoặc chu kỳ quản lý tiền bạc của một tổ chức, nhà nước.",
        exampleSentence = "Maintaining fiscal discipline is crucial for the long-term survival of any small business.",
        nuanceInfo = "Cần phân biệt với 'Financial' (mang nghĩa tài chính chung chung). 'Fiscal' thường gắn liền với chính sách của chính phủ ('fiscal policy') hoặc chu kỳ báo cáo thuế của doanh nghiệp, ví dụ 'fiscal year' (năm tài chính/năm ngân sách).",
        collocations = listOf("Fiscal year", "Fiscal policy", "Fiscal discipline"),
        relatedWords = listOf(
            RelatedWord("Financial", "Thuộc về tài chính"),
            RelatedWord("Monetary", "Thuộc về tiền tệ")
        )
    ),
    Word(
        id = "flagrant",
        term = "Flagrant",
        pronunciation = "/ˈfleɪɡrənt/",
        shortDefinition = "Trắng trợn, tồi tệ một cách hiển nhiên, không biết xấu hổ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Conspicuously or obviously offensive.",
        vietnameseDiff = "Tính chất của một hành vi vi phạm pháp luật, đạo đức hoặc quy định hệ thống diễn ra một cách công khai, lộ liễu, thách thức dư luận mà không hề có ý định che giấu.",
        exampleSentence = "Copying someone else's complete video without giving credit is a flagrant violation of copyright.",
        nuanceInfo = "Nặng hơn 'Bad' hoặc 'Wrong'. 'Flagrant' mang sắc thái phẫn nộ từ người chứng kiến. Ví dụ 'flagrant disregard for the law' (sự coi thường luật pháp trắng trợn), cho thấy đối phương vô cùng ngạo mạn và trơ trẽn.",
        collocations = listOf("Flagrant violation", "Flagrant disregard", "Flagrant breach"),
        relatedWords = listOf(
            RelatedWord("Blatant", "Hay kêu ca, hiển nhiên, trắng trợn"),
            RelatedWord("Glaring", "Rõ ràng, chói lòa (nghĩa bóng tiêu cực)")
        )
    ),
    Word(
        id = "flamboyant",
        term = "Flamboyant",
        pronunciation = "/flæmˈbɔɪənt/",
        shortDefinition = "Chói lọi, rực rỡ, thích gây chú ý, phô trương.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Tending to attract attention because of their exuberance, confidence, and stylishness.",
        vietnameseDiff = "Tính chất của một phong cách thời trang, lối sống hoặc cách biểu diễn cực kỳ lộng lẫy, đầy màu sắc, tự tin và luôn thu hút mọi ánh nhìn của đám đông.",
        exampleSentence = "The creator is known for his flamboyant outfits and high-energy performance arts on TikTok.",
        nuanceInfo = "Có thể mang nghĩa tích cực (cuốn hút, cá tính nghệ sĩ) hoặc tiêu cực (lòe loẹt, phô trương quá đà). Trong visual marketing, yếu tố 'flamboyant aesthetic' là một công cụ đắc lực để tạo ra sự khác biệt, chống lại sự rập khuôn (Derivative).",
        collocations = listOf("Flamboyant style", "Flamboyant personality", "Flamboyant clothes"),
        relatedWords = listOf(
            RelatedWord("Ostentatious", "Khoe khoang, phô trương"),
            RelatedWord("Showy", "Sặc sỡ, thích làm dáng")
        )
    ),
    Word(
        id = "flaunt",
        term = "Flaunt",
        pronunciation = "/flɔːnt/",
        shortDefinition = "Khoe khoang, phô diễn (tài sản, tài năng) một cách trơ trẽn.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Display (something) ostentatiously, especially in order to provoke envy or admiration or to show defiance.",
        vietnameseDiff = "Hành động cố tình trưng trổ sự giàu sang, nhan sắc hoặc tài năng trước mặt người khác nhằm mục đích chọc tức, gây thèm muốn hoặc tìm kiếm sự sùng bái.",
        exampleSentence = "A high-value person aspires to achieve wealth while maintaining absolute privacy, rather than trying to flaunt it.",
        nuanceInfo = "Mang sắc thái tiêu cực rõ rệt, gợi sự kém tinh tế. Khác với việc tự tin thể hiện bản thân, 'flaunt' mang động cơ muốn người khác phải ghen tị. Câu nói kinh điển: 'If you've got it, flaunt it' (Có thì khoe ra), nhưng trong văn hóa Á Đông, hành vi này rất dễ rước về thù hằn (Enmity).",
        collocations = listOf("Flaunt wealth", "Flaunt success", "Tendency to flaunt"),
        relatedWords = listOf(
            RelatedWord("Parade", "Diễu hành, phô bày"),
            RelatedWord("Show off", "Khoe mẽ, diện")
        )
    ),
    Word(
        id = "fleeting",
        term = "Fleeting",
        pronunciation = "/ˈfliːtɪŋ/",
        shortDefinition = "Thoáng qua, vùn vụt, ngắn ngủi.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Lasting for a very short time.",
        vietnameseDiff = "Tính chất của một cảm xúc, một tia ý tưởng hoặc một khoảnh khắc diễn ra và biến mất nhanh như một chớp mắt, không thể níu giữ.",
        exampleSentence = "He caught a fleeting glimpse of his ex-girlfriend in the crowded local night market.",
        nuanceInfo = "Gần nghĩa với 'Ephemeral'. Thường đi kèm với những thứ thuộc về tâm trạng hoặc nhận thức như 'fleeting moment' (khoảnh khắc thoáng qua), 'fleeting thought' (ý nghĩ xẹt qua đầu). Nhắc nhở chúng ta phải nhanh tay ghi lại (hoặc lập trình ngay) trước khi nó tan biến.",
        collocations = listOf("Fleeting moment", "Fleeting glimpse", "Fleeting pleasure"),
        relatedWords = listOf(
            RelatedWord("Transient", "Nhất thời, ngắn ngủi"),
            RelatedWord("Brief", "Vắn tắt, gọn gàng")
        )
    ),
    Word(
        id = "flippant",
        term = "Flippant",
        pronunciation = "/ˈflɪpənt/",
        shortDefinition = "Suồng sã, cợt nhả, thiếu tôn trọng trước vấn đề nghiêm túc.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Not showing a serious or respectful attitude.",
        vietnameseDiff = "Tính chất của một thái độ, lời bình luận coi thường, thiếu chín chắn khi đang đối thoại về một chủ đề đòi hỏi sự trang nghiêm hoặc tính pháp lý.",
        exampleSentence = "His flippant tone during the land division signing session deeply upset his father.",
        nuanceInfo = "Đồng nghĩa với 'Facetious'. Người có thái độ 'flippant' thường cố tình tỏ ra bất cần, cool ngầu không đúng chỗ, dẫn đến việc phá nát bầu không khí lịch sự (Decorum) và khiến đối tác cảm thấy họ không đáng tin cậy.",
        collocations = listOf("Flippant attitude", "Flippant remark", "Flippant tone"),
        relatedWords = listOf(
            RelatedWord("Disrespectful", "Vô lễ, thiếu tôn kính"),
            RelatedWord("Irreverent", "Bất kính, sỗ sàng")
        )
    ),
        Word(
        id = "flout",
        term = "Flout",
        pronunciation = "/flaʊt/",
        shortDefinition = "Cố tình khinh nhờn, ngang nhiên vi phạm (luật lệ, quy định).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Openly disregard (a rule, law or custom).",
        vietnameseDiff = "Hành động công khai coi thường, bất chấp và ngang nhiên phá vỡ các quy định pháp lý, luật lệ hoặc truyền thống một cách ngạo mạn.",
        exampleSentence = "The illegal streaming platform continued to flout copyright laws regarding professional digital assets.",
        nuanceInfo = "Nặng hơn 'Violate'. Khi ai đó 'flout the law', họ không chỉ phạm lỗi một cách vô ý mà đang đưa ra một thông điệp thách thức (Defiance) cơ quan chức năng hoặc hệ thống quản lý.",
        collocations = listOf("Flout the rules", "Flout the law", "Openly flout"),
        relatedWords = listOf(
            RelatedWord("Defy", "Thách thức, bất chấp"),
            RelatedWord("Disregard", "Coi thường, ngó lơ")
        )
    ),
    Word(
        id = "fluctuate",
        term = "Fluctuate",
        pronunciation = "/ˈflʌktʃueɪt/",
        shortDefinition = "Biến động liên tục, lên xuống trồi sụt thất thường.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Rise and fall irregularly in number or amount.",
        vietnameseDiff = "Trạng thái của số liệu, giá cả thị trường hoặc lượng truy cập liên tục dao động, thay đổi biên độ lên xuống liên tục chứ không giữ ở mức ổn định.",
        exampleSentence = "Daily video views on new accounts tend to fluctuate wildly before the algorithm finds the right niche.",
        nuanceInfo = "Một thuật ngữ kinh điển trong phân tích số liệu kỹ thuật và tài chính. Khi các biến số 'fluctuate wildly' (biến động dữ dội), hệ thống hoặc người vận hành cần phải giữ được sự điềm tĩnh (Equanimity) để đưa ra phán đoán dài hạn.",
        collocations = listOf("Fluctuate wildly", "Fluctuate between", "Fluctuating prices"),
        relatedWords = listOf(
            RelatedWord("Vary", "Thay đổi, khác nhau"),
            RelatedWord("Waver", "Dao động, lung lay")
        )
    ),
    Word(
        id = "foible",
        term = "Foible",
        pronunciation = "/ˈfɔɪbl/",
        shortDefinition = "Nhược điểm nhỏ, tật xấu vô hại trong tính cách.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A minor weakness or eccentricity in someone's character.",
        vietnameseDiff = "Danh từ chỉ một thói quen kỳ lạ, một điểm yếu rất nhỏ trong nhân cách của một người nhưng hoàn toàn vô hại và có thể dễ dàng châm chước được.",
        exampleSentence = "Being slightly fastidious about cleaning his workspace is just one of his many professional foibles.",
        nuanceInfo = "Sắc thái mang tính bao dung, nhẹ nhàng. Khác với những thói xấu độc hại (Vice) phá nát một mối quan hệ, một 'human foible' đôi khi lại là nét chấm phá khiến một cá nhân hoặc một nhân vật trong kịch bản trở nên thực tế và gần gũi (Empathy) hơn.",
        collocations = listOf("Human foible", "Minor foible", "Character foible"),
        relatedWords = listOf(
            RelatedWord("Idiosyncrasy", "Đặc tính lập dị, phong cách riêng"),
            RelatedWord("Quirk", "Tật kỳ lạ, sự ngẫu hứng")
        )
    ),
    Word(
        id = "foil",
        term = "Foil",
        pronunciation = "/fɔɪl/",
        shortDefinition = "Làm thất bại, chặn đứng (âm mưu); nhân tố làm nổi bật.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Prevent (something wrong or undesirable) from succeeding; a person or thing that contrasts with and so enhances the qualities of another.",
        vietnameseDiff = "Hành động kịp thời ngăn chặn, đập tan một âm mưu hoặc thủ đoạn xấu xa; hoặc danh từ chỉ một nhân vật/sự vật đứng cạnh bên để làm tôn lên vẻ đẹp/đặc tính của đối tượng chính.",
        exampleSentence = "A robust authentication system was implemented to foil all potential server hacking attempts.",
        nuanceInfo = "Ở dạng động từ, 'foil a plot/plan' mang năng lượng của người hùng chặn đứng kẻ gian. Ở dạng danh từ trong nghệ thuật hoặc thiết kế visual, một nhân vật phụ có tính cách bốc đồng (Erratic) sẽ là một 'perfect foil' để làm nổi bật sự điềm tĩnh của nhân vật chính.",
        collocations = listOf("Foil a plot", "Foil an attempt", "Perfect foil for"),
        relatedWords = listOf(
            RelatedWord("Thwart", "Phá ngang, cản trở"),
            RelatedWord("Enhance", "Nâng cao, làm nổi bật")
        )
    ),
    Word(
        id = "forage",
        term = "Forage",
        pronunciation = "/ˈfɒrɪdʒ/",
        shortDefinition = "Lục lọi, tìm kiếm (thức ăn, thông tin, tài nguyên).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Search widely for food or provisions; search for something hidden or lost.",
        vietnameseDiff = "Hành động đi lùng sục, tìm kiếm khắp nơi để gom nhặt thức ăn, tài nguyên hoặc thông tin cần thiết phục vụ cho sự sinh tồn hoặc một dự án cụ thể.",
        exampleSentence = "Developers often have to forage through obsolete documentation to find specific formula errors.",
        nuanceInfo = "Nghĩa gốc dùng cho động vật đi kiếm ăn trong rừng sâu. Khi đưa vào văn cảnh công nghệ hoặc sáng tạo, 'forage for ideas/data' gợi hình ảnh một quá trình tìm kiếm rất chủ động, lăn xả vào những vùng dữ liệu hoang sơ, hỗn loạn để nhặt nhạnh những viên ngọc thô.",
        collocations = listOf("Forage for food", "Forage for information", "Forage through"),
        relatedWords = listOf(
            RelatedWord("Scavenge", "Bới rác, tìm đồ ăn thừa"),
            RelatedWord("Rummage", "Lục lọi, lục soát")
        )
    ),
    Word(
        id = "forbear",
        term = "Forbear",
        pronunciation = "/fɔːˈbeə(r)/",
        shortDefinition = "Tự kiềm chế, nhẫn nhịn, cố nhịn không làm gì.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Politely or patiently restrain oneself from doing or saying something.",
        vietnameseDiff = "Hành động chủ động kìm nén một thôi thúc nội tại, cố gắng giữ im lặng hoặc nhẫn nhịn không thực hiện một phản ứng tiêu cực để bảo vệ bầu không khí lịch sự.",
        exampleSentence = "Despite his intense frustration, he chose to forbear from making a sharp comeback.",
        nuanceInfo = "Động từ này chứa đựng năng lượng của sự kỷ luật cao độ và lòng tự trọng (Decorum). Cấu trúc thường là 'Forbear from doing something'. Khi bạn 'forbear', bạn chứng minh mình là người làm chủ cảm xúc, không để cái tôi bốc đồng dẫn dắt.",
        collocations = listOf("Forbear from", "Could not forbear", "Patiently forbear"),
        relatedWords = listOf(
            RelatedWord("Refrain", "Kiềm chế, cố nhịn"),
            RelatedWord("Abstain", "Kiêng khem, tiết chế")
        )
    ),
    Word(
        id = "foreboding",
        term = "Foreboding",
        pronunciation = "/fɔːˈbəʊdɪŋ/",
        shortDefinition = "Điềm báo, linh cảm xấu về một tai họa sắp đến.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A feeling that something bad will happen; fearful apprehension.",
        vietnameseDiff = "Danh từ chỉ cảm giác lo âu, bất an sâu kín trong lòng, như một giác quan thứ sáu mánh bảo rằng một rắc rối hoặc biến cố lớn sắp sửa ập xuống.",
        exampleSentence = "He walked into the legal dispute meeting with a heavy sense of foreboding.",
        nuanceInfo = "Luôn đi kèm với sắc thái u tối, tiêu cực. Khác với sự lo lắng thông thường (Anxiety), một 'sense of foreboding' giống như bầu không khí ngột ngạt trước khi một cơn bão nổi lên, khiến bạn phải lập tức đề phòng và chuẩn bị phương án dự phòng.",
        collocations = listOf("Sense of foreboding", "Heavy foreboding", "Filled with foreboding"),
        relatedWords = listOf(
            RelatedWord("Premonition", "Linh cảm, điềm báo trước"),
            RelatedWord("Apprehension", "Sự sợ hãi, sự e sợ")
        )
    ),
    Word(
        id = "foreshadow",
        term = "Foreshadow",
        pronunciation = "/fɔːˈʃædəʊ/",
        shortDefinition = "Báo trước, hé lộ trước bằng các tình tiết ẩn ý.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Be a warning or indication of (a future event).",
        vietnameseDiff = "Hành động gài gắm các chi tiết nhỏ, hình ảnh hoặc lời nói ở giai đoạn đầu để ngầm ẩn ý, chuẩn bị tâm lý cho người xem về một bước ngoặt lớn sẽ xảy ra ở đoạn kết.",
        exampleSentence = "The opening visual sequence was carefully designed to foreshadow the video's dramatic ending.",
        nuanceInfo = "Một kỹ thuật tối thượng trong viết kịch bản, làm phim và xây dựng cốt truyện TikTok (Storytelling). Một cú 'foreshadow' tinh tế (Exquisite) sẽ khiến người xem vỡ òa khi xem đến cuối và lập tức muốn xem lại từ đầu để tìm kiếm manh mối.",
        collocations = listOf("Carefully foreshadow", "Foreshadow the future", "Foreshadow a crisis"),
        relatedWords = listOf(
            RelatedWord("Anticipate", "Thấy trước, lường trước"),
            RelatedWord("Portend", "Báo hiệu, là điềm của")
        )
    ),
    Word(
        id = "forfeit",
        term = "Forfeit",
        pronunciation = "/ˈfɔːfɪt/",
        shortDefinition = "Bị tước, phải nộp phạt, mất quyền lợi do vi phạm.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Lose or be deprived of (property, a right, or a privilege) as a penalty for wrongdoing.",
        vietnameseDiff = "Hành động phải chấp nhận từ bỏ hoặc bị cơ quan chức năng tịch thu tài sản, quyền lợi pháp lý do bản thân đã vi phạm nghiêm trọng các điều khoản hợp đồng hoặc luật pháp.",
        exampleSentence = "If you fail to sign the division documents within the deadline, you might forfeit your land claim.",
        nuanceInfo = "Vừa là động từ vừa là danh từ. Đây là cái giá đắt phải trả về mặt luật pháp hoặc cuộc chơi kinh doanh. Từ này nhấn mạnh rằng việc bạn mất đi quyền lợi hoàn toàn là do lỗi lầm hoặc sự chậm trễ (Negligence) của chính bạn.",
        collocations = listOf("Forfeit a right", "Forfeit deposit", "Forfeit the match"),
        relatedWords = listOf(
            RelatedWord("Surrender", "Đầu hàng, giao nộp"),
            RelatedWord("Relinquish", "Từ bỏ quyền lợi, buông bỏ")
        )
    ),
    Word(
        id = "forge",
        term = "Forge",
        pronunciation = "/fɔːdʒ/",
        shortDefinition = "Làm giả (chữ ký, tiền); nỗ lực xây dựng (mối quan hệ vững chắc).",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Create a fraudulent imitation of (a document, signature, or banknote); create or establish (a relationship or bad habit) with clear effort.",
        vietnameseDiff = "Hành động sao chép trái phép chữ ký, giấy chứng nhận quyền sở hữu nhằm lừa đảo; hoặc nghĩa tích cực là rèn luyện, dốc sức gầy dựng nên một liên minh, một sự nghiệp vững chắc.",
        exampleSentence = "He worked relentlessly to forge a strong alliance with top local raw material suppliers.",
        nuanceInfo = "Từ này mang hai thái cực đối lập hoàn toàn. Trong văn cảnh tội phạm, 'forge a signature' (giả mạo chữ ký) là hành vi lừa đảo đê tiện. Nhưng trong kinh doanh và ngoại giao, 'forge a partnership' (rèn đúc mối quan hệ đối tác) lại mang năng lượng của sự kiến tạo, kiên cường vượt qua thử thách.",
        collocations = listOf("Forge a signature", "Forge a relationship", "Forge ahead"),
        relatedWords = listOf(
            RelatedWord("Counterfeit", "Làm giả, giả mạo"),
            RelatedWord("Establish", "Thiết lập, thành lập")
        )
    ),
    Word(
        id = "formidable",
        term = "Formidable",
        pronunciation = "/fəˈmɪdəbl/",
        shortDefinition = "Gờm mặt, dữ dội, đáng gờm (đối thủ, thử thách).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Inspiring fear or respect through being impressively large, powerful, intense, or capable.",
        vietnameseDiff = "Tính chất của một đối thủ cạnh tranh, một bài toán thuật toán hoặc một rắc rối pháp lý quá mạnh mẽ, đồ sộ, khiến bạn phải thực sự nghiêm túc và dè chừng khi đối mặt.",
        exampleSentence = "The leading app in the education market presents a formidable challenge for new developers.",
        nuanceInfo = "Một lời khen tặng chứa đựng sự tôn trọng sâu sắc dành cho sức mạnh của đối phương. Một 'formidable opponent' (đối thủ đáng gờm) không phải là kẻ bạn có thể hạ gục bằng vài mánh khóe hời hợt (Facile), mà đòi hỏi bạn phải tung ra toàn bộ chiến lược đỉnh cao nhất.",
        collocations = listOf "Formidable opponent", "Formidable challenge", "Formidable reputation"),
        relatedWords = listOf(
            RelatedWord("Intimidating", "Đáng kinh hãi, đe dọa"),
            RelatedWord("Dreadful", "Dễ sợ, khiếp hãi")
        )
    ),
    Word(
        id = "fortitude",
        term = "Fortitude",
        pronunciation = "/ˈfɔːtɪtjuːd/",
        shortDefinition = "Sự kiên cường, bản lĩnh gan góc chịu đựng nghịch cảnh.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Courage in pain or adversity.",
        vietnameseDiff = "Danh từ chỉ sức mạnh tinh thần, lòng quả cảm và bản lĩnh thép giúp một người giữ vững tay lái, âm thầm chịu đựng khó khăn và không đầu hàng trước những cú tát của số phận.",
        exampleSentence = "Managing a business during a major cash flow crisis requires immense mental fortitude.",
        nuanceInfo = "Đỉnh cao của nội lực. Khác với sự dũng cảm bốc đồng xông lên phía trước (Bravery), 'Fortitude' là khả năng chịu đựng áp lực dài hạn một cách lặng lẽ. Nó là chiếc neo neo giữ tinh thần của một nhà sáng lập (Dauntless) đi qua những ngày đen tối nhất của hành trình khởi nghiệp.",
        collocations = listOf("Mental fortitude", "Show fortitude", "Incredible fortitude"),
        relatedWords = listOf(
            RelatedWord("Resilience", "Khả năng phục hồi, sự kiên trì"),
            RelatedWord("Endurance", "Sức chịu đựng, sự nhẫn nại")
        )
    ),
    Word(
        id = "fortuitous",
        term = "Fortuitous",
        pronunciation = "/fɔːˈtʃuːɪtəs/",
        shortDefinition = "Tình cờ, ngẫu nhiên mà đạt được kết quả may mắn.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Happening by a lucky chance; fortunate.",
        vietnameseDiff = "Tính chất của một sự việc xảy ra hoàn toàn do duyên số, ngẫu nhiên nhưng lại mang đến một kết quả cực kỳ may mắn, có lợi cho công việc hoặc cuộc sống.",
        exampleSentence = "A fortuitous meeting with a senior software engineer gave him the exact technical breakthrough he needed.",
        nuanceInfo = "Đừng nhầm với 'Fortunate' (May mắn nói chung). 'Fortuitous' nhấn mạnh vào yếu tố 'tình cờ/bất ngờ' (by chance). Giống như việc bạn đang bí ý tưởng làm video TikTok thì vô tình nghe được một bản nhạc nền cực cuốn và lên luôn kịch bản triệu views.",
        collocations = listOf("Fortuitous meeting", "Fortuitous coincidence", "Highly fortuitous"),
        relatedWords = listOf(
            RelatedWord("Accidental", "Tình cờ, ngẫu nhiên"),
            RelatedWord("Providential", "Do trời phù hộ, may mắn đúng lúc")
        )
    ),
    Word(
        id = "foster",
        term = "Foster",
        pronunciation = "/ˈfɒstə(r)/",
        shortDefinition = "Thúc đẩy, nuôi dưỡng, tạo điều kiện cho phát triển.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Encourage or promote the development of (something, typically something good).",
        vietnameseDiff = "Hành động chủ động tạo ra môi trường thuận lợi, văn hóa lành mạnh để nuôi dưỡng các mối quan hệ, tư duy sáng tạo hoặc tinh thần học tập phát triển.",
        exampleSentence = "The daily meetings are designed to foster open communication and trust among team members.",
        nuanceInfo = "Một động từ cực kỳ ghi điểm trong quản trị nhân sự. Thay vì nói 'Help' hay 'Develop', dùng 'Foster a positive culture' (Nuôi dưỡng một văn hóa tích cực) thể hiện tư duy tầm nhìn cao của một người làm chủ hệ thống.",
        collocations = listOf("Foster growth", "Foster creativity", "Foster a relationship"),
        relatedWords = listOf(
            RelatedWord("Nurture", "Nuôi nấng, dưỡng dục"),
            RelatedWord("Cultivate", "Trau dồi, canh tác")
        )
    ),
    Word(
        id = "fractious",
        term = "Fractious",
        pronunciation = "/ˈfrækʃəs/",
        shortDefinition = "Cáu bẳn, dễ nổi quạu; cứng đầu khó bảo.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Irritable and quarrelsome; difficult to control; unruly.",
        vietnameseDiff = "Tính chất của một người luôn trong trạng thái gắt gỏng, sẵn sàng gây gổ vì những chuyện vặt vãnh; hoặc một tập thể hỗn loạn, bất trị, không chịu tuân theo quy tắc.",
        exampleSentence = "After hours of tense land division debates, the family members became increasingly fractious.",
        nuanceInfo = "Mô tả trạng thái tâm lý cạn kiệt sự kiên nhẫn. Khi một đội nhóm rơi vào tình cảnh 'fractious relationship' (mối quan hệ rạn nứt, hay hục hặc), người đứng đầu cần sử dụng sự điềm tĩnh (Equanimity) để dàn xếp thay vì dùng quyền lực thô bạo.",
        collocations = listOf("Fractious child", "Fractious relationship", "Become fractious"),
        relatedWords = listOf(
            RelatedWord("Peevish", "Cáu bẳn, tị hiềm"),
            RelatedWord("Unruly", "Ngỗ nghịch, ngang ngạnh")
        )
    ),
    Word(
        id = "fraught",
        term = "Fraught",
        pronunciation = "/frɔːt/",
        shortDefinition = "Đầy rẫy (nguy hiểm, lo âu); căng thẳng ngột ngạt.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Filled with or likely to result in (something undesirable); causing or affected by anxiety or stress.",
        vietnameseDiff = "Tính chất của một tình huống, hành trình hoặc bầu không khí chứa đầy rủi ro, hiểm họa hoặc tràn ngập sự lo âu, căng thẳng đến mức nghẹt thở.",
        exampleSentence = "The legal process of dividing family assets is often fraught with emotional complications.",
        nuanceInfo = "Cấu trúc kinh điển là 'Fraught with...' (Đầy rẫy những thứ tiêu cực như 'danger', 'difficulties'). Khi dùng độc lập, 'a fraught atmosphere' miêu tả một căn phòng mà mọi người đang lườm nguýt nhau, chỉ một mồi lửa nhỏ cũng có thể làm bùng nổ tranh chấp.",
        collocations = listOf("Fraught with danger", "Fraught with difficulties", "Fraught situation"),
        relatedWords = listOf(
            RelatedWord("Teeming", "Đầy rẫy, đông đúc"),
            RelatedWord("Tense", "Căng thẳng, hồi hộp")
        )
    ),
    Word(
        id = "frivolous",
        term = "Frivolous",
        pronunciation = "/ˈfrɪvələs/",
        shortDefinition = "Phù phiếm, nhảm nhí, nông cạn, thiếu nghiêm túc.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Not having any serious purpose or value; carefree and superficial.",
        vietnameseDiff = "Tính chất của những hành động, thú vui tiêu khiển hoặc các vụ kiện tụng tốn thời gian, tiền bạc vào những việc vô giá trị, không giúp ích gì cho mục tiêu dài hạn.",
        exampleSentence = "Spending your core budget on frivolous social media vanity metrics won't scale your business.",
        nuanceInfo = "Mang sắc thái phê phán lối sống hoặc tư duy thiếu chín chắn. Ngược lại với người sống có lý tưởng (Fervent), một kẻ 'frivolous' chỉ quan tâm đến những hào nhoáng thoáng qua (Fleeting) mà bỏ quên việc tích lũy nội lực.",
        collocations = listOf("Frivolous lawsuit", "Frivolous spending", "Frivolous behavior"),
        relatedWords = listOf(
            RelatedWord("Inane", "Vô nghĩa, ngớ ngẩn"),
            RelatedWord("Superficial", "Hời hợt, bề ngoài")
        )
    ),
    Word(
        id = "frugal",
        term = "Frugal",
        pronunciation = "/ˈfruːɡl/",
        shortDefinition = "Tiết kiệm, chắt bóp, chi tiêu có tính toán.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Sparing or economical with regard to money or food; simple and plain.",
        vietnameseDiff = "Tính chất của lối sống giản dị, quản lý tài chính chặt chẽ, chỉ chi tiền vào những thứ thực sự tạo ra giá trị và kiên quyết nói không với sự hoang phí (Extravagant).",
        exampleSentence = "A frugal lifestyle in the early stages of a startup helps preserve cash flow for critical features.",
        nuanceInfo = "Mang sắc thái khen ngợi kỹ năng quản lý tài chính đỉnh cao, hoàn toàn khác với 'Stingy' (Bủn xỉn, kẹo kiệt gây khó chịu). Người 'frugal' tiết kiệm thông minh để đầu tư cho những mục tiêu lớn hơn như mua đất hay build app.",
        collocations = listOf("Frugal lifestyle", "Frugal meal", "Highly frugal"),
        relatedWords = listOf(
            RelatedWord("Thrifty", "Cẩn thận chi tiêu, tiết kiệm"),
            RelatedWord("Economical", "Kinh tế, tối ưu chi phí")
        )
    ),
    Word(
        id = "frustrate",
        term = "Frustrate",
        pronunciation = "/frʌˈstreɪt/",
        shortDefinition = "Làm nản lòng, làm cho bực bội; phá sản (kế hoạch).",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Prevent (a plan or attempted action) from progressing, succeeding, or being fulfilled; cause (someone) to feel distressed or annoyed.",
        vietnameseDiff = "Hành động chặn đứng, làm thất bại một kế hoạch; hoặc trạng thái khiến cho một người cảm thấy vô cùng bất lực, ức chế vì mọi nỗ lực đều đổ sông đổ bể.",
        exampleSentence = "The continuous bugs in the word segmentation logic began to frustrate the solo developer.",
        nuanceInfo = "Trong công việc, việc đối mặt với 'frustrating errors' là không thể tránh khỏi. Bản lĩnh của một người kiên cường (Fortitude) được chứng minh khi họ biết cách biến sự 'frustration' (ức chế) thành động lực để mổ xẻ (Explicate) vấn đề.",
        collocations = listOf("Frustrate a plan", "Deeply frustrated", "Frustrating experience"),
        relatedWords = listOf(
            RelatedWord("Thwart", "Phá ngang, ngăn chặn"),
            RelatedWord("Dishearten", "Làm ngã lòng, nản lòng")
        )
    ),
    Word(
        id = "furtive",
        term = "Furtive",
        pronunciation = "/ˈfɜːtɪv/",
        shortDefinition = "Lén lút, vụng trộm, mờ ám.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Attempting to avoid notice or attention, typically because of guilt or a belief that discovery would lead to trouble; secretive.",
        vietnameseDiff = "Tính chất của một hành vi, ánh mắt hoặc hành động cố tình thực hiện một cách giấu diếm, thậm thụt vì sợ người khác phát hiện ra bí mật hoặc mưu đồ xấu.",
        exampleSentence = "He cast a furtive glance at his smartphone to see if his ex-girlfriend had unblocked him.",
        nuanceInfo = "Gợi cảm giác không đàng hoàng, có tật giật mình. Một 'furtive look' (ánh mắt lấm lét) hay 'furtive movement' (động tác mờ ám) ngay lập tức sẽ khiến những người xung quanh cảnh giác và nghi ngờ về sự thành thật của bạn.",
        collocations = listOf("Furtive glance", "Furtive behavior", "Furtive look"),
        relatedWords = listOf(
            RelatedWord("Surreptitious", "Gian lận, lén lút"),
            RelatedWord("Clandestine", "Bí mật, giấu diếm")
        )
    ),
    Word(
        id = "futile",
        term = "Futile",
        pronunciation = "/ˈfjuːtaɪl/",
        shortDefinition = "Vô ích, vô vọng, dã tràng xe cát.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Incapable of producing any useful result; pointless.",
        vietnameseDiff = "Tính chất của một nỗ lực, hành động hoàn toàn không đem lại bất kỳ kết quả thực tế nào, cố gắng đến mấy cũng chỉ là dã tràng xe cát.",
        exampleSentence = "It is futile to argue with toxic commenters on social media; just block them and move on.",
        nuanceInfo = "Mang sắc thái tuyệt vọng, bế tắc. Khi bạn nhận ra một phương án kinh doanh là 'futile effort' (nỗ lực vô ích), một cái đầu lạnh chiến lược sẽ lập tức cắt lỗ, thay đổi thuật toán hoặc đổi tệp khách hàng thay vì cố chấp bấu víu.",
        collocations = listOf("Futile attempt", "Futile exercise", "Prove futile"),
        relatedWords = listOf(
            RelatedWord("Fruitless", "Không có quả, vô ích"),
            RelatedWord("In vain", "Uổng công, vô ích")
        )
    ),
    Word(
        id = "gainsay",
        term = "Gainsay",
        pronunciation = "/ˌɡeɪnˈseɪ/",
        shortDefinition = "Phủ nhận, bác bỏ, cãi lại (thường dùng trong câu phủ định).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Deny or contradict (a fact or statement); speak against or oppose.",
        vietnameseDiff = "Hành động lên tiếng tranh cãi, phủ nhận một sự thật hiển nhiên hoặc bác bỏ lập luận mang tính pháp lý của người khác.",
        exampleSentence = "There is no gainsaying the fact that video marketing is currently the fastest way to get organic customers.",
        nuanceInfo = "Cực kỳ trang trọng và học thuật. Cụm từ kinh điển là 'There is no gainsaying...' (Không thể phủ nhận rằng...). Từ này được dùng khi một sự thật đã đạt độ chính xác rõ ràng (Explicit), không ai có thể dùng lý lẽ cùn để lật ngược thế cờ.",
        collocations = listOf("No gainsaying the fact", "Impossible to gainsay", "Gainsay a claim"),
        relatedWords = listOf(
            RelatedWord("Deny", "Phủ nhận, chối từ"),
            RelatedWord("Contradict", "Mâu thuẫn, cãi lại")
        )
    ),
    Word(
        id = "garrulous",
        term = "Garrulous",
        pronunciation = "/ˈɡærələs/",
        shortDefinition = "Bao đồng, liến thoắng, nói nhiều về những việc vụn vặt.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Excessively talkative, especially on trivial matters.",
        vietnameseDiff = "Tính chất của một người nói quá nhiều, huyên thuyên không ngừng nghỉ về những chủ đề vô thưởng vô phạt, gây mệt mỏi cho người nghe.",
        exampleSentence = "The garrulous customer kept talking about his personal life, slowing down the shop's queue.",
        nuanceInfo = "Khác với 'Eloquent' (Hùng biện, hoạt ngôn một cách cuốn hút). 'Garrulous' mang sắc thái phiền toái, thiếu khả năng cô đọng thông tin. Trong viết kịch bản TikTok, bạn phải triệt tiêu tính 'garrulous' này để giữ các câu hook ngắn gọn, đắt giá.",
        collocations = listOf("Garrulous old man", "Become garrulous", "Garrulous nature"),
        relatedWords = listOf(
            RelatedWord("Loquacious", "Nói nhiều, ba hoa"),
            RelatedWord("Talkative", "Hay nói, nói nhiều")
        )
    ),
    Word(
        id = "gauge",
        term = "Gauge",
        pronunciation = "/ɡeɪdʒ/",
        shortDefinition = "Đo lường, đánh giá (tâm trạng, xu hướng, thông số kỹ thuật).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Estimate or determine the magnitude, amount, or volume of; evaluate a person's mood or a current trend.",
        vietnameseDiff = "Hành động phân tích dữ liệu, quan sát hành vi để đo lường chính xác tâm trạng của đối phương hoặc dự đoán chuẩn xác xu hướng thị trường.",
        exampleSentence = "Data analytics tools allow creators to gauge customer interest in a new product instantly.",
        nuanceInfo = "Vừa là danh từ (đồng hồ đo), vừa là động từ. Khi bạn 'gauge the market reaction', bạn không đoán mò dựa trên cảm tính mà đang đóng vai trò một nhà khoa học dữ liệu, thu thập bằng chứng thực tế (Empirical data) để tối ưu hóa bước đi tiếp theo.",
        collocations = listOf("Gauge market trends", "Gauge public reaction", "Difficult to gauge"),
        relatedWords = listOf(
            RelatedWord("Evaluate", "Đánh giá, định giá"),
            RelatedWord("Measure", "Đo lường, cân đong")
        )
    ),
    Word(
        id = "genial",
        term = "Genial",
        pronunciation = "/ˈdʒiːniəl/",
        shortDefinition = "Vui vẻ, thân thiện, hiếu khách, ấm áp.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Friendly and cheerful; warmly and pleasantly cheerful.",
        vietnameseDiff = "Tính chất của một người có phong thái niềm nở, dễ mến, luôn tỏa ra năng lượng tích cực và ấm áp khiến người đối diện cảm thấy thoải mái và được chào đón.",
        exampleSentence = "A genial smile from the shop owner is the secret to keeping customers coming back to the local diner.",
        nuanceInfo = "Rất thích hợp để mô tả nghệ thuật phục vụ khách hàng (hospitality). Khác với sự chuyên nghiệp lạnh lùng, một 'genial host' (chủ nhà hiếu khách) biết cách dùng sự chân thành và bầu không khí dễ chịu để xây dựng lòng trung thành của khách hàng đối với thương hiệu.",
        collocations = listOf("Genial host", "Genial disposition", "Genial smile"),
        relatedWords = listOf(
            RelatedWord("Affable", "Lịch sự, nhã nhặn, dễ gần"),
            RelatedWord("Cordial", "Thân ái, chân thành")
        )
    ),
    Word(
        id = "giddy",
        term = "Giddy",
        pronunciation = "/ˈɡɪdi/",
        shortDefinition = "Chóng mặt, choáng váng; vui sướng đến mức nông nổi, quay cuồng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Having a sensation of whirling and a tendency to fall or stagger; dizzy; excitable and frivolous.",
        vietnameseDiff = "Trạng thái cơ thể bị choáng váng, mất thăng bằng; hoặc trạng thái tinh thần phấn khích, vui sướng quá độ đến mức trở nên bốc đồng, thiếu chín chắn.",
        exampleSentence = "He felt a bit giddy after looking at the complex data structures for word segmentation all night.",
        nuanceInfo = "Có thể dùng theo nghĩa đen (y học) hoặc nghĩa bóng. Khi một tài khoản TikTok bất ngờ tăng vọt hàng triệu followers sau một đêm, người sáng tạo rất dễ rơi vào cảm giác 'giddy with success' (choáng ngợp vì thành công) và đưa ra những quyết định thiếu tính toán.",
        collocations = listOf("Giddy with success", "Giddy height", "Feel giddy"),
        relatedWords = listOf(
            RelatedWord("Dizzy", "Chóng mặt, thần trí lảo đảo"),
            RelatedWord("Light-headed", "Đầu óc lâng lâng, choáng váng")
        )
    ),
    Word(
        id = "glaring",
        term = "Glaring",
        pronunciation = "/ˈɡleərɪŋ/",
        shortDefinition = "Chói lòa; rành rành, hiển nhiên (lỗi lầm) một cách tồi tệ.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Giving out or reflecting a strong or dazzling light; highly obvious or conspicuous (typically used of something bad).",
        vietnameseDiff = "Tính chất của ánh sáng chiếu trực diện gây mù mờ; hoặc nghĩa bóng chỉ một sai lầm, một lỗ hổng logic quá lớn và hiển nhiên, đập ngay vào mắt người nhìn mà không thể bao biện.",
        exampleSentence = "The QA team instantly spotted a glaring error in the application's core formula logic.",
        nuanceInfo = "Thường mang sắc thái tiêu cực khi dùng làm tính từ tả thực hoặc ẩn dụ. Một 'glaring omission' (sự bỏ sót rành rành) trong hợp đồng pháp lý hoặc một 'glaring mistake' trong mã nguồn code thể hiện sự thiếu cẩn trọng, cần phải được sửa đổi (amend) ngay lập tức.",
        collocations = listOf("Glaring mistake", "Glaring error", "Glaring contradiction"),
        relatedWords = listOf(
            RelatedWord("Obvious", "Rõ ràng, hiển nhiên"),
            RelatedWord("Blatant", "Trắng trợn, hiển nhiên")
        )
    ),
    Word(
        id = "glut",
        term = "Glut",
        pronunciation = "/ɡlʌt/",
        shortDefinition = "Sự cung vượt quá cầu, tình trạng thừa mứa hàng hóa.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "An excessively abundant supply of something.",
        vietnameseDiff = "Danh từ chỉ trạng thái thị trường bị ngập tràn bởi một loại hàng hóa hoặc dịch vụ nào đó, dẫn đến việc giá trị bị sụt giảm nghiêm trọng do số lượng quá dư thừa.",
        exampleSentence = "The recent glut of portable fans on social media marketplaces forced prices to drop significantly.",
        nuanceInfo = "Thuật ngữ kinh tế học quan trọng. Trái ngược với tình trạng khan hiếm (scarcity). Khi thị trường rơi vào thế 'a glut of choices' (thừa mứa sự lựa chọn), sản phẩm của bạn bắt buộc phải có một câu hook marketing xuất sắc hoặc tính năng độc bản để không bị chìm nghỉm.",
        collocations = listOf("Glut of products", "Market glut", "Glut of information"),
        relatedWords = listOf(
            RelatedWord("Surplus", "Số dư, thặng dư"),
            RelatedWord("Surfeit", "Sự thừa mứa, quá độ")
        )
    ),
    Word(
        id = "gourmet",
        term = "Gourmet",
        pronunciation = "/ˈɡʊəmeɪ/",
        shortDefinition = "Người sành ăn; (đồ ăn) cao cấp, hảo hạng.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "A connoisseur of good food; involving high-quality or exotic ingredients and skilled preparation.",
        vietnameseDiff = "Danh từ chỉ chuyên gia có vị giác tinh tế, biết thưởng thức ẩm thực nghệ thuật; hoặc tính từ chỉ những món ăn được chế biến công phu, sử dụng nguyên liệu thượng hạng.",
        exampleSentence = "He aims to elevate traditional street food into a gourmet dining experience for food enthusiasts.",
        nuanceInfo = "Mang sắc thái sang trọng, định vị phân khúc cao cấp (Premium). Khi bạn gắn mác 'gourmet' cho một món ăn, điều đó đồng nghĩa với việc khách hàng sẵn sàng chi trả mức giá cao hơn để đổi lại chất lượng nguyên liệu hoàn hảo và cách bài trí tinh tế.",
        collocations = listOf("Gourmet meal", "Gourmet chef", "Gourmet restaurant"),
        relatedWords = listOf(
            RelatedWord("Connoisseur", "Người am tường, bậc sành sỏi"),
            RelatedWord("Epicure", "Người thích ăn ngon mặc đẹp")
        )
    ),
    Word(
        id = "grandiose",
        term = "Grandiose",
        pronunciation = "/ˈɡrændiəʊs/",
        shortDefinition = "Vĩ đại, hoành tráng; tham vọng quá đà, hào nhoáng xa rời thực tế.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Impressive and imposing in appearance or style, especially pretentiously so; excessively ambitious.",
        vietnameseDiff = "Tính chất của một kế hoạch, phong cách kiến trúc hoặc ý tưởng có quy mô cực kỳ đồ sộ; nhưng thường mang ẩn ý chê bai việc tự đại, vẽ vời quá mức mà năng lực thực tế không gánh vác nổi.",
        exampleSentence = "Instead of sketching out grandiose, unrealizable ecosystems, start with a simple, functional app formula.",
        nuanceInfo = "Gợi cảm giác sáo rỗng, phô trương (Pretentious). Khi một dự án khởi nghiệp đưa ra 'grandiose plans' (kế hoạch viển vông) mà không tập trung tối ưu hóa dòng tiền và sản phẩm cốt lõi, họ rất dễ đối mặt với việc phá sản.",
        collocations = listOf("Grandiose plan", "Grandiose scheme", "Grandiose vision"),
        relatedWords = listOf(
            RelatedWord("Magnificent", "Tráng lệ, nguy nga"),
            RelatedWord("Ostentatious", "Phô trương, khoe khoang")
        )
    ),
    Word(
        id = "gratuitous",
        term = "Gratuitous",
        pronunciation = "/ɡrəˈtʃuːɪtəs/",
        shortDefinition = "Vô cớ, không vì lý do gì, vô thưởng vô phạt (thường mang nghĩa tiêu cực).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Given or done free of charge; uncalled for; lacking good reason; unwarranted.",
        vietnameseDiff = "Tính chất của một hành động vi phạm, lời xúc phạm hoặc một chi tiết bạo lực được đưa vào phim ảnh/kịch bản một cách vô cớ, không có mục đích nghệ thuật hay lý do chính đáng nào.",
        exampleSentence = "The short video was ruined by the inclusion of gratuitous drama that felt completely unnatural.",
        nuanceInfo = "Nghĩa cổ là 'miễn phí', nhưng trong tiếng Anh hiện đại, 90% từ này dùng để chỉ sự quá đà, vô lý. Ví dụ, 'gratuitous violence' (bạo lực vô cớ trong phim) khiến người xem khó chịu vì nó không giúp ích gì cho mạch truyện mà chỉ cố tình câu tương tác bẩn.",
        collocations = listOf("Gratuitous violence", "Gratuitous insult", "Gratuitous advice"),
        relatedWords = listOf(
            RelatedWord("Unwarranted", "Không có lý do xác đáng, vô căn cứ"),
            RelatedWord("Baseless", "Không có cơ sở, ác ý")
        )
    ),
    Word(
        id = "gregarious",
        term = "Gregarious",
        pronunciation = "/ɡrɪˈɡeəriəs/",
        shortDefinition = "Thích giao du, thích tụ tập bè bạn, sống bầy đàn.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Fond of company; sociable; living in flocks or colonies.",
        vietnameseDiff = "Tính chất của một cá nhân vô cùng cởi mở, hướng ngoại, luôn tìm kiếm sự kết nối và cảm thấy tràn đầy năng lượng khi được bao quanh bởi đám đông.",
        exampleSentence = "Despite his gregarious public personality on TikTok, he highly values his privacy in real life.",
        nuanceInfo = "Trong sinh học, dùng để chỉ động vật sống theo bầy. Trong tâm lý học hành vi, một 'gregarious person' là người hướng ngoại điển hình. Họ có tài ngoại giao tự nhiên, rất thích hợp làm các công việc tiền tuyến như PR, tiếp khách hoặc làm host.",
        collocations = listOf("Gregarious animal", "Gregarious personality", "Naturally gregarious"),
        relatedWords = listOf(
            RelatedWord("Sociable", "Dễ gần, thích kết bạn"),
            RelatedWord("Outgoing", "Thân mật, thoải mái, hướng ngoại")
        )
    ),
    Word(
        id = "grievance",
        term = "Grievance",
        pronunciation = "/ˈɡriːvəns/",
        shortDefinition = "Lời than phiền, nỗi bất bình, đơn khiếu nại (do bị đối xử bất công).",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "A real or imagined wrong or other cause for complaint or protest, especially unfair treatment.",
        vietnameseDiff = "Danh từ chỉ cảm giác oán hận, bất bình sâu sắc hoặc văn bản khiếu nại chính thức khi quyền lợi hợp pháp cá nhân bị xâm phạm hoặc bị đối xử thiếu công bằng.",
        exampleSentence = "The court provides an official framework to address land boundary grievances between citizens.",
        nuanceInfo = "Mang tính pháp lý và trang trọng hơn 'complaint'. 'Air a grievance' nghĩa là nói ra nỗi uất ức của mình. Việc giải quyết triệt để các 'customer grievances' (nỗi bất bình của khách hàng) là yếu tố sống còn để bảo vệ uy tín của một cơ sở kinh doanh.",
        collocations = listOf("Air a grievance", "File a grievance", "Personal grievance"),
        relatedWords = listOf(
            RelatedWord("Complaint", "Lời phàn nàn, sự kêu ca"),
            RelatedWord("Resentment", "Lòng oán hận, sự phẫn uất")
        )
    ),
    Word(
        id = "grotesque",
        term = "Grotesque",
        pronunciation = "/ɡrəʊˈtesk/",
        shortDefinition = "Lố lăng, kỳ quái, quái dị đến mức nực cười.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Comically or repulsively ugly or distorted; shocking or offensive.",
        vietnameseDiff = "Tính chất của một hình ảnh, hành vi hoặc sự bóp méo hình thể mang phong cách quái gở, dị hợm, vừa gây cười nhưng cũng vừa gây cảm giác ghê rợn, phản cảm.",
        exampleSentence = "The video filter distorted his face into a grotesque shape for comedic effect.",
        nuanceInfo = "Trong nghệ thuật học, 'Grotesque' là một trường phái thẩm mỹ đặc trưng sử dụng các yếu tố phóng đại, kỳ dị. Trong đời sống, từ này dùng để chỉ trích một hành vi đi quá giới hạn đạo đức thông thường, ví dụ 'a grotesque distortion of the truth' (sự xuyên tạc sự thật một cách lố lăng).",
        collocations = listOf("Grotesque distortion", "Grotesque shape", "Grotesque behavior"),
        relatedWords = listOf(
            RelatedWord("Bizarre", "Kỳ quái, lập dị"),
            RelatedWord("Monstrous", "Kỳ dị, quái tởm")
        )
    ),
    Word(
        id = "gullible",
        term = "Gullible",
        pronunciation = "/ˈɡʌləbl/",
        shortDefinition = "Cả tin, dễ bị lừa, khờ khạo.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Easily persuaded to believe something; credulous.",
        vietnameseDiff = "Tính chất của một người quá ngây thơ, thiếu trải nghiệm sống hoặc thiếu tư duy phản biện nên ai nói gì cũng tin, rất dễ trở thành mục tiêu của các trò lừa đảo.",
        exampleSentence = "Gullible online buyers often fall for exaggerated claims about magical weight loss fans.",
        nuanceInfo = "Mang sắc thái cảnh báo hoặc chê trách nhẹ. Ngược lại hoàn toàn với người có tính hoài nghi khoa học (Skeptical). Trong kinh doanh, bạn phải hiểu tâm lý khách hàng nhưng tuyệt đối không được lợi dụng những người 'gullible' bằng các chiêu trò lừa dối (Disingenuous), vì điều đó sẽ hủy hoại đạo đức thương hiệu.",
        collocations = listOf("Gullible person", "Incredibly gullible", "Gullible public"),
        relatedWords = listOf(
            RelatedWord("Credulous", "Dễ tin, nhẹ dạ"),
            RelatedWord("Naive", "Ngây thơ, chất phác")
        )
    ),
    Word(
        id = "hackneyed",
        term = "Hackneyed",
        pronunciation = "/ˈhæknid/",
        shortDefinition = "Cũ rích, nhàm chán, nhai đi nhai lại (ý tưởng, khẩu hiệu).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Used so often as to be lack of significance or originality; trite.",
        vietnameseDiff = "Tính chất của một cụm từ, câu châm ngôn hoặc ý tưởng kịch bản đã bị lạm dụng quá nhiều lần trong quá khứ, đến mức trở nên sáo rỗng, không còn chút giá trị sáng tạo nào.",
        exampleSentence = "Avoid hackneyed phrases like 'Think outside the box' when pitching a modern mobile application.",
        nuanceInfo = "Từ tối kỵ đối với các Content Creator và copywriter. Một kịch bản sử dụng 'hackneyed plot' (cốt truyện cũ rích) sẽ lập tức khiến người xem lướt qua sau 1 giây đầu tiên. Để thành công, nội dung cần liên tục được làm mới và mang đậm dấu ấn cá nhân.",
        collocations = listOf("Hackneyed phrase", "Hackneyed plot", "Hackneyed expression"),
        relatedWords = listOf(
            RelatedWord("Trite", "Cũ rích, mòn, nhàm"),
            RelatedWord("Clichéd", "Rập khuôn, rập mẫu")
        )
    ),
    Word(
        id = "hallow",
        term = "Hallow",
        pronunciation = "/ˈhæləʊ/",
        shortDefinition = "Tôn kính, thánh hóa, coi là thiêng liêng.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Honor as holy; make holy; consecrate.",
        vietnameseDiff = "Hành động tôn kính sâu sắc hoặc tuyên bố một địa danh, một di sản hay một truyền thống lâu đời là bất khả xâm phạm, mang giá trị thiêng liêng cao quý.",
        exampleSentence = "The local family shrine has been a hallowed place for generations, preserving ancestral traditions.",
        nuanceInfo = "Mang sắc thái trang nghiêm, cổ kính và nhuốm màu sắc tâm linh hoặc tôn giáo. Tính từ 'Hallowed' thường đi liền với các danh từ như 'hallowed ground' (mảnh đất linh thiêng) hoặc 'hallowed traditions' (truyền thống đáng kính trọng).",
        collocations = listOf("Hallowed ground", "Hallowed traditions", "Hallowed halls"),
        relatedWords = listOf(
            RelatedWord("Consecrate", "Hiến dâng, thánh hóa"),
            RelatedWord("Revere", "Tôn kính, sùng kính")
        )
    ),
    Word(
        id = "hamper",
        term = "Hamper",
        pronunciation = "/ˈhæmpə(r)/",
        shortDefinition = "Cản trở, làm vướng chân, gây khó khăn cho sự tiến triển.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Hinder or impede the movement or progress of.",
        vietnameseDiff = "Hành động hoặc yếu tố khách quan làm chậm tiến độ xử lý công việc, khiến cho một quy trình hoặc một thuật toán không thể vận hành mượt mà.",
        exampleSentence = "A lack of structured formula documentation will hamper the application development process.",
        nuanceInfo = "Khác với 'Prevent' (ngăn chặn hoàn toàn), 'Hamper' mang nghĩa tạo ra vô vàn rào cản, chướng ngại vật khiến đối tượng phải di chuyển hoặc phát triển một cách cực kỳ chật vật, mệt mỏi.",
        collocations = listOf("Hamper progress", "Hamper growth", "Seriously hamper"),
        relatedWords = listOf(
            RelatedWord("Hinder", "Cản trở, kìm hãm"),
            RelatedWord("Impede", "Làm trở ngại, trì hoãn")
        )
    ),
    Word(
        id = "haphazard",
        term = "Haphazard",
        pronunciation = "/hæpˈhæzəd/",
        shortDefinition = "Tùy tiện, vô tổ chức, ngẫu hứng thiếu kế hoạch.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Lacking any obvious principle of organization; random.",
        vietnameseDiff = "Tính chất của một cách làm việc cẩu thả, sắp xếp dữ liệu hoặc quản lý tài chính theo kiểu 'gặp đâu làm đấy', hoàn toàn không tuân theo một hệ thống hay logic quy chuẩn nào.",
        exampleSentence = "A haphazard approach to the word segmentation algorithm will lead to continuous system crashes.",
        nuanceInfo = "Mang sắc thái chê bai rõ rệt về tác phong làm việc. Khi bạn xây dựng thương hiệu hay viết code một cách 'haphazard', sản phẩm của bạn sẽ trở thành một mớ hỗn độn, thiếu đi sự tinh tế (Exquisite) và độ chính xác cần thiết.",
        collocations = listOf("Haphazard manner", "Haphazard development", "Purely haphazard"),
        relatedWords = listOf(
            RelatedWord("Random", "Ngẫu nhiên, tình cờ"),
            RelatedWord("Disorganized", "Vô tổ chức, lộn xộn")
        )
    ),
    Word(
        id = "hapless",
        term = "Hapless",
        pronunciation = "/ˈhæpləs/",
        shortDefinition = "Rủi ro, bất hạnh, đáng thương (do hoàn cảnh xui xẻo).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Unfortunate (especially of a person).",
        vietnameseDiff = "Tính chất của một cá nhân liên tục gặp xui xẻo, bị cuốn vào những rắc rối khách quan mà bản thân họ không hề mong muốn hoặc không đủ khả năng tự vệ.",
        exampleSentence = "The hapless business owner had to deal with a major power outage right during the weekend rush hour.",
        nuanceInfo = "Từ này luôn gợi lên lòng trắc ẩn (Empathy) và sự thương cảm từ người nghe. Một 'hapless victim' (nạn nhân đáng thương) thường là người vô tội, bị mắc kẹt giữa các biến cố lớn như tranh chấp pháp lý hoặc khủng hoảng kinh tế.",
        collocations = listOf("Hapless victim", "Hapless individual", "Hapless creature"),
        relatedWords = listOf(
            RelatedWord("Unfortunate", "Không may, rủi ro"),
            RelatedWord("Luckless", "Vô duyên, vô phúc")
        )
    ),
    Word(
        id = "harangue",
        term = "Harangue",
        pronunciation = "/həˈræŋ/",
        shortDefinition = "Bài diễn văn đao to búa lớn; lời lên lớp, sỉ vả nặng nề.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A lengthy and aggressive speech, lectured in an analytical or critical manner.",
        vietnameseDiff = "Danh từ hoặc động từ chỉ một bài nói kéo dài lê thê với giọng điệu hung hăng, chỉ trích gay gắt nhằm áp đặt quan điểm hoặc lên lớp, giáo huấn người khác.",
        exampleSentence = "Instead of constructive feedback, the manager delivered a long harangue that ruined team morale.",
        nuanceInfo = "Mang sắc thái rất mệt mỏi và độc đoán (Dogmatic). Khi ai đó 'harangue' bạn, họ không có tinh thần lắng nghe hay thảo luận, mà chỉ muốn xả cơn giận hoặc chứng minh cái tôi bề trên của mình trước đám đông.",
        collocations = listOf("Lengthy harangue", "Delivered a harangue", "Harangue the audience"),
        relatedWords = listOf(
            RelatedWord("Tirade", "Tràng bài xích, chuỗi lời sỉ vả"),
            RelatedWord("Lecture", "Bài thuyết trình, lời lên lớp")
        )
    ),
    Word(
        id = "harbinger",
        term = "Harbinger",
        pronunciation = "/ˈhɑːbɪndʒə(r)/",
        shortDefinition = "Điềm báo, kẻ tiền phong báo hiệu điều sắp tới.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A person or thing that announces or signals the approach of another.",
        vietnameseDiff = "Danh từ chỉ một dấu hiệu, một sự kiện nhỏ hoặc một cá nhân xuất hiện trước để báo cáo, hé lộ cho cả hệ thống biết một xu hướng lớn hoặc một biến cố sắp sửa bùng nổ.",
        exampleSentence = "A sudden drop in user retention is often a harbinger of a failing mobile application.",
        nuanceInfo = "Trang trọng và mang tính ẩn dụ cao. Khác với 'Foreboding' (thường chỉ điềm xấu), 'Harbinger' mang tính trung tính. Ví dụ 'harbinger of spring' (chim én báo hiệu mùa xuân) là tích cực, nhưng 'harbinger of doom' lại là điềm báo tử của một doanh nghiệp.",
        collocations = listOf("Harbinger of change", "Harbinger of spring", "True harbinger"),
        relatedWords = listOf(
            RelatedWord("Forerunner", "Kẻ chạy tiền phong, tổ tiên"),
            RelatedWord("Herald", "Sứ giả, người đưa tin")
        )
    ),
    Word(
        id = "haughty",
        term = "Haughty",
        pronunciation = "/ˈhɔːti/",
        shortDefinition = "Kiêu căng, ngạo mạn, nhìn đời bằng nửa con mắt.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Arrogantly superior and disdainful.",
        vietnameseDiff = "Tính chất của một người luôn tự cao tự đại, coi khinh (Disdain) những người xung quanh và thể hiện sự bề trên thông qua cử chỉ, giọng điệu.",
        exampleSentence = "The consultant's haughty attitude quickly alienated the local restaurant staff.",
        nuanceInfo = "Mô tả một kiểu ngạo mạn lộ liễu, gây khó chịu cho tập thể. Người có phong thái 'haughty' thường nghĩ mình ở một đẳng cấp khác, dẫn đến việc hành xử thiếu chuẩn mực lịch sự (Decorum) và dễ rước về thù hằn (Enmity).",
        collocations = listOf("Haughty attitude", "Haughty look", "Arrogant and haughty"),
        relatedWords = listOf(
            RelatedWord("Arrogant", "Kiêu ngạo, kiêu căng"),
            RelatedWord("Supercilious", "Trịch thượng, khinh khỉnh")
        )
    ),
    Word(
        id = "haven",
        term = "Haven",
        pronunciation = "/ˈheɪvn/",
        shortDefinition = "Nơi trú ẩn an toàn, chốn bình yên.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A place of safety or refuge.",
        vietnameseDiff = "Danh từ chỉ một không gian yên bình, một vùng an toàn tuyệt đối giúp bạn trốn thoát khỏi những áp lực, drama thị phi của cuộc sống hoặc thương trường.",
        exampleSentence = "After hours of managing the chaotic kitchen, his private tech workspace felt like a peaceful haven.",
        nuanceInfo = "Đừng viết nhầm thành 'Heaven' (Thiên đường). 'Haven' nhấn mạnh vào tính chất 'trú ẩn, bảo vệ'. Ví dụ 'tax haven' (thiên đường trốn thuế) trong tài chính, hoặc một góc phòng yên tĩnh làm 'haven for creativity' để bạn tập trung tư duy thuật toán.",
        collocations = listOf("Safe haven", "Peaceful haven", "Tax haven"),
        relatedWords = listOf(
            RelatedWord("Sanctuary", "Thánh địa, nơi trú ẩn"),
            RelatedWord("Refuge", "Nơi trốn tránh, chốn ẩn náu")
        )
    ),
    Word(
        id = "havoc",
        term = "Havoc",
        pronunciation = "/ˈhævək/",
        shortDefinition = "Sự tàn phá hoang tàn, cảnh hỗn loạn tột cùng.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Widespread destruction; great confusion or disorder.",
        vietnameseDiff = "Danh từ chỉ hậu quả của một cuộc khủng hoảng, một con bug nghiêm trọng hoặc một thiên tai quét qua phá nát cấu trúc vận hành ổn định của một hệ thống.",
        exampleSentence = "A minor edge-case error in the word segmentation module wreaked havoc on the entire server.",
        nuanceInfo = "Luôn đi kèm với động từ kinh điển 'Wreak havoc on something' (Gây ra sự tàn phá kinh hoàng cho cái gì). Đây là thuật ngữ cực mạnh để mô tả sức công phá của một lỗi bảo mật hoặc một scandal truyền thông.",
        collocations = listOf("Wreak havoc on", "Cause havoc", "Create havoc"),
        relatedWords = listOf(
            RelatedWord("Devastation", "Sự tàn phá, sự phá hủy"),
            RelatedWord("Chaos", "Thời kỳ hỗn độn, sự vô chính phủ")
        )
    ),
    Word(
        id = "hedonism",
        term = "Hedonism",
        pronunciation = "/ˈhiːdənɪzəm/",
        shortDefinition = "Chủ nghĩa duy lạc, lối sống tôn thờ khoái lạc.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The pursuit of pleasure; sensual self-indulgence as a primary goal.",
        vietnameseDiff = "Danh từ chỉ triết lý sống coi việc tìm kiếm niềm vui, sự thỏa mãn các giác quan và hưởng thụ cá nhân là mục đích tối cao của cuộc đời, phớt lờ các giá trị kỷ luật dài hạn.",
        exampleSentence = "He realized that continuous late-night partying was just a form of cheap hedonism that delayed his career goals.",
        nuanceInfo = "Mang sắc thái cảnh báo về sự thiếu kiểm soát bản thân. Khác với người sống có lý tưởng và kiên cường (Fortitude), lối sống 'hedonism' dễ khiến các bạn trẻ đốt sạch tài chính vào những thú vui phù phiếm (Frivolous) thoáng qua.",
        collocations = listOf("Pure hedonism", "Crude hedonism", "Lifestyle of hedonism"),
        relatedWords = listOf(
            RelatedWord("Self-indulgence", "Sự nuông chiều bản thân"),
            RelatedWord("Epicureanism", "Thuyết khoái lạc tinh tế")
        )
    ),
    Word(
        id = "hegemony",
        term = "Hegemony",
        pronunciation = "/hɪˈɡeməni/",
        shortDefinition = "Quyền bá chủ, sự thống trị tuyệt đối (về chính trị, thị trường).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Leadership or dominance, especially by one country or social group over others, or a tech giant over a market.",
        vietnameseDiff = "Danh từ chỉ vị thế độc tôn, quyền lực thống trị áp đảo của một quốc gia, một tập đoàn công nghệ lớn khiến các đối thủ nhỏ hơn hầu như không có cơ hội lật đổ.",
        exampleSentence = "New software startups constantly try to break the hegemony of established tech giants.",
        nuanceInfo = "Thuật ngữ cao cấp trong chính trị học và kinh tế vĩ mô. Khi một ông lớn sở hữu 'market hegemony' (sự bá chiếm thị trường), họ có quyền đặt ra luật chơi, buộc bạn phải tìm kiếm những thị trường ngách (Niche) hoặc giải pháp độc bản để sinh tồn.",
        collocations = listOf("Cultural hegemony", "Economic hegemony", "Establish hegemony"),
        relatedWords = listOf(
            RelatedWord("Dominance", "Ưu thế, địa vị thống trị"),
            RelatedWord("Supremacy", "Quyền tối cao, thế thượng phong")
        )
    ),
    Word(
        id = "heinous",
        term = "Heinous",
        pronunciation = "/ˈheɪnəs/",
        shortDefinition = "Grange tởm, tàn ác, tồi tệ tội lỗi tột cùng.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Utterly odious or wicked (of a person or wrongful act).",
        vietnameseDiff = "Tính chất của một tội ác, hành vi lừa đảo hoặc phản bội điên rồ, chà đạp lên mọi quy chuẩn đạo đức của xã hội, khiến dư luận phẫn nộ sâu sắc.",
        exampleSentence = "Fabricating legal documents to steal land from family members is a heinous act.",
        nuanceInfo = "Mức độ nghiêm trọng cao nhất của sự chỉ trích. Thường đi kèm các danh từ pháp lý hoặc hình sự như 'heinous crime' (tội ác ghê tởm), 'heinous sin' (tội lỗi tày đình). Không dùng từ này cho các lỗi lầm vặt vãnh thông thường.",
        collocations = listOf("Heinous crime", "Heinous act", "Heinous offense"),
        relatedWords = listOf(
            RelatedWord("Atrocious", "Hung bạo, tàn ác"),
            RelatedWord("Abominable", "Đáng ghét, kinh tởm")
        )
    ),
    Word(
        id = "herald",
        term = "Herald",
        pronunciation = "/ˈherəld/",
        shortDefinition = "Sứ giả, người đưa tin; báo hiệu, mở ra (giai đoạn mới).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "An official messenger bringing news; be a sign that something is about to happen.",
        vietnameseDiff = "Danh từ chỉ người đưa tin hoặc dấu hiệu tiên phong; động từ chỉ hành động trang trọng báo hiệu một kỷ nguyên, xu hướng hoặc công nghệ đột phá bắt đầu xuất hiện.",
        exampleSentence = "The integration of AI features will herald a new era for local business management applications.",
        nuanceInfo = "Mang sắc thái trang trọng, tích cực và hào hùng hơn 'Harbinger'. Khi dùng làm động từ, 'herald' gợi lên sự chào đón một bước ngoặt vĩ đại, ví dụ như việc ra mắt một thuật toán tối ưu giúp cách mạng hóa toàn bộ quy trình vận hành.",
        collocations = listOf("Herald a new era", "Herald of spring", "Widely heralded"),
        relatedWords = listOf(
            RelatedWord("Announce", "Báo cáo, công bố"),
            RelatedWord("Proclaim", "Tuyên ngôn, tuyên bố công khai")
        )
    ),
    Word(
        id = "hermetic",
        term = "Hermetic",
        pronunciation = "/hɜːˈmetɪk/",
        shortDefinition = "Kín bưng, hoàn toàn kín gió; khép kín cách biệt xã hội.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Complete and airtight; insulated or protected from outside atmospheres or influences.",
        vietnameseDiff = "Tính chất của một bao bì được đóng gói cách lị tuyệt đối với không khí bên ngoài; hoặc nghĩa bóng chỉ một lối sống, một cộng đồng khép kín, không chịu ảnh hưởng từ dư luận.",
        exampleSentence = "The ingredients must be stored in hermetic containers to maintain maximum freshness.",
        nuanceInfo = "Xuất phát từ thuật ngữ niêm phong hộp bọc kỹ thuật ('hermetic seal'). Khi dùng tả người hoặc tổ chức, 'a hermetic life' chỉ một cá nhân chọn lối sống ẩn dật để tập trung cao độ vào việc build app hoặc rèn luyện tài năng, tránh xa các drama thị phi (frivolous).",
        collocations = listOf("Hermetic seal", "Hermetic container", "Hermetic world"),
        relatedWords = listOf(
            RelatedWord("Airtight", "Kín hơi, kín kẽ"),
            RelatedWord("Sealed", "Được niêm phong, đóng kín")
        )
    ),
    Word(
        id = "heterogeneous",
        term = "Heterogeneous",
        pronunciation = "/ˌhetərəʊˈdʒiːniəs/",
        shortDefinition = "Hỗn tạp, gồm nhiều thành phần khác biệt, không đồng nhất.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Diverse in character or content; originating from different sources.",
        vietnameseDiff = "Tính chất của một tập hợp, kho dữ liệu hoặc tệp khách hàng chứa đựng vô số yếu tố đa dạng, khác biệt hoàn toàn về cấu trúc hoặc bản chất.",
        exampleSentence = "An effective word segmentation framework must be able to parse a heterogeneous dataset of local slangs.",
        nuanceInfo = "Thuật ngữ học thuật kinh điển trong toán học, khoa học máy tính và xã hội học. Trái ngược hoàn toàn với 'Homogeneous' (Đồng nhất). Việc xử lý một 'heterogeneous group' luôn đòi hỏi thuật toán phải có độ tùy biến cực cao.",
        collocations = listOf("Heterogeneous group", "Heterogeneous mixture", "Highly heterogeneous"),
        relatedWords = listOf(
            RelatedWord("Diverse", "Đa dạng, nhiều dạng"),
            RelatedWord("Varied", "Khác nhau, đa dạng")
        )
    ),
    Word(
        id = "heyday",
        term = "Heyday",
        pronunciation = "/ˈheɪdeɪ/",
        shortDefinition = "Thời hoàng kim, thời kỳ đỉnh cao phong độ.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "The period of a person's or thing's greatest success, popularity, or vigor.",
        vietnameseDiff = "Danh từ chỉ giai đoạn một cá nhân, một thương hiệu hoặc một mô hình kinh doanh đạt được sự thịnh vượng, tiếng vang và sức mạnh lớn nhất trong lịch sử.",
        exampleSentence = "In its heyday, the traditional diner was the most crowded spot in the whole district.",
        nuanceInfo = "Thường dùng với cụm 'In one's heyday' (Trong thời hoàng kim của...). Từ này gợi một chút hoài niệm, nhắc nhở người làm chủ hệ thống không được tự mãn (complacent) khi đang ở đỉnh cao mà phải liên tục đổi mới để tránh bị lỗi thời.",
        collocations = listOf("In its heyday, "Heyday of", "During the heyday"),
        relatedWords = listOf(
            RelatedWord("Prime", "Thời kỳ rực rỡ nhất"),
            RelatedWord("Peak", "Đỉnh chóp, cao điểm")
        )
    ),
    Word(
        id = "hiatus",
        term = "Hiatus",
        pronunciation = "/haɪˈeɪtəs/",
        shortDefinition = "Khoảng trống; thời gian tạm hoãn, tạm dừng hoạt động.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A pause or gap in a sequence, series, or process.",
        vietnameseDiff = "Danh từ chỉ một khoảng thời gian gián đoạn, dừng chân nghỉ ngơi của một nghệ sĩ, một Content Creator hoặc một dự án phần mềm trước khi quay trở lại.",
        exampleSentence = "After a short hiatus to restructure the backend code, the application was successfully relaunched.",
        nuanceInfo = "Thường đi kèm với cụm 'Go on a hiatus' (Tạm dừng hoạt động). Sắc thái của từ này mang tính chủ động và chuyên nghiệp, giống như việc bạn tạm ngắt mạch đăng video TikTok để đi học thêm kỹ năng nhằm mục đích lột xác visual.",
        collocations = listOf("Go on a hiatus", "Brief hiatus", "After a long hiatus"),
        relatedWords = listOf(
            RelatedWord("Pause", "Sự tạm nghỉ, dừng lại"),
            RelatedWord("Intermission", "Thời gian giải lao, lúc ngừng")
        )
    ),
    Word(
        id = "hinder",
        term = "Hinder",
        pronunciation = "/ˈhɪndə(r)/",
        shortDefinition = "Cản trở, kìm hãm, làm chậm tiến độ.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Create difficulties for (someone or something), resulting in delay or obstruction.",
        vietnameseDiff = "Hành động gây ra khó khăn, rào cản khiến cho một người không thể thực hiện mục tiêu hoặc một quy trình bị kéo dài thời gian xử lý.",
        exampleSentence = "Complicated family emotional disputes can seriously hinder important business decisions.",
        nuanceInfo = "Rất gần nghĩa với 'Hamper'. Tuy nhiên, 'Hinder' thường nhấn mạnh vào hậu quả làm chậm trễ tiến độ thời gian (delay). Một cấu trúc phổ biến là 'Hinder someone from doing something'.",
        collocations = listOf("Hinder progress", "Hinder growth", "Hinder development"),
        relatedWords = listOf(
            RelatedWord("Hamper", "Làm vướng chân, cản trở"),
            RelatedWord("Impede", "Trì hoãn, làm trở ngại")
        )
    ),
    Word(
        id = "histrionic",
        term = "Histrionic",
        pronunciation = "/ˌhɪstriˈɒnɪk/",
        shortDefinition = "Kịch tính hóa quá đà, diễn sâu, làm trò giả trân.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Overly theatrical or melodramatic in character or style.",
        vietnameseDiff = "Tính chất của một hành vi, thái độ cố tình làm quá lên, la hét, khóc lóc hoặc diễn xuất đầy drama nhằm thu hút sự chú ý hoặc thao túng tâm lý người khác.",
        exampleSentence = "She couldn't stand the histrionic outbursts during what should have been a calm property legal discussion.",
        nuanceInfo = "Mang sắc thái chê bai, mỉa mai rõ rệt. Trong tâm lý học, có 'Histrionic personality disorder' (Rối loạn nhân cách kịch tính). Trong đời sống, dùng từ này để bóc trần những nội dung 'bú trend bẩn' hoặc cố tình tạo phốt giả trân trên mạng xã hội.",
        collocations = listOf("Histrionic behavior", "Histrionic outburst", "Histrionic talent"),
        relatedWords = listOf(
            RelatedWord("Melodramatic", "Cường điệu, cải lương"),
            RelatedWord("Theatrical", "Thuộc về sân khấu, thích phô trương")
        )
    ),
    Word(
        id = "holistic",
        term = "Holistic",
        pronunciation = "/həʊˈlɪstɪk/",
        shortDefinition = "Toàn diện, tổng thể, xét toàn bộ các mối quan hệ cấu thành.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Characterized by comprehension of the parts of something as intimately interconnected and explicable only by reference to the whole.",
        vietnameseDiff = "Tính chất của một góc nhìn, phương pháp giải quyết vấn đề bằng cách quan sát toàn bộ hệ thống tổng thể thay vì chỉ sửa chữa từng phần riêng lẻ.",
        exampleSentence = "A holistic marketing approach combines offline food quality with high-energy short video branding.",
        nuanceInfo = "Một từ cực kỳ thời thượng trong kinh doanh và y học. Khi bạn đưa ra một 'holistic solution' (giải pháp toàn diện), bạn chứng minh tầm nhìn chiến lược vĩ mô của mình, hiểu rằng mọi biến số nhỏ đều tác động mật thiết đến vận mệnh toàn cục.",
        collocations = listOf("Holistic approach", "Holistic view", "Holistic solution"),
        relatedWords = listOf(
            RelatedWord("Comprehensive", "Bao hàm, toàn diện"),
            RelatedWord("Integrated", "Tích hợp, hợp nhất")
        )
    ),
    Word(
        id = "homage",
        term = "Homage",
        pronunciation = "/ˈhɒmɪdʒ/",
        shortDefinition = "Sự tôn kính, lòng ngưỡng mộ; tác phẩm tri ân thần tượng.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Special honor or respect shown publicly; a creative work criticizing or artistic piece mimicking an original master to show respect.",
        vietnameseDiff = "Danh từ chỉ hành động bày tỏ lòng thành kính công khai; hoặc một phân cảnh kịch bản, động tác vũ đạo được cố tình mô phỏng lại để tri ân những bậc tiền bối huyền thoại.",
        exampleSentence = "The modern dance routine paid a beautiful homage to the martial arts legends of the past.",
        nuanceInfo = "Cụm từ kinh điển là 'Pay homage to someone/something'. Trong nghệ thuật sáng tạo nội dung, việc 'pay homage' hoàn toàn khác với đạo nhái (copyright infringement), vì người làm nội dung luôn ghi công (credit) và thể hiện sự tôn trọng sâu sắc đối với bản gốc.",
        collocations = listOf("Pay homage to", "Token of homage", "Artistic homage"),
        relatedWords = listOf(
            RelatedWord("Tribute", "Vật cống hiến, lời ca ngợi"),
            RelatedWord("Reverence", "Sự tôn kính, lòng kính trọng")
        )
    ),
    Word(
        id = "homogeneous",
        term = "Homogeneous",
        pronunciation = "/ˌhɒməˈdʒiːniəs/",
        shortDefinition = "Đồng nhất, đồng đều, một màu giống hệt nhau.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Of the same kind; alike; consisting of parts all of the same kind.",
        vietnameseDiff = "Tính chất của một tập hợp, một hệ thống dữ liệu hoặc một tệp khách hàng có chung đặc điểm hành vi, sở thích và cấu trúc giống nhau từ đầu đến cuối.",
        exampleSentence = "The target market for this basic language tool is a homogeneous group of absolute beginners.",
        nuanceInfo = "Trái nghĩa với 'Heterogeneous'. Nếu một cộng đồng quá 'homogeneous' (thiếu sự đa dạng), nội dung sáng tạo sẽ rất dễ rơi vào lối mòn rập khuôn (hackneyed). Tuy nhiên, trong lập trình cấu trúc dữ liệu, dữ liệu đồng nhất giúp tối ưu hóa thuật toán chạy mượt mà hơn.",
        collocations = listOf("Homogeneous group", "Homogeneous culture", "Highly homogeneous"),
        relatedWords = listOf(
            RelatedWord("Uniform", "Đều, giống nhau, đồng dạng"),
            RelatedWord("Identical", "Giống hệt, đồng nhất")
        )
    ),
    Word(
        id = "hone",
        term = "Hone",
        pronunciation = "/həʊn/",
        shortDefinition = "Mài sắc, rèn luyện (kỹ năng) đạt độ điêu luyện.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Sharpen (a blade); refine or perfect (a skill or talent) over a period of time.",
        vietnameseDiff = "Hành động dốc sức rèn giũa, tập luyện nghiêm túc trong một thời gian dài để nâng tầm một tài năng, kỹ năng (như hát, nhảy, võ thuật, code) đạt đến độ tinh tế, sắc bén.",
        exampleSentence = "He spent years practicing under strict discipline to hone his martial arts skills.",
        nuanceInfo = "Nghĩa gốc là mài dao trên đá. Khi chuyển sang nghĩa bóng, 'hone a skill' mang năng lượng của một võ sĩ hoặc một nghệ sĩ đích thực. Từ này cho thấy sự đầu tư nghiêm túc về mặt thời gian và kỷ luật thép chứ không phải là kiểu cưỡi ngựa xem hoa.",
        collocations = listOf("Hone a skill", "Hone talents", "Hone expertise"),
        relatedWords = listOf(
            RelatedWord("Sharpen", "Làm cho sắc, làm cho nhọn"),
            RelatedWord("Refine", "Gọt giũa, cải tiến tinh tế")
        )
    ),
    Word(
        id = "hostility",
        term = "Hostility",
        pronunciation = "/hɒˈstɪləti/",
        shortDefinition = "Sự thù địch, lòng căm ghét, thái độ chống đối công khai.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Hostile behavior; unfriendliness or opposition.",
        vietnameseDiff = "Danh từ chỉ trạng thái thù hằn gay gắt, ác cảm sâu sắc dẫn đến những hành vi gây chiến hoặc chống đối ra mặt giữa hai cá nhân hoặc phe phái.",
        exampleSentence = "The unexpected property dispute created a wave of hostility among the relatives.",
        nuanceInfo = "Nặng hơn 'Dislike'. 'Hostility' mang tính chiến đấu và đối đầu trực diện. Trong kinh doanh, khi đối mặt với 'customer hostility' (sự giận dữ, chống đối của khách hàng), người làm chủ khôn ngoan luôn dùng sự lịch thiệp (decorum) và điềm tĩnh để xoa dịu thay vì đôi co.",
        collocations = listOf("Open hostility", "Show hostility", "Feel hostility toward"),
        relatedWords = listOf(
            RelatedWord("Enmity", "Lòng thù hận, tình trạng thù địch"),
            RelatedWord("Antagonism", "Sự phản đối, sự kình địch")
        )
    ),
        Word(
        id = "hubris",
        term = "Hubris",
        pronunciation = "/ˈhjuːbrɪs/",
        shortDefinition = "Sự ngạo mạn quá độ, sự tự phụ mù quáng dẫn đến thất bại.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Excessive pride or self-confidence, often leading to a fatal downfall.",
        vietnameseDiff = "Danh từ chỉ trạng thái tự cao tự đại đến mức mù quáng, coi khinh mọi lời khuyên ngăn và luật lệ, để rồi chính cái tôi quá lớn đó tự chôn vùi sự nghiệp của mình.",
        exampleSentence = "The tech startup's hubris led them to ignore user feedback, which eventually caused their downfall.",
        nuanceInfo = "Một thuật ngữ kinh điển bắt nguồn từ bi kịch Hy Lạp cổ đại. 'Hubris' không đơn thuần là kiêu ngạo (arrogant), nó là sự tự phụ đỉnh điểm thách thức cả thần linh hay các quy luật thị trường. Cái kết của 'hubris' luôn là 'nemesis' (sự quả báo, thất bại ê chề).",
        collocations = listOf("Brutal hubris", "Blinded by hubris", "Corporate hubris"),
        relatedWords = listOf(
            RelatedWord("Arrogance", "Sự kiêu ngạo, tính kiêu căng"),
            RelatedWord("Conceit", "Sự tự cao, lòng tự mãn")
        )
    ),
    Word(
        id = "humanitarian",
        term = "Humanitarian",
        pronunciation = "/hjuːˌmænɪˈteəriən/",
        shortDefinition = "Nhân đạo; người có lòng bao dung, thương người.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Concerned with or seeking to promote human welfare; a person who actively works to solve human suffering.",
        vietnameseDiff = "Tính từ chỉ các hoạt động cứu trợ, bảo vệ quyền lợi con người; hoặc danh từ chỉ người cống hiến cuộc đời để xoa dịu nỗi đau, mang lại cuộc sống tốt đẹp cho những mảnh đời bất hạnh.",
        exampleSentence = "The local business owner initiated a humanitarian campaign to provide free hot meals for temporary workers.",
        nuanceInfo = "Mang năng lượng của lòng vị tha (altruism) và trắc ẩn (empathy) sâu sắc. Khi một thương hiệu lồng ghép các chiến dịch 'humanitarian aid' (cứu trợ nhân đạo) một cách chân thành, họ không chỉ giúp đỡ cộng đồng mà còn xây dựng được một tệp khách hàng trung thành bền vững.",
        collocations = listOf("Humanitarian aid", "Humanitarian crisis", "Humanitarian organization"),
        relatedWords = listOf(
            RelatedWord("Philanthropic", "Thương người, có lòng từ thiện"),
            RelatedWord("Altruistic", "Vị tha, thương người")
        )
    ),
    Word(
        id = "humility",
        term = "Humility",
        pronunciation = "/hjuːˈmɪləti/",
        shortDefinition = "Sự khiêm tốn, đức tính nhún nhường bớt cái tôi.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "A modest or low view of one's own importance; humbleness.",
        vietnameseDiff = "Danh từ chỉ đức tính biết mình biết ta, không khoe khoang tài năng, địa vị hay tài sản của mình trước mặt người khác và luôn sẵn sàng học hỏi từ những điều nhỏ nhất.",
        exampleSentence = "Despite achieving multi-million views on his performance videos, he maintained absolute humility.",
        nuanceInfo = "Vũ khí tối thượng của bậc vĩ nhân. Trái ngược hoàn toàn với 'hubris' (ngạo mạn mù quáng). Một nhà sáng lập sở hữu 'intellectual humility' (sự khiêm tốn về tri thức) sẽ luôn nhìn ra lỗ hổng trong thuật toán hoặc mô hình kinh doanh của mình để kịp thời sửa đổi.",
        collocations = listOf("Great humility", "With humility", "Show humility"),
        relatedWords = listOf(
            RelatedWord("Modesty", "Sự khiêm tốn, tính giản dị"),
            RelatedWord("Meekness", "Sự nhu mì, tính nhu thuận")
        )
    ),
    Word(
        id = "hyperbole",
        term = "Hyperbole",
        pronunciation = "/haɪˈpɜːbəli/",
        shortDefinition = "Phép ngoa dụ, lối nói phóng đại, thổi phồng sự thật.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Exaggerated statements or claims not meant to be taken literally.",
        vietnameseDiff = "Danh từ chỉ thủ pháp nói quá, cố tình đẩy tính chất của sự việc lên gấp nhiều lần nhằm gây ấn tượng mạnh, giật gân hoặc tăng tính biểu cảm cho câu chuyện.",
        exampleSentence = "Media copywriters often rely on hyperbole to create highly viral hooks for traditional appliances.",
        nuanceInfo = "Một công cụ đắc lực nhưng con dao hai lưỡi trong viết kịch bản quảng cáo và marketing. Một chút 'hyperbole' tinh tế (exquisite) sẽ khiến video cuốn hút hơn, nhưng nếu lạm dụng quá đà thành 'gian dối' (disingenuous), khách hàng sẽ lập tức quay lưng.",
        collocations = listOf("Mere hyperbole", "Use hyperbole", "Rhetorical hyperbole"),
        relatedWords = listOf(
            RelatedWord("Exaggeration", "Sự phóng đại, sự thổi phồng"),
            RelatedWord("Overstatement", "Lời nói quá, sự phóng đại")
        )
    ),
    Word(
        id = "hypocrisy",
        term = "Hypocrisy",
        pronunciation = "/hɪˈpɒkrəsi/",
        shortDefinition = "Sự đạo đức giả, thói nói một đằng làm một nẻo.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The practice of claiming to have moral standards or beliefs to which one's own behavior does not conform; pretense.",
        vietnameseDiff = "Danh từ chỉ hành vi ngụy tạo vỏ bọc thánh thiện, liên tục rao giảng đạo lý cho người khác nghe trong khi bản thân lại hành xử ích kỷ, vi phạm chính những quy chuẩn đó.",
        exampleSentence = "The public quickly exposed the influencer's hypocrisy when his private behavior leaked online.",
        nuanceInfo = "Mang sắc thái lên án dữ dội. Trong văn hóa mạng xã hội, sự 'hypocrisy' (đạo đức giả) là đòn chí mạng hủy hoại toàn bộ danh tiếng của một cá nhân hay một thương hiệu chỉ trong vài giây ngắn ngủi nếu bị bóc trần.",
        collocations = listOf("Rank hypocrisy", "Sheer hypocrisy", "Accused of hypocrisy"),
        relatedWords = listOf(
            RelatedWord("Duplicity", "Tính hai mặt, sự dối trá"),
            RelatedWord("Insincerity", "Sự không chân thành, tính giả dối")
        )
    ),
    Word(
        id = "iconoclastic",
        term = "Iconoclastic",
        pronunciation = "/aɪˌkɒnəˈklæstɪk/",
        shortDefinition = "Phá vỡ các thần tượng, thách thức mọi tư duy truyền thống lỗi thời.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Criticizing or attacking cherished beliefs or established institutions; unconventional and rebellious.",
        vietnameseDiff = "Tính chất của một tư tưởng, phong cách nghệ thuật hoặc cá nhân thích đập tan các quy tắc rập khuôn, dám đi ngược lại số đông để kiến tạo nên một lối đi hoàn toàn mới.",
        exampleSentence = "His iconoclastic approach to structuring the language app defied all traditional textbook formulas.",
        nuanceInfo = "Nghĩa gốc lịch sử là hành động đập phá các tượng thánh (bài trừ thánh tượng). Nghĩa hiện đại mang tính tích cực trong giới công nghệ và nghệ thuật. Một 'iconoclastic creator' là người có tư duy nổi loạn đầy thiên tài, chuyên tạo ra những cú lật đổ ngoạn mục trên thị trường.",
        collocations = listOf("Iconoclastic view", "Iconoclastic artist", "Highly iconoclastic"),
        relatedWords = listOf(
            RelatedWord("Subversive", "Có tính chất lật đổ, phá hoại"),
            RelatedWord("Unconventional", "Trái với thói thường, độc đáo")
        )
    ),
    Word(
        id = "idiosyncrasy",
        term = "Idiosyncrasy",
        pronunciation = "/ˌɪdiəˈsɪŋkrəsi/",
        shortDefinition = "Đặc tính lập dị, nét kỳ quặc độc bản của một cá nhân.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A mode of behavior or way of thought peculiar to an individual; a distinctive or peculiar feature of a place or thing.",
        vietnameseDiff = "Danh từ chỉ một thói quen nhỏ, một nét tính cách vô cùng độc lạ, có phần lập dị của riêng một người khiến họ không thể bị lẫn lộn với bất kỳ ai khác.",
        exampleSentence = "Coding only after midnight while listening to old martial arts soundtracks was his technical idiosyncrasy.",
        nuanceInfo = "Sắc thái trung tính, đôi khi mang nét đáng yêu hoặc mang đậm dấu ấn cá nhân. Sáng tạo nội dung ngắn rất cần những 'personal idiosyncrasies' này (như một cái nhếch môi, một kiểu ngắt câu) để biến nó thành một thương hiệu độc quyền (signature) hút người xem.",
        collocations = listOf("Personal idiosyncrasy", "Cultural idiosyncrasy", "Quirky idiosyncrasy"),
        relatedWords = listOf(
            RelatedWord("Quirk", "Tật kỳ lạ, sự ngẫu hứng"),
            RelatedWord("Eccentricity", "Tính lập dị, tính kỳ cục")
        )
    ),
    Word(
        id = "ignominious",
        term = "Ignominious",
        pronunciation = "/ˌɪɡnəˈmɪniəs/",
        shortDefinition = "Nhục nhã, nhơ nhuốc, ê chề tột cùng (thất bại).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Deserving or causing public disgrace or shame.",
        vietnameseDiff = "Tính chất của một thất bại, một vụ bê bối hoặc một bản án khiến cá nhân hoặc tổ chức bị mất sạch danh dự, phải cúi đầu trước sự chỉ trích nhục nhã của dư luận.",
        exampleSentence = "The fraudulent real estate scheme suffered an ignominious defeat in court.",
        nuanceInfo = "Mức độ nhục nhã cực kỳ cao. Thường đi kèm cụm 'ignominious defeat' (thất bại nhục nhã ê chề) hoặc 'ignominious end' (kết cục bi thảm, nhơ nhuốc). Từ này ám chỉ kết cục thích đáng cho những hành vi gian dối, coi thường pháp luật.",
        collocations = listOf("Ignominious defeat", "Ignominious failure", "Ignominious end"),
        relatedWords = listOf(
            RelatedWord("Disgraceful", "Nhục nhã, hổ thẹn"),
            RelatedWord("Humiliating", "Làm nhục, làm bẽ mặt")
        )
    ),
    Word(
        id = "illicit",
        term = "Illicit",
        pronunciation = "/ɪˈlɪsɪt/",
        shortDefinition = "Bất hợp pháp, lén lút, trái với quy chuẩn đạo đức.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Forbidden by law, rules, or custom.",
        vietnameseDiff = "Tính chất của các hành vi giao dịch, sao chép dữ liệu hoặc mối quan hệ được thực hiện một cách vụng trộm vì chúng hoàn toàn bị luật pháp nghiêm cấm hoặc bị xã hội lên án.",
        exampleSentence = "The authority launched a campaign to crack down on illicit land division practices in the district.",
        nuanceInfo = "Đừng nhầm với 'Elicit' (Khơi gợi thông tin). 'Illicit' gắn liền với các văn cảnh pháp lý hoặc tệ nạn như 'illicit trade' (buôn lậu), 'illicit software copy' (bản lậu phần mềm). Khi dính vào các yếu tố 'illicit', bạn có nguy cơ phải từ bỏ (forfeit) toàn bộ quyền lợi hợp pháp.",
        collocations = listOf("Illicit trade", "Illicit relationship", "Illicit drugs"),
        relatedWords = listOf(
            RelatedWord("Illegal", "Trái pháp luật, bất hợp pháp"),
            RelatedWord("Unlawful", "Không hợp pháp, loạn phép")
        )
    ),
    Word(
        id = "illuminate",
        term = "Illuminate",
        pronunciation = "/ɪˈluːmɪneɪt/",
        shortDefinition = "Chiếu sáng rực rỡ; làm sáng tỏ một vấn đề phức tạp.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Make something visible or bright by shining light on it; help to clarify or explain something complex.",
        vietnameseDiff = "Hành động thắp sáng không gian bằng hệ thống đèn visual; hoặc nghĩa bóng cực kỳ hay là dùng lý luận, sơ đồ để giải thích cặn kẽ giúp người khác thông suốt một thuật toán hay một đạo lý khó nhằn.",
        exampleSentence = "A comprehensive diagram was created to illuminate the exact flow of the DFS algorithm.",
        nuanceInfo = "Một động từ mang đầy năng lượng trí tuệ. Thay vì nói 'explain' (giải thích thông thường), dùng 'illuminate the problem' gợi hình ảnh bạn mang một ngọn đuốc tri thức rọi thẳng vào vùng tối tăm, hỗn loạn, giúp mọi thứ trở nên minh bạch (explicit) ngay lập tức.",
        collocations = listOf("Illuminate the truth", "Illuminate the mind", "Brightly illuminate"),
        relatedWords = listOf(
            RelatedWord("Clarify", "Làm cho sáng sủa, dễ hiểu"),
            RelatedWord("Enlighten", "Làm sáng mắt, khai sáng")
        )
    ),
    Word(
        id = "illusory",
        term = "Illusory",
        pronunciation = "/ɪˈluːsəri/",
        shortDefinition = "Huyễn hoặc, ảo tưởng, không có thật, đánh lừa thị giác.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Based on or producing illusion; deceptive.",
        vietnameseDiff = "Tính chất của những chỉ số hào nhoáng, những lời hứa hẹn hoặc hiệu ứng hình ảnh nhìn thì rất lung linh nhưng thực chất chỉ là một cái bẫy tâm lý, không hề có giá trị cốt lõi.",
        exampleSentence = "Chasing illusory social media likes without building a real customer database is a dangerous strategy.",
        nuanceInfo = "Mang sắc thái cảnh tỉnh sâu sắc. Một 'illusory success' (thành công ảo) rất dễ khiến người làm chủ ngủ quên trên chiến thắng, lơ là quản lý dòng tiền thực tế để rồi nhận cái kết đắng khi cơn sốt truyền thông hạ nhiệt.",
        collocations = listOf("Illusory promise", "Illusory progress", "Illusory appearance"),
        relatedWords = listOf(
            RelatedWord("Deceptive", "Dối trá, lừa dối, dễ làm bạn nhầm"),
            RelatedWord("Specious", "Chỉ có bề ngoài tốt, hờ hợt")
        )
    ),
    Word(
        id = "imbibe",
        term = "Imbibe",
        pronunciation = "/ɪmˈbaɪb/",
        shortDefinition = "Húp, uống (rượu, nước); hấp thụ sâu sắc (kiến thức, tư tưởng).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Drink (alcohol); absorb or assimilate (ideas or knowledge).",
        vietnameseDiff = "Hành động thưởng thức đồ uống; hoặc nghĩa bóng là âm thầm, chủ động thấm nhuần, nuốt trọn từng kiến thức tinh hoa, tư tưởng văn hóa để biến nó thành máu thịt của mình.",
        exampleSentence = "As a dedicated self-learner, he would imbibe every piece of documentation about advanced NLP algorithms.",
        nuanceInfo = "Nghĩa đen dùng cho việc nhậu nhẹt hoặc uống nước một cách thong thả. Trong văn cảnh học thuật và nghệ thuật, 'imbibe knowledge' thể hiện một niềm đam mê học hỏi ở mức độ cực kỳ mãnh liệt (fervent), khát khao làm chủ công nghệ hoàn toàn.",
        collocations = listOf("Imbibe knowledge", "Imbibe alcohol", "Imbibe ideas"),
        relatedWords = listOf(
            RelatedWord("Absorb", "Hút, hấp thu, thu hút"),
            RelatedWord("Assimilate", "Tiêu hóa, đồng hóa")
        )
    ),
        Word(
        id = "immaculate",
        term = "Immaculate",
        pronunciation = "/ɪˈmæk jələt/",
        shortDefinition = "Tinh khôi, sạch bong không tì vết; hoàn hảo chuẩn chỉ.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Perfectly clean, neat, or tidy; free from flaws or mistakes; perfect.",
        vietnameseDiff = "Tính chất của một không gian được dọn dẹp sạch sẽ, tinh tươm đến mức không một hạt bụi; hoặc một bộ trang phục chỉn chu, một bản thiết kế hệ thống hoàn hảo không có một lỗi nhỏ.",
        exampleSentence = "Maintaining an immaculate kitchen is the first rule for building trust with food delivery customers.",
        nuanceInfo = "Mang sắc thái khen ngợi tuyệt đối về tiêu chuẩn vệ sinh hoặc chất lượng công việc. Đạt được 'immaculate service' hay sở hữu một 'immaculate outfit' (bộ đồ không một nếp nhăn) thể hiện sự tôn trọng khách hàng và tính kỷ luật cực cao của bạn.",
        collocations = listOf("Immaculate kitchen", "Immaculate record", "Immaculate taste"),
        relatedWords = listOf(
            RelatedWord("Spotless", "Sạch sẽ, không một vết bẩn"),
            RelatedWord("Flawless", "Hoàn mỹ, không có khuyết điểm")
        )
    ),
    Word(
        id = "imminent",
        term = "Imminent",
        pronunciation = "/ˈɪmɪnənt/",
        shortDefinition = "Sắp xảy ra đến nơi, cận kề ngay trước mắt.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "About to happen; fast approaching (typically used of something dangerous or unpleasant).",
        vietnameseDiff = "Tính chất của một sự việc, một biến động hoặc một kỳ hạn pháp lý sắp sửa đổ ập xuống trong tương lai gần, đòi hỏi phải có hành động ứng phó ngay lập tức.",
        exampleSentence = "The lawyer warned that without proper signatures, a property dispute was imminent.",
        nuanceInfo = "Đừng viết nhầm với 'Eminent' (Kiệt xuất). 'Imminent' thường mang sắc thái khẩn cấp, đôi khi là tiêu cực như 'imminent danger' (nguy hiểm cận kề), 'imminent failure' (thất bại đến nơi). Việc nhận biết các dấu hiệu này giúp bạn kịp thời sửa đổi chiến lược.",
        collocations = listOf("Imminent danger", "Imminent collapse", "Imminent threat"),
        relatedWords = listOf(
            RelatedWord("Impending", "Sắp xảy đến, đang đe dọa"),
            RelatedWord("Approaching", "Đang đến gần, sắp tới")
        )
    ),
    Word(
        id = "immutable",
        term = "Immutable",
        pronunciation = "/ɪˈmjuːtəbl/",
        shortDefinition = "Bất biến, không bao giờ thay đổi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Unchanging over time or unable to be changed.",
        vietnameseDiff = "Tính chất của một quy luật tự nhiên, một hằng số toán học hoặc một cấu trúc dữ liệu trong lập trình mà sau khi khởi tạo, giá trị của nó cố định tuyệt đối, không một tác vụ nào có thể can thiệp chỉnh sửa.",
        exampleSentence = "In many clean software designs, core application formulas are kept strictly immutable to prevent bugs.",
        nuanceInfo = "Một thuật ngữ tối quan trọng trong lập trình hướng đối tượng và lập trình hàm (`immutable object`). Trong đời sống, 'immutable truth' chỉ một sự thật thép không thể chối cãi, giúp bạn xây dựng những lập luận vững chắc trong các cuộc đàm phán pháp lý.",
        collocations = listOf("Immutable law", "Immutable truth", "Immutable variable"),
        relatedWords = listOf(
            RelatedWord("Unchangeable", "Không thay đổi được"),
            RelatedWord("Fixed", "Cố định, đứng im")
        )
    ),
    Word(
        id = "impartial",
        term = "Impartial",
        pronunciation = "/ɪmˈpɑːʃl/",
        shortDefinition = "Công tâm, vô tư, không thiên vị, khách quan.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Treating all rivals or disputants equally; fair and just.",
        vietnameseDiff = "Tính chất của một vị trọng tài, một thẩm phán hoặc một người đứng đầu khi giải quyết tranh chấp tài sản luôn giữ cái đầu lạnh, xét đoán dựa trên chứng cứ thực tế chứ không nghiêng về bất kỳ mối quan hệ thân sơ nào.",
        exampleSentence = "To settle the family land division smoothly, they needed an impartial legal advisor.",
        nuanceInfo = "Trái ngược hoàn toàn với 'Biased' (Thiên vị). Sắc thái của từ này mang tính chính trực, thượng tôn pháp luật. Khi bạn giải quyết khiếu nại của khách hàng với thái độ 'impartial', bạn sẽ bảo vệ được uy tín dài hạn của cơ sở kinh doanh.",
        collocations = listOf("Impartial advice", "Impartial judge", "Remain impartial"),
        relatedWords = listOf(
            RelatedWord("Unbiased", "Không thiên vị, khách quan"),
            RelatedWord("Disinterested", "Vô tư, không vụ lợi")
        )
    ),
    Word(
        id = "impassionate",
        term = "Impassionate",
        pronunciation = "/ɪmˈpæʃənət/",
        shortDefinition = "Mãnh liệt, nồng nàn, tràn đầy cảm xúc và nhiệt huyết.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Filled with or showing intense emotion or passion.",
        vietnameseDiff = "Tính chất của một bài phát biểu, một kịch bản bán hàng hoặc một phần trình diễn nghệ thuật được thực hiện với nguồn năng lượng bùng nổ, chạm thẳng vào cảm xúc người xem.",
        exampleSentence = "He delivered an impassionate pitch that instantly convinced investors to back his mobile learning tool.",
        nuanceInfo = "Hãy cẩn thận: Tiền tố 'Im-' ở đây KHÔNG mang nghĩa phủ định. 'Impassionate' đồng nghĩa với 'Passionate' nhưng ở mức độ văn chương, trang trọng và mạnh mẽ hơn rất nhiều. Một video TikTok có 'impassionate delivery' sẽ giữ chân người xem cực tốt.",
        collocations = listOf("Impassionate speech", "Impassionate plea", "Impassionate performance"),
        relatedWords = listOf(
            RelatedWord("Passionate", "Sôi nổi, nồng nàn"),
            RelatedWord("Fervent", "Nhiệt thành, tha thiết")
        )
    ),
    Word(
        id = "impassive",
        term = "Impassive",
        pronunciation = "/ɪmˈpæsɪv/",
        shortDefinition = "Thản nhiên, không cảm xúc, mặt lạnh như tiền.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Not feeling or showing emotion; expressionless.",
        vietnameseDiff = "Tính chất của một khuôn mặt, một ánh mắt hoàn toàn đóng băng, không để lộ bất kỳ sự tức giận, lo lắng hay vui mừng nào ra bên ngoài, khiến đối phương không thể đoán biết nội tâm.",
        exampleSentence = "The experienced developer remained impassive even when the system server crashed during deployment.",
        nuanceInfo = "Ngược lại với 'Impassionate'. Phong thái 'impassive poker face' là một lợi thế cực lớn khi bạn phải đối mặt với những khách hàng gắt gỏng (fractious) hoặc ngồi trong các phiên thảo luận pháp lý căng thẳng, giúp bạn giữ vững thế chủ động.",
        collocations = listOf("Impassive face", "Impassive look", "Remain impassive"),
        relatedWords = listOf(
            RelatedWord("Expressionless", "Không biểu cảm, đờ đẫn"),
            RelatedWord("Stolid", "Thản nhiên, dửng dưng")
        )
    ),
    Word(
        id = "impeccable",
        term = "Impeccable",
        pronunciation = "/ɪmˈpekəbl/",
        shortDefinition = "Hoàn hảo, không chê vào đâu được, không một tì vết.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "In accordance with the highest standards; faultless; perfect.",
        vietnameseDiff = "Tính chất của một kỹ năng, một phong cách thời trang hoặc một thuật toán xử lý dữ liệu đạt đến độ chuẩn mực tối cao, khiến ngay cả những chuyên gia khó tính nhất cũng không thể tìm ra lỗi.",
        exampleSentence = "Her modern male styling choices for the video shoot showed impeccable taste.",
        nuanceInfo = "Một tính từ cực kỳ sang xịn mịn. Thường đi với 'taste' (gu thẩm mỹ), 'timing' (chọn thời điểm chuẩn xác) hoặc 'manners' (cách hành xử chuẩn mực). Khi bạn vận hành quán ăn với một quy trình 'impeccable execution', việc bứt phá doanh thu là điều tất yếu.",
        collocations = listOf("Impeccable taste", "Impeccable timing", "Impeccable credentials"),
        relatedWords = listOf(
            RelatedWord("Faultless", "Không có lỗi, hoàn hảo"),
            RelatedWord("Irreproachable", "Không thể trách cứ được, quá chuẩn")
        )
    ),
    Word(
        id = "impede",
        term = "Impede",
        pronunciation = "/ɪmˈpiːd/",
        shortDefinition = "Cản trở, làm chậm, gây tắc nghẽn tiến trình.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Delay or prevent (someone or something) by obstructing them; hinder.",
        vietnameseDiff = "Hành động tạo ra các nút thắt cổ chai, rào cản vật lý hoặc thủ tục rườm rà khiến cho dòng chảy công việc hoặc một thuật toán BFS/DFS bị trì trệ, không thể đạt tốc độ tối ưu.",
        exampleSentence = "Inefficient string concatenation will heavily impede the performance of the segmentation algorithm.",
        nuanceInfo = "Học thuật và mang tính kỹ thuật hơn 'Hinder' hay 'Hamper'. 'Impede' gợi hình ảnh một vật cản lớn chặn ngang đường (như lỗi nghẽn mạng băng thông). Danh từ của nó là 'Impediment' (sự trở ngại/chướng ngại vật).",
        collocations = listOf("Impede progress", "Impede growth", "Impede the flow"),
        relatedWords = listOf(
            RelatedWord("Obstruct", "Làm tắc nghẽn, ngăn trở"),
            RelatedWord("Hinder", "Kìm hãm, cản trở")
        )
    ),
    Word(
        id = "imperative",
        term = "Imperative",
        pronunciation = "/ɪmˈperətɪv/",
        shortDefinition = "Cấp bách, bắt buộc, là yếu tố sống còn phải làm ngay.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Of vital importance; crucial; giving an authoritative command.",
        vietnameseDiff = "Tính chất của một nhiệm vụ, một điều kiện tiên quyết cực kỳ quan trọng, không thể trì hoãn nếu muốn hệ thống hoặc doanh nghiệp sống sót.",
        exampleSentence = "It is imperative to secure the digital watermarks before publishing proprietary content online.",
        nuanceInfo = "Trong ngữ pháp, 'Imperative sentence' là câu mệnh lệnh. Trong kinh doanh, khi nói 'It is imperative that...', bạn đang phát đi một tín hiệu khẩn cấp, yêu cầu đội nhóm tập trung 100% công lực để xử lý ngay lập tức bài toán trước mắt.",
        collocations = listOf("Categorical imperative", "Economic imperative", "Absolutely imperative"),
        relatedWords = listOf(
            RelatedWord("Crucial", "Cốt yếu, mang tính quyết định"),
            RelatedWord("Vital", "Sống còn, quan trọng")
        )
    ),
    Word(
        id = "imperceptible",
        term = "Imperceptible",
        pronunciation = "/ˌɪmpəˈseptəbl/",
        shortDefinition = "Rất nhỏ, siêu tinh vi, mắt thường khó lòng nhận ra.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "So slight, gradual, or subtle as not to be perceived by the human senses.",
        vietnameseDiff = "Tính chất của một sự thay đổi màu sắc hình ảnh, một độ trễ thuật toán cực nhỏ hoặc một sắc thái âm thanh vô cùng tinh vi mà nếu không quan sát cực kỳ kỹ lưỡng thì không thể nào phát hiện ra.",
        exampleSentence = "The image editing tool made an imperceptible change to the lighting that enhanced the soft boy aesthetic.",
        nuanceInfo = "Mang sắc thái đỉnh cao của sự tinh tế (subtle). Một 'imperceptible transition' (sự chuyển cảnh mượt mà) trong video ngắn sẽ mang lại trải nghiệm vô cùng dễ chịu cho người xem mà họ không hề nhận ra có sự can thiệp của kỹ thuật.",
        collocations = listOf("Imperceptible change", "Imperceptible difference", "Almost imperceptible"),
        relatedWords = listOf(
            RelatedWord("Subtle", "Tinh tế, tế nhị"),
            RelatedWord("Indistinguishable", "Không thể phân biệt được")
        )
    ),
    Word(
        id = "impetuous",
        term = "Impetuous",
        pronunciation = "/ɪmˈpetʃuəs/",
        shortDefinition = "Hấp tấp, bốc đồng, làm theo bản năng thiếu suy nghĩ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Acting or done quickly and without thought or care; impulsive.",
        vietnameseDiff = "Tính chất của một hành động xuống tiền mua đất, đầu tư hoặc phát ngôn trên mạng xã hội một cách vội vã, chỉ để thỏa mãn cảm xúc nhất thời mà hoàn toàn bỏ qua việc phân tích rủi ro.",
        exampleSentence = "An impetuous decision to change the app architecture overnight led to critical backend crashes.",
        nuanceInfo = "Mang sắc thái cảnh báo về tính cách nông nổi của tuổi trẻ. Khác với sự quyết đoán thông minh, một kẻ 'impetuous' thường để cảm xúc lấn át lý trí, dẫn đến những sai lầm tốn kém, cần phải rèn luyện sự điềm tĩnh (equanimity) để khắc chế.",
        collocations = listOf("Impetuous decision", "Impetuous youth", "Impetuous behavior"),
        relatedWords = listOf(
            RelatedWord("Impulsive", "Hấp tấp, tự phát"),
            RelatedWord("Rash", "Liều lĩnh, thiếu thận trọng")
        )
    ),
    Word(
        id = "implacable",
        term = "Implacable",
        pronunciation = "/ɪmˈplækəbl/",
        shortDefinition = "Nội tâm kiên định không lay chuyển; thù dai, không thể xoa dịu.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Unable to be placated or appeased; relentless; unstoppable.",
        vietnameseDiff = "Tính chất của một thế lực, một lòng căm thù hoặc một sự quyết tâm sắt đá đến mức không một lời cầu xin, một số tiền hay một giải pháp hòa giải nào có thể làm cho lung lay hoặc dừng lại.",
        exampleSentence = "The business faced implacable opposition from traditional competitors in the area.",
        nuanceInfo = "Thường mang sắc thái đáng sợ, lạnh lùng khi đi với các danh từ như 'implacable enemy' (kẻ thù không đội trời chung), 'implacable logic' (logic đanh thép không thể bẻ gãy). Từ này thể hiện một trạng thái tuyệt đối, không có chỗ cho sự thương lượng.",
        collocations = listOf("Implacable enemy", "Implacable hostility", "Implacable logic"),
        relatedWords = listOf(
            RelatedWord("Relentless", "Tàn nhẫn, không ngừng nghỉ"),
            RelatedWord("Inexorable", "Không lay chuyển được, khăng khăng")
        )
    ),
        Word(
        id = "implicit",
        term = "Implicit",
        pronunciation = "/ɪmˈplɪsɪt/",
        shortDefinition = "Ngầm hiểu, ẩn ý không nói ra; tuyệt đối (niềm tin).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Implied though not plainly expressed; essentially connected with but not plainly apparent; absolute and unquestioning.",
        vietnameseDiff = "Tính chất của một thông điệp, một điều khoản hoặc một mong muốn được lồng ghép khéo léo để người đối diện tự suy luận ra chứ không tuyên bố trực diện; hoặc chỉ một niềm tin tuyệt đối không chút hoài nghi.",
        exampleSentence = "There was an implicit agreement between the content creator and his editors regarding video aesthetics.",
        nuanceInfo = "Trái nghĩa hoàn toàn với 'Explicit' (rõ ràng, minh bạch). Trong lập trình, `implicit conversion` là việc hệ thống tự ngầm hiểu và chuyển đổi kiểu dữ liệu. Trong nghệ thuật viết kịch bản, việc sử dụng 'implicit messaging' (thông điệp ẩn ý) giúp câu chuyện có chiều sâu và tinh tế hơn rất nhiều.",
        collocations = listOf("Implicit trust", "Implicit agreement", "Implicit meaning"),
        relatedWords = listOf(
            RelatedWord("Implied", "Ngầm, ám chỉ"),
            RelatedWord("Tacit", "Ngầm, không nói ra lời")
        )
    ),
    Word(
        id = "implode",
        term = "Implode",
        pronunciation = "/ɪmˈpləʊd/",
        shortDefinition = "Nổ tung vào trong, sụp đổ hoàn toàn từ bên trong.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Collapse or cause to collapse violently inward; end or fail suddenly and catastrophically as a result of internal strained forces.",
        vietnameseDiff = "Hành động nổ ép vào trong do áp suất cực lớn; hoặc nghĩa bóng chỉ một doanh nghiệp, một đội nhóm hoặc một mối quan hệ tự sụp đổ tan tành vì những xung đột mâu thuẫn nội bộ quá dữ dội.",
        exampleSentence = "Without a clear division of family assets, the business partnership could implode at any moment.",
        nuanceInfo = "Trái nghĩa với 'Explode' (nổ tung ra ngoài). Khi một dự án khởi nghiệp 'implode', nguyên nhân không phải do đối thủ cạnh tranh đánh bại, mà là do bộ máy quản trị quá yếu kém, dòng tiền cạn kiệt hoặc nội bộ lục đục, tự hủy hoại từ gốc rễ.",
        collocations = listOf("Implode inward", "Spectacularly implode", "Threaten to implode"),
        relatedWords = listOf(
            RelatedWord("Collapse", "Sụp đổ, sập"),
            RelatedWord("Disintegrate", "Tan rã, phân hủy")
        )
    ),
    Word(
        id = "implore",
        term = "Implore",
        pronunciation = "/ɪmˈplɔː(r)/",
        shortDefinition = "Cầu xin, van nài một cách khẩn thiết, đau đớn.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Beg someone earnestly or piteously to do something.",
        vietnameseDiff = "Hành động cầu xin ai đó một cách tuyệt vọng, tha thiết và đầy nghẹn ngào, thường xảy ra trong các văn cảnh hoạn nạn hoặc kịch kịch tính cao trào.",
        exampleSentence = "The tone of his voice seemed to implore his former partner for a final chance to clear the misunderstanding.",
        nuanceInfo = "Nặng sắc thái cảm xúc hơn rất nhiều so với 'Ask' hoặc 'Beg'. Từ này gợi hình ảnh một người đang rơi vào đường cùng, dùng cả danh dự và sự chân thành để lay động đối phương. Thường xuất hiện trong viết kịch bản phim drama hoặc tiểu thuyết.",
        collocations = listOf("Implore someone for mercy", "Implore someone to stay", "Earnestly implore"),
        relatedWords = listOf(
            RelatedWord("Beseech", "Van xin, khẩn cầu"),
            RelatedWord("Entreat", "Khẩn nài, nài xin")
        )
    ),
    Word(
        id = "impresario",
        term = "Impresario",
        pronunciation = "/ˌɪmprəˈsɑːriəʊ/",
        shortDefinition = "Ông bầu thời thượng, nhà tổ chức đêm diễn nghệ thuật.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A person who organizes and often finances concerts, plays, or operas; a manager of an entertainment company.",
        vietnameseDiff = "Danh từ chỉ những nhân vật quyền lực đứng sau cánh gà, chuyên bỏ vốn, lên ý tưởng kịch bản và quản lý show diễn cho các ca sĩ, vũ công, nghệ sĩ biểu diễn bùng nổ trước công chúng.",
        exampleSentence = "The young TikTok content creator dreams of becoming a digital impresario, managing top talents in the country.",
        nuanceInfo = "Từ ngữ cao cấp mang phong thái rất nghệ thuật và sang trọng. Một 'impresario' không chỉ đơn giản là một manager thông thường, họ là những bộ óc chiến lược thiên tài có khả năng nhào nặn xu hướng thời trang và định hình gu thẩm mỹ cho cả một thế hệ.",
        collocations = listOf("Theater impresario", "Opera impresario", "Legendary impresario"),
        relatedWords = listOf(
            RelatedWord("Producer", "Nhà sản xuất"),
            RelatedWord("Promoter", "Nhà tổ chức, người tài trợ")
        )
    ),
    Word(
        id = "impromptu",
        term = "Impromptu",
        pronunciation = "/ɪmˈprɒmptjuː/",
        shortDefinition = "Ứng biến tại chỗ, ngẫu hứng không chuẩn bị trước.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Done without being planned, organized, or rehearsed.",
        vietnameseDiff = "Tính từ hoặc trạng từ chỉ một bài phát biểu, một điệu nhảy, hoặc một buổi quay video được thực hiện ngay lập tức theo tiếng gọi của cảm xúc, hoàn toàn không có trong kịch bản chuẩn bị từ trước.",
        exampleSentence = "An impromptu martial arts showcase during his trip instantly went viral on short video platforms.",
        nuanceInfo = "Khác với từ 'Haphazard' (mang nghĩa vô tổ chức, cẩu thả), 'Impromptu' mang năng lượng vô cùng tích cực, phóng khoáng. Nó thể hiện tài năng thiên bẩm và độ nhạy bén của một creator khi có thể tạo ra nội dung xuất sắc (exquisite) ngay tại chỗ mà không cần đạo cụ cồng kềnh.",
        collocations = listOf("Impromptu speech", "Impromptu performance", "Impromptu party"),
        relatedWords = listOf(
            RelatedWord("Extemporaneous", "Ứng khẩu, tùy ứng"),
            RelatedWord("Unrehearsed", "Không tập dượt trước")
        )
    ),
    Word(
        id = "improvident",
        term = "Improvident",
        pronunciation = "/ɪmˈprɒvɪdənt/",
        shortDefinition = "Hoang phí, thiển cận, không biết lo xa tích lũy cho tương lai.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Not having or showing foresight; spendthrift or thoughtless in money management.",
        vietnameseDiff = "Tính chất của một người chi tiêu tiền bạc vô tội vạ, có bao nhiêu xài bấy nhiêu, sống buông thả (hedonism) theo cảm xúc nhất thời mà không hề có kế hoạch dự phòng tài chính cho những lúc rủi ro.",
        exampleSentence = "Improvident business choices during peak seasons will leave you completely vulnerable when winter comes.",
        nuanceInfo = "Mang sắc thái phê phán nghiêm túc về mặt tư duy tài chính. Trái ngược hoàn toàn with 'Prudent' (thận trọng, biết lo xa). Một người làm chủ hệ thống bắt buộc phải loại bỏ thói quen 'improvident' để đảm bảo dòng tiền luôn ở trạng thái an toàn tuyệt đối.",
        collocations = listOf("Improvident lifestyle", "Improvident habits", "Improvident spending"),
        relatedWords = listOf(
            RelatedWord("Thriftless", "Không tiết kiệm, hoang phí"),
            RelatedWord("Spendthrift", "Phung phí tiền bạc")
        )
    ),
    Word(
        id = "impudent",
        term = "Impudent",
        pronunciation = "/ˈɪmpjədənt/",
        shortDefinition = "Láo xược, xấc xược, trơ trẽn vô lễ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Not showing due respect for another person; impertinent; boldly disrespectful.",
        vietnameseDiff = "Tính chất của một thái độ, lời nói vô lễ, coi thường người lớn tuổi hoặc bề trên một cách trơ trẽn, cố tình phá vỡ các quy chuẩn lịch sự tối thiểu.",
        exampleSentence = "The manager dismissed the staff immediately for making impudent remarks to a loyal customer.",
        nuanceInfo = "Mức độ chỉ trích nặng nề về mặt nhân cách. Một hành vi 'impudent' sẽ lập tức hủy hoại mọi mối quan hệ đối tác và khiến tập thể quay lưng. Trong môi trường dịch vụ ẩm thực, sự lịch thiệp (decorum) luôn phải được đặt lên hàng đầu để khắc chế những biểu hiện này.",
        collocations = listOf("Impudent remark", "Impudent behavior", "Impudent young man"),
        relatedWords = listOf(
            RelatedWord("Insolent", "Láo xược, xấc láo"),
            RelatedWord("Impertinent", "Xấc xược, trơ tráo")
        )
    ),
    Word(
        id = "impugn",
        term = "Impugn",
        pronunciation = "/ɪmˈpjuːn/",
        shortDefinition = "Công kích, nghi ngờ, đặt dấu hỏi lớn về tính trung thực.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Dispute the truth, validity, or honesty of (a statement or motive); call into question.",
        vietnameseDiff = "Hành động công khai bác bỏ, phản biện hoặc đưa ra bằng chứng để nghi ngờ tính chính trực của một hợp đồng pháp lý, một lời tuyên bố hoặc một động cơ của đối phương.",
        exampleSentence = "The defense team attempted to impugn the validity of the signed property certificate in court.",
        nuanceInfo = "Một thuật ngữ vô cùng mạnh mẽ trong văn cảnh tranh chấp, đàm phán hoặc pháp lý. Khi bạn 'impugn someone's character', bạn đang giáng một đòn nặng nề vào danh dự của họ, đòi hỏi bạn phải có những chứng cứ thép để không bị khép vào tội vu khống.",
        collocations = listOf("Impugn the honesty of", "Impugn motives", "Impugn credibility"),
        relatedWords = listOf(
            RelatedWord("Challenge", "Thách thức, nghi ngờ"),
            RelatedWord("Question", "Chất vấn, đặt câu hỏi")
        )
    ),
    Word(
        id = "impunity",
        term = "Impunity",
        pronunciation = "/ɪmˈpjuːnəti/",
        shortDefinition = "Sự miễn phạt, tình trạng làm càn mà không sợ bị trừng phạt.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Exemption from punishment or freedom from the injurious consequences of an action.",
        vietnameseDiff = "Danh từ chỉ trạng thái một cá nhân hoặc một thế lực vô tư vi phạm quy định, luật lệ hoặc làm tổn thương người khác mà luôn trốn thoát được mọi hình phạt pháp lý một cách bất công.",
        exampleSentence = "No one should be allowed to bypass local land management laws with absolute impunity.",
        nuanceInfo = "Cấu trúc kinh điển là 'With impunity' (Một cách vô tội vạ, không sợ bị phạt). Từ này mang sắc thái bất bình sâu sắc đối với những lỗ hổng quản lý hoặc những kẻ cậy quyền thế để chà đạp lên lợi ích chung của tập thể.",
        collocations = listOf("Act with impunity", "Enjoy impunity", "Absolute impunity"),
        relatedWords = listOf(
            RelatedWord("Exemption", "Sự miễn trừ"),
            RelatedWord("Immunity", "Sự miễn dịch, quyền bất khả xâm phạm")
        )
    ),
    Word(
        id = "inadvertent",
        term = "Inadvertent",
        pronunciation = "/ˌɪnədˈvɜːtənt/",
        shortDefinition = "Vô tình, sơ suất, không cố ý (gây ra lỗi).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Not resulting from or achieved through deliberate planning; unintentional due to oversight.",
        vietnameseDiff = "Tính chất của một sai sót, một con bug trong code hoặc một hành động làm lộ thông tin xảy ra hoàn toàn do vô tình, lơ đãng chứ người làm không hề có dã tâm hay ác ý từ trước.",
        exampleSentence = "An inadvertent mistake in the database design caused the tool to miscalculate user memory scores.",
        nuanceInfo = "Trái nghĩa với 'Deliberate' (cố tình). Dù mang sắc thái nhẹ nhàng hơn vì không phải do ác ý, một 'inadvertent omission' (sự bỏ sót vô tình) trong các văn bản ký kết chia đất đai vẫn có thể để lại những hậu quả pháp lý vô cùng nghiêm trọng.",
        collocations = listOf("Inadvertent error", "Inadvertent disclosure", "Inadvertent mistake"),
        relatedWords = listOf(
            RelatedWord("Unintentional", "Không cố ý, không chủ tâm"),
            RelatedWord("Accidental", "Tình cờ, ngẫu nhiên")
        )
    ),
    Word(
        id = "inalienable",
        term = "Inalienable",
        pronunciation = "/ɪnˈeɪliənəbl/",
        shortDefinition = "Bất khả xâm phạm, không thể bị tước đoạt hay chuyển nhượng.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Unable to be taken away from or given away by the possessor.",
        vietnameseDiff = "Tính chất của một quyền lợi chính đáng, một chủ quyền hợp pháp mà không một cá nhân, tổ chức hay đạo luật nào có quyền can thiệp, tước đoạt hay ép buộc từ bỏ.",
        exampleSentence = "Every citizen has an inalienable right to protect their legal property ownership.",
        nuanceInfo = "Thuật ngữ chính trị và pháp lý ở cấp độ cao nhất. Cụm từ kinh điển trong các bản tuyên ngôn độc lập là 'inalienable rights' (những quyền bất khả xâm phạm như quyền sống, quyền tự do). Từ này tạo nên một lớp lá chắn lập luận vững chắc, đanh thép.",
        collocations = listOf("Inalienable right", "Inalienable property", "Inalienable sovereignty"),
        relatedWords = listOf(
            RelatedWord("Inviolable", "Bất khả xâm phạm"),
            RelatedWord("Absolute", "Tuyệt đối, hoàn toàn")
        )
    ),
    Word(
        id = "inane",
        term = "Inane",
        pronunciation = "/ɪˈneɪn/",
        shortDefinition = "Ngu ngốc, ngớ ngẩn, sáo rỗng vô nghĩa.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Lacking sense or meaning; silly; silly and mindless.",
        vietnameseDiff = "Tính chất của một câu hỏi, một bình luận hoặc một kịch bản video nông cạn, ngớ ngẩn đến mức nực cười, hoàn toàn không mang lại một giá trị trí tuệ nào.",
        exampleSentence = "Ignore the inane comments on social media and keep focusing on refining your core software product.",
        nuanceInfo = "Sắc thái chê trách sự hời hợt, thiếu muối. Một người sáng tạo nội dung thông minh cần biết cách lọc bỏ những 'inane questions' từ các tài khoản ảo để dành thời gian tối ưu hóa thuật toán word segmentation hoặc chăm sóc những khách hàng thực tế.",
        collocations = listOf("Inane comment", "Inane question", "Inane conversation"),
        relatedWords = listOf(
            RelatedWord("Fatuous", "Ngu ngốc, khờ khạo"),
            RelatedWord("Asinine", "Ngu xuẩn, độn")
        )
    ),
        Word(
        id = "inarticulate",
        term = "Inarticulate",
        pronunciation = "/ˌɪnɑːˈtɪkjulət/",
        shortDefinition = "Ú ớ, không nói nên lời; không có khả năng diễn đạt lưu loát.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Unable to express one's ideas or feelings clearly or easily; not clearly expressed or pronounced.",
        vietnameseDiff = "Tính chất của một người đang trong trạng thái quá xúc động, sợ hãi dẫn đến nói năng lập bập, không ra hơi; hoặc một cá nhân gặp khó khăn trong việc trình bày tư tưởng của mình thành câu từ mạch lạc.",
        exampleSentence = "When confronted with the sudden property legal documents, he became completely inarticulate with anger.",
        nuanceInfo = "Mô tả sự bất lực trong ngôn ngữ. Trái ngược hoàn toàn với người có tài ăn nói (articulate) hay một MC chuyên nghiệp. Việc luyện tập viết kịch bản, làm video ngắn sẽ giúp bạn khắc phục triệt để sự 'inarticulate' này khi đứng trước đám đông.",
        collocations = listOf("Inarticulate speech", "Inarticulate with rage", "Rendered inarticulate"),
        relatedWords = listOf(
            RelatedWord("Tongue-tied", "Líu lưỡi, không nói được"),
            RelatedWord("Incoherent", "Không mạch lạc, rời rạc")
        )
    ),
    Word(
        id = "incandescent",
        term = "Incandescent",
        pronunciation = "/ˌɪnkænˈdesnt/",
        shortDefinition = "Sáng rực rỡ, phát sáng; ngập tràn cảm xúc mãnh liệt.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Emitting light as a result of being heated; full of strong emotion; passionate or brilliant.",
        vietnameseDiff = "Tính từ chỉ ngọn đèn dây tóc phát sáng rực rỡ khi bị nung nóng; hoặc nghĩa bóng tả một nụ cười, một visual bừng sáng, hay một màn trình diễn nghệ thuật đầy nhiệt huyết, hút hồn người xem.",
        exampleSentence = "The dancer delivered an incandescent performance that illuminated the entire theatrical stage.",
        nuanceInfo = "Mang năng lượng thẩm mỹ cực kỳ cao sang và lung linh. Khi áp dụng cho một ý tưởng hay phong cách thẩm mỹ trong video short-form, 'incandescent brilliance' chỉ những khoảnh khắc bùng nổ tài năng bẩm sinh làm lu mờ mọi sự rập khuôn thông thường.",
        collocations = listOf("Incandescent light", "Incandescent smile", "Incandescent performance"),
        relatedWords = listOf(
            RelatedWord("Luminous", "Sáng, chói lọi"),
            RelatedWord("Radiant", "Rạng rỡ, hớn hở")
        )
    ),
    Word(
        id = "incantation",
        term = "Incantation",
        pronunciation = "/ˌɪnkænˈteɪʃn/",
        shortDefinition = "Lời câu chú, câu thần chú huyền bí.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A series of words said as a magic spell or charm.",
        vietnameseDiff = "Danh từ chỉ một chuỗi các câu từ mang màu sắc tâm linh, ma thuật được tụng niệm lặp đi lặp lại nhằm khơi gợi một nguồn năng lượng huyền bí hoặc thao túng thực tại.",
        exampleSentence = "To the absolute beginner, the advanced NLP algorithm code looked like a complex mathematical incantation.",
        nuanceInfo = "Từ ngữ mang màu sắc kỳ ảo, cổ kính. Thường dùng trong phim ảnh võ thuật, kỳ ảo. Trong văn cảnh đời sống, từ này hay được ví von một cách hài hước để chỉ những công thức ghi nhớ ngôn ngữ hoặc những đoạn code nhìn qua vô cùng rối rắm, bí hiểm.",
        collocations = listOf("Mumble an incantation", "Magic incantation", "Ancient incantation"),
        relatedWords = listOf(
            RelatedWord("Spell", "Câu thần chú, bùa chú"),
            RelatedWord("Chant", "Câu hát tụng niệm, thánh ca")
        )
    ),
    Word(
        id = "incense",
        term = "Incense",
        pronunciation = "/ɪnˈsens/ (v) - /ˈɪnsens/ (n)",
        shortDefinition = "Nhang, hương; chọc giận đùng đùng, làm nổi trận lôi đình.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Make someone very angry; a gum or spice which is burned for the sweet smell it produces.",
        vietnameseDiff = "Danh từ chỉ cây nhang/hương thắp ban thờ; động từ mang ý nghĩa cực mạnh: hành động chọc giận, xúc phạm nghiêm trọng khiến một người lập tức bốc hỏa, phẫn nộ tột cùng.",
        exampleSentence = "The data breach incensed customers, leading to a massive boycott of the application.",
        nuanceInfo = "Hãy chú ý trọng âm. Trọng âm rơi vào âm tiết thứ hai khi là động từ. 'Incensed' (tính từ) mô tả trạng thái giận run người. Mức độ giận dữ ở đây cao hơn rất nhiều so với 'angry' hay 'annoyed', liên quan đến sự xúc phạm sâu sắc vào lòng tự trọng.",
        collocations = listOf("Incensed by", "Highly incensed", "Burn incense"),
        relatedWords = listOf(
            RelatedWord("Enrage", "Làm nổi điên, làm điên lên"),
            RelatedWord("Infuriate", "Làm tức điên lên")
        )
    ),
    Word(
        id = "incentive",
        term = "Incentive",
        pronunciation = "/ɪnˈsentɪv/",
        shortDefinition = "Động lực, sự khuyến khích; phần thưởng kích cầu.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "A thing that motivates or encourages someone to do something; a payment or concession to stimulate greater output or investment.",
        vietnameseDiff = "Danh từ chỉ một phần thưởng tài chính, một chính sách ưu đãi hoặc một mục tiêu hấp dẫn được đưa ra nhằm kích thích nhân viên làm việc hăng hái hơn, hoặc lôi kéo khách hàng xuống tiền.",
        exampleSentence = "Offering a premium feature for free is a powerful incentive to boost mobile app downloads.",
        nuanceInfo = "Từ khóa kinh điển trong kinh tế học hành vi và quản trị hệ thống. Để một ứng dụng học tập hay một mô hình kinh doanh ẩm thực vận hành tự động hiệu quả, người làm chủ phải thiết kế ra một hệ thống 'incentive structured' (cơ chế phần thưởng) đủ thông minh để giữ chân người dùng.",
        collocations = listOf("Financial incentive", "Strong incentive", "Create an incentive"),
        relatedWords = listOf(
            RelatedWord("Motivation", "Sự thúc đẩy, động cơ"),
            RelatedWord("Inducement", "Sự cám dỗ, sự khuyến khích")
        )
    ),
    Word(
        id = "inception",
        term = "Inception",
        pronunciation = "/ɪnˈsepʃn/",
        shortDefinition = "Sự khởi đầu, ngày đầu thành lập dự án/tổ chức.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "The establishment or starting point of an institution or activity.",
        vietnameseDiff = "Danh từ trang trọng chỉ thời điểm viên gạch đầu tiên được đặt xuống, khoảnh khắc một dự án khởi nghiệp, một ứng dụng di động hoặc một ý tưởng kinh doanh chính thức được khai sinh.",
        exampleSentence = "Since its inception, the local food brand has consistently focused on clean ingredients.",
        nuanceInfo = "Thường đi với cụm 'Since its inception' (Kể từ ngày đầu thành lập). Từ này mang sắc thái trang trọng, vĩ mô hơn 'start' hay 'beginning'. Nó gợi lên hành trình dài hơi của một hệ thống từ thuở sơ khai cho đến khi gặt hái quả ngọt.",
        collocations = listOf("Since its inception", "Project inception", "From its inception"),
        relatedWords = listOf(
            RelatedWord("Origin", "Gốc, nguồn gốc"),
            RelatedWord("Inauguration", "Lễ khai trương, sự mở đầu")
        )
    ),
    Word(
        id = "incessant",
        term = "Incessant",
        pronunciation = "/ɪnˈsesnt/",
        shortDefinition = "Liên miên, không ngớt, rả rích gây khó chịu.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Continuing without pause or interruption (of something regarded as unpleasant).",
        vietnameseDiff = "Tính chất của một sự việc, hành động kéo dài liên tục từ tiếng này qua tiếng khác, ngày này qua ngày khác mà không hề dừng lại, tạo ra cảm giác mệt mỏi, ức chế tinh thần.",
        exampleSentence = "The incessant notifications from unoptimized code bugs will quickly drain any developer's energy.",
        nuanceInfo = "Luôn mang sắc thái tiêu cực. Khác với 'continuous' (liên tục một cách trung tính), 'incessant' thường đi kèm với những thứ gây phiền toái như 'incessant rain' (mưa dầm dề), 'incessant complaints' (cằn nhằn liên miên). Bạn cần những giải pháp dứt điểm để chặn đứng sự phiền toái này.",
        collocations = listOf("Incessant noise", "Incessant chatter", "Incessant rain"),
        relatedWords = listOf(
            RelatedWord("Ceaseless", "Không ngừng, không ngớt"),
            RelatedWord("Unremitting", "Không ngừng, không giảm")
        )
    ),
    Word(
        id = "inchoate",
        term = "Inchoate",
        pronunciation = "/ɪnˈkəʊət/",
        shortDefinition = "Sơ khai, mới phôi thai, còn mơ hồ chưa định hình.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Just begun and so not fully formed or developed; rudimentary.",
        vietnameseDiff = "Tính chất của một ý tưởng kinh doanh, một thuật toán AI hoặc một dự thảo hợp đồng mới chỉ nằm trên bề mặt tư duy, còn rất lỏng lẻo và cần rất nhiều thời gian gọt giũa để thành hình.",
        exampleSentence = "She had an inchoate plan to expand the food shop, but no explicit formula for execution yet.",
        nuanceInfo = "Thuật ngữ cao cấp mô tả trạng thái nguyên thủy nhất của một vạn vật. Một 'inchoate idea' (ý tưởng sơ khai) giống như một khối ngọc thô, nếu người làm chủ sở hữu tư duy hệ thống và kiên trì, họ sẽ rèn giũa (hone) nó thành một siêu phẩm đắt giá.",
        collocations = listOf("Inchoate idea", "Inchoate state", "Inchoate plan"),
        relatedWords = listOf(
            RelatedWord("Rudimentary", "Sơ bộ, bước đầu"),
            RelatedWord("Embryonic", "Thuộc phôi, mới phôi thai")
        )
    ),
    Word(
        id = "incisive",
        term = "Incisive",
        pronunciation = "/ɪnˈsaɪsɪv/",
        shortDefinition = "Sắc sảo, bén ngót, đâm trúng tim đen vấn đề.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Analytical and clear-thinking; accurate and sharply focused.",
        vietnameseDiff = "Tính chất của một tư duy, một lời nhận xét hoặc một bài phân tích vô cùng thông minh, gãy gọn, có khả năng bóc tách một bài toán phức tạp thành những phần cốt lõi ngay lập tức.",
        exampleSentence = "The consultant gave an incisive analysis of why the previous social media caption failed to convert.",
        nuanceInfo = "Nghĩa gốc liên quan đến răng cửa (incisor) có chức năng cắn xé thức ăn. Nghĩa bóng thể hiện một trí tuệ cực kỳ đáng gờm. Khi bạn đưa ra một 'incisive comment', bạn chứng minh mình không cưỡi ngựa xem hoa mà đã thấu suốt bản chất quy luật.",
        collocations = listOf("Incisive mind", "Incisive commentary", "Incisive analysis"),
        relatedWords = listOf(
            RelatedWord("Sharp", "Sắc bén, nhạy bén"),
            RelatedWord("Acute", "Sâu sắc, nhạy bén")
        )
    ),
    Word(
        id = "incite",
        term = "Incite",
        pronunciation = "/ɪnˈsaɪt/",
        shortDefinition = "Kích động, xúi giục, châm ngòi cho hành vi bạo lực/vi phạm.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Encourage or stir up (violent or unlawful behavior); urge or persuade (someone) to act in a violent or unlawful way.",
        vietnameseDiff = "Hành động cố tình dùng lời nói, video hoặc phốt truyền thông để kích động đám đông nổi loạn, gây chiến hoặc thực hiện các hành vi phá hoại trái pháp luật.",
        exampleSentence = "Publishing fake legal certificates online can incite unnecessary panic and hostility within the community.",
        nuanceInfo = "Mang sắc thái rất nặng nề và tiêu cực trong pháp luật. Khác với 'encourage' (khuyến khích làm việc tốt), 'incite' gắn liền với tội danh kích động bạo lực (`incite violence`) hoặc thù hằn. Người làm nội dung sạch tuyệt đối phải né tránh chiêu trò này.",
        collocations = listOf("Incite violence", "Incite a riot", "Incite hatred"),
        relatedWords = listOf(
            RelatedWord("Instigate", "Xúi giục, gây ra"),
            RelatedWord("Provoke", "Khiêu khích, chọc tức")
        )
    ),
    Word(
        id = "inclement",
        term = "Inclement",
        pronunciation = "/ɪnˈklemənt/",
        shortDefinition = "Khắc nghiệt, dữ dội (thường chỉ thời tiết).",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Unpleasantly cold or wet (of the weather).",
        vietnameseDiff = "Tính chất của thời tiết mưa bão, giông lốc hoặc rét đậm rét hại gây cản trở nghiêm trọng cho các hoạt động di chuyển và vận hành kinh doanh ngoài trời.",
        exampleSentence = "Due to the inclement weather, walk-in customer traffic at the restaurant dropped significantly.",
        nuanceInfo = "Từ ngữ vô cùng trang trọng và chuyên nghiệp. Thay vì nói 'bad weather', các thông báo dịch vụ hoặc báo cáo doanh thu thường dùng 'inclement weather conditions' để thể hiện sự bài bản và giải trình lý do khách quan một cách thuyết phục.",
        collocations = listOf("Inclement weather", "Inclement conditions", "Inclement climate"),
        relatedWords = listOf(
            RelatedWord("Severe", "Khắt khe, dữ dội"),
            RelatedWord("Harsh", "Thô bạo, khắc nghiệt")
        )
    ),
    Word(
        id = "incongruous",
        term = "Incongruous",
        pronunciation = "/ɪnˈkɒŋɡruəs/",
        shortDefinition = "Lệch pha, cạch cỡm, không ăn nhập, lạc quẻ.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Not in harmony or keeping with the surroundings or other aspects of something.",
        vietnameseDiff = "Tính chất của một yếu tố, một hành vi hoặc một chi tiết hình ảnh nằm sai chỗ, hoàn toàn lạc quẻ và phá nát sự hài hòa tổng thể của một hệ thống hoặc một concept mỹ thuật.",
        exampleSentence = "Wearing a formal business suit during a casual martial arts training felt completely incongruous.",
        nuanceInfo = "Mang sắc thái chỉ ra sự thiếu tinh tế hoặc bất hợp lý. Ví dụ, lồng một bản nhạc nền giật gân vào một video quay món ăn truyền thống mộc mạc sẽ tạo cảm giác 'incongruous'. Người làm creative luôn phải đảm bảo mọi chi tiết đồng nhất (homogeneous) với nhau.",
        collocations = listOf("Incongruous sight", "Incongruous behavior", "Completely incongruous"),
        relatedWords = listOf(
            RelatedWord("Inappropriate", "Không thích hợp, không thích đáng"),
            RelatedWord("Discordant", "Chói tai, không hòa hợp")
        )
    ),
        Word(
        id = "inconsequential",
        term = "Inconsequential",
        pronunciation = "/ɪnˌkɒnsɪˈkwenʃl/",
        shortDefinition = "Vụn vặt, tầm thường, không quan trọng, chẳng đáng kể.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Not important or significant; trivial.",
        vietnameseDiff = "Tính chất của một chi tiết, một số tiền hoặc một sự cố nhỏ nhặt, hoàn toàn không có sức nặng để làm thay đổi cục diện hoặc ảnh hưởng đến quyết định lớn của một hệ thống.",
        exampleSentence = "Don't let inconsequential social media arguments distract you from optimizing your core data structure.",
        nuanceInfo = "Mang sắc thái nhắc nhở người làm chủ phải biết buông bỏ những điều nhỏ nhặt. Khi bạn đối mặt với các tranh chấp vĩ mô hay áp lực vận hành, việc phân loại đâu là biến số 'inconsequential' sẽ giúp bạn tiết kiệm được rất nhiều năng lượng tinh thần.",
        collocations = listOf("Inconsequential detail", "Inconsequential amount", "Completely inconsequential"),
        relatedWords = listOf(
            RelatedWord("Trivial", "Tầm thường, không đáng kể"),
            RelatedWord("Insignificant", "Không có ý nghĩa, không quan trọng")
        )
    ),
    Word(
        id = "incontrovertible",
        term = "Incontrovertible",
        pronunciation = "/ˌɪnkɒntrəˈvɜːtəbl/",
        shortDefinition = "Không thể chối cãi, đanh thép rõ ràng, không thể bàn cãi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Not able to be denied or disputed; indisputable; undeniable.",
        vietnameseDiff = "Tính chất của một bằng chứng pháp lý, một con số doanh thu thực tế hoặc một chân lý toán học chuẩn xác đến mức không một ai có thể tìm ra lý lẽ để phủ nhận hay tranh luận ngược lại.",
        exampleSentence = "The official land certificate with governmental red stamps provided incontrovertible proof of ownership.",
        nuanceInfo = "Cấp độ cao nhất của sự chắc chắn. Thường đi kèm với danh từ như 'incontrovertible evidence' (chứng cứ đanh thép) hoặc 'incontrovertible fact' (sự thật hiển nhiên). Đây là vũ khí tối thượng giúp bạn dập tắt mọi sự hoài nghi trong các cuộc đàm phán hợp đồng.",
        collocations = listOf("Incontrovertible evidence", "Incontrovertible fact", "Incontrovertible proof"),
        relatedWords = listOf(
            RelatedWord("Indisputable", "Không thể tranh cãi được"),
            RelatedWord("Undeniable", "Không thể phủ nhận được")
        )
    ),
    Word(
        id = "incorporate",
        term = "Incorporate",
        pronunciation = "/ɪnˈkɔːpəreɪt/",
        shortDefinition = "Tích hợp, lồng ghép, kết hợp chặt chẽ vào một tổng thể.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "Take in or include (something) as a part of a whole; include; combine ingredients into one substance.",
        vietnameseDiff = "Hành động chủ động đưa một thuật toán mới, một tính năng ghi nhớ, hoặc một xu hướng thời trang trẻ trung lồng ghép nhuần nhuyễn vào bộ máy vận hành hoặc ứng dụng di động sẵn có.",
        exampleSentence = "We plan to incorporate modern soft boy design formulas into the learning app's user interface.",
        nuanceInfo = "Mạnh hơn 'add' hay 'include'. 'Incorporate' mang tính chất hòa tan và đồng hóa. Khi bạn 'incorporate' một yếu tố mới, nó không đứng tách biệt mà trở thành một phần máu thịt, giúp nâng cấp toàn diện sức mạnh của hệ thống tổng thể.",
        collocations = listOf("Incorporate features", "Incorporate elements", "Incorporate into"),
        relatedWords = listOf(
            RelatedWord("Integrate", "Tích hợp, hợp nhất"),
            RelatedWord("Assimilate", "Đồng hóa, hấp thu")
        )
    ),
    Word(
        id = "incorigible",
        term = "Incorrigible",
        pronunciation = "/ɪnˈkɒrɪdʒəbl/",
        shortDefinition = "Không thể sửa đổi, hết thuốc chữa, chứng nào tật nấy.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Not able to be corrected, improved, or reformed (of a person or their tendencies).",
        vietnameseDiff = "Tính chất của một thói quen xấu, một tật xấu chi tiêu hoang phí hoặc một cá nhân lười biếng đã ăn sâu vào cốt tủy, dù có bị phạt hay khuyên răn bao nhiêu lần cũng không bao giờ tiến bộ.",
        exampleSentence = "He realized that spending database budget on unvetted short-form video ads was an incorrigible mistake.",
        nuanceInfo = "Đôi khi được dùng với sắc thái hài hước, nuông chiều nhẹ nhàng (như 'an incorrigible romantic' - kẻ lãng mạn hết thuốc chữa), nhưng trong văn cảnh công việc, một 'incorrigible staff' (nhân viên chứng nào tật nấy) là dấu hiệu bạn cần phải dứt khoát sa thải.",
        collocations = listOf("Incorrigible liar", "Incorrigible habit", "An incorrigible romantic"),
        relatedWords = listOf(
            RelatedWord("Incurable", "Không thể cứu chữa, nan y"),
            RelatedWord("Inveterate", "Ăn sâu, lâu năm, thâm căn cố đế")
        )
    ),
    Word(
        id = "incredulous",
        term = "Incredulous",
        pronunciation = "/ɪnˈkredjələs/",
        shortDefinition = "Hoài nghi, mắt chữ O miệng chữ Ô vì không thể tin nổi.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Unwilling or unable to believe something; skeptical.",
        vietnameseDiff = "Tính chất của một cái nhìn, một thái độ thể hiện sự ngờ vực tột độ, không sẵn lòng tin vào một thông tin, một lời hứa hẹn hoặc một chỉ số ảo tung chảo mà đối phương đưa ra.",
        exampleSentence = "The investors gave an incredulous look when the creator claimed he could double conversion rates without spending a dime.",
        nuanceInfo = "Đừng nhầm với 'Incredible' (Tuyệt vời, không thể tin được - tính chất của vật). 'Incredulous' tả trạng thái nội tâm của con người khi họ chủ động bật chế độ phòng thủ, nghi ngờ để tránh bị thao túng tâm lý hoặc dính bẫy phốt truyền thông.",
        collocations = listOf("Incredulous look", "Incredulous smile", "Remain incredulous"),
        relatedWords = listOf(
            RelatedWord("Skeptical", "Hoài nghi, đa nghi"),
            RelatedWord("Doubtful", "Nghi ngờ, do dự")
        )
    ),
    Word(
        id = "increment",
        term = "Increment",
        pronunciation = "/ˈɪŋkrəmənt/",
        shortDefinition = "Lượng tăng thêm, sự tăng trưởng theo từng nấc nhỏ.",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "An increase or addition, especially one of a series on a fixed scale.",
        vietnameseDiff = "Danh từ chỉ một giá trị cố định được cộng thêm vào hệ thống (như tăng lương định kỳ, tăng biến số vòng lặp `i++` trong thuật toán, hoặc tiến trình tích lũy từ vựng mỗi ngày).",
        exampleSentence = "The software tool tracks user memory retention and adds a small increment to the difficulty score daily.",
        nuanceInfo = "Cực kỳ phổ biến trong toán học, khoa học máy tính và quản trị tài chính. Việc xây dựng ứng dụng hay rèn luyện võ thuật không thể thành công sau một đêm, mà dựa trên nguyên lý 'continuous increments' (tích lũy từng nấc nhỏ) để tạo nên sự lột xác vĩ đại.",
        collocations = listOf("Salary increment", "Small increment", "Increment of value"),
        relatedWords = listOf(
            RelatedWord("Increase", "Sự tăng lên, lượng tăng"),
            RelatedWord("Accrual", "Sự tích lũy, dồn lại")
        )
    ),
    Word(
        id = "incumbency",
        term = "Incumbency",
        pronunciation = "/ɪnˈkʌmbənsi/",
        shortDefinition = "Nhiệm kỳ, thời gian đương nhiệm nắm giữ chức vụ.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "The holding of an office or the period during which one is held.",
        vietnameseDiff = "Danh từ chỉ giai đoạn chính thức một cá nhân đứng tên điều hành, chịu trách nhiệm pháp lý cao nhất đối với một tổ chức, cơ sở kinh doanh hoặc tài sản nhà đất.",
        exampleSentence = "During his incumbency as the primary manager, the restaurant's operational flow was fully automated.",
        nuanceInfo = "Mang sắc thái vô cùng trang trọng và chính trị. Khi nhắc đến 'during my incumbency', bạn đang nhấn mạnh vào những thành tựu hoặc di sản, thay đổi cốt lõi mà mình đã kiến tạo nên trong suốt thời gian cầm quyền.",
        collocations = listOf("During one's incumbency", "Challenge the incumbency", "Length of incumbency"),
        relatedWords = listOf(
            RelatedWord("Tenure", "Nhiệm kỳ, sự chiếm hữu"),
            RelatedWord("Term", "Kỳ hạn, thời hạn chức vụ")
        )
    ),
    Word(
        id = "incur",
        term = "Incur",
        pronunciation = "/ɪnˈkɜː(r)/",
        shortDefinition = "Gánh chịu, chuốc lấy (hậu quả, chi phí, nợ nần).",
        cefrLevel = "C1",
        cefrDescription = "Advanced",
        cefrColor = Color(0xFFFF9800),
        englishDiff = "Bring or take upon oneself (something undesirable, such as a legal penalty or financial debt) as a result of one's own behavior.",
        vietnameseDiff = "Hành động tự mình làm ra để rồi phải gánh chịu những khoản chi phí phát sinh, những hình phạt pháp lý hoặc sự phẫn nộ từ dư luận.",
        exampleSentence = "If you delay signing the official division agreement, you might incur unnecessary legal fees.",
        nuanceInfo = "Cụm từ kinh điển là 'Incur debts' (vướng vào nợ nần) hoặc 'Incur costs' (phát sinh chi phí). Sắc thái của từ này nhấn mạnh vào việc hậu quả xảy ra là do chính hành vi chủ quan của bạn gây ra, chứ không phải do tai bay vạ gió.",
        collocations = listOf("Incur expenses", "Incur wrath", "Incur a penalty"),
        relatedWords = listOf(
            RelatedWord("Sustain", "Chịu đựng, gánh chịu"),
            RelatedWord("Acquire", "Thu được, nhiễm phải")
        )
    ),
    Word(
        id = "indefatigable",
        term = "Indefatigable",
        pronunciation = "/ˌɪndɪˈfætɪɡəbl/",
        shortDefinition = "Không biết mệt mỏi, bền bỉ kiên cường dẻo dai.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Persisting tirelessly (of a person or their efforts).",
        vietnameseDiff = "Tính chất của một tinh thần chiến đấu, một creator hoặc một võ sĩ làm việc, luyện tập liên tục với cường độ cao mà không một lời kêu ca, luôn tràn đầy năng lượng bùng nổ.",
        exampleSentence = "Thanks to his indefatigable efforts, the complex word segmentation module was completed ahead of schedule.",
        nuanceInfo = "Một từ hoa mỹ dùng để tôn vinh những con người có ý chí sắt đá. 'Indefatigable enthusiasm' (sự nhiệt huyết không biết mệt mỏi) là chìa khóa giúp một nhà sáng lập vừa quản lý quán ăn trơn tru, vừa tự học thuật toán nâng cao mà vẫn giữ được thần thái visual đỉnh cao.",
        collocations = listOf("Indefatigable worker", "Indefatigable efforts", "Indefatigable spirit"),
        relatedWords = listOf(
            RelatedWord("Tireless", "Không mệt mỏi, kiên trì"),
            RelatedWord("Unflagging", "Bền bỉ, không sụt giảm")
        )
    ),
    Word(
        id = "indelible",
        term = "Indelible",
        pronunciation = "/ɪnˈdeləbl/",
        shortDefinition = "Không thể gột rửa, in đậm sâu sắc không bao giờ phai.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Making marks that cannot be removed; not able to be forgotten or severe.",
        vietnameseDiff = "Tính chất của một loại mực không thể xóa; hoặc nghĩa bóng chỉ một ấn tượng visual, một bài học xương máu hay một vết sẹo tâm lý khắc sâu vào tâm trí, trường tồn cùng thời gian.",
        exampleSentence = "The dramatic break-up left an indelible mark on his artistic and emotional perspective.",
        nuanceInfo = "Thường dùng trong cụm 'leave an indelible impression' (để lại ấn tượng không thể nào quên). Trong sáng tạo nội dung video ngắn, mục tiêu tối cao của bạn là tạo ra những đoạn 'hook' hình ảnh độc bản mang tính 'indelible' để người xem nhớ mãi thương hiệu của bạn.",
        collocations = listOf("Indelible ink", "Indelible impression", "Indelible mark"),
        relatedWords = listOf(
            RelatedWord("Inerasable", "Không thể xóa bỏ được"),
            RelatedWord("Enduring", "Lâu dài, trường tồn")
        )
    ),
    Word(
        id = "indemnify",
        term = "Indemnify",
        pronunciation = "/ɪnˈdemnɪfaɪ/",
        shortDefinition = "Bồi hoàn, cam kết bảo lãnh bồi thường thiệt hại tài chính.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "Compensate (someone) for harm or loss; secure (someone) against legal responsibility for their actions.",
        vietnameseDiff = "Hành động ký kết điều khoản pháp lý cam kết sẽ móc tiền túi ra đền bù toàn bộ tổn thất hoặc bảo vệ đối tác khỏi các rủi ro kiện tụng trong quá trình hợp tác làm ăn.",
        exampleSentence = "The land division contract states that the party who causes the delay must indemnify the other co-owners.",
        nuanceInfo = "Thuật ngữ cốt lõi trong bảo hiểm và luật hợp đồng thương mại. Khi bạn yêu cầu một điều khoản 'indemnify', bạn đang tự xây dựng một tấm khiên bảo vệ dòng tiền và tài sản của mình trước những biến cố rủi ro do bên thứ ba gây ra.",
        collocations = listOf("Indemnify someone against loss", "Indemnify for damages", "Agreement to indemnify"),
        relatedWords = listOf(
            RelatedWord("Compensate", "Đền bù, bồi thường"),
            RelatedWord("Reimburse", "Hoàn lại, trả lại số tiền đã ứng")
        )
    ),
    Word(
        id = "indictment",
        term = "Indictment",
        pronunciation = "/ɪnˈdaɪtmənt/",
        shortDefinition = "Bản cáo trạng; bằng chứng đanh thép đập tan sự dối trá.",
        cefrLevel = "C2",
        cefrDescription = "Proficient",
        cefrColor = Color(0xFFE91E63),
        englishDiff = "A formal charge or accusation of a serious crime; a thing that serves as a potent sign that a system or situation is bad.",
        vietnameseDiff = "Danh từ pháp lý chỉ văn bản buộc tội chính thức từ viện kiểm sát; hoặc nghĩa bóng là một sự thật, một chỉ số tồi tệ phơi bày sự yếu kém, thất bại hoàn toàn của một bộ máy quản lý.",
        exampleSentence = "The sudden spike in server bugs was a severe indictment of their rushed application framework.",
        nuanceInfo = "Hãy chú ý phát âm, âm 'c' hoàn toàn bị câm. Khi một sự việc là 'a damning indictment of...', nó phản ánh một lỗ hổng đạo đức hoặc kỹ thuật nghiêm trọng mà bạn không thể bao biện (extenuate), bắt buộc phải đối mặt cải tổ.",
        collocations = listOf("Damning indictment", "Formal indictment", "An indictment of the system"),
        relatedWords = listOf(
            RelatedWord("Accusation", "Sự buộc tội, lời kết tội"),
            RelatedWord("Arraignment", "Sự luận tội, sự đưa ra tòa")
        )
    ),
        Word(
        id = "ability",
        term = "Ability",
        pronunciation = "/əˈbɪliti/",
        shortDefinition = "Khả năng, năng lực làm một việc gì đó.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "The physical or mental power or skill needed to do something.",
        vietnameseDiff = "Danh từ chỉ năng khiếu bẩm sinh hoặc kỹ năng bạn luyện tập mà có (như khả năng code, ca hát, nhảy múa, võ thuật).",
        exampleSentence = "He has the ability to write clean code and create viral video scripts at the same time.",
        nuanceInfo = "Một từ siêu cơ bản. Khi nói về năng lực chung chung, cứ dùng 'ability'. Trong lập trình, từ này hay xuất hiện trong các tính năng phân quyền (User Abilities).",
        collocations = listOf("Great ability", "Natural ability", "Ability to do something"),
        relatedWords = listOf(
            RelatedWord("Skill", "Kỹ năng (do luyện tập)"),
            RelatedWord("Talent", "Tài năng (bẩm sinh)")
        )
    ),
    Word(
        id = "access",
        term = "Access",
        pronunciation = "/ˈækses/",
        shortDefinition = "Quyền truy cập, đường vào; tiếp cận.",
        cefrLevel = "B1",
        cefrDescription = "Intermediate",
        cefrColor = Color(0xFF03A9F4),
        englishDiff = "The right or opportunity to use or see something; the way to enter a place.",
        vietnameseDiff = "Vừa là danh từ (quyền vào) vừa là động từ (vào mạng, xem dữ liệu). Rất quen thuộc khi bạn đăng nhập ứng dụng hoặc quản lý tài sản.",
        exampleSentence = "Only the primary admin has the right to access the user database.",
        nuanceInfo = "Từ khóa 'gối đầu giường' của dân công nghệ (`Access Control`, `Access Token`). Trong đời sống, có 'access' giống như bạn giữ chiếc chìa khóa vạn năng để mở cửa một cơ hội vậy.",
        collocations = listOf("Gain access", "Direct access", "Internet access"),
        relatedWords = listOf(
            RelatedWord("Entry", "Sự đi vào, lối vào"),
            RelatedWord("Admission", "Sự nhận vào, cho vào")
        )
    ),
    Word(
        id = "accurate",
        term = "Accurate",
        pronunciation = "/ˈækjərət/",
        shortDefinition = "Chính xác, chuẩn xác, không có sai sót.",
        cefrLevel = "B1",
        cefrDescription = "Intermediate",
        cefrColor = Color(0xFF03A9F4),
        englishDiff = "Correct, exact, and without any mistakes.",
        vietnameseDiff = "Tính từ chỉ những số liệu dòng tiền, tọa độ đất đai trên giấy tờ, hoặc kết quả trả về của một thuật toán phân tách từ ngữ đạt độ chuẩn chỉnh 100%.",
        exampleSentence = "The word segmentation algorithm must be accurate to ensure the app works smoothly.",
        nuanceInfo = "Dùng khi nói về độ chính xác của số liệu, thông tin, máy móc. Khác với 'Correct' (đúng/sai thông thường), 'Accurate' nhấn mạnh vào độ tỉ mỉ, đo lường chuẩn xác.",
        collocations = listOf("Highly accurate", "Accurate information", "Accurate data"),
        relatedWords = listOf(
            RelatedWord("Exact", "Chính xác, chuẩn"),
            RelatedWord("Precise", "Tỉ mỉ, chính xác từng tí")
        )
    ),
    Word(
        id = "achieve",
        term = "Achieve",
        pronunciation = "/əˈtʃiːv/",
        shortDefinition = "Đạt được, giành được (sau một quá trình nỗ lực).",
        cefrLevel = "B1",
        cefrDescription = "Intermediate",
        cefrColor = Color(0xFF03A9F4),
        englishDiff = "To succeed in finishing something or reaching an aim, especially after a lot of work or effort.",
        vietnameseDiff = "Động từ chỉ việc bạn hoàn thành xuất sắc một mục tiêu lớn như bứt phá doanh thu cho quán ăn, hay tự tay build xong một ứng dụng di động.",
        exampleSentence = "With a clear formula and daily discipline, you will achieve your financial goals.",
        nuanceInfo = "Mang năng lượng tích cực và tự hào. Thường đi với các mục tiêu cần sự kiên trì dài hạn (`achieve a goal`, `achieve success`). Danh từ của nó là 'Achievement' (thành tựu) - thứ mà app nào cũng cần để thưởng cho user khi họ học chăm chỉ.",
        collocations = listOf("Achieve success", "Achieve a goal", "Achieve growth"),
        relatedWords = listOf(
            RelatedWord("Attain", "Đạt được (vị trí, trình độ)"),
            RelatedWord("Accomplish", "Hoàn thành (nhiệm vụ)")
        )
    ),
    Word(
        id = "active",
        term = "Active",
        pronunciation = "/ˈæktɪv/",
        shortDefinition = "Tích cực, chủ động, hoạt động năng nổ.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "Busy with a particular activity; doing things energy and commitment.",
        vietnameseDiff = "Tính từ chỉ trạng thái một tài khoản mạng xã hội liên tục đăng bài, hoặc một người luôn tràn đầy năng lượng, thích vận động, tập luyện.",
        exampleSentence = "He stays active by practicing martial arts every afternoon.",
        nuanceInfo = "Trong kinh doanh và quản lý app, cụm từ 'Active Users' (người dùng thực sự hoạt động) là chỉ số sống còn để đánh giá độ thành công của sản phẩm, quan trọng hơn nhiều so với tổng số lượt tải ảo.",
        collocations = listOf("Active user", "Active lifestyle", "Take an active role"),
        relatedWords = listOf(
            RelatedWord("Energetic", "Tràn đầy năng lượng"),
            RelatedWord("Dynamic", "Năng động, sôi nổi")
        )
    ),
    Word(
        id = "add",
        term = "Add",
        pronunciation = "/æd/",
        shortDefinition = "Thêm vào, cộng vào.",
        cefrLevel = "A1",
        cefrDescription = "Beginner",
        cefrColor = Color(0xFF8BC34A),
        englishDiff = "To put something with something else to increase the number or amount.",
        vietnameseDiff = "Động từ siêu ngắn gọn: thêm món mới vào menu, thêm tính năng vào code, hoặc cộng thêm điểm thưởng cho người dùng.",
        exampleSentence = "Remember to add a watermark filter to your images before posting them on TikTok.",
        nuanceInfo = "Gần như là từ đầu tiên ai cũng học. Trong lập trình, các thao tác cơ bản luôn xoay quanh cụm CRUD (Create, Read, Update, Delete) và 'Add' chính là hành động tạo mới.",
        collocations = listOf("Add value", "Add a comment", "Add to cart"),
        relatedWords = listOf(
            RelatedWord("Insert", "Chèn vào (ở giữa)"),
            RelatedWord("Include", "Bao gồm, tính cả")
        )
    ),
        Word(
        id = "adjust",
        term = "Adjust",
        pronunciation = "/əˈdʒʌst/",
        shortDefinition = "Điều chỉnh, sửa lại chút ít cho phù hợp.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "To change something slightly to make it fit, work better, or look more appropriate.",
        vietnameseDiff = "Hành động căn chỉnh lại độ sáng của ảnh, sửa lại giá món ăn trên menu, hoặc tinh chỉnh một thông số trong thuật toán để chạy mượt hơn.",
        exampleSentence = "You can adjust the image filter to make your video look more style-cool.",
        nuanceInfo = "Thay vì dùng từ 'Change' (thay đổi hoàn toàn), 'Adjust' mang sắc thái tinh chỉnh một chút để đạt đến trạng thái hoàn hảo hoặc cân bằng nhất.",
        collocations = listOf("Adjust the price", "Adjust settings", "Adjust the volume"),
        relatedWords = listOf(
            RelatedWord("Modify", "Sửa đổi, thay đổi nhỏ"),
            RelatedWord("Adapt", "Thích nghi, sửa cho hợp")
        )
    ),
    Word(
        id = "admin",
        term = "Admin",
        pronunciation = "/ˈædmɪn/",
        shortDefinition = "Quản trị viên, người điều hành hệ thống.",
        cefrLevel = "B1",
        cefrDescription = "Intermediate",
        cefrColor = Color(0xFF03A9F4),
        englishDiff = "Short for administrator; the person responsible for running a system, shop, or application.",
        vietnameseDiff = "Từ viết tắt cực kỳ phổ biến trong đời sống và công nghệ để chỉ người làm chủ, nắm quyền cao nhất để quản lý fanpage, tài khoản hoặc app.",
        exampleSentence = "As the main admin, you have the right to approve or delete user accounts.",
        nuanceInfo = "Trong lập trình ứng dụng, giao diện dành cho người quản lý luôn được gọi là 'Admin Dashboard'. Từ này mang tính chất vận hành và kiểm soát hệ thống.",
        collocations = listOf("Admin dashboard", "Group admin", "Admin rights"),
        relatedWords = listOf(
            RelatedWord("Manager", "Người quản lý"),
            RelatedWord("Owner", "Người làm chủ, chủ sở hữu")
        )
    ),
    Word(
        id = "advance",
        term = "Advance",
        pronunciation = "/ədˈvɑːns/",
        shortDefinition = "Tiến bộ, đi lên; đưa lên trước (tiền đặt cọc).",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "To go forward; to develop or improve; money paid before it is due.",
        vietnameseDiff = "Vừa là động từ (tiến bộ, nâng cao tay nghề) vừa là danh từ (khoản tiền trả trước/đặt cọc khi mua bán đất đai, làm dịch vụ).",
        exampleSentence = "Learning complex algorithms is a great way to advance your computer science career.",
        nuanceInfo = "Tính từ 'Advanced' nghĩa là nâng cao, cao cấp. Còn trong giao dịch kinh doanh, cụm từ 'In advance' nghĩa là làm cái gì đó trước (ví dụ: thanh toán trước).",
        collocations = listOf("In advance", "Advance payment", "Career advance"),
        relatedWords = listOf(
            RelatedWord("Progress", "Sự tiến bộ, phát triển"),
            RelatedWord("Deposit", "Tiền đặt cọc")
        )
    ),
    Word(
        id = "advice",
        term = "Advice",
        pronunciation = "/ədˈvaɪs/",
        shortDefinition = "Lời khuyên, sự chỉ bảo.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "An opinion or recommendation offered as a guide to action.",
        vietnameseDiff = "Danh từ chỉ những lời góp ý, hướng dẫn từ người có kinh nghiệm giúp bạn giải quyết vấn đề (như lời khuyên về thủ tục pháp lý, cách viết caption kéo tương tác).",
        exampleSentence = "He asked his older brother for advice on how to build a simple mobile application.",
        nuanceInfo = "Lưu ý cực kỳ quan trọng: 'Advice' là danh từ KHÔNG đếm được. Bạn không được dùng 'an advice' hay 'advices'. Nếu muốn đếm, bắt buộc phải dùng cụm 'a piece of advice'.",
        collocations = listOf("Give advice", "Take advice", "Legal advice"),
        relatedWords = listOf(
            RelatedWord("Recommendation", "Sự tiến cử, lời khuyên"),
            RelatedWord("Tip", "Mẹo nhỏ, hướng dẫn nhanh")
        )
    ),
    Word(
        id = "agree",
        term = "Agree",
        pronunciation = "/əˈɡriː/",
        shortDefinition = "Đồng ý, nhất trí, đồng thuận.",
        cefrLevel = "A1",
        cefrDescription = "Beginner",
        cefrColor = Color(0xFF8BC34A),
        englishDiff = "To have the same opinion; to accept a proposal or statement.",
        vietnameseDiff = "Động từ thể hiện sự đồng tình với một ý kiến, hoặc hai bên cùng ký kết chấp thuận các điều khoản phân chia tài sản, hợp đồng.",
        exampleSentence = "Both sides need to agree before signing the official land division papers.",
        nuanceInfo = "Thường đi với giới từ 'with' (đồng ý với ai) hoặc 'on' (đồng ý về vấn đề gì). Trái nghĩa của nó là 'Disagree'. Danh từ là 'Agreement' (sự đồng ý / bản hợp đồng).",
        collocations = listOf("Agree with someone", "Agree on a price", "Completely agree"),
        relatedWords = listOf(
            RelatedWord("Accept", "Chấp nhận, thừa nhận"),
            RelatedWord("Consent", "Bằng lòng, đồng ý")
        )
    ),
    Word(
        id = "algorithm",
        term = "Algorithm",
        pronunciation = "/ˈælɡərɪðəm/",
        shortDefinition = "Thuật toán, quy trình giải quyết một bài toán.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "A set of step-by-step instructions or rules followed by a computer to solve a problem.",
        vietnameseDiff = "Danh từ chỉ một chuỗi các bước được lập trình sẵn để máy tính tự động xử lý dữ liệu (như thuật toán tìm kiếm DFS/BFS, thuật toán phân tách từ ngữ, thuật toán hiển thị của TikTok).",
        exampleSentence = "Understanding the TikTok algorithm helps you get more views for your short videos.",
        nuanceInfo = "Dân công nghệ và làm nội dung đều gặp từ này hằng ngày. Một bên tối ưu thuật toán bằng code (`code optimization`), một bên tối ưu nội dung để 'ăn' thuật toán của nền tảng.",
        collocations = listOf("Search algorithm", "Optimize an algorithm", "Algorithm design"),
        relatedWords = listOf(
            RelatedWord("Formula", "Công thức"),
            RelatedWord("Procedure", "Quy trình, thủ tục")
        )
    ),
        Word(
        id = "allow",
        term = "Allow",
        pronunciation = "/əˈlaʊ/",
        shortDefinition = "Cho phép, chấp nhận cho việc gì đó xảy ra.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "To give permission for someone to do something, or to let something happen.",
        vietnameseDiff = "Động từ dùng khi bạn cấp quyền cho ai đó làm việc gì, hoặc thiết lập hệ thống để bật một tính năng nào đó lên.",
        exampleSentence = "The new app settings allow users to change the theme to cool-dark mode.",
        nuanceInfo = "Cấu trúc cực kỳ phổ biến là `Allow someone to do something` (Cho phép ai làm gì). Trong lập trình di động, bạn sẽ gặp từ này liên tục khi viết các câu lệnh xin quyền truy cập hệ thống (`Allow access to photos`).",
        collocations = listOf("Allow access", "Allow users to", "Not allow to"),
        relatedWords = listOf(
            RelatedWord("Permit", "Cho phép (mang tính chính thức, văn bản)"),
            RelatedWord("Let", "Để cho, cho phép (thân mật hằng ngày)")
        )
    ),
    Word(
        id = "amount",
        term = "Amount",
        pronunciation = "/əˈmaʊnt/",
        shortDefinition = "Số lượng, khoản (tiền).",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "A collection or mass of something, especially something that cannot be counted, such as money or time.",
        vietnameseDiff = "Danh từ chỉ một lượng vật chất hoặc một khoản tiền tổng cộng nào đó trong kinh doanh, giao dịch.",
        exampleSentence = "You need to double-check the exact amount of money before transferring it.",
        nuanceInfo = "Lưu ý: 'Amount' thường đi với danh từ KHÔNG đếm được (như `amount of money`, `amount of time`). Nếu là danh từ đếm được số lượng cụ thể, người ta thường dùng 'Number'.",
        collocations = listOf("Total amount", "Large amount", "Amount of money"),
        relatedWords = listOf(
            RelatedWord("Quantity", "Số lượng, khối lượng"),
            RelatedWord("Sum", "Tổng số, khoản tiền")
        )
    ),
    Word(
        id = "analysis",
        term = "Analysis",
        pronunciation = "/əˈnæləsɪs/",
        shortDefinition = "Sự phân tích, bài phân tích sâu.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "The act of studying or examining something in detail, in order to discover more about it.",
        vietnameseDiff = "Danh từ chỉ việc mổ xẻ, xem xét kỹ lưỡng các số liệu quán ăn, thuật toán hoặc các chỉ số video để tìm ra nguyên nhân và giải pháp.",
        exampleSentence = "After a careful analysis of the TikTok data, he improved his video's first 3 seconds.",
        nuanceInfo = "Số nhiều của từ này là 'Analyses' (phát âm là `/əˈnæləsiːz/`). Động từ của nó là 'Analyze' (Phân tích). Đây là kỹ năng cốt lõi của cả dân làm business lẫn dân làm kỹ thuật.",
        collocations = listOf("Data analysis", "Detailed analysis", "Perform an analysis"),
        relatedWords = listOf(
            RelatedWord("Examination", "Sự kiểm tra, nghiên cứu"),
            RelatedWord("Investigation", "Sự điều tra, dò xét")
        )
    ),
    Word(
        id = "app",
        term = "App",
        pronunciation = "/æp/",
        shortDefinition = "Ứng dụng (trên điện thoại hoặc máy tính).",
        cefrLevel = "A1",
        cefrDescription = "Beginner",
        cefrColor = Color(0xFF8BC34A),
        englishDiff = "Short for application; a computer program designed for a specific purpose, especially one downloaded to a mobile device.",
        vietnameseDiff = "Từ viết tắt siêu quốc dân mà ai cũng dùng hằng ngày để chỉ các app công nghệ trên smartphone hoặc máy tính.",
        exampleSentence = "He is designing a simple app to help users memorize vocabulary using smart formulas.",
        nuanceInfo = "Dù là từ viết tắt của 'Application', trong đời sống hiện đại và ngôn ngữ lập trình hằng ngày, từ 'App' được dùng phổ biến hơn cả vì độ ngắn gọn, súc tích (`Mobile app`, `Web app`).",
        collocations = listOf("Mobile app", "Download an app", "App development"),
        relatedWords = listOf(
            RelatedWord("Application", "Ứng dụng (từ đầy đủ, trang trọng)"),
            RelatedWord("Software", "Phần mềm")
        )
    ),
    Word(
        id = "appearance",
        term = "Appearance",
        pronunciation = "/əˈpɪərəns/",
        shortDefinition = "Diện mạo, ngoại hình; sự xuất hiện.",
        cefrLevel = "B1",
        cefrDescription = "Intermediate",
        cefrColor = Color(0xFF03A9F4),
        englishDiff = "The way that someone or something looks on the outside; the act of coming into sight.",
        vietnameseDiff = "Danh từ chỉ vẻ bề ngoài, phong cách ăn mặc thời trang của một người; hoặc sự xuất hiện của một nhân vật, một tính năng mới.",
        exampleSentence = "The soft boy style completely changed his personal appearance in the videos.",
        nuanceInfo = "Trong làm nội dung short-form, 'appearance' (ngoại hình, thần thái, ánh sáng bối cảnh) quyết định rất lớn đến việc giữ chân người xem ở lại video trong những giây đầu tiên.",
        collocations = listOf("Personal appearance", "Physical appearance", "Make an appearance"),
        relatedWords = listOf(
            RelatedWord("Look", "Vẻ bề ngoài, cái nhìn"),
            RelatedWord("Look", "Diện mạo, phong thái")
        )
    ),
    Word(
        id = "approval",
        term = "Approval",
        pronunciation = "/əˈpruːvl/",
        shortDefinition = "Sự phê duyệt, sự chấp thuận chính thức.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "The feeling of having a positive opinion of something; official permission or agreement.",
        vietnameseDiff = "Danh từ chỉ sự đồng ý bằng văn bản của cơ quan chức năng (như phê duyệt sổ đỏ/sổ hồng), hoặc nút bấm chấp thuận duyệt bài của admin.",
        exampleSentence = "We are waiting for the official approval from the local land management office.",
        nuanceInfo = "Động từ của nó là 'Approve' (Phê duyệt). Từ này mang sắc thái chính thức, có thẩm quyền và đúng quy trình pháp lý hoặc hệ thống.",
        collocations = listOf("Official approval", "Get approval", "Approval process"),
        relatedWords = listOf(
            RelatedWord("Permission", "Sự cho phép"),
            RelatedWord("Consent", "Sự đồng thuận")
        )
    ),
        Word(
        id = "area",
        term = "Area",
        pronunciation = "/ˈeəriə/",
        shortDefinition = "Diện tích; khu vực, vùng.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "The size of a flat surface, measured in square units; a particular part of a place, piece of land, or country.",
        vietnameseDiff = "Danh từ dùng để đo kích thước bề mặt của một mảnh đất (diện tích sàn, diện tích nông nghiệp) hoặc chỉ một khu vực địa lý cụ thể.",
        exampleSentence = "The total area of the divided land is 215 square meters, including a small garden.",
        nuanceInfo = "Trong toán học và bất động sản, 'area' là diện tích ($S = \text{width} \times \text{length}$). Trong đời sống và lập trình, nó còn dùng để chỉ một vùng không gian hiển thị (`Clickable area` - vùng có thể bấm được trên màn hình app).",
        collocations = listOf("Total area", "Rural area", "Dining area"),
        relatedWords = listOf(
            RelatedWord("Region", "Vùng, miền (quy mô lớn)"),
            RelatedWord("Zone", "Khu vực được phân loại, quy hoạch")
        )
    ),
    Word(
        id = "arrange",
        term = "Arrange",
        pronunciation = "/əˈreɪndʒ/",
        shortDefinition = "Sắp xếp, thu xếp, lên lịch hẹn.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "To plan or organize something in advance; to put things in a neat or particular order.",
        vietnameseDiff = "Động từ chỉ hành động lên lịch một cuộc hẹn gặp mặt đối tác, thu xếp thời gian ký giấy tờ, hoặc bài trí bàn ghế trong quán ăn cho gọn gàng.",
        exampleSentence = "He needs to arrange a meeting with his family to sign the official land papers.",
        nuanceInfo = "Danh từ của nó là 'Arrangement' (sự sắp xếp). Từ này nhấn mạnh vào tính chủ động tổ chức và chuẩn bị trước để mọi việc diễn ra suôn sẻ, không bị chồng chéo lịch trình.",
        collocations = listOf("Arrange a meeting", "Arrange a schedule", "Arrange in order"),
        relatedWords = listOf(
            RelatedWord("Organize", "Tổ chức, thiết lập"),
            RelatedWord("Schedule", "Lên lịch trình")
        )
    ),
    Word(
        id = "asset",
        term = "Asset",
        pronunciation = "/ˈæset/",
        shortDefinition = "Tài sản, của cải có giá trị.",
        cefrLevel = "B2",
        cefrDescription = "Upper-Intermediate",
        cefrColor = Color(0xFFFFC107),
        englishDiff = "A useful or valuable quality, person, or thing; something valuable belonging to a person or organization that can be used for the payment of debts.",
        vietnameseDiff = "Danh từ chỉ bất kỳ thứ gì có giá trị thuộc sở hữu của bạn (như nhà đất, dòng tiền, thương hiệu cá nhân, hoặc thậm chí là mã nguồn của một cái app).",
        exampleSentence = "Real estate is a powerful asset that can provide long-term financial security.",
        nuanceInfo = "Trong kinh doanh, 'assets' là tài sản (đối lập với 'liabilities' - nợ phải trả). Ở nghĩa bóng, một người có tài năng bẩm sinh hay kỹ năng giỏi cũng được coi là một 'valuable asset' (tài sản vô giá) của một tổ chức.",
        collocations = listOf("Valuable asset", "Financial asset", "Personal assets"),
        relatedWords = listOf(
            RelatedWord("Property", "Bất động sản, quyền sở hữu"),
            RelatedWord("Wealth", "Sự giàu có, của cải")
        )
    ),
    Word(
        id = "assistant",
        term = "Assistant",
        pronunciation = "/əˈsɪstənt/",
        shortDefinition = "Trợ lý, người phụ tá, người giúp việc.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "A person who helps someone else to do a job or a task.",
        vietnameseDiff = "Danh từ chỉ người hỗ trợ bạn trong công việc (như nhân viên phụ quán, trợ lý chỉnh sửa video TikTok, hoặc một bot AI giúp bạn học từ vựng).",
        exampleSentence = "Having a reliable kitchen assistant helps the restaurant run smoothly during rush hours.",
        nuanceInfo = "Động từ gốc là 'Assist' (hỗ trợ, giúp đỡ). Trong thời đại công nghệ, cụm từ 'Virtual Assistant' (Trợ lý ảo) đang cực kỳ phổ biến để chỉ các phần mềm thông minh giúp tự động hóa công việc hằng ngày.",
        collocations = listOf("Shop assistant", "Personal assistant", "Virtual assistant"),
        relatedWords = listOf(
            RelatedWord("Helper", "Người giúp đỡ, phụ tá"),
            RelatedWord("Aide", "Cố vấn, trợ lý thân cận")
        )
    ),
    Word(
        id = "audience",
        term = "Audience",
        pronunciation = "/ˈɔːdiəns/",
        shortDefinition = "Khán giả, người xem, nhóm công chúng mục tiêu.",
        cefrLevel = "B1",
        cefrDescription = "Intermediate",
        cefrColor = Color(0xFF03A9F4),
        englishDiff = "The group of people who gather together to watch to or listen to something; the people who watch a video or use a specific software product.",
        vietnameseDiff = "Danh từ chỉ nhóm người trực tiếp xem video short-form của bạn, hoặc tập khách hàng mục tiêu mà ứng dụng di động của bạn đang hướng tới.",
        exampleSentence = "To create a viral video, you must understand what your target audience really wants.",
        nuanceInfo = "Dân làm nội dung và marketing bắt buộc phải thuộc lòng cụm 'Target Audience' (Khán giả mục tiêu). Việc định hình rõ khán giả của mình là ai (độ tuổi, gu thẩm mỹ, sở thích) sẽ quyết định sự thành bại của kênh.",
        collocations = listOf("Target audience", "Large audience", "Engage the audience"),
        relatedWords = listOf(
            RelatedWord("Viewer", "Người xem (video, tivi)"),
            RelatedWord("Follower", "Người theo dõi (trên mạng xã hội)")
        )
    ),
    Word(
        id = "automatic",
        term = "Automatic",
        pronunciation = "/ˌɔːtəˈmætɪk/",
        shortDefinition = "Tự động, máy móc tự vận hành.",
        cefrLevel = "B1",
        cefrDescription = "Intermediate",
        cefrColor = Color(0xFF03A9F4),
        englishDiff = "An automatic machine or process starts or operates by itself, without human control or power.",
        vietnameseDiff = "Tính từ chỉ một hệ thống, thiết bị hoặc quy trình phần mềm tự chạy mà không cần con người phải can thiệp thủ công bằng tay.",
        exampleSentence = "The app has an automatic backup feature to protect your daily study progress.",
        nuanceInfo = "Trạng từ của nó là 'Automatically' (Một cách tự động) - một từ khóa xuất hiện liên tục trong lập trình. Đưa một quy trình từ 'manual' (thủ công) sang 'automatic' chính là chìa khóa để giải phóng sức lao động.",
        collocations = listOf("Automatic system", "Automatic reply", "Automatically update"),
        relatedWords = listOf(
            RelatedWord("Automated", "Đã được tự động hóa"),
            RelatedWord("Mechanical", "Thuộc về cơ khí, máy móc")
        )
    ),
        Word(
        id = "available",
        term = "Available",
        pronunciation = "/əˈveɪləbl/",
        shortDefinition = "Có sẵn, sẵn sàng để dùng/mua; trống lịch.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "Able to be bought, used, or reached; free to do something or meet someone.",
        vietnameseDiff = "Tính từ chỉ một món ăn vẫn còn để bán, một tính năng đã được bật trên app, hoặc một người đang rảnh rỗi để hẹn gặp, thảo luận công việc.",
        exampleSentence = "The special Bún Chả set is only available during lunch hours.",
        nuanceInfo = "Trong lập trình, từ này cực kỳ phổ biến để kiểm tra trạng thái hệ thống (`Is data available?`). Trong đời sống, khi hỏi 'Are you available?', bạn đang hỏi đối phương có đang rảnh để nói chuyện hoặc đi chơi hay không.",
        collocations = listOf("Available for download", "Readily available", "Not available"),
        relatedWords = listOf(
            RelatedWord("Accessible", "Có thể tiếp cận, truy cập"),
            RelatedWord("Free", "Rảnh rỗi, tự do")
        )
    ),
    Word(
        id = "average",
        term = "Average",
        pronunciation = "/ˈævərɪdʒ/",
        shortDefinition = "Trung bình, mức trung bình.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "A standard or level that is considered to be typical or usual; calculated by adding amounts together and dividing by the number of amounts.",
        vietnameseDiff = "Danh từ hoặc tính từ chỉ con số trung bình cộng (như doanh thu trung bình ngày, lượt xem trung bình của video) hoặc chỉ một thứ ở mức bình thường, không quá nổi bật.",
        exampleSentence = "The average watch time of your TikTok short video determines if it goes viral.",
        nuanceInfo = "Trong toán học và lập trình, 'Average' chính là giá trị trung bình (Mean). Trong đời sống, nếu nói ai đó có 'average look', nghĩa là ngoại hình của họ ở mức phổ thông, vừa vặn, không quá xuất sắc nhưng cũng không tệ.",
        collocations = listOf("Above average", "On average", "Average price"),
        relatedWords = listOf(
            RelatedWord("Medium", "Mức trung bình, vừa"),
            RelatedWord("Standard", "Tiêu chuẩn, thông thường")
        )
    ),
    Word(
        id = "avoid",
        term = "Avoid",
        pronunciation = "/əˈvɔɪd/",
        shortDefinition = "Tránh, né tránh (rủi ro, lỗi, người nào đó).",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "To stay away from a person, place, or situation; to prevent something bad from happening.",
        vietnameseDiff = "Động từ chỉ hành động chủ động né xa một rắc rối pháp lý, né lỗi trong code, hoặc tránh mặt một người mà bạn không muốn gặp.",
        exampleSentence = "You should double-check the contract clauses to avoid unnecessary legal arguments later.",
        nuanceInfo = "Cấu trúc bắt buộc cần nhớ: `Avoid + V-ing` (Tránh làm việc gì đó). Từ này thể hiện tư duy phòng bệnh hơn chữa bệnh, giúp bạn quản lý rủi ro tốt hơn trong cả kinh doanh lẫn cuộc sống.",
        collocations = listOf("Avoid mistakes", "Avoid traffic", "Avoid conflict"),
        relatedWords = listOf(
            RelatedWord("Evade", "Lẩn tránh, né tránh (trách nhiệm, nghĩa vụ)"),
            RelatedWord("Dodge", "Né sang một bên (đòn đánh, câu hỏi)")
        )
    ),
    Word(
        id = "background",
        term = "Background",
        pronunciation = "/ˈbækɡraʊnd/",
        shortDefinition = "Nền, bối cảnh phía sau; lý lịch, nền tảng học vấn.",
        cefrLevel = "A2",
        cefrDescription = "Elementary",
        cefrColor = Color(0xFF4CAF50),
        englishDiff = "The things that can be seen behind the main things in a picture; a person's education, family history, and experience.",
        vietnameseDiff = "Danh từ chỉ phần phông nền phía sau khi quay video, chụp ảnh; hoặc dùng để nói về nền tảng kiến thức, kinh nghiệm sẵn có của một người.",
        exampleSentence = "Clean up your bedroom background before filming a fashion lookbook video.",
        nuanceInfo = "Trong thiết kế giao diện ứng dụng, `Background Color` là màu nền. Còn khi nói về con người, một người có 'strong tech background' nghĩa là họ đã có nền tảng học code hoặc làm công nghệ rất vững chắc từ trước.",
        collocations = listOf("Background music", "Family background", "In the background"),
        relatedWords = listOf(
            RelatedWord("Context", "Bối cảnh, ngữ cảnh"),
            RelatedWord("Experience", "Kinh nghiệm, trải nghiệm")
        )
    ),
    Word(
        id = "backup",
        term = "Backup",
        pronunciation = "/ˈbækʌp/",
        shortDefinition = "Bản sao lưu dự phòng; sự hỗ trợ.",
        cefrLevel = "B1",
        cefrDescription = "Intermediate",
        cefrColor = Color(0xFF03A9F4),
        englishDiff = "A copy of computer data taken and stored elsewhere so that it may be used to restore the original after a data loss event; support or help.",
        vietnameseDiff = "Danh từ hoặc động từ chỉ việc nhân bản dữ liệu để cất đi, phòng trường hợp máy tính bị hỏng hoặc mất file thì vẫn khôi phục lại được; hoặc chỉ phương án B dự phòng.",
        exampleSentence = "Always create a backup of your database before optimizing the search algorithm.",
        nuanceInfo = "Từ khóa sống còn của dân lập trình (`Data backup`). Ở nghĩa đời sống, có một 'backup plan' (kế hoạch dự phòng) giúp bạn luôn giữ thế chủ động khi dòng tiền hoặc công việc kinh doanh gặp biến cố đột xuất.",
        collocations = listOf("Backup file", "Backup plan", "Automatic backup"),
        relatedWords = listOf(
            RelatedWord("Copy", "Bản sao"),
            RelatedWord("Support", "Sự hỗ trợ, nâng đỡ")
        )
    ),
    Word(
        id = "balance",
        term = "Balance",
        pronunciation = "/ˈbæləns/",
        shortDefinition = "Sự cân bằng; số dư tài khoản.",
        cefrLevel = "B1",
        cefrDescription = "Intermediate",
        cefrColor = Color(0xFF03A9F4),
        englishDiff = "A state where things are of equal weight or force; the amount of money you have in a bank account.",
        vietnameseDiff = "Danh từ chỉ trạng thái cân bằng giữa các yếu tố trong đời sống; hoặc số tiền thực tế còn lại trong tài khoản ngân hàng, ví điện tử của bạn.",
        exampleSentence = "It is important to keep a balance between managing the physical shop and building the mobile app.",
        nuanceInfo = "Vừa là danh từ vừa là động từ. Cụm từ 'Work-life balance' (Cân bằng công việc và cuộc sống) là mục tiêu của rất nhiều người. Trong app tài chính hoặc ngân hàng, bạn sẽ luôn thấy mục `Account Balance` (Số dư tài khoản).",
        collocations = listOf("Keep your balance", "Account balance", "Perfect balance"),
        relatedWords = listOf(
            RelatedWord("Equilibrium", "Trạng thái cân bằng (vật lý/hóa học)"),
            RelatedWord("Remainder", "Số dư, phần còn lại")
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
