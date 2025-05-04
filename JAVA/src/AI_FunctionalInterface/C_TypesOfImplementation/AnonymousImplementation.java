package AI_FunctionalInterface.C_TypesOfImplementation;

public class AnonymousImplementation {

    public static void main(String[] args) {
        Bird birdObject = new Bird(){
            @Override
            public void canFly(String val){
                System.out.println(val);
            }
        };

        birdObject.canFly("Avinash");
    }
}
