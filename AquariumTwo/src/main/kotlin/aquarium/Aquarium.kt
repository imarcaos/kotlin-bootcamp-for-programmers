package aquarium

class Aquarium {

    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    /* ex1
    fun volume(): Int {
        return width * height * length / 1000
    }
    */

    /* ex2 - one line function
    fun volume() = width * height * length / 1000
    }
    */

    /* ex3  function represented as properties
    val volume : Int get() {
        return width * height * length / 1000
    }
    */
    // ex4  function represented as properties in one line
    val volume : Int get() = width * height * length / 1000
}