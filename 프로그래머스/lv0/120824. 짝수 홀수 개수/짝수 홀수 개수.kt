class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = IntArray(2)
        var a = 0
        var b = 0
        for(i in 0..num_list.size-1){
            if(num_list[i] %2 == 0) // 짝수
            {
                a++
            }
            else{
                b++
            }
        }
        answer[0] = a
        answer[1] = b
        return answer
    }
}