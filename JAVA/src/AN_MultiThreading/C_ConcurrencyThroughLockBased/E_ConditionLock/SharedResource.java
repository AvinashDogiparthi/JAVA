package AN_MultiThreading.C_ConcurrencyThroughLockBased.E_ConditionLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    private boolean isAvailable = false;


    public void produce(ReentrantLock reentrantLock, Condition condition) throws InterruptedException {
        reentrantLock.lock();
        System.out.println("SharedResource::produce --- inside produce method which was triggered by : "+Thread.currentThread().getName());

        while (isAvailable) {
            condition.await();
        }

        if(!isAvailable){
            System.out.println("SharedResource::produce -- since not available producing one");
            isAvailable = true;
        }

        System.out.println("SharedResouce::produce ---- completed produce method which was triggered by : "+Thread.currentThread().getName());
        condition.signalAll();
        reentrantLock.unlock();
    }

    public void consume(ReentrantLock reentrantLock, Condition condition) throws InterruptedException {
        reentrantLock.lock();
        System.out.println("SharedResource::consume --- inside consume method which was triggered by : "+Thread.currentThread().getName());

        while (!isAvailable) {
            condition.await();
        }

        if(isAvailable){
            System.out.println("SharedResource::consume -- since not available consuming one");
            isAvailable = false;
        }
        System.out.println("SharedResouce::consume ---- completed consume method which was triggered by : "+Thread.currentThread().getName());
        condition.signalAll();
        reentrantLock.unlock();
    }
}
