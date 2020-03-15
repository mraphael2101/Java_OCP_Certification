package collections._04.collections.vector;


import java.util.Iterator;
import java.util.Vector;

public class _02_Vector_Using_Iterator {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();

        vector.add("Mango");
        vector.add("Orange");
        vector.add("Apple");
        vector.add("Grapes");
        vector.add("Kiwi");

        Iterator itr = vector.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

    }

}
