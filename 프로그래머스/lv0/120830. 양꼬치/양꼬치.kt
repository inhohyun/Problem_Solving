class Solution {
    fun solution(n: Int, k: Int): Int {
        
        var ang = 12000 * n
        var juc = 2000 * k
        var service = n/10 * 2000
        
        var answer: Int = ang + juc - service
        return answer
    }
}