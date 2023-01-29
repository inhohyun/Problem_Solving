import java.util.*

//1로 바꾸는 경우의 수와 0으로 바꾸는 경우의 수 중 더 작은 것
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val arr = Array(101) { IntArray(101) }
    val n = nextInt()
    val m = nextInt()
    //주어진 범위를 1씩 추가하고 m보다 큰 수들을 보이지 않는 그림들로 취급
   for (a in 0 until n){
        val x1 = nextInt()
        val y1 = nextInt()
        val x2 = nextInt()
        val y2 = nextInt()
        for (i in x1..x2) {
            for (j in y1..y2) {
                arr[i][j] += 1 // 가릴때마다 1씩 증가시키기
            }
        }
    }
    var ans = 0
    for (i in 1..100) {
        for (j in 1..100) {
            if (arr[i][j] > m)
            ans++
        }
    }
    print(ans)


}

