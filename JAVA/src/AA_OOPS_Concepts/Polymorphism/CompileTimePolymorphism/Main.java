package AA_OOPS_Concepts.Polymorphism.CompileTimePolymorphism;

import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();

        int result1  = mathOperation.add(1,2);
        int result2 = mathOperation.add(2,3,4);
    }
}
