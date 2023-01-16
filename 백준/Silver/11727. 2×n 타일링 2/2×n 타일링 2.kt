import java.util.*


fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    var n = nextInt()
    var d = IntArray(1001)
    d[0] = 1
    d[1] = 1
    for (i in 2..n){
        d[i] = d[i-1]+d[i-2]+d[i-2]
        d[i] %= 10007
    }

    print(d[n])
}






