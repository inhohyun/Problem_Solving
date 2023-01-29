import java.util.*

//1로 바꾸는 경우의 수와 0으로 바꾸는 경우의 수 중 더 작은 것
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val str = next()
    var zero = 0
    var one = 0
    var check = ' '
    for(n in str){
        if (check != n){
            check = n
            if (n == '1')
                one++
            else {
                zero++
            }
        }
    }
print(Math.min(zero, one))
}
