package _01_collections._06.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class _02_Traverse_TreeSet_Default_Ascending_Order {

    public static void main(String[] args)
    {
        // Creating TreeSet and adding elemenets
        TreeSet<String> tset = new TreeSet<String>();

        tset.add("ABC");
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");

        Iterator<String> itr = tset.iterator();

        // Print the default output for a TreeSet data structure (the insertion order is not preserved)
        while (itr.hasNext())
            System.out.println(itr.next());


        TreeSet<Integer> tset2 = new TreeSet<Integer>();

        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);

        Iterator<Integer> itr2 = tset2.iterator();

        // Print the default output for a TreeSet data structure (the insertion order is not preserved)
        while (itr2.hasNext())
            System.out.println(itr2.next());
    }
}
