package AG_Interface;

abstract class AbstractClass {
    abstract void abstractMethod(); // Not forced to override in subclass

    void concreteMethod() {
        System.out.println("Concrete method in AbstractClass");
    }
}
