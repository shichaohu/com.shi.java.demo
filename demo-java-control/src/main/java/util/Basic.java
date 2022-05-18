package util;

import java.time.LocalDateTime;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        //Sort();
        collection();
    }

    /*
     * 排序
     * */
    public static void Sort() {
        List<String> names = new ArrayList<String>();
        names.add("b.Google ");
        names.add("c.Runoob ");
        names.add("a.Taobao ");
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println(names);

        System.out.println(LocalDateTime.now());
    }

    public static void collection(){
        Set<String> set = Set.of("A", "B", "C");
        System.out.println(set);
        List<String> list = List.of("A", "B", "C");
        System.out.println(list);
        Map<String, String> map = Map.of("A","Apple","B","Boy","C","Cat");
        System.out.println(map);

        Map<String, String> map1 = Map.ofEntries (
                new AbstractMap.SimpleEntry<>("A","Apple"),
                new AbstractMap.SimpleEntry<>("B","Boy"),
                new AbstractMap.SimpleEntry<>("C","Cat"));
        System.out.println(map1);
    }
}
