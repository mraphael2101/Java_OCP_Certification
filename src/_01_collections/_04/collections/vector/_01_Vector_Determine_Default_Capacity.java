package _01_collections._04.collections.vector;

import java.util.Vector;

/* Vector is synchronised because it can be utilised in a multi-threaded environment. It will hold the other threads
 * in a a runnable or non-runnable state until the current thread releases the lock on the object.
 * Vector is slow because it is synchronised.
 * Vector expands by the default capacity when it is utilised up to the last element */


public class _01_Vector_Determine_Default_Capacity {

    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>(2);

        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity increment is " + vec.capacity());

    }

}

