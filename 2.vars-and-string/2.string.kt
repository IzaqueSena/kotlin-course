fun main() {
    // # String 
    // / is the escape character
    println("The answer is \"yes\" ")
    println("look: \\ is just one")
    
    // ## Get character by index
    var myString = "Hello World!"
    println(myString[0]) // H
    println(myString.get(1)) // e
    var explicit: String = "OOLA"\
    println(explicit) // OOLA

    // ## Substring
    println(myString.substring(0, 5)) // Hello


    // ## Length
    var myPet = "Crocodile"
    println(myPet.length) // 9

    // ## String Methods
    
    // ### Capitalize - first letter to uppercase
    var myName = "michelle"
    println(myName.replaceFirstChar { it.uppercaseChar() }) // Michelle

    // ### Decapitalize - first letter to lowercase
    var myAnimal = "Giraffa"
    println(myAnimal.replaceFirstChar { it.lowercaseChar() }) // giraffa

    // ### Trim - remove whitespace
    var myText = "   Hello World!   aa   "
    println(myText.trim()) // "Hello World!   aa"

    // ## Template
    var dogName = "Teddy"
    println("My dog's name is $dogName") // My dog's name is Teddy
    println("I have ${3+2} cats") // I have 5 cats
    
}