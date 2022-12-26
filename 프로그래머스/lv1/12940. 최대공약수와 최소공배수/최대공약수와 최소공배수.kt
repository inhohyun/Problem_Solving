class Solution {
    fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
    fun solution(n: Int, m: Int): IntArray {
        var answer = mutableListOf<Int>()
        var min = n* m / gcd(n, m) //최소 공배수
        var max =  gcd(n, m) //최대 공약수
       
        
          answer.add(max)
              answer.add(min)
          
 
       
        
        
   
    
        return answer.toIntArray()
    }
}