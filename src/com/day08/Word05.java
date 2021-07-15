package src.com.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Xiloer
 *
 */

public class Word05 {

    public static void main(String[] args) {
        List<Integer> ss=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ss.add(i);

        }

        System.out.println("ss = " + ss);
        Integer[] aa=new Integer[ss.size()];
        ss.toArray(aa);
        System.out.println(Arrays.toString(aa));



    }
}
