package de.troido.ekstend.collections

import java.util.*

@Suppress("NOTHING_TO_INLINE")
inline fun <T> Comparator<T>.reverseOrder(): Comparator<T> =
        Collections.reverseOrder(this)
