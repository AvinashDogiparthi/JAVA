package AJ_Reflection.B_MethodLevelReflection.usingGetDeclaredMethods;
import java.lang.reflect.*;
public class Main {

    public static void main(String[] args) {
        Class eagleObject = Eagle.class;

        Method[] methods = eagleObject.getDeclaredMethods();

        for(Method method : methods){
            System.out.println("Method name  : " + method.getName());
            System.out.println("Method return type  : " + method.getReturnType());
            System.out.println("Class Name  : "+ method.getDeclaringClass());
        }
    }
}
