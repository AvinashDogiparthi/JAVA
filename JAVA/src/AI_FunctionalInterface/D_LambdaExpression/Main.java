package AI_FunctionalInterface.D_LambdaExpression;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Bird birdObject = (String val) -> {
            System.out.println(val);
        };

        birdObject.canFly("Avinash");

    }
}
