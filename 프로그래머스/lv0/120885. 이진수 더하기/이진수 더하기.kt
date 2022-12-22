class Solution {
    //이진수의 덧셈
    fun solution(bin1: String, bin2: String): String {
        var answer: String = ""
    var b1 = bin1.toInt(2)
    var b2 = bin2.toInt(2)
    var sum = b1 + b2
        
        return Integer.toBinaryString(sum)
    }
}