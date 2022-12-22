class Solution {
    fun solution(emergency: IntArray): IntArray =  emergency.map{
            emergency.sortedDescending().indexOf(it)+1
      //  sortedDescending()
        }.toIntArray()
}