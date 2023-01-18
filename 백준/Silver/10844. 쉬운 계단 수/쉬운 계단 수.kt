    import java.util.Scanner
    val mod = 1000000000L
    fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
        val n = nextInt()
        val d = Array(n+1){LongArray(10)} //자릿수를 0~9중 어느것인지 이차원배열에서 판별
        for(i in 1..9){
            d[1][i] = 1 // 1의 자릿수는 1로 초기화?

        }
        for(i in 2..n){ //2자리 부터 n자리의 계단수까지 판별
            for (j in 0..9){
                d[i][j] = 0
                if (j-1 >= 0){
                    d[i][j] += d[i-1][j-1]
                }
                if (j+1 <= 9){
                    d[i][j] += d[i-1][j+1]
                }
                d[i][j] %= mod


            }
        }
        var ans = 0L
        for (i in 0..9){
            ans += d[n][i] //자리수가 n인 수 중 끝 자리가 0~9인 모든 수를 더함
        }
        print(ans%mod)


    }
