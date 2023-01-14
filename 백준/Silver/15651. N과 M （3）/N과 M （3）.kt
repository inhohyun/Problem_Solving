import java.lang.StringBuilder
import java.util.*
//n과 m 3
/* 슈도코드
1. 재귀함수로 반복되는 작업 구현
2. boolean 배열로 사용한 수 구분
* */
var c = BooleanArray(10)
var a = IntArray(10)
val sb = StringBuilder()

fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    var n = nextInt()
    var m = nextInt()
    go(0, n, m)
    print(sb.toString())

}
fun go(index:Int, n:Int, m:Int ){
    //index = m 일때 한 줄 저장하고 종료
    if (index == m){
        for (i in 0 until m){
            sb.append(a[i])
            if (i != m-1) sb.append(" ")

        }
        sb.append("\n")
        return // break point
    }
    for(i in 1..n){
//        if (c[i]) continue // 이미 사용한 수는 건너뛰기
//        c[i] = true
        a[index] = i
        go(index+1,  n, m)
//        c[i] = false // c 초기화
    }


}






