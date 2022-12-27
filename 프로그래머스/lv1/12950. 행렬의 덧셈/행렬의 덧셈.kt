class Solution {
    //이차원 배열의 합?
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    
        var len = arr1.size
        var row = arr1[0].size
        var answer = Array(len, {IntArray(row, {0})})
        for(i in 0..len-1){
            for(j in 0..row-1){
                answer[i][j] = arr1[i][j] + arr2[i][j]
                
            }
            
        }
        
        
        return answer
    }
}