// const val - constants,  compile time, top level - outside the function, can be accesed from anywhere
const val URL_LINK = "google.com"

fun main() {
    
    // # Vars
    // ## declaring
    // Declaring variables with explicit type
    val age: Int = 25
    var name: String = "John"
    // Declaring variables with type inference
    var count = 10
    // Declaring variables with nullable types
    var nullableNumber: Int? = 42
    // Declaring variables with explicit type and initializer
    var message: String = "Hello, World!"
    // Declaring variables without initializer (must have explicit type)
    var quantity: Int
    println("$age $name $count $nullableNumber $message")

    // ## Static Language
    // you cannot change the type of the variable, kotlin is a static language, first has to be string
    var ageVal = 25
    println(ageVal)
    // ageVal = "John" // error

    // ## var  vs val
    // var is mutable, val is immutable
    val nameVal = "John"
    println(nameVal)
    // name = "Jack" // error

    // ## Naming convention
    // camelCase
    // var myName = "John"

    // # const val
    println(URL_LINK) // google.com

}