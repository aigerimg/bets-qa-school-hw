import io.kotlintest.forAny

//homework 1
//multiple conditions (switch case)
fun main(args: Array<String>) {
    var score = 1
    var grade = when (score) {
        5 -> println("Excellent")
        4 -> println("Good")
        3 -> println("Average")
        2 -> println("Below Average")
        1 -> println("Bad")
        else -> println("Fail")
    }

// collections
    val listOfNumber = listOf(1, 2, 3, 4, 5)
    val keyValue = mapOf(1 to 'A',
            2 to 'B',
            3 to 'C',
            4 to 'D')
    // function of sum
    fun sum(listOfNumber: Int) =  1 + 2 + 3 + 4 + 5

    // second trial
    data class test(val id: Int)
    val sum = listOfNumber.sumBy {it}
    fun sum(list: List<Int>): Int {
        var sum = 0
        for (i in list) {
            sum += i
        }
        return sum
}}










