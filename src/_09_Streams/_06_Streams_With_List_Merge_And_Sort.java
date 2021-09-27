package _09_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _06_Streams_With_List_Merge_And_Sort {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Mark");
        list1.add("Stephen");
        list1.add("Remy");
        list1.add("Diana");
        list1.add("Michael");


        List<String> list2 = Arrays.asList("Mark", "Stephen", "Remy", "Diana", "Michael");


        Stream<String> newStream = Stream.concat(list1.stream(), list2.stream());


        newStream.sorted().forEach(s -> System.out.println(s));


        boolean flag = newStream.anyMatch(s-> s.equalsIgnoreCase("Adam"));


        //System.out.println(flag);
    }

}
