class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0
        
        fun dfs(index:Int, temp:Int){
            if(index < numbers.size-1)
            {
                dfs(index+1, temp+numbers[index])
                dfs(index+1, temp-numbers[index])
            }
            else 
            {
                if(temp+numbers[index] == target || temp-numbers[index] == target){
                    answer++
                }
            }
        }
        dfs(0,0)
        return answer
    }
}