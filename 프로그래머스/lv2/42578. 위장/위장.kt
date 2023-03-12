class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val hash = HashMap<String, Int>()
        
        for(cloth in clothes){
            val key = cloth[1]
            
            if(hash.containsKey(key)){
                val v = hash[key]
                v?.let {
                    hash.put(key, v + 1)
                }
            }
            else {
                hash.put(key, 1)
            }
        }
        
        for(keyValue in hash){
            answer *= (keyValue.value + 1)
        }
        
        return answer - 1
    }
}