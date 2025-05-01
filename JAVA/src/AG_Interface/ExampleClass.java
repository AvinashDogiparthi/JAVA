package AG_Interface;


public class ExampleClass extends AbstractClass implements InterfaceA, InterfaceB {

    // Point 3: Overriding interface method with SAME or MORE permissive access
    @Override
    public void methodA() {
        System.out.println("methodA() implemented. Interface value = " + VALUE);
    }

    @Override
    public void methodB() {
        System.out.println("methodB() implemented from InterfaceB");
    }

    // Point 5: Abstract class method overridden here
    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod() overridden from AbstractClass");
    }

    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass();
        obj.methodA();             // From InterfaceA
        obj.methodB();             // From InterfaceB
        obj.abstractMethod();      // From AbstractClass
        obj.concreteMethod();      // Concrete method from AbstractClass

        // Accessing interface field (Point 1)
        System.out.println("Accessing VALUE directly: " + InterfaceA.VALUE);
    }
}
