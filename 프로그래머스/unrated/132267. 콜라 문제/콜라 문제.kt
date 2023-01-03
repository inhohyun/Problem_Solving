class Solution {
    //n : 현재 가지고있는 병의 수
    //a : 최소 가져가야하는 병의 수
    //b : a개를 가져가면 돌려주는 병의 수
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var a1 = a
        var b1 = b
        var n1 = n

        while(n1 >= a1){
          
            answer += b1 * (n1 / a1) // 받은 콜라의 수
            n1 = (n1 % a1) + (b1 * (n1 / a1)) // 남은 콜라의 수
            
        }
        return answer
    }
}