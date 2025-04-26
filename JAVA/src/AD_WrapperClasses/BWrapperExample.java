package AD_WrapperClasses;

public class BWrapperExample {
    public static void main(String[] args) {
        int num = 10;          // primitive
        Integer obj = new Integer(num);  // wrapping manually (older way)

        System.out.println(obj);  // Output: 10
    }
}

