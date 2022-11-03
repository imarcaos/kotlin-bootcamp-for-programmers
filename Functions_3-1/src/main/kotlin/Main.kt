import java.util.Calendar

fun main(args: Array<String>) {

    /* 03/11/2022
    Practice Functions - e.g 3-1
    In this practice, you will create your own Kotlin file with a main function and another function.
    You will use this file in later practices as a scratch file for your code, like we do in the screencasts.

    Basic Task
    Create a new Kotlin file.
    Copy and paste the main() function from Hello World into the file.
    Create a new function, dayOfWeek().
    In the body of the function, print "What day is it today?"
    Call dayOfWeek() from main().
    Run your program.

    Extended Task
    In the body of the dayOfWeek() function, answer the question by printing the current day of the week.

    Hints
    You can use Java libraries (java.util) from Kotlin. For example, to get the day of the week:
    Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    Type in the code, then press Option + Enter in Mac, or Alt + Enter in Windows, over the red Calendar class to import the library.
    Use a when statement to print a string depending on the day. Sunday is the first day of the week.
     */

    // Basic Task
    dayOfWeek()
}

fun dayOfWeek() {

    println("What day is it today?") // Basic Task

    // Extended Task
    var dayOW = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    val dayOWString = when (dayOW) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid Day!"
    }
    println("Today is: $dayOWString")
}