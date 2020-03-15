package collections._05.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* The Java HashSet can only contain a unique set of elements unlike List
* a) HashSet does not maintain any order, the elements would be returned in any random order
* b) HashSet does not allow any duplicates. If you try to add a duplicate element the old value will be overwritten
* c) HashSet allows null values. However, if you insert more than one nulls it will only ever return one null value
* d) HashSet is non-synchronised */


public class _01_Traverse_HashSet_Forwards_With_Iterator {

    public static void main (String[] args) {

        // Creating HashSet and adding elemenets
        HashSet<String> set = new HashSet<String>();

        set.add("Sam");
        set.add("Steve");
        set.add("Sam");
        set.add("Bob");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

    }

}
