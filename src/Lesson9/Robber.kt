package Lesson9

class Robber: Player() {
    override val name = "Robber"
    override val armor = MediumArmor()
    override val weapon = Daggers()
    override var health = 100
}