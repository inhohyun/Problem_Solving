import java.util.*

fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    var n = nextInt()
    val arr = Array(101) { IntArray(101) }
//검은 종이는 가로세로가 10
//검은 종이 영역을 +1하고 0이 아닌 구간의 개수를 세면 됨
    while (n-- > 0) {
        val x = nextInt()
        val y = nextInt()
        for (i in x..x + 9) {
            for (j in y..y + 9) {
                arr[i][j] += 1
            }
        }
    }
    var ans = 0
    for (i in 1..100) {
        for (j in 1..100) {
            if (arr[i][j] >= 1)
                ans++
        }
    }
    print(ans)
}




