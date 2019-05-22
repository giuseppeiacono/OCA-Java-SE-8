package oca.exam_1Z0_808.chapter_1.self_tests.test_2;

class Rocket {
    private void blastOff() { System.out.print("bang "); }
}

public class Shuttle {
    public static void main(String[] arg) {
        new Shuttle().go();
    }
    void go() {
        blastOff();
        // Rocket.blastOff();  // line A
    }
    private void blastOff() { System.out.print("sh-bang "); }
}


/**
 * ______________________________________________________________________________
 *
 * CORRECT answers |
 * -----------------
 *  B. As the code stands, the output is sh-bang
 *  F. If line A is uncommented, compilation fails
 *
 *  They are correct since Rocket.blastOff() is private, it can't be overridden,
 *  and is is invisible to class Shuttle
 * ______________________________________________________________________________
 */

/**
 * !! WRONG answers !!
 * -------------------
 *  A. As the code stands, the output is bang
 *  C. As the code stands, compilation fails
 *  D. If line A is uncommented, the output is bang bang
 *  E. If line A is uncommented, the output is sh-bang bang
 */