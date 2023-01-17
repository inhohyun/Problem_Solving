import java.util.*

//카드를 n개 사려고할때의 최대값을 구하시오
//가격을 d[] 배열에 저장하기
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    var n = nextInt()
    var a = IntArray(n+1)
    for(i in 1..n){
        a[i] = nextInt()
    }
    var d = IntArray(n+1)
    for (i in 1..n){
        for (j in 1..i){
            if (d[i] < d[i-j] +a[j])
                d[i] = d[i-j] +a[j]
        }
    }
print(d[n])




}






