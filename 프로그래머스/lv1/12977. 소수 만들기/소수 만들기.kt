class Solution {
    private var prime= Array(3001){false}
    fun solution(nums: IntArray): Int {
        setprime() // 2~3000의 수 중에 소수만 false
        var answer = 0
        for(i in 0..nums.size-3){
             for(j in i+1..nums.size-2){
                 for(k in j+1..nums.size-1){
            if(!prime[nums[i]+nums[j]+nums[k]])answer++
        }
        }
        }
 

        return answer
    }
    fun setprime(){
        prime[0] = true
        prime[1] = true
        for(i in 2..3000){
            if(!prime[i]) // 소수면
            for(j in i * 2..3000 step i){ //소수의 배수를 true
                prime[j] = true
            }
        }
    }
    
}