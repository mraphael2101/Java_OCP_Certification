package _03_generics;


/* 1) You can write a single generic method declaration that can be called with arguments of different types
 * 2) All generic method declarations have a type parameter delimited by <> preceding the method return type */


public class _04_GenericMethodExample
{

    // Generic method printArray
    private static <E> void printArray(E[] inputArray)
    {
        // Display array elements
        for (E element : inputArray)
            System.out.print(" " + element);

        System.out.println();
    }


    public static void main(String args[])
    {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array
    }


}
