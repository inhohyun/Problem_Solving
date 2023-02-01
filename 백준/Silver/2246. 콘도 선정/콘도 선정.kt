import java.util.*


fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
     val n = nextInt()

     //1. 더 가까운데 숙박비가 더 싼 경우
     //2. 더 먼데 숙박비가 더 비싼 경우
     val arr = Array(n){IntArray(2)} // 입력받은 모든 경우를 비교해야하므로 배열로 비교

     var ans = 0
     for(i in 0 until n){
          arr[i][0] = nextInt() // 거리
          arr[i][1] = nextInt() // 비용
     }
     for (i in 0 until n){
          var can = true //후보군인지 확인
          for (j in 0 until n){

               if (i == j) continue

               if(arr[i][0] >= arr[j][0]){
                    if (arr[i][1] >= arr[j][1]){
                         can = false
                         continue
                    }
               }

               if (arr[i][1] >= arr[j][1]){
                    if (arr[i][0]>= arr[j][0]){
                         can = false
                         continue
                    }
               }
          }
          if (can)ans++
     }
     print(ans)




}