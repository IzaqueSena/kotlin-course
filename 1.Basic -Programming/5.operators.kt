fun main() {
    // # Arithmetic Operators
    var a = 10
    var b = 5
    
    var sum = a + b // Addition
    var difference = a - b // Subtraction
    var product = a * b // Multiplication
    var quotient = a / b // Division
    var remainder = a % b // Modulus
    
    println("Sum: $sum") // Sum: 15
    println("Difference: $difference")  // Difference: 5
    println("Product: $product") // Product: 50
    println("Quotient: $quotient")  // Quotient: 2
    println("Remainder: $remainder") // Remainder: 0
    a++
    println(a) // 11
    b--
    println(b) // 4
    a += 2
    println(a) // 13


    // ## Result type
    // the type of the result of an operation is the same as the type of the largest operand in terms of sizxe in memory
    // byte < short < int < long < float < double

    // # Booleans
    // size 1 bit
    // true or false

    // # Logical Operators
    var x = true
    var y = false

    var andResult = x && y // Logical AND
    var orResult = x || y // Logical OR
    var notResult = !x // Logical NOT

    println("AND Result: $andResult") // AND Result: false
    println("OR Result: $orResult") // OR Result: true
    println("NOT Result: $notResult") // NOT Result: false

    // # Comparison Operators
    var isEqual = a == b // Equal to
    var isNotEqual = a != b // Not equal to
    var isGreater = a > b // Greater than
    var isLess = a < b // Less than
    var isGreaterOrEqual = a >= b // Greater than or equal to
    var isLessOrEqual = a <= b // Less than or equal to
    
    println("Is Equal: $isEqual") // Is Equal: false
    println("Is Not Equal: $isNotEqual") // Is Not Equal: true
    println("Is Greater: $isGreater") // Is Greater: true
    println("Is Less: $isLess") // Is Less: false
    println("Is Greater or Equal: $isGreaterOrEqual") // Is Greater or Equal: true
    println("Is Less or Equal: $isLessOrEqual") // Is Less or Equal: false
}