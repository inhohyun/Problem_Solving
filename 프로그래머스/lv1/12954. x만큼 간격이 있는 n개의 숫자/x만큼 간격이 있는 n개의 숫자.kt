class Solution {
    //n은 자연수
    //
   fun solution(x: Int, n: Int): LongArray = LongArray(n) { x.toLong() * (it + 1) }
}