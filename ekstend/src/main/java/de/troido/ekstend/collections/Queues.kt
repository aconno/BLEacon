package de.troido.ekstend.collections

import java.util.*

@Suppress("NOTHING_TO_INLINE", "SENSELESS_COMPARISON")
inline fun <T : Any> Queue<T>.sequence(): Sequence<T> =
        generateSequence(this::poll).takeWhile { it != null }

inline fun <T : Any> Queue<T>.forEachPolled(f: (T) -> Unit) =
        sequence().forEach(f)
