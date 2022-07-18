package com.alptazecicek.kotlin_oop

class User {
    //property
    var name : String? = null
    var age : Int? = null

    //constructor vs init

    constructor(nameInput:String, ageInput:Int) {
        this.name = nameInput
        this.age = ageInput
        println("object created")

    }

    init {
        println("Initiliazed")
    }



}