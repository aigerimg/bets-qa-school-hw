import io.kotlintest.shouldBe
import io.kotlintest.shouldEqual
import io.kotlintest.specs.DescribeSpec

//hw 2 ex 1 sorting
class HW2 : DescribeSpec({
    describe("Check bubble sorting algorithm") {
        context("bubble sorting") {
            val list = arrayListOf<Int>()
            it("sorting works") {
            //    arrayListOf(10, 6, 8, 2, 4) shouldEqual arrayListOf(2, 4, 6, 8, 10)
            }
        }
        context("do work on time") {
            val qa = QA()
            qa.name = "Aigerim"
            qa.department = "Quality Assurance"

            it("test works") {
                qa.releaseTesting(7,arrayListOf("registration", "redesign", "addButton", "reallocate", "rename", "revise")) shouldBe true
                qa.releaseTesting(1,arrayListOf("registration", "redesign", "addButton", "reallocate", "rename", "revise" )) shouldBe false
                qa.releaseTesting(2,arrayListOf("registration", "redesign", "addButton", "reallocate", "rename", "revise" )) shouldBe false
                qa.releaseTesting(3,arrayListOf("registration", "redesign", "addButton", "reallocate", "rename", "revise" )) shouldBe true
                qa.releaseTesting(1,arrayListOf("registration", "redesign" )) shouldBe true
                qa.releaseTesting(2,arrayListOf("registration", "redesign", "addButton", "reallocate" )) shouldBe true
                qa.releaseTesting(2,arrayListOf("registration", "redesign", "addButton", "reallocate" )) shouldBe true

            }
        }
    }
})

fun ArrayList<Int>.bubbleSort()
        : ArrayList<Int> {
    var swap = true
    while (swap) {
        swap = false
        for (i in 0 until this.indices.last) {
            if (this[i] > this[i + 1]) {
                val temp = this[i]
                this[i] = this[i + 1]
                this[i + 1] = temp
                swap = true
            }
        }
    }
    return this
}


fun main(args: Array<String>) {
    val list = arrayListOf(10, 6, 8, 2, 4)
            .bubbleSort()
    list.forEach {
        println(it)
    }
}

// ex 2

open class Engineer() {
    var name: String = ""
    var department: String = ""
}

class QA : Engineer() {
    var bool = false
    fun releaseTesting(days: Int, list: ArrayList<String>): Boolean {
        bool = days.toDouble() >= (list.size.toDouble()/2)
        return bool
    }
}




