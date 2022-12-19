class Solution {
    fun solution(array: IntArray): Int  = array.sorted().let{
it[it.size /2]
    }
}