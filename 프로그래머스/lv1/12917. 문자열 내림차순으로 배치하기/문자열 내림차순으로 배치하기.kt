class Solution {
    fun solution(s: String): String {
        //문자열 배열 answer 선언하면 끝
  var answer = ""
        
        var answer2 = s.toCharArray().sortedDescending()
       for(i in 0..answer2.size-1){
          answer += answer2[i].toString()
       }
     
        return answer
    }
}