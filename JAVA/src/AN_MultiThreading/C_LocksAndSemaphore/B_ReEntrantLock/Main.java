package AN_MultiThreading.C_LocksAndSemaphore.B_ReEntrantLock;

import AN_MultiThreading.C_LocksAndSemaphore.B_ReEntrantLock.SharedResource;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        ReentrantLock reentrantLock = new ReentrantLock();
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();
        Thread thread1 = new Thread(() -> {
            try {
                resource1.produce(reentrantLock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                resource2.produce(reentrantLock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}
