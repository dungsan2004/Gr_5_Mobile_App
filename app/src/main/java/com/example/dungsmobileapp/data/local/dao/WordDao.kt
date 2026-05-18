package com.example.dungsmobileapp.data.local.dao

import androidx.room.*
import com.example.dungsmobileapp.data.local.entities.WordEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {
    @Query("SELECT * FROM words")
    fun getAllWords(): Flow<List<WordEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWord(word: WordEntity)

    @Delete
    suspend fun deleteWord(word: WordEntity)
}