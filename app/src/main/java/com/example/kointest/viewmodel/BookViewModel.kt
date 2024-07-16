package com.example.kointest.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kointest.model.Book
import com.example.kointest.repository.BookRepository

//DI is occurring when an instance of BookRepository is given to the BookViewModel
//constructor
class BookViewModel(private val repository: BookRepository) : ViewModel() {
    private val _books = MutableLiveData<List<Book>>()
    val books: LiveData<List<Book>> = _books

    init {
        loadBooks()
    }

    private fun loadBooks() {
        _books.value = repository.getBooks()
    }
}
