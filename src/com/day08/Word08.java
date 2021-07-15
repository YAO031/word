package src.com.day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Xiloer
 *
 */

public class Word08 {
    public static void main(String[] args) {
//        Date date=new Date();
        List<Date> ss=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            datass(ss);
        }
        System.out.println(ss);

    }

    private static void datass(List<Date> ss) {
        System.out.println("输入时间：格式如：yyyy-MM-dd");
        Scanner sc=new Scanner(System.in);
        String dd=sc.nextLine();
        //修改 日期格式

        String  pattern="yyyy-MM-dd";


        SimpleDateFormat sdf=new SimpleDateFormat(pattern);

//        String chinnaDat=sdf.format(dd);
//        System.out.println(chinnaDat);


        //字符串 专日期


        try {
            Date parse = sdf.parse(dd);

            System.out.println("parse = " + parse);

            ss.add(parse);


        } catch (ParseException e) {

            System.out.println("你的日期字符串可能 不是一个日期。");
            e.printStackTrace();
        }
    }
}
