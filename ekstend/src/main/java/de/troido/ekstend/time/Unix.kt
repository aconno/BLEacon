package de.troido.ekstend.time

import java.util.*

val Date.unixTime: Int
    get() = (time / 1000L).toInt()

fun unixTime(): Int =
        (System.currentTimeMillis() / 1000L).toInt()
