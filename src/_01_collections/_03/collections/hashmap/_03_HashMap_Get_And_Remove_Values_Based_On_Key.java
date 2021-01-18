package _01_collections._03.collections.hashmap;


import java.util.HashMap;
import java.util.Map;

public class _03_HashMap_Get_And_Remove_Values_Based_On_Key {

    public static void main(String [] args)
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(12, "Sam");
        hmap.put(2,  "Mike");
        hmap.put(7,  "Steve");
        hmap.put(49, "Andy");
        hmap.put(3,  "George");

        for(Map.Entry<Integer, String> me : hmap.entrySet()) {
            System.out.println("Key is: " + me.getKey() + " & Value is: ");
            System.out.println(me.getValue());
        }

        // Get values based on key
        String var = hmap.get(2);
        System.out.println("\nValue when key=2 is: " + var);


        // Removes values based on key
        hmap.remove(3);
        System.out.println("\nMap key and values after removal: ");

        for(Map.Entry<Integer, String> me : hmap.entrySet()) {
            System.out.println("Key is: " + me.getKey() + " & Value is: ");
            System.out.println(me.getValue());
        }

    }

}
