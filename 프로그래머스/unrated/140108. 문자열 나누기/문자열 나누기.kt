class Solution {
    fun solution(s: String): Int {
        var answer: Int = 1
        var x =  s[0]
        var x_true = 0
        var x_false = 0
        for(i in 0..s.length-2){
            if(s[i] == x)
            x_true++
            else
            x_false++
            
            if(x_true == x_false){
                answer++
                x_true = 0
                x_false = 0
                x = s[i+1]
            }
        }
       
        return answer
    }
}