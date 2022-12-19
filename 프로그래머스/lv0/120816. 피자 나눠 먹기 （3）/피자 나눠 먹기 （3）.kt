class Solution {
    //피자 : 2~10조각
    // 조각 수 slice, 먹는 사람 수 n
    //한 명이 한 조각 이상
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
     answer =  n / slice 
        if(n%slice != 0){
            answer++
        }
        return answer
    }
}