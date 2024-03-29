package _03_generics;



class Box<T>
{
    private T t;

    public void add(T t)
    {
        this.t = t;
    }

    public T get()
    {
        return t;
    }
}



public class _06_GenericClassExample2
{

    public static void main(String[] args)
    {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(10);
        stringBox.add("Hello World");

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }

}
