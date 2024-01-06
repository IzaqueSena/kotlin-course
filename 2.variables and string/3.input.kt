fun main() {
    // # input
    println("What's your name?")
    var userInput = readLine()?:"" // ?: is the elvis operatoor, if readLine() is null, then set it to "" 
    println("You wrote: $userInput")

    // input is read as a String
    // but can be converted to other types
    println("What's your age?")
    var age = readLine()?.toIntOrNull()?:0
    println("You are ${age} years old")

}