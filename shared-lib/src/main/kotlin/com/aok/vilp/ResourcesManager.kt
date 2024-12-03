package com.aok.vilp.com.aok.vilp

fun getResourceAsText(filename: String): String? =
    object {}.javaClass.getResource("/$filename")?.readText()