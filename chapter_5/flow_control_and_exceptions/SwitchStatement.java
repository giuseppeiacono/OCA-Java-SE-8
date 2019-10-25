public class SwitchStatement {

    public static void main(String[] args) {

        // Compile error due to the second case argument (128) that is too large for a byte, the type of switch argument
        byte g = 2;
        switch(g) {
            case 23:
            case 128:
        }

        // Compile error because it uses two cases with the same value of 80
        int temp = 90;
        switch(temp) {
            case 80:
                System.out.println("80");
            case 80:
                System.out.println("80");
        }

        // It's LEGAL because boxing is allowed into switch argument
        switch(new Integer(4)) {
            case 4: System.out.println("boxing is OK");
        }

        // ILLEGAL because the case keyword omits the colon
        int x = 0, y = 0;
        switch(x) {
            case 0 {
                y = 7;
            }
        }

        // ILLEGAL because it omits the case keywords
        int z = 0;
        switch(z) {
            0: { }
            1: { }
        }

        // ILLEGAL use of compile-time constant in the case clause
        final int a = 1;
        final int b;
        b = 2;
        int c = 0;
        switch (c) {
            case a: // ok because a is a compile-time constant

            case b: // compiler error because b is not declared and initialized at the same time
                // (final variable can not be assigned after declaration)

            default:
                System.out.println("default clause");
        }
    }

}
