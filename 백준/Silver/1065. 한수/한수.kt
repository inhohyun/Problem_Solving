private fun main() {

    val s = readLine()!!
    var answer = 0
    for (i in s.toInt() downTo 1) {
        val t = i.toString()
        var isAnswer = true
        if (t.length == 1) {
            answer++
        } else {
            val tmp = t[0].toString().toInt() - t[1].toString().toInt()
            for (j in 0 until t.lastIndex) {
                if (tmp!=t[j].toString().toInt() - t[j+1].toString().toInt())
                 isAnswer= false
            }
            if (isAnswer) answer++
        }
    }
    println(answer)
}