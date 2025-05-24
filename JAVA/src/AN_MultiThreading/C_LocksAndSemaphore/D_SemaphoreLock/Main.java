package AN_MultiThreading.C_LocksAndSemaphore.D_SemaphoreLock;

public class Main {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(() -> {
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.setName("ProduceThread1");


        Thread thread2 = new Thread(() -> {
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread2.setName("ProduceThread2");

        Thread thread3 = new Thread(() -> {
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread3.setName("ProduceThread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
