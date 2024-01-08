fun main() {
    // continue
    for (i in 1..10) {
        if (i % 2 != 0) {
            continue
        }
        println("Half of $i is ${i / 2}")
    }

    // break
    val numbers = arrayListOf(2, 4, 6, 7, 8, 10)
    for (i in numbers) {
        if (i % 2 != 0) {
            break
        }
        println("Half of $i is ${i / 2}")
    }
}