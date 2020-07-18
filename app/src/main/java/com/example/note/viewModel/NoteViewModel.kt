package com.example.note.viewModel

import android.app.Application
import androidx.annotation.NonNull
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.note.data.entity.Note
import com.example.note.data.repository.NoteRepository


class NoteViewModel(@NonNull application: Application?) :
   ViewModel() {
    private val repository: NoteRepository = NoteRepository(application)
    private val allNotes: LiveData<List<Note?>?>?
    fun insert(note: Note?) {
        repository.insert(note)
    }

    fun update(note: Note?) {
        repository.update(note)
    }

    fun delete(note: Note?) {
        repository.delete(note)
    }

    fun deleteAllNotes() {
        repository.deleteAllNotes()
    }

    fun getAllNotes(): LiveData<List<Note?>?>? {
        return allNotes
    }

    init {
        allNotes = repository.getAllNotes()
    }
}