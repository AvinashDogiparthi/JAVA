package AA_OOPS_Concepts.Inheritance.D_MultipleInheritance;

public class Duck implements Flyable,Swimmable{


    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
