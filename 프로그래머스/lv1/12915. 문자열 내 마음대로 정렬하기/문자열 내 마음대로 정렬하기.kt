class Solution {
    //원소의 n번째 글짜끼리 비교하여 정렬
    fun solution(strings: Array<String>, n: Int): Array<String> = 
    strings.sorted().sortedBy{it[n]}.toTypedArray()
}