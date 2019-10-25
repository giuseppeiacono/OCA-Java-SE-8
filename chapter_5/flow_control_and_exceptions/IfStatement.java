/**
 * Examples of difficulties that you could find in the exam concerning to if and switch statement.
 */
public class IfStatement {

    public static void main(String[] args) {

        // The indenting try to mislead you. Else belong to the second if
        if (1>3)
            if (0.2 < 0.61)
                System.out.println("internal if");
            else System.out.println("else");

        // Illegal conditions because trueInt and falseInt are integer,
        // while the only legal expression in an if test is a boolean
        int trueInt = 1;
        int falseInt = 0;
        if (trueInt) {}
        if (trueInt == true) {}
        if (1) {}
        if (falseInt == false) {}
    }

}