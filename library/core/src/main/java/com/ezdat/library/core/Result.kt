package com.ezdat.library.core

sealed class Result<out T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Failure<Nothing>(val throwable: Throwable) : Result<Nothing>()
}