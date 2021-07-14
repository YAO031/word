package src.com.dataandclollection;

import java.util.Calendar;

/*
**日历类  ： 日期计算
* 使用场景 预约 功能，日期计算功能
* 常用的App ，美柚，疫苗预约  入职日期计算 旅游模块
*
* 创建对象  一班是new出来的
*
*
* 对象如果不能被new 无参的e
* 无参构造私有化，肯能是单例模式
* 该类可能是抽象类 接口，必须new他的实现 类
*

 */
public class CarlandarWord02 {

    public static void main(String[] args) {
        //创建对象  不仅仅只有new ，还有 类的实例方法

        //Calendar包含了date的功能
         Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
            //日历进行计算 add 增加
        //增加一个年份  增加10年  场景：买保险 结婚纪念日
       // calendar.add(Calendar.YEAR,10);




        //家月份
//        calendar.add(Calendar.MONTH,1);

        //加天数
//        calendar.add(Calendar.DAY_OF_YEAR,1);

        //减去一天
//        calendar.add(Calendar.DAY_OF_YEAR,-1);

        //比如设置当前的周五的日期

       // calendar.set(Calendar.DAY_OF_YEAR,Calendar.FRIDAY);
        System.out.println(calendar.getTime());


        //能计算每个月的最大值，
        int actualMaximum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(actualMaximum);


        //日历的获取方法 get方法


        //查看今年过了多少天

         int i=calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(i);

        //查询今天是周几？ 从周日开始
       int i1= calendar.get(Calendar.DAY_OF_WEEK);


        String []  weeks={"周日","周一","周二","周三","周四","周五","周六"};

        System.out.println("今天是" + weeks[i1-1]);


        //获取月份 从0开始
        int i3=calendar.get(Calendar.MONTH)+1;
        System.out.println(i3);


        //日历的set。。。。


        calendar.set(Calendar.YEAR,2008);

        System.out.println(calendar);


        //设置月份
        calendar.set(Calendar.MONTH,Calendar.APRIL);//月份从零开始


        System.out.println(calendar);


            }
}
