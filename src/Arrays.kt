fun main(){
    var courses = arrayOf("MIT","Android","Data")
    println(courses[1])

    //Reassigning an element in an array
    courses[1] = "Web development"
    println(courses[1])

    //looping through an array
    var newcourse =  courses.plus("Cybersecurity")
    for (courses in newcourse){
        println(courses)
    }

     //Size of an array
    println(courses.size)
    println(newcourse.size)
}