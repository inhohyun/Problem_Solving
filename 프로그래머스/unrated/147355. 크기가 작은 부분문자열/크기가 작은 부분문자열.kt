class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        //subString 활용
        val len = p.length -1 
        val num = p.toLong()
        //범위 조절하기
        for(i in 0..t.length-1 -len){
             if(t.substring(i, len+i+1).toLong() <= num ){
                answer++
             }
        }
        return answer
    }
}