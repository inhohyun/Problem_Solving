import java.util.*
import kotlin.math.max
import kotlin.math.min

//꼭짓점의 값이 모두 같은 가장 큰 크기의 정사각형 찾기
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val map = Array(n) { readLine()!!.toCharArray() }
    var max = 0

    for (i in 0 until n){
        for (j in 0 until m){
            //정사각형의 한 변의 최대길이
            val maxSize = min(m-j,n-i)

            for (k in maxSize downTo 1){
                if(map[i][j] == map[i+k-1][j+k-1] &&
                    map[i][j] == map[i][j+k-1]&&
                    map[i][j] == map[i+k-1][j]){
                    max = max(k*k, max)//조건을 만족하는 최대값
                }
            }


        }
    }
    print(max)
}