fun main() {
    // # iterating over a collection
    var animals = arrayListOf("cat", "dog", "bird", "cow", "pig")
    for (animal in animals) {
        println(animal)
    }

    // # iterating over a range
    // ## in with a range inclusive
    for (i in 1..12) {
        val month = when (i) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            else -> "December"
        }
        println("Month $i is $month") // will print from 1 to 12
    }

    // ## in with a range exclusive
    for (i in 1 until 12) {
        println(i) // 1 2 3 4 5 6 7 8 9 10 11
    }

    // ## in with a range and step
    for (i in 1..12 step 2) {
        println(i) // 1 3 5 7 9 11
    }

    // ## in with a range and downTo
    for (i in 12 downTo 1) {
        println(i) // 12 11 10 9 8 7 6 5 4 3 2 1
    }
    
    
}