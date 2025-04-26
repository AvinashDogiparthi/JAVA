package AC_Variable;

public class FTypeConversionExample {
    public static void main(String[] args) {
        // Widening (Automatic)
        int a = 10;
        long b = a;       // int to long (no cast)
        float c = b;       // long to float (no cast)

        System.out.println("Widening Examples:");
        System.out.println("int a: " + a);
        System.out.println("long b: " + b);
        System.out.println("float c: " + c);

        // Narrowing (Manual)
        double x = 9.78;
        int y = (int) x;   // double to int (manual cast)

        System.out.println("\nNarrowing Example:");
        System.out.println("double x: " + x);
        System.out.println("int y: " + y);
    }
}

