fun main() {
    // # NUMBERS

    // ## Number types
    /* byte 
    Size: 1 byte
    Minimum value: -128
    Maximum value: 127 */

    /* short 
    Size: 2 bytes
    Minimum value: -32768
    Maximum value: 32767 */

    /* int 
    Size: 4 bytes
    Minimum value: -2147483648
    Maximum value: 2147483647 */

    /* long 
    Size: 8 bytes
    Minimum value: -9223372036854775808
    Maximum value: 9223372036854775807 */

    /* float
    Size: 4 bytes
    Decimal digits: 6-7 */

    /* double
    Size: 8 bytes
    Decimal digits: 15-16 */

    var items = 51
    println(items::class.java) // int

    var peopleQuantiy = 75L // 7500000000000000000
    println(peopleQuantiy::class.java) // long

    var price = 1.99
    println(price::class.java) // double

    var pi = 3.141593847639564
    println(pi::class.java) // double

    // ## implicit value attribuiton vs explicit value attribuiton
    var a = 1 // implicit 
    println(a::class.java) // int
    var b: Byte = 1 // explicit
    println(b::class.java) // byte
    var afloat = 1.90f
    println(afloat::class.java) // float


}