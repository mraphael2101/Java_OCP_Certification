package _03_generics;


class Test<T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U

    // Constructor
    Test(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}


public class _07_MultiTypeParamsInGenericClasses
{

    public static void main (String[] args)
    {
        Test <String, Integer> obj =  new Test<String, Integer>("Java Course", 2018);

        obj.print();
    }

}
