package com.example.note.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.note.data.entity.Note


@Dao
interface NoteDao {
    @Insert
    fun addNote(note : Note)

    @Update
    fun updateNote(note : Note)

    @Delete
    fun deleteNote(note :Note)

    @Query("delete from NOTE_TABLE")//n'a pas prédéfiné
    fun deleteAllNotes()

    @Query("SELECT * FROM note_table ORDER BY date ,priority DESC")
    fun getAllNotes(): LiveData<List<Note?>?>?//so we can observe the changes
}