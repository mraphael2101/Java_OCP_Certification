package _03_generics;

import java.util.ArrayList;

public class _03_UsingGenericsExample {

    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Andy");
        list.add("Mike");

        // Compile time error
        // list.add(32);

        // Type casting is not required
        String s = list.get(1);
        System.out.println("Element is: " + s);

        for (String obj : list)
            System.out.println(obj);

    }

}
