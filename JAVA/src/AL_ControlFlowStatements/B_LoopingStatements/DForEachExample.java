package AL_ControlFlowStatements.B_LoopingStatements;

public class DForEachExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using for-each to loop through the array
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}

