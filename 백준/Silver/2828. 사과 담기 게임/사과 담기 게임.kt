import java.util.Scanner
import kotlin.math.abs


fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val n = nextInt() // 맵의 넓이
    val m = nextInt() // 바구니의 넓이
    val apple = nextInt() // 사과의 개수
    var sum = 0 //이동한거리
    var left = 1 //바구니의 왼쪽 좌표
    var right = m //바구니의 오른쪽 좌표
    for(i in 0 until apple){
        val where = nextInt() // 떨어진 사과의 위치
        if (where <=right && where >=left)continue // 바구니안에 떨어진 경우

        if (where < left){ //왼쪽에 떨어진 경우
            sum +=(left - where)
            right -=(left-where)
            left = where

        }
        else{
            sum +=(where-right)

            left +=(where-right)
            right = where
        }
    }
    print(sum)

}


