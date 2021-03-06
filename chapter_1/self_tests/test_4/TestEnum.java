enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals (String s) { sound = s; }
}

class TestEnum {
    static Animals a;
    public static void main(String[] args) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}

/**
 * ___________________________________________
 *
 * CORRECT answers |
 * -----------------
 *  A. woof burble
 *
 *  Enums can have variables and constructors
 * ___________________________________________
 */

/**
 * !! WRONG answers !!
 * -------------------
 *  B. Multiple compilation errors
 *  C. Compilation fails due to an error on line 2
 *  D. Compilation fails due to an error on line 3
 *  E. Compilation fails due to an error on line 4
 *  F. Compilation fails due to an error on line 9
 */