import java.util.Scanner

var d = IntArray(0)
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    var n = nextInt()
    d = IntArray(n+1)
    println(go(n))
    

}
fun go(n:Int):Int{
    if (n == 1)return 0
    //작은 문제에 값이 이미 있을 경우
if (d[n]>0){
    return d[n]
}
    d[n] = go(n-1)+1
    if (n%2 ==0){
        var temp = go(n/2)+1
        if (d[n]>temp){
            d[n] = temp
        }
    }
    if (n%3 ==0){
        var temp = go(n/3)+1
        if (d[n]>temp){
            d[n] = temp
        }
    }
    return d[n]
}