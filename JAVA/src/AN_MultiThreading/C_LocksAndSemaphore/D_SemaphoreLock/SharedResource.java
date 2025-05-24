package AN_MultiThreading.C_LocksAndSemaphore.D_SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {

    Semaphore semaphore = new Semaphore(2);

    public void produce() throws InterruptedException {
        semaphore.acquire();
        System.out.println("SharedResource::produce --- inside produce method which was triggered by : "+Thread.currentThread().getName());

        Thread.sleep(4000);

        semaphore.release();
        System.out.println("SharedResouce::produce ---- completed produce method which was triggered by : "+Thread.currentThread().getName());
    }
}
