import java.util.*
import kotlin.math.abs

//리모컨
var broken = BooleanArray(10) // 고장난 버튼 확인
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var n = nextInt()
    var dis_num = nextInt()

    //고장난 버튼 == true로 설정
    for (i in 0 until dis_num){
        var dis = nextInt()
        broken[dis] = true
    }

    //정답의 초기 값 설정
    var ans = abs(n-100)

    for (i in 0..1000000){
        var c = i
        var len = possible(c) // 숫자의 개수
        if (len > 0){
            var press = abs( c - n)
            if (ans > len + press)
                ans = len + press
        }
    }
    print(ans)




}
//c로 이동 가능하면 c의 숫자의 개수 리턴 불가능하면 0리턴
fun possible(c:Int): Int {
    if (c == 0){
        if (broken[0])return 0
        else return 1
    }
    var len = 0
    var c2 = c
    while (c2 > 0){
        if (broken[c2%10]) return 0
        len+=1
        c2 /= 10
    }

    return len
}

