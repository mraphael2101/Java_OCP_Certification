package _03_generics;

/*   1) Java Generics was introduced to store particular type-safe objects
 *   2) We can hold only a single type of objects in generics
 *   3) Type casting is not required. However, before Generics this was necessary */

import java.util.ArrayList;

public class _01_NotUsingGenericsCanCauseRTException {

    public static void main(String[] args)
    {
        // Creating an ArrayList without any type specified
        ArrayList al = new ArrayList();

        al.add("Sam");
        al.add("Mark");
        al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String)al.get(2);

        System.out.println(s3);
    }


}
