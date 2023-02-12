class Solution {
    var answer = 0
    var visited = BooleanArray(0)
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        visited = BooleanArray(dungeons.size)
        
        dfs(0, k, dungeons)
        return answer
    }
    
    fun dfs(depth:Int, p:Int, dungeons: Array<IntArray>){
        for(i in 0 until dungeons.size){
            if(!visited[i] && dungeons[i][0] <= p){
                visited[i] = true
                dfs(depth+1, p-dungeons[i][1], dungeons)
                  visited[i] = false
            }
            
            answer = Math.max(answer, depth)
        }
    }
    
}