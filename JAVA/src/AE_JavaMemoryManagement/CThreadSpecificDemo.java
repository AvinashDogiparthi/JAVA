package AE_JavaMemoryManagement;

public class CThreadSpecificDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> doWork(), "Thread-1");
        Thread t2 = new Thread(() -> doWork(), "Thread-2");

        t1.start();
        t2.start();
    }

    static void doWork() {
        int x = 5;  // Local variable (stored in stack of each thread)
        System.out.println(Thread.currentThread().getName() + " x = " + x);
        // ✅ Even though both threads are running the same method doWork(),
        // ✅ Each thread has its own Stack storing a separate copy of variable x.
    }
}

