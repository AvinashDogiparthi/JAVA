package AF_ClassesInDepth.B_AbstractClass;

class Dog extends Animal {

    Dog(String name) {
        super(name); // Calling abstract class constructor
    }

    // Providing body for abstract method
    void sound() {
        System.out.println(name + " barks: Woof Woof!");
    }
}
