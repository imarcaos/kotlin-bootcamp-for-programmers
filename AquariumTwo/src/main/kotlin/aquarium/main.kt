package aquarium

fun main(args: Array<String>) {
    /* 18/11/2022
        Defining Classes class ex.1
    */

    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}"
    )
}