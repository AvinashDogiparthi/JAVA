package AL_ControlFlowStatements.A_DecisionMakingStatement;

public class ScoreChecker {

    public static void main(String[] args) {
        int marks = 85;

        // if statement
        if (marks >= 50) {
            System.out.println("You passed.");
        }

        // if-else statement
        if (marks >= 90) {
            System.out.println("Excellent");
        } else {
            System.out.println("Keep improving");
        }

        // if-else-if ladder
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // switch statement
        int gradeCode = 2; // Let's assume this comes from some logic
        switch (gradeCode) {
            case 1:
                System.out.println("Outstanding");
                break;
            case 2:
                System.out.println("Very Good");
                break;
            case 3:
                System.out.println("Good");
                break;
            default:
                System.out.println("No grade available");
        }

        // since Java 7, the switch statement supports String values directly.

        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the work week!");
                break;
            case "Friday":
                System.out.println("Almost weekend!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Just another weekday.");
        }
    }
}
