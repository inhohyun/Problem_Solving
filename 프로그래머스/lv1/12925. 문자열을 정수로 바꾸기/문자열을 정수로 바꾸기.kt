class Solution {
    fun solution(s: String): Int {
        //+인경우 -인 경우
           var answer = ""
        if(s[0] == '-')
        {
            for(i in 1..s.length-1){
                answer += s[i].toString()
            }
        }
        else{
            return s.toInt()
        }
     
        return answer.toInt() * -1
    }
}