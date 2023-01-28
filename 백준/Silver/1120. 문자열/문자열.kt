import java.util.*


fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val (A, B) = readLine()!!.split(" ")
    var ans = A.length
    for (i in 0..(B.length - A.length)) {
        var tmp = 0
        for (j in A.indices) {
            if (A[j] != B[j + i]) tmp++

        }
        if (ans > tmp) ans = tmp //최소값 저장
    }
    print(ans)

}

