class Solution {
    //문자열에서 특정 문자만 삭제하는 방법
    
    fun solution(my_string: String, letter: String): String {
        var answer: String = my_string.replace(letter, "")
        return answer
    }
}