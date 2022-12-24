class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var x = 0
        for(i in 0..seoul.size-1){
            if(seoul[i].equals("Kim"))
            {
                x = i
            }
        }
        answer = "김서방은 ${x}에 있다"
        return answer
    }
}