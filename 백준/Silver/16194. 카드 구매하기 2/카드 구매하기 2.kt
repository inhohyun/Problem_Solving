import java.util.*

//가격을 d[] 배열에 저장하기
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val n = nextInt()
    val a = IntArray(n+1)
    for(i in 1..n){
        a[i] = nextInt()
    }

    val d = IntArray(n+1){-1}
    d[0] = 0
    //d[n] : 카드 n개를 사려고 할때 최소값
    for (i in 1..n){
        for (j in 1..i){
            if (d[i] == -1 ||d[i] > d[i-j] + a[j])
                d[i] = d[i-j] +a[j]
        }
    }

print(d[n])
}






