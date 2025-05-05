package AL_ControlFlowStatements.A_DecisionMakingStatement.SwitchStatements;

public class NestedSwitchExample {
    public static void main(String[] args) {
        String day = "Saturday";
        int hour = 10;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday routine");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");

                // Nested switch for time-specific activities
                switch (hour) {
                    case 8:
                        System.out.println("Go for a run");
                        break;
                    case 10:
                        System.out.println("Do laundry");
                        break;
                    case 14:
                        System.out.println("Watch a movie");
                        break;
                    default:
                        System.out.println("Relax or read a book");
                }
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}

