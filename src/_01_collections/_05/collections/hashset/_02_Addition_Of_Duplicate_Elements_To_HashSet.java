package _01_collections._05.collections.hashset;

/* As you can see only ever one null value is returned and duplicate values are overrwritten */

import java.util.HashSet;
import java.util.Iterator;

public class _02_Addition_Of_Duplicate_Elements_To_HashSet {

    public static void main(String[] args)
    {
        // HashSet declaration
        HashSet<String> hset = new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");

        // Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        hset.add(null);
        hset.add(null);

        Iterator<String> it = hset.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }

}
