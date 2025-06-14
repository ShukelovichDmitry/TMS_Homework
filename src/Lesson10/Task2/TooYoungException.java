package Lesson10.Task2;

public class TooYoungException extends Exception {
    public TooYoungException() {
        super("Запрещено для лиц, младше 18 лет");
    }
}
