import io.kotlintest.shouldBe
import io.kotlintest.shouldEqual
import io.kotlintest.specs.DescribeSpec

class HW5 : DescribeSpec({
    describe("Tricky exercise") {
        context ("Integer is palindrome") {
            it("Testing that integer is palindrome") {
                palindromeInt("123321") shouldBe true
                palindromeInt("-123321") shouldBe false
                palindromeInt("123331") shouldBe false
                palindromeInt("123123") shouldBe false
                palindromeInt("12321") shouldBe true
            }
        }
    }
})

fun palindromeInt(string: String) : Boolean {
    var bool = false
    if (string.equals(string.reversed()) ) {
        return true
    }
    return false
}