class Solution {
    //문자로 변환 후 정렬
    fun solution(numbers: IntArray): String {
        var answer = ""
        
        
          numbers.sortedWith(Comparator({o1,o2-> 
       "$o2$o1".compareTo("$o1$o2")}
            )).forEach({answer += it})
   

     
       
        if(answer[0].equals('0')) answer = "0"
        
        return answer
    }
}