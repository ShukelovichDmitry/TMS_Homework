package Lesson9

class Paladin(): Player() {
    override val name = "Paladin"
    override val armor = HeavyArmor()
    override val weapon = Hammer()
    override var health = 150
}