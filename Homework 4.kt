import com.sun.xml.internal.fastinfoset.util.CharArrayString
import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

//HW 4 basic exercise
class HW4 : DescribeSpec({
    describe("Checking uniqueness and rotation") {
        context("Basic: one string") {
            it("testing uniqueness") {
                uniqueLetters("Hello") shouldBe false
                uniqueLetters("Unique") shouldBe true
                uniqueLetters("Pepsi") shouldBe true
                uniqueLetters("Lollipop") shouldBe false
            }
        }
        context("Tricky: two strings") {
            it("checking rotation") {
                rotation("swift", "ftswi") shouldBe true
                rotation("hello", "llohe") shouldBe true
                rotation("rabbit", "tibrab") shouldBe false
                rotation("Lucky", "ckylu") shouldBe false
            }
        }
    }
})

fun uniqueLetters(string: String) : Boolean {
    var charArray = string.toCharArray()
 //   charArray.sort()
    for (i in 0 until charArray.size-1)
        if (charArray[i] == charArray[i+1])
            return false
    return true
}

fun rotation(string1: String, string2: String) : Boolean {
    var bool = false
    var charArray1 = string1.toCharArray()
    var charArray2 = string2.toCharArray()
    var sumOfString = string1 + string1

    if (sumOfString.contains(string2)) {
        return true
    }
    return false
}

