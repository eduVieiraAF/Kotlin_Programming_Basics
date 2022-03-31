package aquarium

interface AquariumAction{
    fun  eat()
    fun jump()
    fun clean()
    fun cacthFish()
    fun swim() = println("swim, baby")
}

fun delegation(){
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor{
    val color: String
}

abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("Yum")
}

class Plecostomus:
    FishAction by PrintingFishAction("tons of algae"),
    FishColor by GoldColor

object GoldColor: FishColor {
    override val color = "gold"
}

object Redcolor: FishColor{
    override val color = "red"
}

class PrintingFishAction(val food: String): FishAction{
    override fun eat() = println(food)
}