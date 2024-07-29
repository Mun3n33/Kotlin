import java.util.Scanner
import kotlin.math.max

fun main() {
    var read = Scanner(System.`in`)

    println("Enter value 1:")
    var l = read.nextDouble()

    println("Enter value 2:")
    var w = read.nextDouble()

    if (l > w ){
        println("$l is the greatest")
    }
    else  if( w > l ){
        println("$w is the greatest")
    }


}