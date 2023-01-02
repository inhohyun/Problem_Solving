import java.util.*

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer:IntArray
        var queue:Queue<Int> = LinkedList<Int>()
        
        /* 개발하는데 필요한 일수 구하기 */
        for(i in 0..progresses.size-1){
            var leftDay = 0

            leftDay = (100-progresses[i])/speeds[i]
            if((100-progresses[i])%speeds[i] != 0){
                leftDay++
            }
            queue.add(leftDay)
        }

        /* Queue의 앞 날짜보다 작은 일수 세기 */
        var result = mutableListOf<Int>()

        while(!queue.isEmpty()) {
            var count = 1
            var first = queue.poll()

            while (!queue.isEmpty() && queue.peek() <= first) {
                queue.remove()
                count++

            }
            result.add(count)
        }
        answer = result.toIntArray()

        return answer
    }
}