package Lesson2

//Дополнительное задание №1
fun checkList(uncheckedList: List<String?>): List<String>{
    return uncheckedList
        .filter { it != null && it.length > 0 }
        .map { it?.substring(0,10) as String }
        .toList()
}

//Дополнительное задание №2
fun FizzBuzz(){
    for (i in 1..100){
        if(i%15 == 0) print("FizzBuzz ")
        else if(i%3 == 0) print("Fizz ")
        else if(i%5 == 0) print("Buzz ")
        else print("$i ")
    }
}

//Дополнительное задание №3
fun describeObject(any: Any){
    when(any){
        (any is Number && any.toLong() > 0) -> print("Число положительное")
        (any is Number && any.toLong() < 0) -> print("Число отрицательное")
        (any is String && any.toString().length > 5) -> print("Это строка")
        else -> print("Неизвестный тип")
    }
}

fun main(){
    val a = 5
    describeObject(a)
}