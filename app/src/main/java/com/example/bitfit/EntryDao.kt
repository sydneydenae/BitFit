package com.example.bitfit

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface EntryDao {
    @Query("SELECT * FROM entry_table")
    fun getAll(): Flow<List<EntryEntity>>

    @Insert
    fun insertAll(articles: List<EntryEntity>)

    @Query("DELETE FROM entry_table")
    fun deleteAll()
}