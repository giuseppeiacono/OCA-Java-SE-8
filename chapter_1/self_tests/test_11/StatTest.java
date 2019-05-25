// insert code here
class StatTest {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}

/**
 * _______________________________________________________________________________________
 *
 * CORRECT answers |
 * -----------------
 *  C. import static java.lang.Integer.*;
 *  E. import static java.lang.Integer.MAX_VALUE;
 *
 *  They are correct syntax for static imports. Line 4 isn't making use of static imports,
 *  so the code will also compile with none of the imports.
 * _______________________________________________________________________________________
 */

/**
 * !! WRONG answers !!
 * -------------------
 *  A. import static java.lang;
 *  B. import static java.lang.Integer;
 *  D. static import java.lang.Integer.*;
 *  F. None of the above statements are valid import syntax
 */