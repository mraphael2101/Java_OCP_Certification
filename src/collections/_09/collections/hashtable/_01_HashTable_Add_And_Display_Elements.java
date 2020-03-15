package collections._09.collections.hashtable;

/* The HashTable does not allow any null key or value.
 * HashTable is synchronized unlike HashMap */

import java.util.Hashtable;
import java.util.Map;

public class _01_HashTable_Add_And_Display_Elements
{

    public static void main(String args[])
    {
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        hm.put(100, "Sam");
        hm.put(102, "Mike");
        hm.put(101, "Steve");
        hm.put(103, "Andy");

        for (Map.Entry<Integer, String> m : hm.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

    }

}
