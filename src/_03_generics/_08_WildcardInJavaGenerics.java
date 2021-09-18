package _03_generics;

import java.util.Arrays;
import java.util.List;


/* */


public class _08_WildcardInJavaGenerics
{

    public static void main(String[] args)
    {
        List<Integer> list1 = Arrays.asList(4,5,6,7);
        System.out.println("Total sum is: " + sum(list1));


        List<Double> list2 = Arrays.asList(4.1,5.1,6.1);
        System.out.print("Total sum is: " + sum(list2));
    }


    /*  1) The question mark symbol represents the wildcard element. It means any type
     *  2) If we write <? extends Number>, it means any child class of number. Now we
     *     can call the method of Number class through any child class object */

    private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;

        for (Number i: list)
            sum += i.doubleValue();

        return sum;
    }


}
