import java.util.*

fun main(args: Array<String>) {

    /* 16/11/2022
        Extra Exercise: Functions- ex. 3-19 - gamePlay RollDice lambda

        Practice Time: Extra Questions
        1 - Why would you want to use the function type notation instead of just the lambda?
        2 - Create a function gamePlay() that takes a roll of the dice as an argument and prints it out.
        3 - Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time gamePlay() is called.
     */

    val rollDice2: (Int) -> Int = { sides: Int ->  if (sides == 0) 0 else Random().nextInt(sides) + 1}
    gamePlay(rollDice2(9))
}

fun gamePlay(diceRoll: Int) {
    println("Reusing function rollDice2 -> $diceRoll")
}