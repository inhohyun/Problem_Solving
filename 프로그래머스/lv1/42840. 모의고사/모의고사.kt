class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = IntArray(0)
        val one = intArrayOf(1,2,3,4,5)
        val two = intArrayOf(2,1,2,3,2,4,2,5)
        val three = intArrayOf(3,3,1,1,2,2,4,4,5,5)
        var oneAnswer = 0
        var twoAnswer = 0
        var threeAnswer = 0
        for(i in 0 until answers.size){
         val j = i % 5
                 if(answers[i] == one[j])  {
                     oneAnswer++
                 }  
        }
          for(i in 0 until answers.size){
         val j = i % 8
                 if(answers[i] == two[j])  {
                     twoAnswer++
                 }  
        }
        for(i in 0 until answers.size){
         val j = i % 10
                 if(answers[i] == three[j])  {
                     threeAnswer++
                 }  
        }
    //1번이 최다일때
        if(oneAnswer > twoAnswer && oneAnswer > threeAnswer){
           answer = IntArray(1)
            answer[0] = 1
        }
        //2번이 최다일때
        else if(oneAnswer < twoAnswer && twoAnswer > threeAnswer)
        {
              answer = IntArray(1)
            answer[0] = 2
        }
        //3번이 최다일때
        else if(threeAnswer > twoAnswer && oneAnswer < threeAnswer){
              answer = IntArray(1)
            answer[0] = 3
        }
        //1,2번이 최다일때
        else if(oneAnswer == twoAnswer && oneAnswer > threeAnswer){
             answer = IntArray(2)
            answer[0] = 1
            answer[1] = 2
        }
        //1,3번이 최다일때
        else if(oneAnswer == threeAnswer && oneAnswer > twoAnswer){
                answer = IntArray(2)
            answer[0] = 1
            answer[1] = 3
        }
        //2,3번이 최다일때
        else if(twoAnswer == threeAnswer && twoAnswer > oneAnswer){
               answer = IntArray(2)
            answer[0] = 2
            answer[1] = 3
        }
        //1,2,3번이 최다일때
        else{
             answer = IntArray(3)
            answer[0] = 1
            answer[1] = 2
            answer[2] = 3
        }
        
        
        return answer
    }
}