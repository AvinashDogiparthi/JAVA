package AF_ClassesInDepth.E_GenericClass;

public class Main {

    public static void main(String[] args) {
        Print<Integer> print = new Print<>();
        print.setValue(10);
        System.out.println("Integer value: " + print.getValue());

        Print<String> printString = new Print<>();
        printString.setValue("Hello, Generics!");
        System.out.println("String value: " + printString.getValue());
    }
}
