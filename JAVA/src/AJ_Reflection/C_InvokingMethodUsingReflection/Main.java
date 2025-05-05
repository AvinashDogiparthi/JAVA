package AJ_Reflection.C_InvokingMethodUsingReflection;
import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class eagleClass = Eagle.class;

        Object eagleObject = eagleClass.newInstance();
        Method flyMethod = eagleClass.getMethod("fly",int.class,boolean.class,String.class);
        flyMethod.invoke(eagleObject,1,true,"Avinash");
    }
}
