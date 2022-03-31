package aquarium


class Shark: AquariumFish(), FishAction {

    override val color = "gray"
    override fun eat() {

        println("Hunt and eat some fish")
    }
}

/*class Plecostomus: AquariumFish(), FishAction {

    override val color = "gold"
    override fun eat() {

        println("Swallow algae")
    }
}

/*interface FishAction{

    fun eat()
}*/