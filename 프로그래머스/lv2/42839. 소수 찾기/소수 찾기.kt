class Solution {
    fun solution(numbers: String): Int {
        var answer = 0
        val s = mutableSetOf<String>()
        fun recursive(temp:String, others:String){
            //비어있지 않으면 set에 추가
            if(!temp.isEmpty()){
                if(temp[0] != '0')
                     s.add(temp)
            }
            //한 글자씩 꺼내와 temp에 붙이기
            for(i in 0 until others.length){
                recursive(temp+others[i], others.substring(0, i)+others.substring(i+1))
            }
        
       
            
        }
        recursive("", numbers)
         s.forEach{
            if(isprime(it.toInt())) answer++
        }
        
        return answer
    }
    
    fun isprime(num:Int):Boolean{
        if(num == 0 || num == 1)return false
        for(i in 2..num/2){
            if(num%i == 0){
                return false
            } 
        }
        return true
    }
}