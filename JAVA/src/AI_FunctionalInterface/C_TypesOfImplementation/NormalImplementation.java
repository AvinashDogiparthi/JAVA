package AI_FunctionalInterface.C_TypesOfImplementation;

public class NormalImplementation implements Bird {

    @Override
    public void canFly(String val){
        System.out.println(val);
    }
}
