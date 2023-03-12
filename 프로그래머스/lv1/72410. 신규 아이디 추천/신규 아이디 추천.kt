class Solution {
    fun solution(new_id: String): String {
        var answer: String = ""
        //1단계
        val low_id = new_id.toLowerCase()
        //2단계
        for(i in 0 until low_id.length){
            var ch = low_id[i]
            if(ch.isLetterOrDigit() || ch == '-' || ch == '_' || ch == '.'){
                answer += ch
            }
        }
        //3단계
        while(answer.indexOf("..") != -1){
            answer = answer.replace("..", ".")
        }
        //4단계
        if(!answer.isEmpty() && answer[0] == '.'){
            answer = answer.substring(1)
        }
        if(!answer.isEmpty() &&answer[answer.length -1] == '.'){
            answer = answer.substring(0, answer.length -1)
        } 
        //5단계
        if(answer == "")
            answer = "a"
        //6단계
        if(answer.length > 15){
            answer = answer.substring(0, 15)
            if(answer[0] == '.'){
               answer = answer.substring(1)
            }
            if(answer[answer.length -1] == '.'){
                answer = answer.substring(0, answer.length -1)
            } 
        }

        //7단계
        if(answer.length <= 2){
            while(answer.length < 3){
                answer += answer[answer.length-1]
            }
        }
        return answer
    }
}