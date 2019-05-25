

package pkgB;
import pkgA.*;
public class Baz {
    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.print(" " + f.a);
        System.out.print(" " + f.b);
        System.out.println(" " + f.c);
    }
}

/**
 * _________________________________________________________________________________
 *
 * CORRECT answers |
 * -----------------
 *  D. Compilation fails with an error on line 8
 *  E. Compilation fails with an error on line 9
 *
 *  Variable a as default access, so it cannot be accessed from outside the package.
 *  Variable b as protected access in package pkgA
 * _________________________________________________________________________________
 */

/**
 * !! WRONG answers !!
 * -------------------
 *  A. 5 6 7
 *  B. 5 followed by an exception
 *  C. Compilation fails with an error on line 7
 *  F. Compilation fails with an error on line 10
 */