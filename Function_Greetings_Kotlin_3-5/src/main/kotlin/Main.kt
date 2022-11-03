fun main(args: Array<String>) {

    /* 03/11/2022
    Exercise: Greetings, Kotlin - ex.3-5
    Create a main() function that takes an argument representing
    the time in 24-hour format (values between and including 0 -> 23).

    In the main() function, check if the time is before midday (<12),
    then print "Good morning, Kotlin"; otherwise, print "Good night, Kotlin".

    Notes:
    Remember that all main() function arguments are Strings,
    so you will have to convert this argument to an Int before you can apply the check.

    Advanced
    Try to use Kotlin's string templates to do this in 1 line.
     */

    // here you need to select your main file, e.g"Main.kt"
    // and click on the Menu>Run>Edit Configurations>Program Arguments: "put you desire time between 0-23"
    // and click OK
    println(if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin")

    /* Other way suggest
    println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")
     */

}