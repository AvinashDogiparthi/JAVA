package AN_MultiThreading.C_LocksAndSemaphore.C_ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

        Thread thread1 = new Thread(() -> {
            try {
                sharedResource.produce(reentrantReadWriteLock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.setName("ProduceThread1");


        Thread thread2 = new Thread(() -> {
            try {
                sharedResource.produce(reentrantReadWriteLock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread2.setName("ProduceThread2");

        SharedResource sharedResource1 = new SharedResource();
        Thread thread3 = new Thread(() -> {
            try {
                sharedResource1.produce(reentrantReadWriteLock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread3.setName("ProduceThread3");

        Thread thread4 = new Thread(() -> {
            try {
                sharedResource.consume(reentrantReadWriteLock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread4.setName("ConsumeThread4");

        Thread thread5 = new Thread(() -> {
            try {
                sharedResource1.consume(reentrantReadWriteLock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread5.setName("ConsumeThread5");

        thread4.start();
//        thread5.start();
        thread2.start();
        thread1.start();
        thread3.start();
//        thread4.start();
        thread5.start();
    }
}
