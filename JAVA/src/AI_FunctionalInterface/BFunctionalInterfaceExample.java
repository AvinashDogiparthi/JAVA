package AI_FunctionalInterface;

@FunctionalInterface
public interface BFunctionalInterfaceExample {

    void getHeight();

    default void canEat(){
        // implementation
    }

    static void canBark(){
        // static method implementation
    }

    String toString(); // as we know everything in JAVA extends Object Class
}
