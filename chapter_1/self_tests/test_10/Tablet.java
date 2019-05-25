interface Gadget {
    void doStuff();
}
abstract class Electronic {
    void getPower() { System.out.print("plug in "); }
}
public class Tablet extends Electronic implements Gadget {
    void doStuff() { System.out.print("show book "); }
    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}

/**
 * ____________________________________________________________________
 *
 * CORRECT answers |
 * -----------------
 *  A. The class Tablet will NOT compile
 *
 *  By default, an interface's methods are public so the Tablet.doStuff
 *  method must be public, too. The rest of the code is valid
 * ____________________________________________________________________
 */

/**
 * !! WRONG answers !!
 * -------------------
 *  B. The interface Gadget will NOT compile
 *  C. The output will be plug in show book
 *  D. The abstract class Electronic will NOT compile
 *  E. The class Tablet CANNOT both extend and implement
 */