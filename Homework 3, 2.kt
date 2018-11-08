import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec

//hw 3 ex 2
class HW32 : DescribeSpec({
    describe("time management") {
        context("do work on time") {
            it("capacity's effects on QA engineer's work") {
            val dev = Developer()
            dev.name = "Quality Assurance"
                var list = hashMapOf("task1" to 2, "task2" to 3, "task3" to 4, "task3" to 3, "task4" to 1,"task5" to 5)
            }
        }
    }
})


///basic exercise

open class Engineer2 {
    var name: String = ""
    var department: String = ""
    open fun work(capacity: Int, currentTasks: HashMap<String, Int>): HashMap<String, Int> {
        return currentTasks
    }
}

class QA2 : Engineer2() {
    var bool = false
    fun releaseTesting(hours: Int, list: HashMap<String, Int>): Boolean {
        bool = hours.toDouble() >= (list.size.toDouble() / 2)
        return bool

    }}
 /*   override fun work(capacity: Int, currentTasks: HashMap<String, Int>) {
        val tasks: HashMap<String, Int> = currentTasks
        for (i in 2..capacity)
            hashMapOf<String, Int>().sumBy(8)
    }
        return tasks
    }
}

class Developer1 : Engineer2() {
    override fun work(capacity: Int, currentTasks: HashMap<String, Int>): {
        val  tasks: HashMap<String, Int> = currentTasks

        }
        return tasks
    }
}
*/