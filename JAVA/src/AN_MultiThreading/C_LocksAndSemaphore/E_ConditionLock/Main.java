package AN_MultiThreading.C_LocksAndSemaphore.E_ConditionLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(() -> {
            try {
                sharedResource.produce(reentrantLock, condition);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                sharedResource.consume(reentrantLock, condition);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}
