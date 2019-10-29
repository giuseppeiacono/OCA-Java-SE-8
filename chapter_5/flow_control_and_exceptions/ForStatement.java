/**
 * Peculiarties of for-loop statement.
 */
public class ForStatement {

    public static void main(String[] args) {

        // 3 LEGAL ways to force exit
        ForStatement.forceExitWithReturn();
        ForStatement.forceExitWithBreak();
        ForStatement.forceExitWithSystemExit();

        // It's LEGAL, but not a good practice
        for ( ; ; ) {
            System.out.println("None of the three sections of the for declaration are required");
            break; // it avoid infinite loop due to missing conditional test
        }
    }

    private static boolean forceExitWithReturn() {
        for (int x = 1; x < 3; x++) {
            System.out.println("For loop was executed " + x + " time before ---> return statement");
            return true;
        }
        return false;
    }

    private static void forceExitWithBreak() {
        for (int x = 1; x < 3; x++) {
            System.out.println("For loop was executed " + x + " time before ---> break statement");
            break;
        }
    }

    private static void forceExitWithSystemExit() {
        for (int x = 1; x < 3; x++) {
            System.out.println("For loop was executed " + x + " time before ---> System.exit() statement");
            System.exit(0);
        }
    }

}
