import java.util.*



fun main(args : Array<String>) = with(Scanner(System.`in`)) {

    val n = nextInt()
    var answer = 0
    for (i in 0 until n){
        var m = nextInt()
        if(isPrime(m)){
            answer++
        }
    }
print(answer)
}

fun isPrime(num:Int):Boolean{

    if(num == 1 || num == 0 ){return false}
    for(i in 2..num/2){
        if(num%i == 0){
            return false
        }
    }
    return true
}
