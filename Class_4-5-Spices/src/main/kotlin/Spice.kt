
// ex.1 and ex.2
class Spice(val name: String, val spiciness: String = "mild") {

    // ex.3
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 2
                "spicy" -> 3
                "very spicy" -> 4
                "extremely spicy" -> 5
                else -> 0
            }
        }

    init {
        println("Name: $name, Spiciness: $spiciness, Heat: $heat")
    }

}

