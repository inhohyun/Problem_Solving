
class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        var total = 0L
        for(i in 1..count){
            total += price * i
        }
        return if(money > total)0.toLong() else (total.toLong() - money.toLong())
    }
}