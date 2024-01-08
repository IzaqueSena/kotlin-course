fun main() {
    // # HASHMAP
    // MUTABLE map
    // implement map but with more operations

    // # Creating a HashMap
    var numbers = hashMapOf("one" to 1, "two" to 2) // hashmap of strings to integers
    println(numbers) // {one=1, two=2}
    // we can also create an empty hashmap
    var numbers2 = hashMapOf<String, Int>() // hashmap of strings to integers
    println(numbers2) // {}

    // # Adding elements
    // we can add elements using put()
    numbers.put("three", 3)
    println(numbers) // {one=1, two=2, three=3}
    // we can add elements using index assignment
    numbers["four"] = 4
    println(numbers) // {one=1, two=2, three=3, four=4}
    // we can also add a map of elements using putAll()
    numbers.putAll(mapOf("five" to 5, "six" to 6)) 
    println(numbers) // {one=1, two=2, three=3, four=4, five=5, six=6}
    // we can also add a map of elements using +=
    numbers += mapOf("seven" to 7, "eight" to 8)
    println(numbers) // {one=1, two=2, three=3, four=4, five=5, six=6, seven=7, eight=8}

    // # Removing elements
    // we can remove elements using remove()
    numbers.remove("one")
    println(numbers) // {two=2, three=3, four=4, five=5, six=6, seven=7, eight=8}
    // we can also remove all elements using clear()
    numbers.clear()
    println(numbers) // {}

    // # Updating elements
    // we can update elements using put()
    numbers = hashMapOf("one" to 1, "two" to 2) // hashmap of strings to integers
    numbers.put("one", 11)
    println(numbers) // {one=11, two=2}
    // we can also update elements using index assignment
    numbers["one"] = 1
    println(numbers) // {one=1, two=2}
    // we can also update element using replace()
    numbers.replace("one", 11)
    println(numbers) // {one=11, two=2}
    

}