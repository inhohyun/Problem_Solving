import java.util.Scanner

//순서가 연속되서 나오면 안됨 : 이차원 배열로 사용한 수를 나타냄?
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val mod = 1000000009L
    val limit = 100000
    val d = Array(limit+1){LongArray(4)}
    for(i in 1..limit){
        if (i-1 >= 0){
            d[i][1] = d[i-1][2]+d[i-1][3]
            if(i == 1){
                d[i][1] = 1
            }
        }
        if (i-2 >=0){
            d[i][2] = d[i-2][1] + d[i-2][3]
            if (i == 2){
                d[i][2] = 1
            }
        }
        if (i-3 >= 0){
            d[i][3] = d[i-3][1] + d[i-3][2]
            if (i==3){
                d[i][3] = 1
            }
        }
        d[i][1] %= mod
        d[i][2] %= mod
        d[i][3] %= mod
    }
    val t = nextInt()
    val ans = LongArray(t)
    for(i in 0 until t){
       val n = nextInt()
      ans[i] = (d[n][1]+d[n][2]+d[n][3])%mod
    }
    ans.forEach {
        println(it)
    }
}
