package _09_Streams;

import java.util.Arrays;
import java.util.List;

public class _04_Streams_With_List_Filter_And_Sort {
    private static final List<String> names = Arrays.asList("Mark", "Stephen", "Remy", "Diana", "Michael");

    public static void main(String[] args) {
        names.stream().filter(s -> s.startsWith("M")).sorted().map(String::toUpperCase).forEach(System.out::println);
    }
}
