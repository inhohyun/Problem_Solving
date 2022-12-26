class Solution {
    //1. 숫자를 기준으로 문자열을 나눔
    //2. 문자열에 숫자는 그대로 저장
    //3. 영문자화 된 수는 숫자로 변환하는 코드작성
    // 문자가 연속해서 등장할 경우?
    fun solution(s: String): Int {
        var answer: String = ""
        var str = ""
        var check = true
        for(i in 0..s.length-1){
            if(Character.isDigit(s[i]) && check){ //숫자일때
             
                answer += s[i].toString() // 숫자를 저장
                
               
            }
            else{ //숫자가 아닐때
                str += s[i].toString()
                when(str){ //앞서나온 문자를 숫자로 바꿈
                    "zero" -> {answer += "0"
                        str = ""}
                    "one" -> {answer += "1" 
                        str = ""}
                    "two" -> {answer += "2" 
                        str = ""}
                    "three" -> {answer += "3" 
                        str = ""}
                    "four" -> {answer += "4" 
                        str = ""}
                    "five" -> {answer += "5" 
                        str = ""}
                    "six" -> {answer += "6" 
                        str = ""}
                    "seven" -> {answer += "7" 
                        str = ""}
                    "eight" -> {answer += "8" 
                        str = ""}
                    "nine" -> {answer += "9" 
                        str = ""}
                }
            }
          
            
            
        }
        
        
     
        return answer.toInt()
    }
}