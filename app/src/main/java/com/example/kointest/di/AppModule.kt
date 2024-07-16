// AppModule.kt
package com.example.kointest.di

import com.example.kointest.repository.BookRepository
import com.example.kointest.repository.BookRepositoryImpl
import com.example.kointest.viewmodel.BookViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<BookRepository> { BookRepositoryImpl() }
    viewModel { BookViewModel(get()) }
}
