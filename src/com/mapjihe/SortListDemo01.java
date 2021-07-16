package src.com.mapjihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合排序，对集合进行自然排序
 * 只能 对List排序，对set无效，set是无序
 *
 */

public class SortListDemo01 {
    public static void main(String[] args) {

            //纯数字
        List<Integer> list=new ArrayList<>();
        list.add(50);
        list.add(30);
        list.add(20);
        list.add(60);
        System.out.println("list = " + list);

        Collections.sort(list);//从小到大排序
        System.out.println("list = " + list);


        //字符串排序
        List<String> list1=new ArrayList<>();
        list1.add("小乔");
        list1.add("周瑜");
        list1.add("司马懿");
        System.out.println("list1 = " + list1);
        Collections.sort(list1);
        System.out.println("list1 = " + list1);
        //春对象的排序
        Test s1 = new Test();
        s1.setAge(21);
        s1.setHeiht(187);
        s1.setName("周瑜");


        Test s2 =new Test();
        s2.setAge(23);
        s2.setHeiht(177);
        s2.setName("周瑜2");
        Test s3 =new Test();
        s3.setAge(18);
        s3.setHeiht(167);
        s3.setName("周瑜3");
        Test s4 =new Test();
        s4.setAge(22);
        s4.setHeiht(172);
        s4.setName("周瑜4");
        Test s5= new Test();
        s5.setAge(21);
        s5.setHeiht(187);
        s5.setName("周瑜8");
        //对对象某个属性排序
        List<Test> tt=new ArrayList<>();

        tt.add(s1);
        tt.add(s2);
        tt.add(s3);
        tt.add(s4);
        tt.add(s5);
        Collections.sort(tt);

        System.out.println("tt = " + tt);



    }
}
