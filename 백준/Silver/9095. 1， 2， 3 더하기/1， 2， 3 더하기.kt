import java.util.*

//123 더하기
/* 슈도코드
1.  경우의 수 : number는 최대 10 따라서 사용 가능 한 경우의 수는 3의 10승 -> 10중 for문으로 풀이 가능
* */
var count = 0
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    var ans = IntArray(n)

    for (i in 0 until n){
        var number = nextInt() // 분해할 수, 0 < number < 11
        sum(number-1)
        sum(number-2)
        sum(number-3)
        ans[i] = count
            count = 0
    }


    ans.forEach {
        println(it)
    }
}
fun sum(c:Int): Int{
if (c < 0) return 0
if (c == 0){
    count++
    return count
}
    sum(c-1)
    sum(c-2)
    sum(c-3)


    return count
}





