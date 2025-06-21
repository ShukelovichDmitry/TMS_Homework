package Lesson9

class Game {

    private val playerOne: Player = createPlayer(1)
    private val playerTwo: Player = createPlayer(2)

    private var lastRoll = 0

    val CHARGED_MULTIPLIER = 1.5f
    val BLOCKED_MULTIPLIER = 0.5f

    fun createPlayer(number: Int): Player {
        println("Игрок $number выберите персонажа:")
        println("1) Паладин")
        println("2) Разбойник")
        println("3) Лучник")
        val value = readLine()?.toInt() ?: 1
        return when (value) {
            1 -> Paladin()
            2 -> Robber()
            3 -> Archer()
            else -> Paladin()
        }
    }

    fun attack(attacker: Player, defender: Player, roll: Int, crit: Boolean){
        if(roll >= lastRoll && defender.isBlockActive() || roll >= 3 && !defender.isBlockActive()) {
            if (crit) {
                defender.takeDamage((CHARGED_MULTIPLIER * attacker.useWeapon()).toInt())
            } else {
                defender.takeDamage(attacker.useWeapon())
            }
        } else if(roll < 3 && !defender.isBlockActive()) {
            if (crit) {
                defender.takeDamage((BLOCKED_MULTIPLIER * attacker.useWeapon()).toInt())
            } else {
                println("Аттака не удалась")
            }
        } else if(roll < lastRoll && defender.isBlockActive()) {
            println("Аттака блокирована")
        }
        lastRoll = 0
    }

    fun play(){
        var step = 0
        var value = 0
        var isMovePlayerOne = false
        var attacker: Player
        var defender: Player

        while (playerOne.isAlive() && playerTwo.isAlive()) {
            isMovePlayerOne = step % 2 == 0

            if (isMovePlayerOne) {
                println("Ходит игрок 1")
                attacker = playerOne
                defender = playerTwo
            } else {
                println("Ходит игрок 2")
                attacker = playerTwo
                defender = playerOne
            }

            do {
                println("Выберите действие")
                println("1 - Атака")
                //Критичесикй урон
                println("2 - Сильная атака")
                //Блокирование уменьшает урон
                println("3 - Блокирование")
                value = readLine()?.toInt() ?: 1
                if (value == 2 && !attacker.useChargedAttack()) {
                    println("Вы больше не можете использовать сильную атаку")
                    value = 0
                }
            } while (value < 1)
            val roll = (1..6).random()
            println("Кубик: $roll")

            when (value) {
                1 -> attack(attacker, defender, roll,false)
                2 -> attack(attacker, defender, roll,true)
                else -> {
                    attacker.setBlock(true)
                    lastRoll = value
                }
            }

            step++
            attacker.setBlock(false)
        }

        println("--- ИГРА ОКОНЧЕНА ---")
        if (playerOne.isAlive()) {
            println("Победил игрок 1")
        } else {
            println("Победил игрок 2")
        }
    }
}