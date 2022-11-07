import java.util.*

fun main(args: Array<String>) {

    /* 07/11/2022
    Exercise: Functions- ex. 3-9

    Use the code you created in the last practice, or copy the starter code from below.

    The getFortune() function should really only be getting the fortune, and not be in the business of getting the birthday.

    Change your Fortune Cookie program as follows:

    1-Create a function called getBirthday() that gets the birthday from the user.
    2-Pass the result of getBirthday() to getFortune() using an Integer argument, and use it to return the correct fortune.
    3-Remove getting the birthday from getFortune()
    4-Instead of calculating the fortune based on the birthday,
      use a when statement to assign some fortunes as follows (or use your own conditions):
        -If the birthday is 28 or 31...
        -If the birthday is in the first week…
        -else … return the calculated fortune as before.

    Hint: There are several ways in which to make this when statement. How much can you Kotlinize it?
    */

    // Extra exercise
    var fortunePhrase: String
    for (i in 1..10) {
        fortunePhrase = getFortuneCookie(getBirthday())
        println("$i - Your fortune is: $fortunePhrase")
        println("------------------------------------------")
        if (fortunePhrase.contains("Take it easy and enjoy life!")) break
    }

}

fun getFortuneCookie(birthday : Int) : String {
    val fortunePhrases = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    var fortuneIndex = when (birthday) {
        in 1..7 -> 6
        28, 31 -> 2 // means if it is 28 or 31
        else -> birthday.rem(fortunePhrases.size)
    }
    return fortunePhrases[fortuneIndex]
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}