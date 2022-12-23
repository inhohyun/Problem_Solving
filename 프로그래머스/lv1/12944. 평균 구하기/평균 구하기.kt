class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        arr.forEach{
            answer += it
        }
        answer = answer.toDouble() / arr.size.toDouble()
        return answer
    }
}