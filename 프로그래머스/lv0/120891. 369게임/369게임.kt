class Solution {
    fun solution(order: Int): Int {
        var answer: Int = 0
        var str = order.toString()
        for(i in 0..str.length -1){
            when(str[i]){
           '3' -> answer++
            '6' -> answer++
            '9' -> answer++
                
                
            }
            
        }
        return answer
    }
}