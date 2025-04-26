package AA_OOPS_Concepts.Abstraction.Interface;

public class Main {
    public static void main(String[] args) {

        //makeSound is an abstract method in the Animal interface which hides the internal implementation and shows only essential functionality to user
        Animal cat = new Cat();
        Animal tiger = new Tiger();

        cat.makeSound(); // Output: Meowing
        tiger.makeSound(); // Output: Roaring
    }
}
