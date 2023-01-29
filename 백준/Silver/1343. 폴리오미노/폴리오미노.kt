import java.util.*
//XXXX -> AAAA
//xx -> BB

fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val input = readLine()!!.replace("XXXX", "AAAA").replace("XX", "BB")
    if (input.contains('X'))
        print(-1)
    else
        print(input)



}

