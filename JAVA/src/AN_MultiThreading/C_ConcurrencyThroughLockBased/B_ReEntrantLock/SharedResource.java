package AN_MultiThreading.C_ConcurrencyThroughLockBased.B_ReEntrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {


    public synchronized void produce(ReentrantLock reentrantLock) throws InterruptedException {
        reentrantLock.lock();
        System.out.println("SharedResource::produce --- inside produce method which was triggered by : "+Thread.currentThread().getName());

        Thread.sleep(4000);

        reentrantLock.unlock();
        System.out.println("SharedResouce::produce ---- completed produce method which was triggered by : "+Thread.currentThread().getName());
    }
}

