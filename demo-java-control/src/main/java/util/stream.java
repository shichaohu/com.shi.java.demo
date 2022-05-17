package util;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args){
        List<String> stringList= Arrays.asList("a","b","c","d");
        List<String> filtered=stringList.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
        filtered.forEach(str->{
            System.out.println(str);
        });
        for (String str:filtered){
            System.out.println(str);
        }
        StringJoiner sj=new StringJoiner(",");
        filtered.forEach(sj::add);
        System.out.println(sj.toString());
    }
}
