class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        var count = 0
        //시간초과 : 
        for(i in 1..number){
            for(j in 1..i/2){
                if(i % j == 0)
                count += 1
            }
            if(count+1 <= limit){
                 answer += count +1
                 count = 0
            }
            else {
                answer += power
                count = 0
            }
           
        }
        return answer
    }
}