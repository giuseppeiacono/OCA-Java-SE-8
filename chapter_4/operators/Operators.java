/**
 * It shows:
 *  1. exam tricks
 *  2. uncommon LEGAL uses of operators that could get you into trouble during the exam
 */
public class Operators {

    public static void main(String[] args) {

        /**
         * char example
         */
        System.out.println("|  Primitive char \n------------------------");
        char a = 'a';
        if (a == 'a') System.out.println(a + " is equals to 'a'");
        if (a == 97) System.out.println(a + " unicode value is 97");
        if ('c' != 'a') System.out.println("'c' is NOT equals to 'a'");

        /**
         * boolean example
         */
        System.out.println("\n|  Primitive boolean \n------------------------");
        boolean b = false;
        // it's a legal assignment because if test can be done only on boolean expressions
        if (b = true) {
            System.out.println("b is true");
        }

        /**
         * String example
         */
        System.out.println("\n|  String \n------------------------");
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = s1;
        System.out.println("s1 == s2 is " + (s1 == s2));
        System.out.println("s1.equals(s2) is " + (s1.equals(s2)));
        System.out.println("s1 == s3 is " + (s1 == s3));
        System.out.println("s1.equals(s3) is " + (s1.equals(s3)));

        /**
         * Object example
         */
        System.out.println("\n|  Object \n------------------------");
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println("o1 == o2 is " + (o1 == o2));
        System.out.println("o1.equals(o2) is " + (o1.equals(o2)));

        /**
         * instanceof examples
         */
        System.out.println("\n|  instanceof operator\n------------------------");
        String s = null;
        // it is legal to test whether the null reference is an instance of a class
        if (s instanceof String) {
            System.out.println(s + " is instance of String class");
        }
        else {
            System.out.println(s + " instanceof String ---> false \ninstanceof operator always return false for null values");
        }

        // The code below does not compile because it is not allowed to use instanceof operator
        // to test across two different class hierarchies
//        Operators operators = new Operators();
//        System.out.println(operators instanceof OtherClassHierarchy);

        int [] intArray = new int[3];
        if (intArray instanceof Object) {
            System.out.println("\nAn array is always an instance of Object");
        }

        /**
         * Arithmetic operators example
         */
        System.out.println("\n|  Arithmetic operator\n------------------------");
        // The code below does not compile because you can't change the value of final variables
//        final int x = 5;
//        int y = x++;
    }

}

class OtherClassHierarchy extends Operators { }
