fun main(args: Array<String>) {

    /* 23/11/2022
        Classes ex.4-5 Spice Class update with constructors

        Practice Time
        Let's improve our SimpleSpice class so that we can have various spices with different levels of spiciness.

        1 - Create a new class, Spice.
        2 - Pass in a mandatory String argument for the name, and a String argument for the level of spiciness
            where the default value is mild for not spicy.
        3 - Add a variable, heat, to your class, with a getter that returns a numeric value for each type of spiciness.
        4 - Instead of the list of spices as Strings you used earlier, create a list of Spice objects and
            give each object a name and a spiciness level.
        5 - Add an init block that prints out the values for the object after it has been created. Create a spice.
        6 - Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
        7 - Because salt is a very common spice, create a helper function called makeSalt()
    */

    val simpleSpice = SimpleSpice()
    print("First class -> ")
    println("name: ${simpleSpice.name} , heat: ${simpleSpice.heat} \n")

    // ex.4
    val spicesType = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    // ex.5
    print("\nex.5 -> ")
    val spice = Spice("cayenne", spiciness = "spicy")

    // ex.6
    val spiceList = spicesType.filter { it.heat < 3 }

    // ex.7
    fun makeSalt() = Spice("Salt")
}