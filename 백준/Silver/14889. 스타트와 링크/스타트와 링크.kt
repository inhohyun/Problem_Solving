import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

var n = 0
var s = Array(n+1){IntArray(n+1)}
//스타트팀과 링크팀의 능력치 차이가 최소 : 차이의 절댓값이 최소
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
   n = nextInt()
   s = Array(n){IntArray(n)}

   for(i in 0 until n){
      for (j in 0 until n){
         s[i][j] = nextInt()
      }
   }

   var first = ArrayList<Int>()
   var second = ArrayList<Int>()

   print(go(0, first,second))
}

fun go(index:Int, first:ArrayList<Int>, second:ArrayList<Int>): Int{
   if(index == n) { // 정답을 찾은 경우
      if(first.size != n/2) return -1
      if (second.size != n/2) return -1

      var t1 = 0
      var t2 = 0
      for (i in 0 until n / 2) {
         for (j in 0 until n / 2) {
            if (i == j) continue
            t1 += s[first[i]][first[j]]
            t2 += s[second[i]][second[j]]
         }
      }
      return abs(t1 - t2)
   }

   var ans = -1
   first.add(index)
   val t1 = go(index+1, first,second)
   if (ans == -1 || (t1 != -1 && ans > t1)){
      ans = t1
   }
   first.removeAt(first.size-1)

   second.add(index)
   val t2 = go(index+1, first,second)
   if(ans == -1 || (t2 !=-1 && ans > t2)){
      ans = t2
   }
   second.removeAt(second.size-1)

   return ans
}











