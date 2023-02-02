
import java.util.*
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
//이차원 배열 위에 0과 1로 표시
     val arr = Array(101) { IntArray(102) }

     var n = nextInt()
     while (n-- > 0) {
          val x = nextInt()
          val y = nextInt()
          for (i in x until x + 10) {
               for (j in y until y + 10) {
                    if (arr[i][j] == 1)continue

                    arr[i][j] = 1
               }
          }
     }

     //1이 접하고있는 0의 개수
     //가로 세로 구분해서 탐색
     var ans = 0
     for (i in 0 until arr.size) {
          for (j in 0 until arr.size) {
               if (i > 0 && j > 0) {
                    if (arr[i][j] == 1) {
                         if (arr[i][j - 1] == 0) ans++
                         if (arr[i + 1][j] == 0) ans++
                         if (arr[i][j + 1] == 0) ans++
                         if (arr[i - 1][j] == 0) ans++
                    }
               }


          }
     }
     print(ans)


}


