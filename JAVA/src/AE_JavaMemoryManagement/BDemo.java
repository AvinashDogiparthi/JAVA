package AE_JavaMemoryManagement;

public class BDemo {
    public static void main(String[] args) {
        int a = 10;   // stored in stack
        int b = 20;   // stored in stack
        int sum = add(a, b);  // stack frame created for add()

        System.out.println(sum);
    }

    static int add(int x, int y) {
        int result = x + y;  // stored in stack
        return result;
    }
}
//
//Stack:
//        - main() frame: a, b, sum
//        - add() frame: x, y, result
//
//Heap:
//        - (Nothing unless objects are created)


