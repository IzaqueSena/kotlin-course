fun main() {
    // # LIST
    // Ordered collection of elements
    // Immutable by default
    // Can contain duplicate elements

    // # Creating a list
    val colors = listOf("Red", "Green", "Blue") // list of strings
    println(colors)
    // if we create an empty list we have to specify the type
    val colors2 = listOf<String>() // list of strings
    println(colors2)
    // we can also create a list of nulls
    val colors3 = listOf("Blue", "Red", null, null) // list of nullable strings, String?
    println(colors3)

    // # Accessing elements
    // we can access elements by index
    println(colors[0]) // Red
    // we can also use get()
    println(colors.get(1)) // Green
    // we can also use first() and last()
    println(colors.first()) // Red
    println(colors.last()) // Blue
    println(colors.subList(0, 2)) // [Red, Green]
    
    // # List operations
    // we can use size to get the size of the list
    println(colors.size) // 3
    // we can use contains() to check if an element is in the list
    println(colors.contains("Red")) // true
    // we can use containsAll() to check if a list of elements is in the list
    println(colors.containsAll(listOf("Red", "Green"))) // true
    // we can also use indexOf() to get the index of the first occurrence of an element
    println(colors.indexOf("Green")) // 1
    // we can also use lastIndexOf() to get the index of the last occurrence of the element
    println(colors.lastIndexOf("Green")) // 1
    // we can also use isEmpty() to check if the list is empty
    println(colors.isEmpty()) // false

    
}