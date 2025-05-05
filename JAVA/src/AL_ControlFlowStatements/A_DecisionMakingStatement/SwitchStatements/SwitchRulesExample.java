package AL_ControlFlowStatements.A_DecisionMakingStatement.SwitchStatements;

public class SwitchRulesExample {

    // Rule 3: Constants must be declared as `final`
    static final String MONDAY = "Monday"; // ✅ Valid constant
    static String FRIDAY = "Friday";       // ❌ Not final, can't be used in case

    public static void main(String[] args) {
        String day = "Monday";

        // Switch expression example
        String message = switch (day) {

            // Rule 1: Unique values only
            case MONDAY -> "Start of the week";
            // case "Monday" -> "Duplicate case"; // ❌ Error: duplicate value

            // Rule 2: Same data type (String in this case)
            case "Tuesday" -> "Keep going";
            // case 1 -> "Wrong type"; // ❌ Error: int is not compatible with String

            // Rule 3: Case values must be literals or final constants
            // case FRIDAY -> "Almost weekend"; // ❌ Error: FRIDAY is not final

            // Rule 4: Not all cases must be handled if `default` is used
            default -> "Some other day";
        };

        System.out.println(message);
    }
}

