import java.util.*


//연관관계 : 인접행렬로 구현

val check = BooleanArray(1001)
var n = 0
var g = Array(0){IntArray(0)}
var q: Queue<Int> = LinkedList()
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
     n = nextInt()
    val m = nextInt()
    val start = nextInt()
    g = Array(n+1){IntArray(n+1)}
    for(i in 0 until m){
        graph(nextInt(), nextInt()) //인접행렬로 그래프 저장
    }

    dfs(start)
    println()
    check.fill(false)
    bfs(start)

}

fun graph(a:Int, b:Int){
    g[a][b] = 1
    g[b][a] = 1
}

fun dfs(start:Int){
    check[start] = true //시작노드는 방문한 것으로
    print("$start ")
    for (i in 1..n){
        if(g[start][i] == 1 && !check[i]){
            dfs(i) // 1~n노드
        }
    }
}

fun bfs(start: Int){

    check[start] = true
    q.add(start)
    while (!q.isEmpty()){
       val start =  q.poll()
        print("$start ")

        for (i in 1..n){
            if (g[start][i] == 1 && !check[i]){
                check[i] = true
                q.add(i)
            }
        }

    }

}



