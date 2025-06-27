package Lesson14;

public class Counter {
    private int counter;
    private final Object syncObj;

    public Counter(Object syncObj) {
        counter = 0;
        this.syncObj = syncObj;
    }

    public void increment() {
        synchronized (syncObj) {
            counter++;
        }
    }

    public void decrement() {
        synchronized (syncObj) {
            counter--;
        }
    }

    public int get() {
        return counter;
    }
}
