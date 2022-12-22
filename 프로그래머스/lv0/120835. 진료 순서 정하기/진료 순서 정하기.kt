class Solution {
    //크기에 따른 순서 정하기, 큰 수면 
    //save와 같은 수 = n-i 저장
    fun solution(emergency: IntArray): IntArray {
        var answer: IntArray = IntArray(emergency.size)
        var n = emergency.size // 저장할 수
        var save = emergency.sorted()
        for(i in 0..emergency.size-1){
            for(j in 0..save.size-1){
                if(emergency[i] == save[j]){
                    answer[i] = n-j
                }
            }
        }
        return answer
    }
}