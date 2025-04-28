package AF_ClassesInDepth.B_AbstractClass;

abstract class Animal {

    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Abstract method (no body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}
