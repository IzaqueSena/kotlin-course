fun main() {
    example() // I have 5 flowers
    // println("$flowers") // ERROR
}

// # Scope
// Scope is the visibility of a variable
// A variable defined inside a function only exists in that function
// it is related to the concept of stack memory, every memory used inside a function is freed when the function ends

fun example() {
    val flowers = 5
    println("I have $flowers flowers")
}