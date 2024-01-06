fun main() {
    // # NULLABILITY
    // ## Nullable variables vs Non-nullable variables
    var name2: String = "Michelle" // non-nullable
    var name: String? = null // nullable
    println(name2) // Michelle
    println(name) // null

    var catName: String? = "Chonkers"
    catName = null // ok
    var dogName: String = "Teddy"
    // dogName = null // compilation error

    // ## Null safe calls
    // ### Safe call operator 
    var myString: String? = "Hello World!"
    println(myString?.length) // if is null, return null else return length=12
    // myString.length // compilation error
    println(myString?.length?.toString()) // if is null, return null else return "12"
    // ### Elvis operator
    var myString2: String? = "Hello World!"
    println(myString2?.length ?: "myString2 is null") // if is null, return "myString2 is null" else return length=12
    var myString3: String? = null
    println(myString3?.length ?: "myString3 is null") // if is null, return "myString3 is null" else return length (will return null)

    // ## Operations with null values
    var a: Int? = 10
    println(a?,plus(2))
    var b: Int? = null
    println(a?,plus(2))
}