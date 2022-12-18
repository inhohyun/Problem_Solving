class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = IntArray(numbers.size)
        for(i in 0..numbers.size -1)
        {
            answer[i] = numbers[i] * 2
        }
        return answer
    }
}