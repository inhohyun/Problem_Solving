class Solution {
    var list = mutableListOf<Char>()
    
    fun solution(s: String): Int {
        var answer: Int = 0
        var s2 = s //회전시킬 문자열
        var sNum = s2.length // 회전시킬 횟수
        
        while(sNum-- > 0){
          var temp = ""
         //조건에 맞는지 확인
        if(check(s2)){
            answer++
        }
        
        //문자열 회전시키기
        for(i in 1 until s.length){
            temp += s2[i].toString()
        }
        temp += s2[0].toString()
        s2 = temp
        }               
        return answer
    }
    
    //올바른 문자열인지 판단해주는 함수
    fun check(s:String) : Boolean{
        //마지막이 여는 괄호일경우 올바를 수 없음
         if(s[s.length-1] == '(' || s[s.length-1] == '{' || s[s.length-1] == '[')
            {
             return false
            }
            if(s.length %2 != 0){
                return false
            }
            
        for(i in 0 until s.length){
          
            if(s[i] == '(' || s[i] == '{' || s[i] == '[')
            {
               list.add(s[i]) 
            }
            else if(s[i] == ')'){
                if(list.contains('(')&& list.last() == '('){
                                       list.removeLast()

                    
                }
                else{
                    return false
                }
            }
            else if(s[i] == ']'){
                if(list.contains('[')&& list.last() == '['){
                                        list.removeLast()

                }
                else{
                    return false
                }
            }
            else if(s[i] == '}'){
                if(list.contains('{')&& list.last() == '{'){
                    list.removeLast()
                }
                else{
                    return false
                }
            }
        }
        
        return true
    }
}