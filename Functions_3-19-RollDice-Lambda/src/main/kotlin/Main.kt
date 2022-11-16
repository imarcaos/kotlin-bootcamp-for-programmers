import java.util.Random

fun main(args: Array<String>) {

/* 16/11/2022
    Exercise: Functions- ex. 3-19 - RollDice function and lambda

    Practice Time: Lambdas
    1 - Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
    2 - Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
    3 - If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
    4 - Create a new variable, rollDice2, for this same lambda using the function type notation.
 */

    // 1
    val rollDice = {Random().nextInt(1, 12)}
    println("ex.1 -> " + rollDice())

    // 2
    val rollDice0 = {sides: Int -> Random().nextInt(sides) + 1}
    println("ex.2 -> " + rollDice0(6))

    // 3
    val rollDice1 = {sides: Int -> if (sides == 0) 0 else Random().nextInt(sides) + 1}
    println("ex.3 -> " + rollDice1(0))

    // 4
    val rollDice2: (Int) -> Int = { sides: Int ->  if (sides == 0) 0 else Random().nextInt(sides) + 1}
    println("ex.4 -> " + rollDice2(9))


}