package com.example

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap

class Utils {
    fun enabled() = true
    fun multimapExample() {
        val multimap: Multimap<String, String> = ArrayListMultimap.create()
        multimap.put("Fruits", "Apple")
        multimap.put("Fruits", "Banana")
        multimap.put("Vegetables", "Carrot")

        println(multimap.get("Fruits")) // Output: [Apple, Banana]
    }
}