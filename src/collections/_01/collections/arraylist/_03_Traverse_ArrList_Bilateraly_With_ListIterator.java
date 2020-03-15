package collections._01.collections.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class _03_Traverse_ArrList_Bilateraly_With_ListIterator {

    /* Using ListIterator we can traverse in both directions (forwards and backwards).
    *  We can obtain indexes at any point of time while traversing a list using ListIterator.
    *  We can add an element at any point in time while traversing through a list */

    public static void main (String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");

        // .listIterator() method copies the contents of the ArrayList to the ListIterator
        ListIterator<String> it = al.listIterator();

        System.out.println("ArrayList elements using ListIterator");

        System.out.println("Traverse FORWARDS");

        // Return true if there is a next element
        while(it.hasNext()) {
            String obj = it.next();
            System.out.println(obj);
        }

        System.out.println("Traverse BACKWARDS");

        // Return true if there is a previous element
        while(it.hasPrevious()) {
            String obj = it.previous();
            System.out.println(obj);
        }


    }

}
