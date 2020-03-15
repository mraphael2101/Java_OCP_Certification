package collections._07.collections.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* The Java LinkedHashSet is similar to HashSet and TreeSet except the below mentioned differences:
*  a) HashSet does not maintain any kind of order of its elements
   b) TreeSet sorts elements in ascending order
   c) Contains unique elements only
   d) LinkedHashSet maintains the insertion order. Elements get sorted in the same sequence in which
      they have been added to the set */


public class _01_Traverse_LinkedHashSet_Forwards_With_Iterator {

    public static void main (String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Sam");
        lhs.add("Mike");
        lhs.add("Sam");
        lhs.add("Andy");

        Iterator<String> itr = lhs.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

    }

}
