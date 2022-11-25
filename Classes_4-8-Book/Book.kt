// ex.1
class Book (val title: String, val author: String) {

    // ex.2
    private var currentPage = 1
    open fun readPage() {
        currentPage++
    }
}

//ex.3 and 4
class eBook (title: String, author: String, var format: String = "text") {
    // ex.5
    private var wordsRead = 0
    override fun readPage() {
        wordsRead += 250
    }
}