class Solution {
   
    fun solution(n: Long): Long {
        var answer: Long = 0
        var list = mutableListOf<Int>()
        for(i in 0..n.toString().length-1)
        {
            list.add(n.toString()[i].digitToInt())
        }
        var list2 = list.sortedDescending()
        var str = ""
        //list -> [] 때문에 Long 형으로 형변환이 안되나?, 일단 for문으로 하고 확인
        for(j in 0..list2.size-1){
            str += list2[j].toString()
        }
        
        return str.toLong()
    }
}