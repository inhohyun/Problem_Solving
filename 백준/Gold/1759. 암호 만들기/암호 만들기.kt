import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var l = nextInt()
    var c = nextInt()
    var alpha = arrayOfNulls<String>(c)
    for (i in 0 until c) {
        alpha[i] = next()
    }
    alpha.sort()

    go(l, alpha, "", 0)


}

//만들어야되는 길이, 재료, 만든 번호, 사용할지 말지 결정해야하는 알파벳의 인덱스
fun go(l: Int, alpha: Array<String?>, password: String, i: Int) {
    if (password.length == l) { // 종료조건
        if (check(password)) println(password)
        return
    }
    if (alpha.size <= i) return //

    go(l, alpha, password + alpha[i], i + 1)
    go(l, alpha, password, i + 1)


}

//만든 암호가 모음하나 이상, 자음 둘 이상으로 구성되었는지 확인하기
fun check(password: String): Boolean {
    var mo = 0
    var ja = 0
    for (i in password.indices) {
        if (password[i] == 'a' || password[i] == 'e' || password[i] == 'i' || password[i] == 'o' || password[i] == 'u')
            mo++
        else ja++
    }

    return mo >= 1 && ja >= 2
}








