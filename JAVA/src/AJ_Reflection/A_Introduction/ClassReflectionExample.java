package AJ_Reflection.A_Introduction;
import java.lang.reflect.*;

public class ClassReflectionExample {
    public static void main(String[] args) throws Exception {
        // Get Class object using Class.forName or .class
        Class<?> cls = Class.forName("Employee");

        // Print class name
        System.out.println("Class Name: " + cls.getName());

        // Print all declared fields
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("Field: " + f.getName());
        }

        // Print all declared methods
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        // Print all constructors
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println("Constructor: " + c);
        }
    }
}
