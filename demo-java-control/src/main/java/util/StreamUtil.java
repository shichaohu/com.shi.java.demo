package util;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * linq to list
 * */
public class StreamUtil {
    public static void main(String[] args) {
        streamAPI();
    }

    /*java 9*/
    public static void streamAPI() {
        //takeWhile
        System.out.println("takeWhile");
        Stream.of("a", "b", "c", "", "e", "f").takeWhile(s -> !s.isEmpty())
                .forEach(System.out::println);
        //dropWhile
        System.out.println("dropWhile");
        Stream.of("a", "b", "c", "", "e", "f").dropWhile(s -> !s.isEmpty())
                .forEach(System.out::println);

        //iterate
        System.out.println("iterate");
        IntStream.iterate(3, x -> x < 10, x -> x + 3).forEach(System.out::println);

        //ofNullable
        System.out.println("ofNullable");
        long count = Stream.ofNullable(100).count();
        System.out.println(count);
    }

    public static void linqToList() {

        List<String> stringList = Arrays.asList("a", "b", "c", "d");
        List<String> filtered = stringList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        filtered.forEach(str -> {
            System.out.println(str);
        });
        for (String str : filtered) {
            System.out.println(str);
        }
        StringJoiner sj = new StringJoiner(",");
        filtered.forEach(sj::add);
        System.out.println(sj.toString());
    }
}
