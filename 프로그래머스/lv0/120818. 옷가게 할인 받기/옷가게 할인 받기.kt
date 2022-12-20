class Solution {
    //실패하는 케이스...는 뭘까?
    fun solution(price: Int): Int {
        var answer: Int = 0
         when(price){
             in 0..99999 -> 
             return price
             in 100000..299999 ->
             return price * 95/100
             in 300000..499999 ->
             return price * 90/100
             //50만 보다 큰 경우
             else  ->
             return price * 80/100
          
         }
      
        return answer
    }
}