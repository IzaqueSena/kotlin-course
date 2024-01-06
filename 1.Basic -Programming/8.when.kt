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
}