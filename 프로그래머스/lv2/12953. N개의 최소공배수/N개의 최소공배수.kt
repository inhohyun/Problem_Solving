class Solution {
    //배열 원소들의 최소 공배수
    fun solution(arr: IntArray): Int {
        var answer = 0
        var save = arr[0]
        for(i in 1 until arr.size){
            if(i < arr.size){
            save = lcm(arr[i], save)
                
            }
          
            
        }
        return save
    }
    fun lcm(a: Int, b: Int): Int = a*b/gcd(a, b)
    fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
}