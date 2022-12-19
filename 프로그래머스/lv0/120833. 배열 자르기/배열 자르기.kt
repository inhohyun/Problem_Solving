class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        var list = ArrayList<Int>()
        for(i in 0..numbers.size-1){
            if(i >= num1 && num2 >= i){
                list.add(numbers[i])
            }
        }
        return list.toIntArray()
    }
}