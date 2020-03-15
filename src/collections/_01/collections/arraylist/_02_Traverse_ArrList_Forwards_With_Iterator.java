package collections._01.collections.arraylist;


import java.util.ArrayList;
import java.util.Iterator;

public class _02_Traverse_ArrList_Forwards_With_Iterator {


    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Sam");
        al.add("Mark");
        al.add("Bob");
        al.add("Rob");

        System.out.println(al);

        // .iterator() method copies the contents of the ArrayList to the iterator
        Iterator<String> it = al.iterator();

        System.out.println("ArrayList elements using Iterator:");
        while(it.hasNext()) {
            String obj = it.next();
            System.out.println(obj);
        }
    }


}
