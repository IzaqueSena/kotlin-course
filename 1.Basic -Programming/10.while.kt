fun main() {
    var a = 0
    var b = 20
    while (a < b) {
        println("a is $a")
        a++
    }

    a = 0
    do {
        println("a is $a")
        a++
    } while (a < b)
}