package AN_MultiThreading.C_ConcurrencyThroughLockBased.C_ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {

    public void produce(ReentrantReadWriteLock lock) throws InterruptedException {
        lock.readLock().lock();

        System.out.println("SharedResource::produce --- inside produce method which was triggered by : "+Thread.currentThread().getName());
        Thread.sleep(4000);

        lock.readLock().unlock();
        System.out.println("SharedResouce::produce ---- completed produce method which was triggered by : "+Thread.currentThread().getName());
    }

    public void consume(ReentrantReadWriteLock lock) throws InterruptedException {
        lock.writeLock().lock();

        System.out.println("SharedResource::produce --- inside consume method which was triggered by : "+Thread.currentThread().getName());
        Thread.sleep(4000);

        System.out.println("SharedResouce::produce ---- completed consume method which was triggered by : "+Thread.currentThread().getName());
        lock.writeLock().unlock();
    }
}
