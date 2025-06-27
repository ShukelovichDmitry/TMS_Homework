package Lesson13

//Домашнее задание 1
fun task1(listOfNumber: List<Int>, operation: (Int, Int) -> Int): Int {
    return listOfNumber.reduce(operation);
}

//Домашнее задание 2
fun task2(listOfPerson: List<Person>) {
    listOfPerson.filter { person -> person.age >= 18 }
        .sortedByDescending { person -> person.age }
        .let { it.forEach { println(it) } }
}

//Домашнее задание 3
fun task3(listOfLong: List<Long>): Long {
    return listOfLong.asSequence()
        .filter { it % 2L == 0L }
        .map { it*it }
        .sum()
}

fun main() {
    //Домашнее задание 1
    val listOfNumber = listOf(1,2,3,4,5,6,7,8,9,10,11)
    val result = task1(listOfNumber, {acc, curr -> acc + curr});
    println(result)

    //Домашнее задание 2
    var listOfPerson = listOf(Person("Алексей", 13), Person("Дмитрий", 30),
        Person("Александр", 19), Person("Даниил", 15), Person("Антон", 24))
    task2(listOfPerson)

    //Домашнее задание 3
    val listOfLong = (1L..1000000L).toList()
    val result2 = task3(listOfLong)
    println(result2)
}