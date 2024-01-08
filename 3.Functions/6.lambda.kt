// # Lambdas
// A lambda is an anonymous function (has no name)

fun main() {
    // # lambda function example
    val  myLambda = {name: String -> println("Hello $name")}
    myLambda("Kotlin") // Hello Kotlin

    // # calling HOF example
    sayHello(arrayListOf("Kotlin", "Java", "Python"), myLambda) // Hello Kotlin, Hello Java, Hello Python
    // ## the convention is create the lambda inside the function call
    sayHello(arrayListOf("Kotlin", "Java", "Python"), {name: String -> println("Hello $name")}) // Hello Kotlin, Hello Java, Hello Python
    //  other syntax
    sayHello(arrayListOf("Kotlin", "Java", "Python")) {name: String -> println("Hello $name")} // Hello Kotlin, Hello Java, Hello Python

    // # Common HOFs
    // ## forEach
    val names = arrayListOf("Kotlin", "Java", "Python")
    names.forEach { println("Hello $it")} // Hello Kotlin, Hello Java, Hello Python
    // ## filter
    names.filter { it.startsWith("K") }.forEach { println("Hello $it")} // Hello Kotlin
    // ## map
    val sizes = names.map { it.length }
    println(sizes) // [6, 4, 6]
    // ## sortedBy
    val sortedNames = names.sortedBy { it.length }
    println(sortedNames) // [Java, Kotlin, Python]
    // ## maxBy
    val max = names.maxBy { it.length }
    println(max) // Kotlin
    // ## minBy
    val min = names.minBy { it.length }
    println(min) // Java
    
}

// # Higher-Order Functions
// A higher-order function is a function that takes another function as parameter or returns a function

// ## Function that takes another function as parameter
fun sayHello(names: ArrayList<String>, say: (String) -> Unit) {
    for (name in names) {
        say(name)
    }
}

