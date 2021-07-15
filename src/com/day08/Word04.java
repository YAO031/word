package src.com.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Xiloer
 *
 */

public class Word04 {

    public static void main(String[] args) {

        List<String> ss=new ArrayList();
        for (int i = 0; i <10 ; i++) {
            ss.add(i+"");



        }
        System.out.println(ss);
        List<String> ss1=new ArrayList<>();

        for (int i = 3; i < 7; i++) {
            ss.get(i);
            ss1.add(ss.get(i));


        }
        System.out.println(ss1);
//        for (String s : ss1) {
//            System.out.println("s = " + s);
//            int r=Integer.parseInt(s)*10;
//            System.out.println("r = " + r);
//
//
//        }
        for (int i = 0; i <4 ; i++) {
            int ii=Integer.parseInt(ss1.get(i))*10;
            ss1.add(ii+"");


        }
        for (int i = 0; i <4; i++) {
            ss1.remove(0);

        }


//        for (String s : ss1) {
//            int r=Integer.parseInt(s)*10;
//            ss1.add(r+"");
//
//
//        }
        System.out.println(ss1);
        System.out.println("ss = " + ss);
        for (int i = 0; i < 3; i++) {
            ss.remove(7);
        }
        System.out.println("ss = " + ss);
    }
}
