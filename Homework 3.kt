import io.kotlintest.shouldBe
import io.kotlintest.shouldEqual
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec

//hw 3 ex 1
class HW3 : DescribeSpec({
    describe("time management") {
        val qa = QA1().apply {
            name =  "Aigerim"
            department =  "Quality Assurance"
        }
        context("do work on time") {
            it("capacity's effects on QA engineer's work") {
                qa.work(2, arrayListOf("retest", "auto-test", "update")) shouldBe arrayListOf("update")
                qa.work(2, arrayListOf("retest", "auto-test", "update", "revisit")) shouldBe arrayListOf("update", "revisit")
                qa.work(2, arrayListOf("retest", "auto-test", "update")) shouldNotBe 0
            }
            it("keeping up with deadline") {
                qa.releaseTesting(1, arrayListOf("update")) shouldBe true
                qa.releaseTesting(1, arrayListOf("update", "revisit")) shouldBe true
                qa.releaseTesting(1, arrayListOf("retest", "auto-test", "update")) shouldBe false
                qa.releaseTesting(1, arrayListOf("retest", "auto-test", "update", "revisit")) shouldBe false
                qa.releaseTesting(2, arrayListOf("retest", "auto-test", "update")) shouldBe true
            }
            val dev = Developer()
            dev.name = "Quality Assurance"
            it("cappacity's effects on Developer's work") {
                    dev.work(2, arrayListOf("recode", "addFeature")) shouldBe arrayListOf("recode", "addFeature", "0", "0")
                    dev.work(2, arrayListOf("recode", "addFeature")) shouldNotBe 3
                }
            }
        }
    })


///basic exercise

open class Engineer1 {
    var name: String = ""
    var department: String = ""
    open fun work(capacity: Int, currentTasks: ArrayList<String>): ArrayList<String> {
        return currentTasks
    }
}

class QA1 : Engineer1() {
    var bool = false
    fun releaseTesting(days: Int, list: ArrayList<String>): Boolean {
        bool = days.toDouble() >= (list.size.toDouble() / 2)
        return bool

    }
    override fun work(capacity: Int, currentTasks: ArrayList<String>): ArrayList<String> {
        val  tasks: ArrayList<String> = currentTasks
        //for i in 1...capacity:
        var i: Int = 0
        while (i < capacity) {
            tasks.removeAt(0)
            i++
        }
        return tasks
    }
}

class Developer : Engineer1() {
    override fun work(capacity: Int, currentTasks: ArrayList<String>): ArrayList<String> {
        val  tasks: ArrayList<String> = currentTasks
        var i: Int = 0
        while (i < capacity) {
            tasks.add(0.toString())
            i++
        }
        return tasks
    }
}
