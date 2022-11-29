package aquarium

fun main(args: Array<String>) {
    /* 22/11/2022
        Classes class ex.4-9 - Interfaces and Abstraction
    */

    buildAquarium()
    makeFish() // ex.4.9
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")

    //ex: 1
    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    //ex: 2 - constructor with parameters
    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium 2: ${myAquarium2.volume} liters with "
            +"lenght ${myAquarium2.length}, "
            +"width ${myAquarium2.width}, "
            +"height ${myAquarium2.height}")
}

//ex.4-9
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}