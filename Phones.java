package com.hp.entity;
//这是标准的单列模式
public class Phones {

    /* 其特点不能new 创建对象 */

    //注意我们学的Spring 是单列模式
    private static Phones ourInstance = new Phones();

    public static Phones getInstance() {
        return ourInstance;
    }
      //无参构造方法  private 这是私有化
    private Phones() {
    }
}
