package _01_collections.hashtable;

/* HashMap and HashTable are both used to store data in key and value form. Both use hashing technique
 * to store unique keys.
 * HashMap is non-synchronized and is not thread safe, whereas HashTable is and can be shared with multi threads.
 * a) HashMap allows one null key and multiple null values
 * b) HashTable does not allow any null key or value
 * c) HashMap is fast and HashTable is slow */


import java.util.Hashtable;

public class _03_HashTable_Size_Method
{

    public static void main(String [] args)
    {
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        // Adding key-value pairs to Hashtable
        hashtable.put("A", "Apple");
        hashtable.put("B", "Orange");
        hashtable.put("C", "Mango");
        hashtable.put("D", "Banana");
        hashtable.put("E", "Grapes");

        // int size() method returns number of key value pairs present in this hashtable
        System.out.println("Size of Hashtable: " + hashtable.size());
    }

}
