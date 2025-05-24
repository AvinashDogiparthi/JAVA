package AN_MultiThreading.B_ThreadJoining;

public class WithoutThreadJoin {

    public static void main(String[] args) {

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

            System.out.println("Started thread12 execution");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Completed sleep for thread2");
        });

        thread1.start();
        thread2.start();

        System.out.println("Exiting from main thread");
    }
}
