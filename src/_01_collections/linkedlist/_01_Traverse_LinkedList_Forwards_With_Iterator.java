package _01_collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class _01_Traverse_LinkedList_Forwards_With_Iterator {

    public static void main (String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Mark");
        ll.add("Sam");
        ll.add("Bob");
        ll.add("Rob");

        Iterator<String> itr = ll.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

    }

}
