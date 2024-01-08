fun main() {
    val animal = "Cat"
    when (animal) {
        "Cat" -> {
            println("Animal is a cat.")
            println("Animal is a house pet.")
        
        }
        "Dog" -> {
            println("Animal is a house pet.")
        }
        "Tiger" -> println("Animal is a wild animal.")
        else -> println("Animal is unknown.")
    }

    val action = when(animal) {
        "Cat", "Dog" -> "Pet"
        "Tiger" -> "Wild"
        else -> "Unknown"
    }
    println("Animal is a $action")

    val name = "Michelle"
    when (name.length) {
        0 -> println("Name is empty")
        in 1..4 -> println("Name is short")
        in 5..10 -> println("Name is long")
        else -> println("Name is very long")
    }
}