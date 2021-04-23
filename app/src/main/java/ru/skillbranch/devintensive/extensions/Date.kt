package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = SECOND * 60
const val HOUR = MINUTE * 60
const val DAY = HOUR * 24

fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy"): String{
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value: Int, timeUnits: TimeUnits = TimeUnits.SECOND): Date {
    var time = this.time

    time += when (timeUnits){
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }
    this.time = time
    return this
}

fun Date.humanizeDiff(date: Date = Date()): String{
    var humanDate: String
    var time = this.time
    var timeCompare = date.time
    val countSecond = (timeCompare-time) * SECOND
    when{
        countSecond in 0..1 -> humanDate = "только что"
        countSecond in 2..45 -> humanDate = "несколько секунд назад"
        countSecond in 46..75 -> humanDate = "минуту назад"
        countSecond in 76..2700 -> humanDate = "N минут назад"
        countSecond in 2701..4500 -> humanDate = "час назад"
        countSecond in 4501..79200 -> humanDate = "N часов назад"
        countSecond in 79201..93600 -> humanDate = "день назад"
        countSecond in 93601..31104000 -> humanDate = "N дней назад"
        countSecond>31104000 -> humanDate = "более года назад"
        else -> humanDate = "сравнение с будущим периодом"
    }
    return humanDate
}

enum class TimeUnits{
    SECOND,
    MINUTE,
    HOUR,
    DAY
}

