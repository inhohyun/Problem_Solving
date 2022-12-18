class Solution {
    fun solution(n: Int): Int {
        //피자의 개수
        var answer: Int = 0
        while( answer * 7 < n)
        {
            answer++
        }
       
        
        return answer
    }
}