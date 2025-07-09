package com.dica.claon.utils

sealed class Either<out L, out R> {
    data class Left<out L>(val a: L) : Either<L, Nothing>()
    data class Right<out R>(val b: R) : Either<Nothing, R>()

    fun <T> fold(left: (L) -> T, right: (R) -> T): T =
        when (this) {
            is Left -> left(a)
            is Right -> right(b)
        }
}