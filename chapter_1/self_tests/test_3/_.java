package oca.exam_1Z0_808.chapter_1.self_tests.test_3;

import static java.lang.System.*;

public class _ {
    static public void main(String[] __A_V_) {
        String $ = "";
        for (int x=0; ++x < __A_V_.length; ) {  // for loop
            $ += __A_V_[x];
            out.println($);
        }
    }
}

/**
 * ______________________________________________________________________________
 *
 * CORRECT answers |
 * -----------------
 *  C. A.
 *
 *  Passing arguments {'-', 'A', '.'} we obtain this result
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