package _01_collections._01.collections.arraylist;


import java.util.ArrayList;
import java.util.Iterator;

public class _04_Various_Traversing_Examples {


    public static void main(String[] args)
    {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);


        // For Loop for iterating ArrayList
        for(int counter=0; counter<arrlist.size(); counter++) {
            System.out.println(arrlist.get(counter));
        }


        // Enhanced For Loop for iterating ArrayList
        for(Integer num : arrlist) {
            System.out.println(num);
        }


        // While Loop for iterating ArrayList
        int count = 0;
        while (arrlist.size() > count) {
            System.out.println(arrlist.get(count));
            count++;
        }


        // Looping ArrayList using Iterator
        Iterator<Integer> it = arrlist.iterator();
        System.out.println("Iterator Forward Traverse");
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // Add an element at a given index
        arrlist.add(0, 100);
        arrlist.add(1,99);
        arrlist.remove(3);


        // AddAll() method in ArrayList
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();
        arrlist.addAll(arrList2); // add all the elements in arrList2 to arrlist


        // Looping ArrayList using Iterator
        Iterator<Integer> it2 = arrlist.iterator();
        System.out.println("Iterator Forward Traverse through updated arrlist");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }


        arrlist.removeAll(arrList2); // remove all the elements from al that are contained in al2

    }


}
