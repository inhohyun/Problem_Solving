import java.util.*

var n = 0
var arr = IntArray(n)
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    n = nextInt()
    arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = i+1
    }
    do {
        for (i in 0 until n){
            print("${arr[i]} ")
        }
        println()
    }
        while (per(arr))

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











