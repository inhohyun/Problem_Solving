class Solution {
    fun solution(before: String, after: String): Int {
        var answer: Int = 0
        var sort1  = before.toCharArray()
        var sort2 = after.toCharArray()
        sort1.sort()
        sort2.sort()
         val check = sort1.contentEquals(sort2)
        
        //접근법은 맞는거 같은데?
        if(check)
        return 1
        else if(!check)
        return 0
        
        
        return answer
    }
}