import java.util.Scanner

fun main(){
    var read =Scanner(System.`in`)



    println("Enter letter:")
    var letter = read.next().single()

    if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
        println("$letter is not consonant")
    }
    else{
        println("$letter is a consonant")
    }

}