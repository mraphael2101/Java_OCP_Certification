package _01_collections.treemap;

import java.util.Map;
import java.util.TreeMap;

/* The main difference between TreeMap and HashMap is that TreeMap is sorted in the ascending order of its keys.
 * a) TreeMap is an unsynchronized collection which means it is not suitable for thread-safe operations */


public class _01_TreeMap_Add_And_Display_Elements
{
    public static void main(String args[])
    {
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();

        hm.put(100,"Andy");
        hm.put(102,"Mike");
        hm.put(101,"Peter");
        hm.put(103,"Steve");

        for(Map.Entry <Integer, String>  m:hm.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());

    }
}
