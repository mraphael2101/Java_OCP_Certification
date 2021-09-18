package _02_autoboxing_and_unboxing;


public class _02_WrapperToPrimitiveExample
{
    public static void main(String args[]) {

        Integer a = new Integer(3);

        // Converting Integer to int
        int i = a.intValue();

        // Unboxing, now compiler will write a.intValue() internally
        int j = a;

        System.out.println(a + " " + i + " " + j);
    }
}