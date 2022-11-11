fun main() {
/* 11/11/2022
    Exercise: Functions- ex. 3-17 - filter - List of Spices

    Practice Time
    You can do the following filter exercise in REPL.

    1-Create a list of spices, as follows:
        val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    2-Create a filter that gets all the curries and sorts them by string length.
        Hint: After you type the dot (.), IntelliJ will give you a list of functions you can apply.

    3-Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.

    4-Take the first three elements of the list and return the ones that start with 'c'.

    Note: We will be able to do a lot more interesting stuff with filters after you learn about classes and Map.

 */
    // 1
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    // 2
    println("**** ex.2 ****")
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })   // [curry, red curry, green curry]

    // 3
    println("**** ex.3 ****")
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })   // [cayenne]
    // 3 or
    println("**** ex.3 or ****")
    println(spices.filter { it[0] == 'c' && it.last() == 'e' })  // [cayenne]

    // 4
    println("**** ex.4 ****")
    println(spices.take(3).filter { it.startsWith('c') } )   // [curry, cayenne]


}