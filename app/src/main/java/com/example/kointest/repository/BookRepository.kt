package com.example.kointest.repository

import com.example.kointest.model.Book
//creating of interface to access the books data.
interface BookRepository {
    fun getBooks(): List<Book>
}
// This is the implementation of the interface
class BookRepositoryImpl : BookRepository {
    override fun getBooks(): List<Book> {
        return listOf(
            Book(1, "1984", "George Orwell"),
            Book(2, "Brave New World", "Aldous Huxley"),
            Book(3, "Fahrenheit 451", "Ray Bradbury")
        )
    }
}