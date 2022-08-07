fun main() {
   val squreCabin = SqaureCabin(10)
       with(squreCabin){
           println("\nSquare Cabin\n=========")
           println("Capacity: ${squreCabin.capacity}")
           println("Material: ${squreCabin.buildingMaterial}")
           println("has Room: ${squreCabin.hasRoom()}")
     }
   val roundHut = RoundHut(4)
       with(roundHut){
           println("\nRound Hut\n=========")
           println("Capacity: ${capacity}")
           println("Material: ${buildingMaterial}")
           println("has Room: ${hasRoom()}")
       }
   val roundTower = RoundTower(5)
       with(roundTower){   
           println("\nRound Tower\n=========")
           println("Capacity: ${capacity}")
           println("Material: ${buildingMaterial}")
           println("has Room: ${hasRoom()}")
       }
}

// Base Class - Parent Class - super Class
abstract class Dwelling(private var residents : Int) {
    //Attributes
    abstract val buildingMaterial : String
    abstract val capacity : Int
    // Function - Methods
    fun hasRoom() : Boolean {
        return residents <= capacity
    }
}/
// subclasses
class SqaureCabin(residents : Int) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 10
}
open class RoundHut(residents : Int) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 10
}
class RoundTower(residents : Int) : RoundHut(residents) {
    override val buildingMaterial = "Stone"
    override val capacity = 10
}
