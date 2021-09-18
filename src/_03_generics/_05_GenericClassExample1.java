package _03_generics;

/* 1) A generic class declaration is the same as a non-generic class declaration except the class name is followed
      by a type parameter
   2) A class that can refer to any type is known as a generic class  */


class GenericClass<T>
{
    private T t;

    public void add(T t)
    {
        this.t = t;
    }

    T get()
    {
        return t;
    }
}


public class _05_GenericClassExample1
{

    public static void main(String[] args)
    {
        GenericClass<Integer> integerGenericClass = new GenericClass<Integer>();
        GenericClass<String> stringGenericClass = new GenericClass<String>();

        
         /* Initialize the  variable with value 10
            The code is only capable of handling one type at a time i.e. you cannot
            pass a string and integer on the below line */
        integerGenericClass.add(10);
        stringGenericClass.add("Hello World");

        
        /* Getter is used to return value of t and this is an example of encapsulation
           in a generic class */
        System.out.printf("Integer Value : %d\n\n", integerGenericClass.get());
        System.out.printf("String Value : %s\n\n", stringGenericClass.get());
    }

}