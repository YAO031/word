package src.com.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Xiloer
 *
 */

public class Word03 {

    public static void main(String[] args) {
        List<String> ss=new ArrayList<>();
        ss.add("one");
        ss.add("two");
        ss.add("three");
        ss.add("four");

        System.out.println(ss.get(1));
       ss.set(2,"3");

        System.out.println("ss = " + ss);
        ss.add(1,"2");
        System.out.println("ss = " + ss);
        ss.remove(2);
        System.out.println("ss = " + ss);
    }
}
