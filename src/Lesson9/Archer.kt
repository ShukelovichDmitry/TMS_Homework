package Lesson9

class Archer: Player() {
    override val name = "Archer"
    override val armor = LowArmor()
    override val weapon = Bow()
    override var health = 75
}