fun main() {
    // # SET
    // UNORDERED collection of UNIQUE elements

    // # Creating a set
    val numbers = setOf(6, 37, 6, 52) // set of integers
    println(numbers) // [37, 6, 52]
    // we can also create an empty set
    val numbers2 = setOf<Int>() // set of integers
    println(numbers2) // []
    // a set can contain null element, but only one
    val numbers3 = setOf(6, 37, 6, 52, null) // set of nullable integers, Int?
    println(numbers3) // [37, 6, 52, null]
    
    // # Accessing elements
    // we can't access elements by index because sets are unordered
    // println(numbers[0]) // ERROR
    // we can use contains() to check if an element is in the set
    println(numbers.contains(6)) // true
    // we can also use isEmpty() to check if the set is empty
    println(numbers.isEmpty()) // false

    // # Set operations
    // we can use size to get the size of the set
    println(numbers.size) // 3
    // we can also use isEmpty() to check if the set is empty
    println(numbers.isEmpty()) // false
    // we can use contains() to check if an element is in the set
    println(numbers.contains(6)) // true
    // we can also use containsAll() to check if a list of elements is in the set
    println(numbers.containsAll(listOf(6, 37))) // true
    // we can also use intersect() to get the intersection of two sets
    println(numbers.intersect(setOf(6, 37, 10, 10))) // [37, 6]
    // note that the set is not changed
    println(numbers) // [37, 6, 52]
    // we can also use union() to get the union of two sets
    println(numbers.union(setOf(6, 37, 10, 10))) // [37, 6, 52, 10]
    // note that the set is not changed
    println(numbers) // [37, 6, 52]
    // we can also use subtract() to get the difference of two sets
    println(numbers.subtract(setOf(6, 37, 10, 10))) // [52]
    // note that the set is not changed
    println(numbers) // [37, 6, 52]
    
}