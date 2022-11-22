package aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int)  {
    // keep our class simple!!, we don't need to be confused with this ;)
    val size: Int

    // init works like a constructor
    init {
        println("first init block")
    }

    // in kotlin typically we don't need secondary constructor
    constructor() : this(true, 9) {
        println("running secondary constructor")
    }

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }
}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample () {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}