import java.util.*
import kotlin.math.abs
import kotlin.math.max

var n = 0
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    n = nextInt()
    var arr = Array(n){IntArray(n)}
    for (i in 0 until n) {
        for (j in 0 until n){
            arr[i][j] = nextInt()
        }
    }
    var d = IntArray(n)
    for(i in 0 until n){
        d[i] = i
    }
    var ans = Integer.MAX_VALUE
    do {
        var ok = true
        var sum = 0
        for (i in 0 until n-1){
            if(arr[d[i]][d[i+1]] == 0){ //갈 수 없는 경우
                ok = false
            }else{
                sum += arr[d[i]][d[i+1]]
            }
        }
        if(ok && arr[d[n-1]][d[0]] != 0){
            sum += arr[d[n-1]][d[0]]
            if (ans>sum){
                ans = sum
            }
        }
    }while (per(d))
    println(ans)
}

//변수 두 개(swap할 위치)를 활용해 다음 순열을 구하기
fun per(arr:IntArray): Boolean {
    var i = arr.size-1
    while (i >0 && arr[i-1] >= arr[i]){
        i -= 1
    }

    if(i <= 0) return false

    var j = arr.size-1
    while (arr[j] <= arr[i-1]){
        j-=1
    }
    //위치 swap
    var temp = arr[i-1]
    arr[i-1] = arr[j]
    arr[j] = temp

    j = arr.size-1
    //i번째부터 마지막까지 수 뒤집기
    while (i<j){
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i++
        j--
    }
        return true
}

fun calculate(arr:IntArray): Int{
    var sum = 0
    for (i in 1 until arr.size){
        sum += abs(arr[i] - arr[i-1])
    }
    return sum
}









