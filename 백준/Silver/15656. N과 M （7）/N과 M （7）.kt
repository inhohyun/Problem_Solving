import java.lang.StringBuilder
import java.util.*
/* 문제분석
1. 주어진 수만 활용하여 출력
* */
var c = BooleanArray(10)
var a = IntArray(10)
val sb = StringBuilder()
val n2 = mutableListOf<Int>()
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()
    for (i in 0 until n){
        val b = nextInt()
        n2.add(i,b)
    }
n2.sort()
go(0, n,m)
    print(sb.toString())
}

fun go(index:Int, n:Int,m:Int){
    if(index == m){

        for(j in 0 until m){
            sb.append(a[j])
            if (j != m-1) sb.append(" ") //마지막 자리가 아니면 공백으로 구분
        }
        sb.append("\n")
        return
    }
    for (i in 1..n){
//        if (c[i]) continue
//
//        c[i] = true
        a[index] = n2[i-1]

        go(index+1,n, m)
//        c[i] = false
    }
}




