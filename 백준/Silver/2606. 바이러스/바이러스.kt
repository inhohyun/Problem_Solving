import java.util.*

var n : Int = 0
var m : Int = 0

var graph = Array(101){Array(101){0}}
var visit = Array(101){0}

fun main(args : Array<String>) = with(Scanner(System.`in`)) {

    var a : Int
    var b : Int


    n = nextInt()
    m = nextInt()

    for(i in 0 until m){

        a = nextInt()
        b=  nextInt()

        graph[a][b] = 1
        graph[b][a] = 1

    }

    dfs(1)

    println(visit.filter { it==1 }.size-1)
   

}

fun dfs(x : Int){
    visit[x] = 1

    for(i in 1..n){
        if(visit[i] ==1 || graph[x][i] ==0) continue

        dfs(i)
    }

}