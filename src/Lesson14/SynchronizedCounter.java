package Lesson14;

public class SynchronizedCounter {
    private int counter;

    public SynchronizedCounter() {
        counter = 0;
    }

    public synchronized void increment()  {
        counter++;
    }

    public synchronized void decrement() {
        counter--;
    }

    public int get() {
        return counter;
    }
}
