package multithreading.javaUtilConcurrentEx;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.secondThread();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        task.show();
    }
}

class Task {
    private int anInt;
    private Lock lock = new ReentrantLock();

    private void setIncrement() {
        for (int i = 0; i < 10000; i++) {
            anInt++;
        }
    }

    public void firstThread() {
        lock.lock();
        setIncrement();
        lock.unlock();
    }

    public void secondThread() {
        lock.lock();
        setIncrement();
        lock.unlock();
    }

    public void show() {
        System.out.println(anInt);
    }
}