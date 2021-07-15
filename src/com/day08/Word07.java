package src.com.day08;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Xiloer
 *
 */

public class Word07 {
    public static void main(String[] args) {
        List<Integer> ss=new ArrayList<>();
        for (int i = 0; i <=10 ; i++) {
            int s= (int) (Math.random()*10);
            ss.add(s);

        }

        Collections.sort(ss);
        System.out.println(ss);

    }
}
