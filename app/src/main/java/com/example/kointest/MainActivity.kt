// MainActivity.kt
package com.example.kointest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.kointest.repository.BookRepositoryImpl// this line is nolonger needed after DI is implemented using Koin
import com.example.kointest.ui.BookListScreen
import com.example.kointest.viewmodel.BookViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
class MainActivity : ComponentActivity() {
    // Koin will provide the ViewModel instance
    private val bookViewModel: BookViewModel by viewModel()


//    //BookRepositoryImpl() is a dependency that is needed by this class to access the books data
//    // there its instance is created manually here.
//    private val bookRepository = BookRepositoryImpl()
//
//    //BookViewModel is a dependency that is needed by this class to access the books data, and this is its instance is created manually here.
//    private val bookViewModel by lazy { BookViewModel(bookRepository) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BookListScreen(viewModel = bookViewModel, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
