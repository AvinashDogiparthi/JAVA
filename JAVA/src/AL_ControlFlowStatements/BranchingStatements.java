package AL_ControlFlowStatements;

public class BranchingStatements {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue;  // Skip i = 3
            }
            if (i == 8) {
                System.out.println("Breaking the loop at i = " + i);
                break;  // Exit the loop when i equals 8
            }
            System.out.println(i);
        }
    }
}
