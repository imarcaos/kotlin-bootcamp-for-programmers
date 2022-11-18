package aquarium

fun main(args: Array<String>) {
    /* 18/11/2022
        Defining Classes class ex.2 Change the val to var to receive another value
    */

    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")
}