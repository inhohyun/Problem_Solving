import java.util.*

var n = 0
var t = IntArray(0)
var p = IntArray(0)
var ans = 0

//모든 일 수를 탐색
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    n = nextInt()
    t = IntArray(n + 1)
    p = IntArray(n + 1)
    for (i in 1.. n) {
        t[i] = nextInt()
        p[i] = nextInt()
    }

    go(1, 0)
    println(ans)

}

//최대 수익을 리턴하는 함수, 파라미터: 현재 날짜, 현재 더한 값
//더할껀지 말껀지 선택하는 문제
//sum : day-1일까지 수익
fun go(day: Int, sum: Int) {
    if (day == n + 1) {
        if (ans < sum) ans = sum
        return
    }
    if (day > n + 1) return

    go(day + 1, sum)
    go(day + t[day], sum + p[day])

}









