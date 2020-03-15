package collections._02.collections.linkedlist;


import java.util.LinkedList;

public class _02_LinkedList_Useful_Methods {

    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Item1");
        ll.add("Item5");
        ll.add("Item3");
        ll.add("Item6");
        ll.add("Item2");

        System.out.println("Linked List Content");
        System.out.println(ll);

        ll.addFirst("First Item");
        ll.addLast("Last Item");

        System.out.println("LinkedList content after addition");
        System.out.println(ll);

        ll.set(0,"Changed first item");
        System.out.println("First element after update by set method = " + ll.get(0));

        ll.removeLast();
        ll.remove(1);
        ll.add(1,"Newly added item");
        print(ll);
    }


    public static void print(LinkedList<String> linkedList)
    {

        for(String x : linkedList)
            System.out.println(x);

        System.out.println();
    }

}
