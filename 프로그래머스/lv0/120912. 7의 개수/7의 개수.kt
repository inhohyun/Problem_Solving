class Solution {
    //string으로 변환하여 풀이
    fun solution(array: IntArray): Int {
        var count: Int = 0
        var ex: String = ""
        for(i in 0..array.size-1){ // 모든 원소를 검사
            ex = array[i].toString()
            for(j in 0..ex.length-1)
            {
                if(ex[j] == '7'){
                    count++
                }
            }
        }
        
        return count
    }
}