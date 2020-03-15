package collections._09.collections.hashtable;

import java.util.Hashtable;
import java.util.Map;


public class _02_HashTable_Remove_Method
{
    public static void main(String[] args)
    {
        Hashtable<Integer, String> map = new Hashtable<Integer, String>();

        map.put(102, "Let us C");
        map.put(103, "Operating System");
        map.put(101, "Data Communication and Networking");


        System.out.println("Values before remove: ");
        for (Map.Entry<Integer, String> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());


        // Remove value for key 102
        map.remove(102);
        System.out.println("\nValues after remove: ");
        for (Map.Entry<Integer, String> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

    }

}
