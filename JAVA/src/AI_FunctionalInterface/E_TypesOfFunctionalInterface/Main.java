package AI_FunctionalInterface.E_TypesOfFunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // Represent an operation, that accept a single input and returns no result
        Consumer<String> loggingObject = (String val) -> {
            System.out.println(val);
        };

        loggingObject.accept("Avinash");


        // Represent the supplier of the result
        // Accepts no input parameter but produce a result
        Supplier<String> isEvenNumber = () -> {
            return "this is a even number";
        };

        isEvenNumber.get();

        //Represent function, that accepts one argument and process it and produce a result
        Function<Integer,String>  function = (Integer num) -> {
            String output = num.toString();
            return output;
        };

        System.out.println(function.apply(64));
    }
}
