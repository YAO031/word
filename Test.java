package com.hp.test;

import com.hp.entity.Phones;
import com.hp.entity.User;

public class Test {

    public static void main(String[] args) {

        //创建 User的对象
         User user = new User();
         user.setId(12);
         user.setName("小路");
         user.setPassword("vsdcgyvcx");

        System.out.println(user);


        //这里 也是创建User的对象
        User user1 = new User();
        user1.setId(12);
        user1.setName("小路");
        user1.setPassword("vsdcgyvcx");

        System.out.println(user1);

        user.setId(12);
        user.setName("小路");
        user.setPassword("vsdcgyvcx");

        //判断 user是否和user1 相等
        System.out.println(user == user1);
        //结果是false


        //总结 以上就是原型模式 每次new一次 都会创建一个新的对象


        //进行单列模式测试

       Phones p1= Phones.getInstance();
       Phones p2= Phones.getInstance();

        System.out.println(p1==p2);


    }
}
