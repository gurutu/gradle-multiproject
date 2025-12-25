package com.example

class ModuleOne {
    constructor(){
        println("Hello world!${Utils().enabled()}")
        hello()
    }
    fun hello() {
        println("Hello world!${Utils().multimapExample()}")
    }

}