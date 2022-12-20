class Solution {
    fun solution(str1: String, str2: String): Int {
        var answer: Int = 0
        val check = str1.contains(str2)
        
        if(check)
        return 1
        else
        return 2
    }
}