fun main() {
    sayHello("Kotlin", "Java", "Python") // Hello Kotlin, Hello Java, Hello Python

}

// # Vararg
// A function can have a variable number of arguments
// The vararg keyword allows to pass a variable number of arguments of a specific type to a function
// The vararg parameter must be the last parameter

fun sayHello(vararg names: String) {
    for (name in names) {
        println("Hello $name")
    }
}