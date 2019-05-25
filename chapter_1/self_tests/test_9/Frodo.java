


public class Frodo extends Hobbit {
    public static void main(String[] args) {
        int myGold = 7;
        System.out.println(countGold(myGold, 6));
    }
}
class Hobbit {
    int countGold(int x, int y) { return x + y; }
}

/**
 * _________________________________________________________________
 *
 * CORRECT answers |
 * -----------------
 *  D. Compilation fails due to an error on line 7
 *
 *  The countGold() method cannot be invoked from a static context
 * _________________________________________________________________
 */

/**
 * !! WRONG answers !!
 * -------------------
 *  A. 13
 *  B. Compilation fails due to multiple errors
 *  C. Compilation fails due to an error on line 6
 *  E. Compilation fails due to an error on line 11
 */