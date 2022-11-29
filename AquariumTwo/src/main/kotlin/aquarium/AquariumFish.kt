package aquarium

//ex. 4-9
abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"

    override fun eat() {
        println("much on algae")
    }
}

interface FishAction {
    fun eat()
}