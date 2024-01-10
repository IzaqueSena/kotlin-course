package com.izaque

// class called Car
class Car {
    // properties
    var model: String? = null // a property called model of type String?
    var topSpeed = 100 // a property called topSpeed of type Int

    // methods
    fun start() { 
        println("Starting the $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed to $speed")
    }
}