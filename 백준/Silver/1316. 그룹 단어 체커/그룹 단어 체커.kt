import java.util.*


fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val n = nextInt()
    var ans = n
    val s = mutableSetOf<Char>()
    var last = ' '
    for (i in 0 until n) {
        val str = next()
        for (j in 0 until str.length) {
            if (last != str[j] && !s.contains(str[j])) { //마지막 단어와 다르고 아직 안나온 단어
                last = str[j] // 마지막 단어 갱신
                s.add(str[j]) // 단어를 저장
            }
            if (last == str[j]) continue //연속된 단어 건너뛰기
            if (last != str[j] && s.contains(str[j])) { //마지막 단어와 다른데 이미있는 단어
                ans--
                break

            }
        }
        s.removeAll(s) // 컬랙션 초기화
        last = ' '
    }
    print(ans)
}

