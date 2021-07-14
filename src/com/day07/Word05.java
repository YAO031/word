package src.com.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18

 *
 */

public class Word05 {

    public static void main(String[] args) {
        System.out.println("请输入你的身份证号");//410926199812130813
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        System.out.println(ss);

        if (ss.length()==18) {
            String s1=ss.substring(6,10);
            String s2 = ss.substring(10, 12);
            int ss1=Integer.parseInt(s1)+20;
            String sss1=String.valueOf(ss1);
            String s3 = ss.substring(12, 14);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(sss1);

            String w=sss1+"-"+s2+"-"+s3;
            System.out.println(w);

            String  pattern="yyyy-MM-dd";


            SimpleDateFormat sdf=new SimpleDateFormat(pattern);




            //字符串 专日期



            try {
                Date parse = sdf.parse(w);
                long sss=parse.getTime();



                System.out.println(sss);
                String time=String.format("%tc",parse);//这是将data格式化成星期二 一月 21 08:12:00 CST 2020形式。
                System.out.println(time);
                String  tt= String.valueOf(time.charAt(2));

//            panduan(data, q1, tt);
                long qqq=parse.getTime();
                System.out.println(qqq);


                System.out.println(tt);
                panduan(sdf, parse, sss, tt);


            } catch (ParseException e) {

                System.out.println("你的日期字符串可能 不是一个日期。");
                e.printStackTrace();
            }


        }else{
            System.out.println("你输入的身份证号不符合要求");
        }



    }

    private static void panduan(SimpleDateFormat sdf, Date parse, long sss, String tt) {
        if (tt.equals("一") ) {
            sss=sss+2*1000*60*60*24;
            parse.setTime(sss);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(parse);


            System.out.println("当周的周三"+guo1);

        }
        if (tt.equals("二") ) {
            sss=sss+1000*60*60*24;
            parse.setTime(sss);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(parse);


            System.out.println(guo1);
//                System.out.println("当周的周三"+gou);

        }
        if (tt.equals("三") ) {

            parse.setTime(sss);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(parse);


            System.out.println("当周的周三"+guo1);

//                System.out.println(gou);

        }
        if (tt.equals("四") ) {
            sss=sss-1000*60*60*24;
            parse.setTime(sss);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(parse);


            System.out.println("当周的周三"+guo1);

//                System.out.println(gou);

        }
        if (tt.equals("五")) {
            sss=sss-2*1000*60*60*24;
            parse.setTime(sss);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(parse);


            System.out.println("当周的周三"+guo1);

//                System.out.println(gou);

        }
        if (tt.equals("六") ) {
            sss=sss-3*1000*60*60*24;
            parse.setTime(sss);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(parse);


            System.out.println("当周的周三"+guo1);

//                System.out.println(gou);

        }
        if (tt.equals("七")) {
            sss=sss-2*1000*60*60*24;
            parse.setTime(sss);
//                String  gou=String.format("%tF",data);
            String guo1=sdf.format(parse);


            System.out.println("当周的周三"+guo1);

//                System.out.println(gou);

        }
    }
}
