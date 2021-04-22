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
    fun transliteration(divider: String = ""): String{
        var latinString: String = ""
//        val cirilicToLatin: String = "Cyrillic-Latin"
//        val transliterator = Transliterator.getInstance(cirilicToLatin)
//        val result: String = transliterator.transliterate(divider)
        for(it in divider){
            when(it.toString()){
                "а" -> latinString + "a"
                "б" -> latinString + "b"
                "в" -> latinString + "v"
                "г" -> latinString + "g"
                "д" -> latinString + "d"
                "е" -> latinString + "e"
                "ё" -> latinString + "e"
                "ж" -> latinString + "zh"
                "з" -> latinString + "z"
                "и" -> latinString + "i"
                "й" -> latinString + "i"
                "к" -> latinString + "k"
                "л" -> latinString + "l"
                "м" -> latinString + "m"
                "н" -> latinString + "n"
                "о" -> latinString + "o"
                "п" -> latinString + "p"
                "р" -> latinString + "r"
                "с" -> latinString + "s"
                "т" -> latinString + "t"
                "у" -> latinString + "u"
                "ф" -> latinString + "f"
                "х" -> latinString + "h"
                "ц" -> latinString + "c"
                "ч" -> latinString + "ch"
                "ш" -> latinString + "sh"
                "щ" -> latinString + "sh'"
                "ъ" -> latinString + ""
                "ы" -> latinString + "i"
                "ь" -> latinString + ""
                "э" -> latinString + "e"
                "ю" -> latinString + "yu"
                "я" -> latinString + "ya"
                "А" -> latinString + "A"
                "Б" -> latinString + "B"
                "В" -> latinString + "V"
                "Г" -> latinString + "G"
                "Д" -> latinString + "D"
                "Е" -> latinString + "E"
                "Ё" -> latinString + "E"
                "Ж" -> latinString + "ZH"
                "З" -> latinString + "Z"
                "И" -> latinString + "I"
                "Й" -> latinString + "I"
                "К" -> latinString + "K"
                "Л" -> latinString + "L"
                "М" -> latinString + "M"
                "Н" -> latinString + "N"
                "О" -> latinString + "O"
                "П" -> latinString + "P"
                "Р" -> latinString + "R"
                "С" -> latinString + "S"
                "Т" -> latinString + "T"
                "У" -> latinString + "U"
                "Ф" -> latinString + "F"
                "Х" -> latinString + "H"
                "Ц" -> latinString + "C"
                "Ч" -> latinString + "CH"
                "Ш" -> latinString + "SH"
                "Щ" -> latinString + "SH'"
                "Ъ" -> latinString + ""
                "Ы" -> latinString + "I"
                "Ь" -> latinString + ""
                "Э" -> latinString + "E"
                "Ю" -> latinString + "YU"
                "Я" -> latinString + "YA"
                else -> latinString + it
            }
        }
        return latinString
    }
}