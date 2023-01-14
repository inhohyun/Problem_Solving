import java.lang.StringBuilder
import java.util.*
/* 슈도코드
1. 재귀함수로 반복되는 작업 구현

* */
var c = BooleanArray(10)
var a = IntArray(10)
val sb = StringBuilder()

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var n = nextInt()
    var m = nextInt()

go(0, 1, n,m)
    print(sb)
}

fun go(index:Int,start:Int,n:Int,m:Int){
    if(index == m){

        for(j in 0 until m){
            sb.append(a[j])
            if (j != m-1) sb.append(" ") //마지막 자리가 아니면 공백으로 구분
        }
        sb.append("\n")
        return
    }
    for (i in start..n){
//        if (c[i]) continue
//
//        c[i] = true
        a[index] = i // a에 한 줄씩 저장하여 builder에 저장
        go(index+1, i,n, m)
//        c[i] = false

    }
}




