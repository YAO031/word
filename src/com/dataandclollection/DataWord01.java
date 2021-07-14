package src.com.dataandclollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 企业开发中，日期是相当重要的
 *
 * 日期类的底层  有一个long值  学名UTC时间
 * 从 1970 年  一月一日 00:00:00 开始  计算机元年 初始日期
 *
 *日期类 俩个类  util  sql
 *
 * 这个日期类  功能有限  日期计算，需要日历类 解决
 */
public class DataWord01 {

    public static void main(String[] args)  {

        //定义一个日期
        Date data =new Date();

        System.out.println(data);//date 为什么输出  Wed Jul 14 09:45:58 CST 2021
        //因为toString 被改写了

        long time=data.getTime();//获得真实的时间。long值
        System.out.println(time);

//        data.setTime(16262273703767L);
//        System.out.println(data);
    int ss=24*60*60*1000;
        System.out.println(ss);

        time+=1000*60*60*24*10L;
        long ss1= ss+time;

        System.out.println(ss1);
        data.setTime(time);
        System.out.println(data);



        //修改 日期格式

       String  pattern="yyyy-mm-dd HH:mm:ss";
        String  pattern1="yyyy/mm/dd HH:mm:ss";

        SimpleDateFormat sdf=new SimpleDateFormat(pattern);

        String chinnaDat=sdf.format(data);

            //字符串 专日期

        String datastr="2018-09-12 23:13:45";

        try {
           Date parse = sdf.parse(datastr);
           long sss=parse.getTime();
            System.out.println(sss);
        } catch (ParseException e) {

            System.out.println("你的日期字符串可能 不是一个日期。");
            e.printStackTrace();
        }




    }
}
