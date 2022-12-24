class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        for(i in n downTo 1){
            if(n % i == 1)
            answer = i
        }
        return answer
    }
}