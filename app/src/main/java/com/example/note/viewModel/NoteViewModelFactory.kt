package com.example.note.viewModel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.note.data.repository.NoteRepository

/**
 *  This class is for passing  the NoteRepository to the Main Activity
 *  when we create the instance of the VideoViewModel
 */

@Suppress("UNCHECKED_CAST")
open class NoteViewModelFactory(
    private val application: Application
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteViewModel(
            application
        ) as T
    }

}