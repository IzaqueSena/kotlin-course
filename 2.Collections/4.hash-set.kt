fun main() {
    // # HASHSET
    // MUTABLE set
    // implement set but with more operations

    // # Creating a HashSet
    var numbers = hashSetOf(6, 37, 6, 52) // hashset of integers
    println(numbers) // [37, 6, 52]
    // we can also create an empty hashset
    var numbers2 = hashSetOf<Int>() // hashset of integers
    println(numbers2) // []
    println(numbers::class) // class java.util.HashSet

    // # Adding elements
    // we can add elements using add()
    numbers.add(6)
    println(numbers) // [37, 6, 52]
    // we can also add a list of elements using addAll()
    numbers.addAll(listOf(8, 37, 10, 10))
    println(numbers) // [37, 6, 52, 8, 10]
    // we can also add a list of elements using +=
    numbers += listOf(8, 37, 10, 10)
    println(numbers) // [37, 6, 52, 8, 10]

    // # Removing elements
    // we can remove elements using remove()
    numbers.remove(6)
    println(numbers) // [37, 52, 8, 10]
    // we can also remove all elements using clear()
    numbers.clear()
    println(numbers) // []

}