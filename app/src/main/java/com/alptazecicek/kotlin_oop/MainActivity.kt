 package com.alptazecicek.kotlin_oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Constructor
        var myUser = User("James", 25)
        //myUser.age = 30
        //myUser.name = "Kirk"
        println(myUser.age.toString())
        println(myUser.name)

        //Encapsulation
        var myMusician = Musicians("Kirk", "Guitar", 50)
        //myMusician.name = "Josh"
        println(myMusician.name)

        //Inheritance
        var lars = SuperMusician("Lars", "Drums", 65)
        println(lars.name)
        println(lars.returnBandName("xyz"))
        lars.sing()

    }
}