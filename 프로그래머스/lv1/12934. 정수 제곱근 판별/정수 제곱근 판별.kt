class Solution {

    fun solution(n: Long): Long {
     for(i in 1..n){
         if(n == i*i )
         return ((i+1) * (i+1)).toLong()
     }
        
        return -1
    }
}