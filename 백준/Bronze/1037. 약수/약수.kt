import java.util.*



fun main(args : Array<String>) = with(Scanner(System.`in`)) {
 var n = nextInt()
    var max = 0
    var min = Integer.MAX_VALUE
    for (i in 0 until n){
        var m = nextInt()
        if(m > max) max = m
        if(m < min) min = m


    }
 print(max * min)


}

