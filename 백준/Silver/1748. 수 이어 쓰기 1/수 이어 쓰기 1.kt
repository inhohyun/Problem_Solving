import java.util.*


fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var n = nextInt()
    var answer = 0
    var divider = 10
    var plus = 1
    //수를 구하려고하면 메모리초과 -> 길이만 구하기
    for(i in 1..n){
        if(i % divider ==  0){ // 10,100,1000...이 될때 자릿수가 변함
            divider *= 10
            plus++ // 자릿수 증가
        }
answer += plus
    }
    print(answer)
}



