import java.util.*
class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        answer = my_string.lowercase()
        val chararr = answer.toCharArray()
        
        chararr.sort()
        val str = String(chararr)
        return str
    }
}