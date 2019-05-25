public class Electronic implements Device { public void doIt() { } }

abstract class Phone1 extends Electronic { }

abstract class Phone2 extends Electronic { public void doIt(int x) { } }

class Phone3 extends Electronic implements Device { public void doStuff() { } }

interface Device { public void doIt(); }

/**
 * _____________________________________
 *
 * CORRECT answers |
 * -----------------
 *  A. Compilation succeeds
 *
 *  All of these are legal declarations
 * ______________________________________
 */

/**
 * !! WRONG answers !!
 * -------------------
 *  B. Compilation fails with an error on line 1
 *  C. Compilation fails with an error on line 3
 *  D. Compilation fails with an error on line 5
 *  E. Compilation fails with an error on line 7
 *  F. Compilation fails with an error on line 9
 */