package AA_OOPS_Concepts.Inheritance.C_HierarchicalInheritance;

public class Main {

    public static void main(String[] args) {

        // Hierarchical Inheritance is when multiple subclasses inherit from a single superclass.
        // Each subclass can use methods of Animal + define their own.
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}
