import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs


fun main(args: Array<String>) = with(Scanner(System.`in`)) {
   val e = nextInt()
    val s = nextInt()
    val m = nextInt()
    var ecopy = 1
    var scopy = 1
    var mcopy = 1
    var count = 1

    while (true) {
        if (e == ecopy && s == scopy && mcopy == m) break

            ecopy++;
            scopy++;
            mcopy++;
            count++

        if (ecopy > 15) ecopy = 1
        if (scopy > 28) scopy = 1
        if (mcopy > 19) mcopy = 1

    }
    print(count)


}



