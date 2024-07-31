class Dog(var name:String
          ,var breed:String,var color:String,)
{

}

fun main() {
    var dog1 = Dog("Rex","German Shepherd","brown")
    println(dog1.name +" "+ dog1.breed)
    var dog2 = Dog("Max","Rottweiler","black")
    println(dog2.name +" "+ dog2.color)
    var dog3 = Dog("Tokyo","Husky","White")
    println(dog3.name +" "+ dog3.breed)


}