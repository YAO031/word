package src.com.mapjihe;

import java.util.ArrayList;
import java.util.List;

public class JDKdk8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        List<String> list3 = new ArrayList();
// 过滤字符串为a的元素
        list.stream().filter(str -> !"a".equals(str)).forEach(str -> {
            list3.add(str);
        });
        System.out.println(list3);
    }
}
