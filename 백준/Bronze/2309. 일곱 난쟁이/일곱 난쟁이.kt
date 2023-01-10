import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

var list = mutableListOf<Int>()
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    for(i in 1..9){
        var n = nextInt()
        list.add(n)
    }
    val sum  = list.sum()
    val two_sum = sum - 100


    loop@ for(i in 0 until 9){
        for(j in 0 until 9){
            if ((list[i] + list[j]) == two_sum && i != j){

                list.removeAt(j) //여러 인덱스를 삭제할 때는  뒤 인덱스부터 삭제해야 오류가 없음
                list.removeAt(i)
                break@loop
                //잘못된 값이 삭제되는 오류 8, 15 -> 15, 25(이게 정상)
            }
            else{
                continue
            }


        }

    }
    list.sort()
    for (a in 0 until list.size){
        println(list[a])
    }
}



