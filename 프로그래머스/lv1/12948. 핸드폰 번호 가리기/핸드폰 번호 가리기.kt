class Solution {
    //문자열 끝 4개빼고 *로 바꾸기
    fun solution(phone_number: String): String {
        var answer = ""
        for(i in 0..phone_number.length-1){
            if(i > (phone_number.length-1) -4) // 끝에서 4번째 자리 이후에 
            {
             answer +=   phone_number[i].toString()
            }
            else{
                answer += "*"
            }
        }
        return answer
    }
}