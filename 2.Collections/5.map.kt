fun main() {
    // # MAP
    // UNORDERED collection of key-value pairs
    // Keys are UNIQUE
    // Keys are used to access values
    // Values can be duplicated
    // single value per key
    // IMMUTABLE by default

    // # Creating a map
    val colors = mapOf("red" to 0xFF0000, "green" to 0x00FF00, "blue" to 0x0000FF) // map of strings to integers
    println(colors) // {red=16711680, green=65280, blue=255}
    // we can also create an empty map
    val colors2 = mapOf<String, Int>() // map of strings to integers
    println(colors2) // {}
    // a map can contain null values
    val colors3 = mapOf("red" to 0xFF0000, "green" to null, "blue" to 0x0000FF) // map of strings to nullable integers, String,Int?
    println(colors3) // {red=16711680, green=null, blue=255}
    // a map can contain null keys
    val colors4 = mapOf("red" to 0xFF0000, null to 0x0000FF) // map of nullable strings to integers, String?,Int
    println(colors4) // {red=16711680, null=255}
    // a map can contain null keys and null values
    val colors5 = mapOf("red" to 0xFF0000, null to null) // map of nullable strings to nullable integers, String?,Int?
    println(colors5) // {red=16711680, null=null}

    // # Accessing elements
    // we can access elements by key
    println(colors["red"]) // 16711680
    // we can also use get()
    println(colors.get("green")) // 65280
    // we can also use getOrDefault()
    println(colors.getOrDefault("yellow", 0x000000)) // 0
    // we can also use keys to get the keys of the map
    println(colors.keys) // [red, green, blue]
    // we can also use values to get the values of the map
    println(colors.values) // [16711680, 65280, 255]
    // we can also use entries to get the entries of the map
    println(colors.entries) // [red=16711680, green=65280, blue=255]
    // we can also use isEmpty() to check if the map is empty
    
    // # Map operations
    // we can use size to get the size of the map
    println(colors.size) // 3
    // we can use containsKey() to check if a key is in the map
    println(colors.containsKey("red")) // true
    // we can use containsValue() to check if a value is in the map
    println(colors.containsValue(0xFF0000)) // true
    // we can use isEmpty() to check if the map is empty
    println(colors.isEmpty()) // false
    
}