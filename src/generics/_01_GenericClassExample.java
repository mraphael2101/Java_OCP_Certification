package generics;

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
   into primitive automatically */


class GenericClass<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}


class GenericClassExample {
    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass<Integer>();
        GenericClass<String> stringGenericClass = new GenericClass<String>();

        // Initialize t variable with value 10
        // The code is only capable of handling one type at a time i.e. you cannot pass a string and integer on the below line
        integerGenericClass.add(10);
        stringGenericClass.add("Hello World");

        // Getter is used to return of t and this is an example of encapsulation in a generic class
        System.out.printf("Integer Value : %d\n\n", integerGenericClass.get());
        System.out.printf("String Value : %s\n\n", stringGenericClass.get());

    }
}