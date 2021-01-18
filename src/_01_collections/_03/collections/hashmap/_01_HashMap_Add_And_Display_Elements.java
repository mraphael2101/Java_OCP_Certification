package _01_collections._03.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

/* HashMap is a Map based collection class that is used for storing Key & value pairs, it is 
 * denoted as HashMap<Key, Value> or HashMap<K, V>
 * a) Each key and value is known as an entry
 * b) A map contains only unique keys
 * c) A map is useful if you have to search, update or delete elements on the basis of a key
 * d) In map you can have duplicate values but you can't have duplicate keys
 * e) Keys is a SET and values is a LIST
 * f) Use maps when you want to retrieve and update elements by keys, or perform lookups by keys
 * g) HashMaps contain only unique elements
 * h) HashMaps may contain one null key and multiple null values
 * i) HashMaps maintains no order and will not give the values based in sequence (uses algorithm based on heap memory)*/

public class _01_HashMap_Add_And_Display_Elements
{
	public static void main(String [] args)
	{
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(11, "AB");	 // Adding elements to HashMap
		hmap.put(2 , "CD");
		hmap.put(33, "EF");
		hmap.put(9 , "GH");
		hmap.put(3 , "IJ");

		System.out.println("Keys and Values in HashMap: ");


		/* Note: Entry Interface and '.entrySet()' method gets the complete entry instead of 
		 * separate key and separate values */
		for (Map.Entry <Integer, String> me : hmap.entrySet())
			System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
	}
}
