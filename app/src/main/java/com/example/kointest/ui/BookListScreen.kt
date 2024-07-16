package com.example.kointest.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kointest.model.Book
import com.example.kointest.viewmodel.BookViewModel

//Dependency injection does not happen here directly it uses BookViewModel, which has  its dependencies already injected
@Composable
fun BookListScreen(viewModel: BookViewModel = viewModel(), modifier: Modifier = Modifier) {
    val books by viewModel.books.observeAsState(emptyList())

    LazyColumn(modifier = modifier) {
        items(books) { book ->
            BookItem(book)
        }
    }
}

@Composable
fun BookItem(book: Book) {
    Text(text = "${book.title} by ${book.author}", style = MaterialTheme.typography.titleLarge)
}
