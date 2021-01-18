package _01_collections.vector;

import java.util.Collections;
import java.util.Vector;

/* Vector maintains the insertion order which means it displays the elements in the same order in which they got added
   to the Vector
    a) ArrayList and Vector both maintain the insertion order
    b) Accessing an ArrayList instance from multiple threads may not be safe (Not synchronised)
    c) Vector is synchronised
    d) ArrayList increments 50% of the current array size if its capacity is exceeded
    e) Vector increments 100% of the current array size if its capacity is exceeded
    f) Vector is a legacy class introduced in Java 1. ArrayList is not
    g) ArrayList is fast because it is non synchronised. Vector is slow because it is synchronised
    h) ArrayList uses Iterator to traverse elements, and Vector uses Iterator also */

public class _04_SortVectorUsingCollectionsSort {


    public static void main(String[] args)
    {
        // Create a Vector
        Vector<String> vector = new Vector<String>();

        // Add elements to Vector
        vector.add("Walter");
        vector.add("Anna");
        vector.add("Hank");
        vector.add("Flynn");
        vector.add("Tom");

        // By default Vector maintains the insertion order
        System.out.println("Vector elements before sorting: ");

        for(int i=0; i<vector.size(); i++)
            System.out.println(vector.get(i));

        // Collections.sort(vector) sorts the collection in ascending order
        Collections.sort(vector);

        // Display vector elements after sorting using Collections.sort
        System.out.println("Vector elements after sorting using Collections.sort");

        for(int i=0; i<vector.size(); i++)
            System.out.println(vector.get(i));


    }


}
