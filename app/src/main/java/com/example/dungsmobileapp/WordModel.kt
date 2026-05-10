package com.example.dungsmobileapp.model

import androidx.compose.ui.graphics.Color

data class Word(
    val id: String,
    val term: String,
    val pronunciation: String,
    val shortDefinition: String,
    val cefrLevel: String,
    val cefrDescription: String,
    val cefrColor: Color,

    val englishDiff: String,
    val vietnameseDiff: String,
    val exampleSentence: String,

    val nuanceInfo: String,
    val collocations: List<String>,

    val relatedWords: List<RelatedWord>
)

data class RelatedWord(
    val word: String,
    val meaning: String
)
