class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        for(i in 0 until cipher.length){
            if((i+1) % code ==0){
                answer +=cipher[i].toString()
            }
        }
        return answer
    }
}