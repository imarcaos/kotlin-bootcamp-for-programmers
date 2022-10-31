fun main(args: Array<String>) {

    /* 31/10/2022 - Practice Basic Operations - Null Checks - ex. 5of5
    Practice Time: Null Checks
    Create a nullable integer variable called nullTest, and set it to null.
    Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.
    Hint: Use the Elvis operator.
     */

    var nullTest: Int? = null

    // inc() increment value by one
    // ?: Elvis Operator is used to return the not null value even the conditional expression is null.
    // It is also used to check the null safety of values.
    println(nullTest?.inc() ?: 0)

    nullTest = 1
    println(nullTest?.inc() ?: 0)

}