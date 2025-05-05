package AK_ExceptionHandling.B_TypesOfException.RunTimeException;

public class RunTimeExceptionExample {

    public static void main(String[] args) {
        String s = null;

        // Throws NullPointerException
        //System.out.println(s.length());

        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
        //	at AK_ExceptionHandling.B_TypesOfException.RunTimeException.RunTimeExceptionExample.main(RunTimeExceptionExample.java:7)
    }
}
