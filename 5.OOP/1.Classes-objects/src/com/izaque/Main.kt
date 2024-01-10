package com.izaque

fun main() {
    // creating instances of the Car class
    val myCar = Car()
    val  yourCar = Car()
    
    // setting the model property of each instance
    myCar.model = "BMW"
    yourCar.model = "Audi"

    // calling their methods
    myCar.start() // "Starting the BMW"
    myCar.drive(200) // "Driving at a speed to 200"

    yourCar.start() // "Starting the Audi"
    yourCar.drive(150) // "Driving at a speed to 150"

    val alist: ArrayList<String> = ArrayList<String>()
    alist.add("Hello")
}