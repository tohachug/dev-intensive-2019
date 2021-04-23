package ru.skillbranch.devintensive.extensions

fun String.truncate(value: Int = 16): String{
    return if(length > value){
        substring(0, value).dropLastWhile{it == ' '}.plus("...")
    } else{
        this
    }
}