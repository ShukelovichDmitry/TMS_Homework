package Lesson14;

public class HomeWork {
    public static final int ITERATION_COUNT = 10000;

    //Урок 14 Задание 1
    public static void task1() throws InterruptedException {
        Counter counter = new Counter(new Object());
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < ITERATION_COUNT; i++)
                counter.increment();
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < ITERATION_COUNT; i++)
                counter.decrement();
        });
        thread1.start();
        thread2.start();
        thread1.join();
        System.out.println("Синхронизация внешним объектом 1: " + counter.get());
        thread2.join();
        System.out.println("Синхронизация внешним объектом 2: " + counter.get());
    }

    //Урок 14 Задание 2
    public static void task2() throws InterruptedException {
        AtomicCounter atomicCounter = new AtomicCounter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < ITERATION_COUNT; i++)
                atomicCounter.increment();
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < ITERATION_COUNT; i++)
                atomicCounter.decrement();
        });
        thread1.start();
        thread2.start();
        thread1.join();
        System.out.println("Синхронизация AtomicInteger 1: " + atomicCounter.get());
        thread2.join();
        System.out.println("Синхронизация AtomicInteger 2: " + atomicCounter.get());
    }

    //Урок 14 Задание 3
    public static void task3() throws InterruptedException {
        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < ITERATION_COUNT; i++)
                synchronizedCounter.increment();
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < ITERATION_COUNT; i++)
                synchronizedCounter.decrement();
        });
        thread1.start();
        thread2.start();
        thread1.join();
        System.out.println("Синхронизрованный счётчик 1: " + synchronizedCounter.get());
        thread2.join();
        System.out.println("Синхронизрованный счётчик 2: " + synchronizedCounter.get());
    }

    public static void main(String[] args) throws InterruptedException {
        //Урок 14 Задание 1
        task1();
        //Урок 14 Задание 2
        task2();
        //Урок 14 Задание 3
        task3();
    }
}
