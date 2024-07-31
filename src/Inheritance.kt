open class Animal {

    var gender = "Male"

    var hasfeathers = true

    fun sound(){
       println("Animal is speaking")
    }

}

open class Eagle:Animal(){
    var hasscales = true
    var ismammal  = true
}


open  class Ostrich:Eagle(){
      fun movement(){
          println("Ostrich is waliking")
      }

}

fun main(){
    var a = Animal()
    var e = Eagle()
    var o = Ostrich()
}