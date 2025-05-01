package AH_JAVA8and9_Interface.A_Default;

public interface Vehicle {

    default void start(){
        System.out.println("Vehicle is starting .............");
    }

    void stop();
}
