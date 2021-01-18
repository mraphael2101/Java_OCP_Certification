package _02_autoboxing_and_unboxing;

/* The eight primitive data types are
   byte    : Wrapper = Byte
   short   : Wrapper = Short
   int     : Wrapper = Integer
   long    : Wrapper = Long
   float   : Wrapper = Float
   double  : Wrapper = Double
   char    : Wrapper = Character
   boolean : Wrapper = Boolean
   - These are not objects. However, the wrapper classes in Java provide a mechanism to convert primitive
   into object and vice versa.
   - Autoboxing and unboxing feature converts primitive into object and object
   into primitive automatically
   - Autoboxing and unboxing lets developers write cleaner code, making it easier to read i.e. no typecasting required */


public class _01_PrimitiveToWrapperExample {

    public static void main(String args[]) {

        int a = 20;

        // Converting int into Integer
        Integer i = Integer.valueOf(a);

        // Autoboxing, now compiler will write Integer.valueOf(a) internally
        Integer j = a;

        System.out.println(a + " " + i + " " + j);
    }
}
