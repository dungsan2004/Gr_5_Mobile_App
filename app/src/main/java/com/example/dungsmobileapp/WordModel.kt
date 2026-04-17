package com.example.dungsmobileapp.model // Nên tạo package model riêng

import androidx.compose.ui.graphics.Color

// Định nghĩa cấu trúc của 1 từ
data class Word(
    val id: String,
    val term: String,               // Vd: Armageddon
    val pronunciation: String,      // Vd: /ˌɑːrməˈɡedn/
    val shortDefinition: String,    // Nghĩa ngắn hiển thị ở Home
    val cefrLevel: String,          // Vd: C2
    val cefrDescription: String,    // Vd: Proficiency
    val cefrColor: Color,           // Màu sắc của level

    // Chi tiết (Tab Nghĩa)
    val englishDiff: String,
    val vietnameseDiff: String,
    val exampleSentence: String,

    // Chi tiết (Tab Sắc thái)
    val nuanceInfo: String,
    val collocations: List<String>,

    // Chi tiết (Tab Họ từ)
    val relatedWords: List<RelatedWord>
)

data class RelatedWord(
    val word: String,
    val meaning: String
)
