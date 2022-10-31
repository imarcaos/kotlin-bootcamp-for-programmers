fun main(args: Array<String>) {

    /* 31/10/2022 - Practice Basic Operations - Nullability - ex. 3of5
    Try to set rainbowColor to null. Declare two variables, greenColor and blueColor.
    Use two different ways of setting them to null.
     */

    var rainbowColor = "orange"
    // rainbowColor = null // error

    var greenColor = null

    // The operator ? Interrogation tell the variable can be null
    var blueColor: String? = null


    blueColor = "black"
    println(blueColor)
}