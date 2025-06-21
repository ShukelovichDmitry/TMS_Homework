package Lesson9

abstract class Player() {
    abstract val name: String
    abstract val armor: Armor
    abstract val weapon: Weapon
    abstract var health: Int
    private var activeBlock: Boolean = false
    private var chargedAttackCount: Int = 10

    fun takeDamage(damage: Int) {
        val isArmorCrush = armor.reduceDurability(damage)

        if (isArmorCrush) {
            health -= damage
        } else {
            val notBlockDamage = damage - armor.defense

            if (notBlockDamage > 0) {
                health -= notBlockDamage
            }
        }
        println("$name получил урон в размере $damage, прочность брони: ${armor.durability}, количество хп: $health")
    }

    fun useWeapon() = weapon.getDamage()

    fun isAlive(): Boolean {
        return health > 0
    }

    fun isBlockActive(): Boolean {
        return activeBlock
    }

    fun setBlock(isBlockActive: Boolean) {
        activeBlock = isBlockActive
    }

    fun useChargedAttack(): Boolean {
        if (chargedAttackCount > 0) {
            chargedAttackCount--;
            return true
        }
        return false
    }
}