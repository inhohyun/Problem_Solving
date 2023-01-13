import java.util.*

//카잉 달력
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var c = nextInt()

var arr = IntArray(c)
  for(i in 0 until c){
      var n = nextInt()
      var m = nextInt()
      var x = nextInt()-1
      var y = nextInt()-1
      var none = true

      for (k in x until (n*m) step(n)){
          if(k % m == y){ // 구하고자하는 값 % m이 y가 됨을 활용
              arr[i] = k+1
              none = false
              break
          }
      }
      if (none){
          arr[i] = -1


      }

  }
       arr.forEach { println(it) }
}






