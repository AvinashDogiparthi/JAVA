package AA_OOPS_Concepts.Polymorphism.RunTimePolymorphism;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(); // Animal reference and object
        Animal dog = new Dog(); // Animal reference but Dog object
        Animal cat = new Cat(); // Animal reference but Cat object

        animal.sound(); // Runs the method in Animal class
        dog.sound(); // Runs the method in Dog class
        cat.sound(); // Runs the method in Cat class
    }
}
