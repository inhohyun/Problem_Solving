
class Solution {
    // 1. 배열에 저장
    // 2. 정답 수를 저장할 배열 생성
    // 3. %를 이용해 정답 비교
    fun solution(answers: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        // 12345
        // 21232425
        // 3311224455
        var one = arrayOf(1,2,3,4,5)
        var two = arrayOf(2,1,2,3,2,4,2,5)
        var three = arrayOf(3,3,1,1,2,2,4,4,5,5)
    
        var ok = arrayOf(0,0,0)
        
        for(i in 0 until answers.size){
            if(answers[i] == one[i % one.size]) ok[0] = ok[0]+1
            if(answers[i] == two[i % two.size]) ok[1] = ok[1]+1
            if(answers[i] == three[i % three.size]) ok[2] = ok[2]+1
        }
        val max = ok.maxOrNull()
        //ok에서 맞춘 수 중 최대값 == max
        
        for(i in 0 until ok.size){
            if(ok[i] == max){
                answer.add(i+1)
            }
            else{
                continue
            }
        }
    
        return answer.toIntArray()
    }
}