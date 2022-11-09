fun main() {

    /* 09/11/2022 - More updates
    Exercise: Functions- ex. 3-15 - WhatShouldIDoToday - part2

    Practice Time
    Improve your whatShouldIDoToday() program with the new knowledge from this segment.

    1-Add 3 more situations and activities. For example:
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
    2-Create a single-expression function for each condition and then use it in your when expression.

    Challenge

    Instead of passing in the mood, get a mood string from the user.
    Hint: The !! operator may come handy.

    Loops
    This lesson introduced the while and repeat loops. To practice using them, do the following:

        - Change your fortune cookie program to use repeat() instead of a for loop.
        What happens to the break instruction? Using the error message from the compiler,
        with what you've learned so far, can you think of why?
        - Change your fortune cookie program to use a while loop,
        which is the better choice when you are looping until a condition is met.
     */

    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", weather = "sunny"))
    println(whatShouldIDoToday("sad", weather = "rainy", temperature = 0))
    println(whatShouldIDoToday("Great", temperature = 35)) // nothing to report because need mood

    print("What your mood at this moment?  ")
    println(whatShouldIDoToday(readLine()!!)) // the operator !! asserts that an expression is non-null.
}

fun happySunny (mood: String, weather: String) = mood == "happy" && weather == "Sunny"
fun sadRainy (mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun temp (temperature: Int) = temperature > 35
fun sad (mood: String) = mood == "sad"
fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24): String {
    return when {
        happySunny(mood, weather) -> "$mood and $weather - go for a walk"
        sadRainy(mood, weather, temperature) -> "$mood ,$weather and $temperature ªC - stay in bed"
        temp(temperature) -> "$temperature ªC - go swimming"
        sad(mood) -> "$mood!! -> The life is unic, get up!!"
        else -> "Nothing Reported - Stay home and read"
    }
}