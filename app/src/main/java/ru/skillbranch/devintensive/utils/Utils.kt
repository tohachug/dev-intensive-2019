package ru.skillbranch.devintensive.utils

import android.icu.text.Transliterator
import android.os.Build
import androidx.annotation.RequiresApi

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?>{

        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return Pair(firstName, lastName)
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    fun transliteration(divider: String? = ""): String?{
        val cirilicToLatin: String = "Cyrillic-Latin"
        val transliterator = Transliterator.getInstance(cirilicToLatin)
        val result: String = transliterator.transliterate(divider)
        return result
    }
}