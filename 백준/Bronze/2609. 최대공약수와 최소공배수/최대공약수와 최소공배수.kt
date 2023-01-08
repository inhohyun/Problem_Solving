import java.util.*



fun main(args : Array<String>) = with(Scanner(System.`in`)) {
var n = nextInt()
    var m = nextInt()
    println( gcd(n, m))
    print((m*n)/gcd(n,m) )


}
fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
