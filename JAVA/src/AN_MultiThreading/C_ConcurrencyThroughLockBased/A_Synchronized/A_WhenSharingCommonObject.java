package AN_MultiThreading.C_ConcurrencyThroughLockBased.A_Synchronized;

public class A_WhenSharingCommonObject {

    public static void main(String[] args) {

        // when sharing common object
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(() -> {
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}
