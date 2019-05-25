

public class TestDays {
    public enum Days { MON, TUE, WED };
    public static void main(String[] args) {
        for(Days d : Days.values() )
            ;
        Days [] d2 = Days.values();
        System.out.println(d2[2]);
    }
}

/**
 * __________________________________________________________________________
 *
 * CORRECT answers |
 * -----------------
 *  B. WED
 *
 *  Every enum comes with a static values() method that returns an array
 *  of the enum 's values in the order in which they are declared in the enum
 * ___________________________________________________________________________
 */

/**
 * !! WRONG answers !!
 * -------------------
 *  A. TUE
 *  C. The output is unpredictable
 *  D. Compilation fails due to an error on line 4
 *  E. Compilation fails due to an error on line 6
 *  F. Compilation fails due to an error on line 8
 *  G. Compilation fails due to an error on line 9
 */