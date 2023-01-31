import java.util.*


//끝까지 자르므로 maxX와 maxY의 값을 곱하는 식으로 하면 될듯
//이차원 배열로 표현 안하고 일차원 두 개로도 가능할듯
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val n = nextInt() //가로
    val m = nextInt() //세로

    val cutN = IntArray(n + 1)
    val cutM = IntArray(m + 1)

    val cutNum = nextInt()
    for (i in 0 until cutNum) {
        val xy = nextInt() //자를 선 가로세로 구분
        val wh = nextInt() //자르는 번호
        if (wh == 0) { //안 자르는 경우
            continue
        }
        if (xy == 0) { //가로로 자름
            cutM[wh] = 1
        } else if (xy == 1) { //세로로 자름
            cutN[wh] = 1
        }


    }

    var maxX = 0
    var temp = 0
    //배열에서 연속되는 0의 최대값을 구하면 됨
    for (j in 1..n) {

            temp++
        if (cutN[j] == 1 || j==n)
        {
            maxX = Math.max(temp, maxX)
            temp = 0
        }


    }
    var maxY = 0
    temp = 0
    for (j in 1..m) {
        temp++
        if (cutM[j] == 1 || j==m)
        {
            maxY = Math.max(temp, maxY)
            temp = 0
        }


    }
    print(maxX * maxY)

}








