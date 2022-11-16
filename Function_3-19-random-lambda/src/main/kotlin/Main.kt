import java.lang.Math.random

fun main(args: Array<String>) {

    /* 16/11/2022
    Exercise: Functions- ex. 3-19 - Random function and lambda

    QUIZ QUESTION
    What is the difference between
        val random1 = random()
        val random2 = {random()}
    Try it out in REPL or a file:
    answer: The second will generate a random number every time random2 is accessed.
     */
    val random1 = random()
    val random2 = {random()}
    println("Random1 -> $random1")
    println("Random2 -> $random2")

    //random1 has a value assigned at compile time, and the value never changes when the variable is accessed.
    //random2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced,
    // returning a different value.
}