class Solution {
         //에라토스테네스로 소수 구하기
         //주어진 문자열로 만들 수 있는 수 구하기 -> 재귀로 구현
    val setList = mutableSetOf<Int>()
    
    fun solution(numbers: String): Int {
        var answer = 0
        val prime = Array(20000000){true}
        prime[0] = false
        prime[1] = false
        
        for(i in 2..10000000){
            if(prime[i]){
                for(j in 2*i..10000000 step i)
                prime[j] = false
            }
        }        
    makeNum("", numbers)
    
        return setList.filter{prime[it] == true}.count()
    }
    fun makeNum(number:String, others:String){
        if(!number.equals(""))
        setList.add(Integer.valueOf(number))
        
        for(i in 0..others.length-1){
            makeNum(number + others[i], others.substring(0, i)+others.substring(i+1))
        }
    }
    
}