package com.example

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    ModuleOne()
    val multimap: Multimap<String, String> = ArrayListMultimap.create()
    multimap.put("Fruits", "Apple")
    multimap.put("Fruits", "Banana")
    multimap.put("Vegetables", "Carrot")

    println(multimap.get("Fruits"))
}