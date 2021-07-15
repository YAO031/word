package src.com.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Xiloer
 *
 */

public class Word06 {

    public static void main(String[] args) {
        String aa[]={"one","two","three"};
        List<String> ss=new ArrayList<>();

        for (String s : aa) {
            ss.add(s);


        }
        System.out.println("ss = " + ss);
    }
}
