import kotlin.math.PI

fun main() {
   
   val squreCabin = SquareCabin(6, 50.0)
       with(squreCabin){
           println("\nSquare Cabin\n=========")
           println("Capacity: ${capacity}")
           println("Material: ${buildingMaterial}")
           println("Floor Area: ${floorArea()}")
           println("has Room: ${hasRoom()}")
           getRoom()
     }
   
   val roundHut = RoundHut(1, 10.0)
       with(roundHut){
           println("\nRound Hut\n=========")
           println("Capacity: ${capacity}")
           println("Material: ${buildingMaterial}")
           println("Floor Area: ${floorArea()}")
           println("has Room: ${hasRoom()}")
           getRoom()
       }
  
   val roundTower = RoundTower(7, 15.0, 10)
       with(roundTower){   
           println("\nRound Tower\n=========")
           println("Capacity: ${capacity}")
           println("Material: ${buildingMaterial}")
           println("Floor Area: ${floorArea()}")
           println("has Room: ${hasRoom()}")
           getRoom()
       }
}

abstract class Dwelling(private var residents : Int) { 
    abstract val buildingMaterial : String
    abstract val capacity : Int
    fun hasRoom() : Boolean {
        return residents <= capacity
    }
    fun getRoom(){
        if(residents <= capacity){
            println("You got a room!")
        }else {
            println("Sorry, at capacity and no rooms left.")
        }
    }
    abstract fun floorArea() : Double 
}
// subclasses
class SquareCabin(residents : Int, val length : Double) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea() : Double {
        return length * length
  }
}
open class RoundHut(residents : Int, val radius : Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 3
    
    override fun floorArea() : Double {
        return PI * radius * radius
  }
}
class RoundTower(residents : Int, radius : Double, val floors : Int = 2) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    
    override fun floorArea() : Double {
        return super.floorArea() * floors
  }
}
