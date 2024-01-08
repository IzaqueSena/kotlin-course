// # FUNCTIONS

fun main() {\
    // calling a function
    helloWorld() // Hello World
    println(helloWorld2()) // Hello World
    helloWorld3("Kotlin") // Hello Kotlin
    sayHelloToPeople(listOf("Kotlin", "Java", "Python")) // Hello Kotlin, Hello Java, Hello Python
    double(2) // Double is 4
    calculateCircleArea(2.0) // 12.566370614359172
}

// # Creating a function

// fun <function_name> (<parameters>) : <return_type> {
//     <function_body>
// }

// ## function with no return type and without parameters
fun helloWorld() {
    println("Hello World")
}

// ## function with return type and without parameters
fun helloWorld2() : String {
    return "Hello World"
}

// ## function with no return type and with parameters
// ### one parameter
fun helloWorld3(name: String) {
    println("Hello $name")
}

// ### collection parameter
fun sayHelloToPeople(people: Collection<String>) {
    for (person in people) {
        println("Hello $person")
    } 
}

// ### default parameter
fun double(number: Int, message: String = "Double is") {
    println("$message ${number * 2}")
}

// ## function with return type and with parameters
fun calculateCircleArea(radius: Double) : Double {
    return Math.PI * radius * radius
}