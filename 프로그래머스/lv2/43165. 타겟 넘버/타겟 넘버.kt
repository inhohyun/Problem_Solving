class Solution {
    //numbers안에 수로 target을 만드는 방법
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0
     
 
       fun dfs(index: Int, result: Int){
        if(index == numbers.size){
            if(result == target){
              answer++
            }
        }
        else{
            dfs(index+1, result+numbers[index])
            dfs(index+1, result-numbers[index])
        }
       }
       dfs(0,0)
          return answer
    }
}