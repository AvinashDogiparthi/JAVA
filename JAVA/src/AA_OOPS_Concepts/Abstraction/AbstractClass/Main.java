package AA_OOPS_Concepts.Abstraction.AbstractClass;

public class Main {
    public static void main(String[] args){

        //makeSound is an abstract method in the Animal abstract class which hides the internal implementation and shows only essential functionality to user
        Animal cat = new Cat();
        cat.makeSound(); // Output: Meowing
        cat.eat(); // Output: This animal eats food

        Animal tiger = new Tiger();
        tiger.makeSound(); // Output: Roaring
        tiger.eat(); // Output: This animal eats food
    }
}
