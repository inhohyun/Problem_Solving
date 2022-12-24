class Solution {
    fun solution(s: String): String {
        var answer = ""
        var count = 0 //공백 만나면 초기화
        var ss = s.split("")
        for(i in 0..ss.size -1){
            if(ss[i] == " ")
            count = 0
            
            
            if(count == 0)
            answer += ss[i].toUpperCase()
            else if(count % 2 != 0 )
             answer += ss[i].toUpperCase()
             else if(count %2 == 0 )
              answer += ss[i].toLowerCase()
              
              count++
        }
        return answer
    }
}