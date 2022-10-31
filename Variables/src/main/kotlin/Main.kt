fun main(args: Array<String>) {

    /* 31/10/2022
    Practice Time: Variables
    Create a String variable rainbowColor, set its color value, then change it.
    Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
     */

    var rainbowColor: String  = "green"
    println(rainbowColor)
    rainbowColor = "yellow"
    println("Var rainbowColor has been changed to $rainbowColor")

    val blackColor: String = "You cannot change my value"
    //blackColor = "White!" //error
    println("Val blackColor -> $blackColor")

}