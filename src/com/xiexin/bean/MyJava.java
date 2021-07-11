package com.xiexin.bean;

import java.util.ArrayList;

/**
 * 输出hello
 */
public class MyJava {
    // main 方法快捷键   psvm
    public static void main(String[] args) {
        System.out.println("输出的快捷键 是 sout"); // sout 输出的快捷键
        String name = "雪莹";
        System.out.println("name = " + name); // soutv  可以显出 变量
        System.out.println("MyJava.main");  // soutm 是输出 方法的名称
        System.out.println("args = [" + args + "]");//soutp 是输出 方法的参数
        int age =17;
        // 如果 小于18 就显示 未成年
        if (age<18) {    // if 的快捷叫做  ifn
            System.out.println("此小侠女未成年");
        }
        ArrayList<String> strings = new ArrayList<>(); // 万能快捷键  alt+enter
                    strings.add("唐一臧");               // ctrl + d 快速复制一行
                    strings.add("唐二臧");               // 多行编辑  alt+鼠标
                    strings.add("唐三臧");
                    strings.add("唐四臧");              // ctrl + y  是 快速删除一行
                    // ctrl+z 是 一步撤销  ctrl+shift+z 是多步骤撤销
        for (String string : strings) {              // 便利循环的快捷键   iter
            System.out.println("string = " + string);
        }
        // 其他的快捷键,  百度!!



        // 创建 电脑
        Computer c1 = new Computer(); // 说命他的 构造方法是  public
                c1.setPrice(5555.0D);
                c1.setColor("黑色");
                c1.setTypeName("机械革命code555");
        System.out.println("c1 = " + c1);  //c1 = com.xiexin.bean.Computer@74a14482 内存
        // 内存地址是否一样 , 是判断对象是否相等的依据
        Computer c2 = new Computer();
        c2.setPrice(5555.0D);
        c2.setColor("黑色");
        c2.setTypeName("机械革命code555");
        System.out.println("c2 = " + c2);

        // 判断c1 c2 是否相等
        System.out.println(c1 == c2);  // false
        // 以上就是原型模式!! 每次new 都会创建一个新对象
        // 想要  对象每次 new 都唯一怎么办 ?


        // 测试单例模式
       // Phone p1 = new Phone(); // 因为: 无参构造私有化了..
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1 == p2); // true

        // 单例模式 分为  :  饿汉
        //          和       懒汉    区别 ? 作业: 写在本子上, 拍照.
    }

}
