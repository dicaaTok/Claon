package com.dica.claon.utils

sealed class Failure {
    object ServerError : Failure()
    data class CustomError(val message: String) : Failure()
}