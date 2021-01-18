package _01_collections.arraylist;

import java.util.ArrayList;

public class _01_Traverse_ArrList_Forwards_With_EnhaForLoop {


    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Sam");
        al.add("Mark");
        al.add("Bob");
        al.add("Rob");

        // Traverse through the Array using an enhanced for loop
        for(String obj:al)
            System.out.println(obj);
    }


}
