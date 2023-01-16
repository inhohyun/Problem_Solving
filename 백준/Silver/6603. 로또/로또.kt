import java.util.*


var n = 0
var arr: IntArray = intArrayOf()
var visited: BooleanArray = booleanArrayOf()

fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    while (true){
         n = nextInt()
        if(n == 0) break
         arr = IntArray(n)
        visited = BooleanArray(n)

        for(i in 0 until n){
            arr[i] = nextInt()
        }
        dfs(0,0)
        println()
    }

}
fun dfs(start:Int, depth:Int){
    if (depth == 6){
        printL()
    }
    for (i in start until n){
        visited[i] = true
        dfs(i+1, depth+1)
        visited[i] = false
    }
}

fun printL(){
    for (i in 0 until n){
        if (visited[i])
            print("${arr[i]} ")
    }
    println()
}








