import java.util.*

fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val n = nextInt()
    val k = nextInt()
    val arr = IntArray(n+1)
    var ans = 0
    for (i in 2..n){
        if (arr[i] != 0)continue

        for (j in i..n step i){
            arr[j] = Math.max(arr[j], i)
        }
    }
    for (i in 1..n){
        if(arr[i] <= k)
            ans++
    }

    print(ans)
}
