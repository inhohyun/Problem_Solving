class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var list = ArrayList<Int>()
        for(i in 0..strlist.size-1)
        {
                list.add(strlist[i].length)
        }
    
        
        return list.toIntArray()
    }
}