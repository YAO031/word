package src.com.mapjihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * jdk 8 的快速去集合的属性
 *
 */
public class CollectionDemo03 {

    public static void main(String[] args) {

        Test  diaochan=new Test();
        diaochan.setName("貂蝉");
        diaochan.setHeiht(167);
        diaochan.setAge(18);

        Test  xiaoqiao=new Test();
        xiaoqiao.setName("小乔");
        xiaoqiao.setHeiht(167);
        xiaoqiao.setAge(18);


        Test  huatuo=new Test();
        huatuo.setName("华佗");
        huatuo.setHeiht(167);
        huatuo.setAge(18);







        List<Test> list=new ArrayList();

        list.add(diaochan);
        list.add(xiaoqiao);
        list.add(huatuo);

//
//        //拿到 一个数组中的特定的字段，添加到另一个数组中
//        List<String> names=new ArrayList();
//        for (int i = 0; i <list.size() ; i++) {
//            String ss= list.get(i).toString();
//
//            String ss1= ss.substring(11,13);
//            System.out.println(ss.substring(11,13));
//
//            names.add(ss1);
//        }
//        System.out.println(names);
//
//        for (Test o : list) {
//            String name=o.getName();
//            names.add(name);
//
//        }
//
//        System.out.println(names);
        //jdk 8 stream()
        List<String> collect = list.stream().map(Test::getName).collect(Collectors.toList());

        System.out.println(collect);
    }



}
