package _01_collections.treeset;

/* The below example copies all the elements of a HashSet to a TreeSet */

import java.util.HashSet;
import java.util.TreeSet;

public class _03_Convert_HashSet_To_TreeSet {

    public static void main(String[] args)
    {
        // Create a HashSet
        HashSet<String> hset = new HashSet<String>();

        //add elements to HashSet
        hset.add("Element1");
        hset.add("Element2");
        hset.add("Element3");
        hset.add("Element4");

        // Displaying HashSet elements
        System.out.println("HashSet contains: ");
        for(String temp : hset){
            System.out.println(temp);
        }

        // Creating a TreeSet of HashSet elements
        TreeSet<String> tset = new TreeSet<String>(hset);

        // Displaying TreeSet elements
        System.out.println("TreeSet contains: ");
        for(String temp : tset)
            System.out.println(temp);

    }

}
