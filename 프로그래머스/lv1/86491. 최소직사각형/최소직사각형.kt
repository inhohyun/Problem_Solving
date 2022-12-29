class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var wMax = 0
        var hMax = 0
        for(s in sizes){
            wMax = maxOf(wMax, s[0], s[1])
            hMax = Math.max(hMax, if(s[0]<s[1]) s[0] else s[1])
        }
        
        
        return hMax * wMax
    }
}