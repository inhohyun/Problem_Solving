import java.util.*

var count = 0
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextInt()
    var arr = IntArray(n)
    for (i in 0 until n) {
        val a = nextInt()


        arr[i] =    go(0, a)


    }


    arr.forEach { println(it) }
}

fun go(sum: Int, goal: Int):Int {
    if (sum > goal) return 0
    if (sum == goal) return 1
    var now = 0
    for (i in 1..3) {
        now += go(sum + i, goal)

    }
    return  now
}






