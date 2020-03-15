package collections._06.collections.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* The Java TreeSet class is similar to HashSet except that it only sorts the elements in ascending order while
   HashSet does not maintain any order
*  a) TreeSet allows null element but like HashSet it does not allow duplicates
   b) TreeSet class is not synchronised therefore making it quite fast
   c) Contains unique elements only like HashSet
   d) TreeSet maintains ascending order */


public class _01_Traverse_TreeSet_Forwards_With_Iterator {

    public static void main (String[] args) {

        // Creating TreeSet and adding elemenets
        TreeSet<String> al = new TreeSet<String>();

        al.add("Sam");
        al.add("Mike");
        al.add("Sam");
        al.add("Andy");

        Iterator<String> itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

    }

}
