package _02_autoboxing_and_unboxing;

import java.util.ArrayList;
import java.util.List;


public class _04_AutoboxingUnboxingInCollections
{
    public static void main (String[] args)
    {
        /* Here we are creating a list
          of elements of Integer type.
          adding the int primitives type values */

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++)
        {
            /* Here, compiler is converting the int primitive type into Integer wrapper
            Object by executing 'list.add(Integer.valueOf(i));' */
            list.add(i);
        }

        for (int x : list)
        {
            System.out.print(x + " ");
        }
    }
}