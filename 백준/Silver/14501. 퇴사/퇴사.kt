    import java.util.Scanner

var T = IntArray(0)
    var P = IntArray(0)
    var n = 0
    var max = 0
    fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
         n = nextInt()
        T = IntArray(n+1)
        P = IntArray(n+1)

        for (i in 1..n){
            T[i] = nextInt()
            P[i] = nextInt()
        }
        go(1, 0)
        print(max)
    }

    fun go(day:Int, sum:Int){


        if (day == n+1){
            if (max < sum)max = sum
            return
        }
        if (day > n+1) return



            go(day+T[day], sum+P[day])
            go(day+1, sum)

    }