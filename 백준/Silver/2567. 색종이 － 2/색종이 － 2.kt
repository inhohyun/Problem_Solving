





























import java.util.*
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
//이차원 배열 위에 0과 1로 표시
     val arr = Array(101){IntArray(101)}

     var n = nextInt()
     while(n-- > 0){
          val x = nextInt()
          val y = nextInt()
          for (i in x until x+10){
               for (j in y until y+10){
                    arr[i][j] = 1
               }
          }
     }

     //1이 접하고있는 0의 개수
     //맨 마지막 부분은 배열을 0으로 둘러싸서 해결(배열 크기를 늘려줌)
     //가로 세로 구분해서 탐색
     var ans = 0
     for (i in 0 until arr.size){
          for (j in 0 until arr.size){

               if (arr[i][j] == 0){
                    //가로 길이
                    if (i+1 < arr.size && arr[i+1][j] != 0  ){
                         ans++
                    }
                    if (i!=0 &&arr[i-1][j] !=0){
                         ans++
                    }
                    //세로 길이
                    if (j+1< arr.size && arr[i][j+1] != 0 ){
                         ans++
                    }
                    if(j!=0 &&arr[i][j-1] !=0){
                         ans++
                    }
               }
          }
     }
     //반례?
     print(ans)






}


