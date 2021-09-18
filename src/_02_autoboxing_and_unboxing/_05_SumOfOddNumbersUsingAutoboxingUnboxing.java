package _02_autoboxing_and_unboxing;

import java.util.ArrayList;
import java.util.List;


public class _05_SumOfOddNumbersUsingAutoboxingUnboxing
{
    private static int sumOfOddNumber(List<Integer> list)
    {
        int sum = 0;

        for (Integer i : list) {
            // Unboxing of i automatically
            if (i % 2 != 0)
                sum += i;
        }
        return sum;
    }


    public static void main (String[] args)
    {
     /* Here we are creating a list of elements
        of Integer type and adding the int primitives
        type values to the list*/
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++)
            list.add(i);

        // get the sum of all odd no's in the list
        int sumOdd = sumOfOddNumber(list);

        System.out.println("Sum of odd numbers = " + sumOdd);
    }


}