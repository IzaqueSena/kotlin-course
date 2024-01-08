fun main() {
    listAnimals() // I have one cat, I have one dog, I have one bird
}

// # Local Functions
// a local function is a function inside a function
// it is only visible inside the function it is defined in

fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("I have one $animal")
    }
    val animals = listOf("cat", "dog", "bird")
    for (animal in animals) {
        listOneAnimal(animal)
    }
}