fun main() {
    var firstname = "Ryan"
    var lastname = "eMobilis"

    println(firstname)
//Accessing in character in a string
    println(firstname[1])

//Modifying a string
    println(firstname.uppercase())
    println(lastname.lowercase())

//String concatenation - Joining string
    println(firstname+" "+lastname)
    println(firstname.plus(lastname))

//String Interpolation
    println("My firstname is "+firstname)
    println("My firstname is $firstname")

    var  num1 = 34
    var  num2 = 20
    println("the sum of $num1 and $num2 is "+(num1+num2))
}