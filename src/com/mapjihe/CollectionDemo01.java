package src.com.mapjihe;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合  ： 非常重要  有一个接口
 *
 * 接口可以继承接口，
 *
 * length（）方法值得是没有泛型的类
 * size（），放很多东西  list.add(person) list.add()
 * 集合可以转换成数组
 *
 */


public class CollectionDemo01  {

    public static void main(String[] args) {
//        ArrayList  c1=new ArrayList();
        Collection  c1=new ArrayList();
        //add增加
        ((ArrayList) c1).add("唐僧--执著的目标 ");

        ((ArrayList) c1).add("吉吉国王--过硬的技术");
        ((ArrayList) c1).add("猪八戒--老色批，体贴关怀");
        ((ArrayList) c1).add("臭咸鱼--劳动力");
        ((ArrayList) c1).add("白龙马--坐骑");

        System.out.println("c1="+c1);

        int size=c1.size();
        System.out.println("size=" +size);


        boolean empty=c1.isEmpty();//是否为空
        System.out.println(empty);

        //集合的清口
//        c1.clear();
        System.out.println(c1);
        boolean empty1=c1.isEmpty();
        System.out.println(empty1);



        //集合的便利

        //one
//        for (int i = 0; i < c1.size(); i++) {
//
//            System.out.println(c1.get(i));
//
//        }
        //迭代器
        for (Object o : c1) {

            System.out.println(o);

        }
        //迭代器和for循环区别；
        //迭代器工作：有游标，问下一个，有没有下一个元素，如果有就拿到，没有就结束
        //for循环工作：把集合从0--N排序，从0开始，那下标。

    }



}
