import java.util.*

fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    var n = nextInt()
    var list = mutableListOf<String>()
    for (i in 0 until n){
        var str = next()
        list.add(str)
    }
    list.distinct().sortedWith(
        compareBy<String>{it.length} // 길이순 정렬
            .thenBy { it } // 이후 철자 순 정렬
    ).forEach{ println(it) }



}

