package src.com.mapjihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JDKdk801 {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("ab");
        list.add("aa");
        list.add("c");
        list.add("d");
        System.out.println("操作前list: " + list);
        List<String> collect = list.stream().sorted((a, b) -> {
            return a.compareTo(b);
        }).collect(Collectors.toList());
        System.out.println("升序collect: " + collect);
        List<String> collect2 = list.stream().sorted((a, b) -> {
            return b.compareTo(a);
        }).collect(Collectors.toList());
        System.out.println("降序collect2: " + collect2);

    }
}
