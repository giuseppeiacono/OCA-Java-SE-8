import java.util.Date;

/**
 * Example of how to make objects eligible for garbage collection
 */
public class GarbageCollection {

    public static void main(String [] args) {

        /**
         * Case 1: nulling a reference
         */
        StringBuffer object = new StringBuffer("created object");
        System.out.println(object);
        object = null;  // Now object is eligible for collection

        /**
         * Case 2: reassigning a reference variable
         */
        StringBuffer obj1 = new StringBuffer("created object 1");
        StringBuffer obj2 = new StringBuffer("created object 2");
        System.out.println(obj1);
        obj1 = obj2;
        // Now the StringBuffer "created object 1" is eligible for collection

        /**
         * Case 3: objects created in a method
         */
        Date d = getDate();
        // the previous method created two objects:
        //      Date : was returned and assigned to variable d (it is still referenced)
        //      StringBuffer : here it is eligible for collection (it was a local object)
        System.out.println("d = " + d);

        /**
         * Case 4: isolating a reference
         */
        Icecream i1 = new Icecream();
        Icecream i2 = new Icecream();
        i1.i = i2;
        i2.i = i1;
        i1 = null;
        i2 = null;
        // the objects referred by instance variables of each object are eligible for collection because they have been nulled
    }

    public static Date getDate() {
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        return d2;
    }
}

class Icecream {
    Icecream i;
}

