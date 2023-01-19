import java.util.*
import kotlin.collections.ArrayList


//인접리스트로 그래프 구현
//구현된 그래프의 개수를 구함
fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()

    val a = Array(n+1){ArrayList<Int>()} //리스트 속성을 리스트로 받음
    for(i in 1 ..n){
        a[i] = ArrayList() // 인접 리스트로 선언
    }

    for(i in 0 until m){
        val u = nextInt()
        val v = nextInt()
        a[u].add(v) // 입력받은 값은 리스트로 연결
        a[v].add(u)
    }

    val check = BooleanArray(n+1)
    var ans = 0
    for(i in 1..n){
        if(!check[i]){
            dfs(a, check, i)
            ans += 1
        }
    }
    println(ans)

}
fun dfs(a: Array<ArrayList<Int>>, c:BooleanArray, x:Int){
    if (c[x]){
        return
    }
  c[x] = true
    for(y in a[x]){
        if (!c[y]){
            dfs(a,c,y)
        }
    }
}

