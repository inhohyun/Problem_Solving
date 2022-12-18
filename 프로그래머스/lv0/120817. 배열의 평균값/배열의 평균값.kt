class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        //배열의 원소를 다 더한 후 size로 실수형으로 나눔
        var total = 0
        for(i in 0..numbers.size-1){
            total += numbers[i]
        }
        answer = total.toDouble() / numbers.size
        
        return answer
    }
}