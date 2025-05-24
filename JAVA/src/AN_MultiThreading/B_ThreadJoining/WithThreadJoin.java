package AN_MultiThreading.B_ThreadJoining;

public class WithThreadJoin {

    public static void main(String[] args) throws InterruptedException {

        // join() gives you programmatic control over sequencing, not JVM lifecycle management.
        // If you don’t call join(), main thread print the final message before the threads actually complete — even though the JVM won’t exit until they do.

        Thread thread1 = new Thread(() -> {

            System.out.println("Started thread1 execution");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Completed sleep for thread1");
        });

        Thread thread2 = new Thread(() -> {

            System.out.println("Started thread2 execution");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Completed sleep for thread2");
        });

        thread1.start();
//        thread1.join();

        thread2.start();
//        thread1.join();
        thread2.join();

        System.out.println("Exiting from main thread");
    }
}
