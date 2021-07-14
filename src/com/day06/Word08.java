package src.com.day06;

import java.util.HashMap;
import java.util.Map;

public class Word08 {
    // 练习:  { "username":"tangseng", "age":"500"  }  提取json 中的  k 和  v .. 赋值到一个对象
    // QuJingRen 类-----> username ,  age



    public static void main(String[] args) {
        Map<String,String > map=new HashMap<>();
        String ss[]={"username","tangseng", "age","500" };

            map.put(ss[0],ss[1]);
            map.put(ss[2],ss[3]);
        System.out.println(map);


    }


}
