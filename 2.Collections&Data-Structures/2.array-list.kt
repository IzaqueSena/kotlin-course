fun main() {
    // # ARRAYLIST
    // a MUTTABLE list
    // implement list but with more operations
    
    // # Creating an ArrayList
    var colors = arrayListOf("Red", "Green", "Blue") // arraylist of strings
    println(colors)
    // if we create an empty list we have to specify the type
    var colors2 = arrayListOf<String>() // arraylist of strings
    println(colors2)
    println(colors::class) // class java.util.ArrayList

    // # Adding elements
    // we can add elements to the end of the list using add()
    colors.add("Yellow")
    println(colors) // [Red, Green, Blue, Yellow]
    // we can add elements at a specific index using add(index, element)
    colors.add(1, "Purple")
    println(colors) // [Red, Purple, Green, Blue, Yellow]
    // we can also add a list of elements using addAll()
    colors.addAll(listOf("Orange", "Brown"))
    println(colors) // [Red, Purple, Green, Blue, Yellow, Orange, Brown]
    // we can also add a list of elements at a specific index using addAll(index, list)
    colors.addAll(1, listOf("Pink", "Gray"))
    println(colors) // [Red, Pink, Gray, Purple, Green, Blue, Yellow, Orange, Brown]

    // # Removing elements
    // we can remove elements using remove(), remove the first occurrence of the element
    colors.remove("Gray")
    println(colors) // [Red, Pink, Purple, Green, Blue, Yellow, Orange, Brown]
    // we can also remove elements at a specific index using removeAt()
    colors.removeAt(1)
    println(colors) // [Red, Purple, Green, Blue, Yellow, Orange, Brown]
    // we can also remove the last element using removeLast()
    colors.removeLast()
    println(colors) // [Red, Purple, Green, Blue, Yellow, Orange]
    // we can also remove the first element using removeFirst()
    colors.removeFirst()
    println(colors) // [Purple, Green, Blue, Yellow, Orange]
    // we can also remove all elements using clear()
    colors.clear()
    println(colors) // []
    
    // # Updating elements
    // we can update elements using set()
    colors = arrayListOf("Red", "Green", "Blue") // arraylist of strings
    colors.set(1, "Purple")
    println(colors) // [Red, Purple, Blue]
    // we can also update elements using index assignment
    colors[1] = "Green"
    println(colors) // [Red, Green, Blue]
    
}