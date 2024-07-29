fun main() {
    var marks = 70

    var grade = when(marks){
        80 -> 'A'
        70 -> 'B'
        60 -> 'C'
        50 -> 'D'

        else -> "E come to my office young man"
    }
    println("Students scored a $grade")
}