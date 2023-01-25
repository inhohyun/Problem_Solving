import java.util.*
//슈도코드
/* 기본적인 구현문제
- 0~9를 리스트에 저장하고 주어진 수를 하나씩 비교
- 주어진 수가 리스트에 있을 경우, 리스트에서 수를 삭제
- 주어진 수가 리스트에 없을 경우, 리스트에 0~9를 추가
- 만약 주어진 수가 6이나 9일 경우 리스트에 6이나 9를 사용 가능
* */


fun main(args: Array<String>): Unit = with(Scanner(System.`in`)) {
    val n = nextInt()
    val list = mutableListOf<Int>(0,1,2,3,4,5,6,7,8,9)
    var count = 1
    val m = n.toString()
    //주어진 수를 하나씩 탐색
    for(i in 0 until m.length){
        val num:Int = m[i].digitToInt()
        if (list.contains(num)){
            list.remove(num)
        }
        else{
            if (num == 6 || num == 9){
                if (list.contains(6) ){
                    list.remove(6)
                    continue

                }
                else if (list.contains(9)){
                    list.remove(9)
                    continue


                }

            }
            list.add(0)
            list.add(1)
            list.add(2)
            list.add(3)
            list.add(4)
            list.add(5)
            list.add(6)
            list.add(7)
            list.add(8)
            list.add(9)
            count++
            list.remove(num)

        }
    }
    print(count)

}

