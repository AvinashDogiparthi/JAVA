package AN_MultiThreading.C_ConcurrencyThroughLockBased.A_Synchronized;

public class WhenNotSharingCommonObject {
    public static void main(String[] args) {

        // when sharing common object
        SharedResource resource1 = new SharedResource();
        Thread thread1 = new Thread(() -> {
            try {
                resource1.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        SharedResource resource2 = new SharedResource();
        Thread thread2 = new Thread(() -> {
            try {
                resource2.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}
