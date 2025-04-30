package AF_ClassesInDepth.H_SingletonClassCreationWays.E_BillPugh_Solution;

public class SingletonExample {

    // this will make use of eager initialization but by fixing the object initialization issue

    private SingletonExample() {

    }

    /**
     * Public method to provide access to the Singleton instance.
     * The instance is created and returned by the static nested class.
     *
     * Advantages:
     * - Lazy initialization: The instance is created only when getInstance() is called.
     * - Thread safety: The JVM guarantees thread safety during class loading.
     */
    private static class SingletonExampleHelper{
        // The inner static class SingletonExampleHelper is not loaded until getInstance() is called.
        // When getInstance() is first called:
        // 1. JVM loads the SingletonHelper class.
        // 2. It initializes the INSTANCE_OBJECT variable (thread-safe due to JVM's class loader).
        // Class loading in Java is thread-safe and guarantees the instance is created safely and only once.
        private static final SingletonExample INSTANCE_OBJECT = new SingletonExample();
    }

    public static SingletonExample getInstance(){
        return SingletonExampleHelper.INSTANCE_OBJECT;
    }
}
