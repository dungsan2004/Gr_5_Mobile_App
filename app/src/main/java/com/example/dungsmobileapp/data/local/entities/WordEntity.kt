package com.example.dungsmobileapp.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words")
data class WordEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val term: String,
    val definition: String,
    val isBookmarked: Boolean = false

)