package _03_generics;

import java.util.ArrayList;

public class _02_UsingGenericsExample {

    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Sam");
        al.add("Mark");

        // This now gives a compile-time error
        // al.add(10);

        // Type-casting is not required
        System.out.println(al.get(0));
        System.out.println(al.get(1));
    }

}
