package _09_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _05_Streams_With_List_And_Collectors {

    public static void main(String[] args) {

        // Collect is used to collect your results and to convert them into a new list for further processing
        List<String> myList = Stream.of("Mark", "Stephen", "Remy", "Diana", "Michael", "Daniel")
                .filter(s -> s.endsWith("l"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));

        // Example 2
        List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
        values.stream().distinct().forEach(System.out::println);
        List<Integer> newList = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("The second lowest distinct value in the list is " + newList.get(2));
    }

}
