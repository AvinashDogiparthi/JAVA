package AN_MultiThreading.C_LocksAndSemaphore.A_Synchronized;

public class SharedResource {

    public synchronized void produce() throws InterruptedException {
        System.out.println("SharedResource::produce --- inside produce method which was triggered by : "+Thread.currentThread().getName());

        Thread.sleep(4000);

        System.out.println("SharedResouce::produce ---- completed produce method which was triggered by : "+Thread.currentThread().getName());
    }
}
