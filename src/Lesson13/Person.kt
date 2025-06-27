package Lesson13

class Person(val name: String, val age: Int) {
    override fun toString(): String {
        return "Имя: $name, Возраст: $age"
    }
}