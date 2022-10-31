fun main(args: Array<String>) {

    /* 31/10/2022
    Practice Time: Basic Operations
    Solve the following using the operator methods in one line of code.

    If you start with 2 fish, and they breed twice, producing 71 offspring the first time,
    and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel,
    How many fish do you have left? How many aquariums do you need if you can put 30 fish per aquarium?

    Hint: You can chain method calls.
    Hint: You can call the methods on numbers, and Kotlin will convert them to objects for you.
    Bonus question: What is special about all the numbers of fish?
    */

    //  How many fish left
    var fishLeft = 2.plus(71).plus(233).minus(13)

    // Aquariums Needed
    var aquariumsQuantity = if (fishLeft.mod(30) > 0) {fishLeft.div(30).plus(1)} else {fishLeft.div(30)}

    println("Fish Left: $fishLeft and Aquarium needed for 30 fish: $aquariumsQuantity ")

}