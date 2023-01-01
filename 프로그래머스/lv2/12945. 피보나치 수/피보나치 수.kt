class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var p = arrayOfNulls<Int>(n+1)
        p[0] = 0
        p[1] = 1
        for(i in 2..n){
            p[i] = (p[i-1]!!.plus(p[i-2]!!)) % 1234567
        }
        
        return p[n]!!.toInt()
    }
}