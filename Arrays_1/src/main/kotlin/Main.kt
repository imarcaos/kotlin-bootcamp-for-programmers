fun main(args: Array<String>) {
    /* 02/10/2022
    Practice Time - Arrays and Loops - e.g.2

    Basic example
    Create an integer array of numbers called numbers, from 11 to 15.
    Create an empty mutable list for Strings.
    Write a for loop that loops over the array and adds the string representation of each number to the list.

    Challenge example
    How can you use a for loop to create (a list of) the numbers between 0 and 100 that are divisible by 7?
     */

    //e.g.1
    val arrayInt = Array<Int>(5) {it + 11}
    println(arrayInt.asList())

    //e.g.2
    var mutableList = mutableListOf<String>()

    //e.g.3
    println("-------------------------------------------------")
    for (number in arrayInt) {
        mutableList.add(number.toString())
    }
    println("String representation for each number to the list:  $mutableList")

    //Challenge Example
    println("-------------------------------------------------")
    var numberList = mutableListOf<String>()
    for (number in 0..100 step 7) {
        if (number != 0) numberList.add(number.toString())
    }
    println("Number divisible by 7 in the list: $numberList")
}