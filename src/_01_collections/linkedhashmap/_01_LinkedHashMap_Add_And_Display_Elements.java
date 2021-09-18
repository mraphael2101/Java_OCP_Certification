package _01_collections.linkedhashmap;

/* Java LinkedHashMap contains values based on the key and only unique elements.
 * a) It may have one null key and multiple null values.
 * b) It is the same as HashMap with the exception that it maintains the insertion order */

import java.util.LinkedHashMap;
import java.util.Map;

public class _01_LinkedHashMap_Add_And_Display_Elements
{
    public static void main(String args []) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(100, "Sam");
        hm.put(101, "Andy");
        hm.put(102, "Mike");

        for (Map.Entry<Integer, String> m : hm.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }

}
