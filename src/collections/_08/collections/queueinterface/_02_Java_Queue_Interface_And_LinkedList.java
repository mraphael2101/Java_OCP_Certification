package collections._08.collections.queueinterface;

/* The Java Queue Interface orders elements in FIFO (First In First Out) manner. In FIFO, the first element is
 * removed first and the last element is removed at last */

import java.util.LinkedList;
import java.util.Queue;

public class _02_Java_Queue_Interface_And_LinkedList {

    public static void main(String args [])
    {

        /* Queue is an interface so we cannot instantiate it, rather we create an instance of LinkedList or
        PriorityQueue and assign it to the queue */

        Queue<String> q = new LinkedList<String>();

        // Adding elements to the Queue
        q.add("Rick");
        q.add("Maggie");
        q.add("Glenn");
        q.add("Megan");
        q.add("Daryl");

        System.out.println("\nElements in Queue");

        for(String x : q)
            System.out.println(x);

        /* We can remoove element from queue using remove() method, this would remove the first element from
           the queue. */
        System.out.println("\nRemoved element: " + q.remove());

        // element() method returns the head of the queue which is the first element
        System.out.println("\nHead: " + q.element());

        // peek() method returns the head of the queue, and null if empty
        System.out.println("\npeek(): " + q.peek());

        // poll() method removes and returns the head of the queue, and null if empty
        System.out.println("\npoll(): " + q.poll());

        // Again displaying the elements of the queue
        System.out.println("\nElements in Queue");

        for(String x : q)
            System.out.println(x);
    }

}
