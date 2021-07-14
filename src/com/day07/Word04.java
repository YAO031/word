package src.com.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 *
 *
 */
public class Word04 {

    public static void main(String[] args) {

        System.out.println("请输入生产日期，格式如：yyyy-mm-dd HH:mm:ss");
        Scanner sc=new Scanner(System.in);
        String ww=sc.nextLine();
        System.out.println(ww);

        System.out.println("请输入保质期的天数");
        Scanner scc= new Scanner(System.in);
        String scc1=scc.nextLine();
        long  t1=Integer.parseInt(scc1);
        long w1=t1-14;
        System.out.println(w1);
        long tt1=w1*1000*60*60*24;

        Date data=new Date();

        String  pattern="yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat sdf=new SimpleDateFormat(pattern);



        //字符串 专日期



        try {
            Date parse = sdf.parse(ww);
            long sss=parse.getTime();
            System.out.println(sss);
            long q1=sss+tt1;


            System.out.println(q1);
            data.setTime(q1);
            System.out.println(data);
            String time=String.format("%tc",data);//这是将data格式化成星期二 一月 21 08:12:00 CST 2020形式。
            System.out.println(time);
            String  tt= String.valueOf(time.charAt(2));

//            panduan(data, q1, tt);
            long qqq=data.getTime();
            System.out.println(qqq);


            System.out.println(tt);
            panduan(data, sdf, q1, tt);

        } catch (ParseException e) {

            System.out.println("你的日期字符串可能 不是一个日期。");
            e.printStackTrace();
        }
    }

    private static void panduan(Date data, SimpleDateFormat sdf, long q1, String tt) {
        if (tt.equals("一") ) {
            q1=q1+2*1000*60*60*24;
            data.setTime(q1);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(data);


            System.out.println(guo1);

        }
        if (tt.equals("二") ) {
            q1=q1+1000*60*60*24;
            data.setTime(q1);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(data);


            System.out.println(guo1);
//                System.out.println(gou);

        }
        if (tt.equals("三") ) {

            data.setTime(q1);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(data);


            System.out.println(guo1);

//                System.out.println(gou);

        }
        if (tt.equals("四") ) {
            q1=q1-1000*60*60*24;
            data.setTime(q1);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(data);


            System.out.println(guo1);

//                System.out.println(gou);

        }
        if (tt.equals("五")) {
            q1=q1-2*1000*60*60*24;
            data.setTime(q1);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(data);


            System.out.println(guo1);

//                System.out.println(gou);

        }
        if (tt.equals("六") ) {
            q1=q1-3*1000*60*60*24;
            data.setTime(q1);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(data);


            System.out.println(guo1);

//                System.out.println(gou);

        }
        if (tt.equals("七")) {
            q1=q1-2*1000*60*60*24;
            data.setTime(q1);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(data);


            System.out.println(guo1);

//                System.out.println(gou);

        }
    }

    private static void panduan(Date data, long q1, String tt) {

    }
}
