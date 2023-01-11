class Solution {
    fun solution(n: Int): Long {
        var answer: Long = 0
        var d = LongArray(n+1)
        if(n == 1)
        return 1
        if(n == 2)
        return 2
        
        d[0] = 0
        d[1] = 1L
        d[2] = 2L
        
        for(i in 3..n){
            d[i] = (d[i-1] + d[i-2]) % 1234567
        }
        
        
    
        return d[n]
    }
}