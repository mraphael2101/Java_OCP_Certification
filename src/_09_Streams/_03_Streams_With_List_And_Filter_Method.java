package _09_Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class _03_Streams_With_List_And_Filter_Method {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Mark");
        names.add("Stephen");
        names.add("Remy");
        names.add("Diana");
        names.add("Michael");


		/* Filter the stream with a lambda expression, and a condition
		   Note: The terminal operation will only be executed if the filter returns true */
        long count = names.stream().filter(s -> s.startsWith("M")).count();

        System.out.println("Count = " + count);


        // An alternative approach to leverage the power of stream filtering is as follows:
        long count2 = Stream.of("Mark", "Stephen", "Remy", "Diana", "Michael").filter(s ->
        {

            return s.startsWith("M");

        }).count();

        System.out.println("Second Count = " + count2);


		/* Print all the names in the ArrayList where the length is greater than 4
		   names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s)); */
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));


        // If you want to manipulate the results which evaluates to true using streams you can use the map method to optimise the code
        Stream.of("Mark", "Stephen", "Remy", "Diana", "Michael").filter(s -> s.endsWith("k")).map(s->s.toUpperCase())
                .forEach(s -> System.out.println(s));
    }

}
