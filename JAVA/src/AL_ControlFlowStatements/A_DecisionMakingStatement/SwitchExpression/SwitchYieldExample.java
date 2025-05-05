package AL_ControlFlowStatements.A_DecisionMakingStatement.SwitchExpression;

public class SwitchYieldExample {
    public static void main(String[] args) {
        int marks = 82;

        String grade = switch (marks / 10) {
            case 10, 9 -> "A";
            case 8 -> {
                System.out.println("Well done!");
                yield "B";
            }
            case 7 -> {
                System.out.println("Good effort.");
                yield "C";
            }
            default -> {
                System.out.println("Needs improvement.");
                yield "D";
            }
        };

        System.out.println("Grade: " + grade);
    }
}

