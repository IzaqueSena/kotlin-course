fun main() {
    println(multiply(2)) // 4
    println(multiply(2, 3)) // 6
    
}

// # Overloading
// Two functions can have the same name
// if they have different parameters

fun multiply(number : Int) : Int {
    return 2 * number
}

fun multiply(number : Int, multiplier : Int) : Int {
    return number * multiplier
}