import java.util.*


//모두 같은 색일 때까지 재귀 반복
//1. 입력값을 이차원 배열에 저장
//2. 안에 내용이 전부 0이거나 전부 1인지 확인하는 check(boolean) 함수 구현
//3. check 함수에 따라 4등분하는 partition 함수 구현


var board = Array(1) { IntArray(1) }
var white = 0
var blue = 0
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    board = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            board[i][j] = sc.nextInt()
        }
    }
    partition(0, 0, n)
    println(white)
    print(blue)

}

fun partition(row: Int, col: Int, size: Int) {
    if (check(row, col, size)) { //모든 색이 같은 경우
        if (board[row][col] == 0) { //그 색이 파란색인 경우
            white++
        } else { // 그 색이 노란색인 경우
            blue++
        }


        return // 모든 색이 다 같으면 return
    }
    val newSize = size / 2  //크기를 절반씩 나눠가며 진행

    partition(row, col, newSize) // 2사분면
    partition(row, col + newSize, newSize) // 1사분면
    partition(row + newSize, col, newSize) // 3사분면
    partition(row + newSize, col + newSize, newSize) //4사분면


}

fun check(row: Int, col: Int, size: Int): Boolean {

    val color = board[row][col] // 첫번째 원소를 기준으로 검사

    for (i in row until row + size) {
        for (j in col until col + size) {
            if (board[i][j] != color) {
                return false //첫번째 원소랑 다른 색이 있으면 false
            }
        }
    }

//다른 색이 하나도 없었으면 true
    return true
}