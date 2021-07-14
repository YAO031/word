package src.com.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。

 *
 */
public class Word03 {

    public static void main(String[] args) {
        System.out.println("请输入你的生日，格式如：yyyy-MM-dd");
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();

        System.out.println(ss);

        Date data=new Date();
        long s1=data.getTime();
        System.out.println(s1);


        String  pattern="yyyy-mm-dd";


        SimpleDateFormat sdf=new SimpleDateFormat(pattern);

        String chinnaDat=sdf.format(data);

        //字符串 专日期



        try {
            Date parse = sdf.parse(ss);
            long sss=parse.getTime();
            System.out.println(sss);
            long s=s1-sss;
            long s3=1000*60*60*24*7;

            long  s2=s/s3;
            System.out.println("从你出生到现在吧，你已经度过了"+s2+"周");
        } catch (ParseException e) {

            System.out.println("你的日期字符串可能 不是一个日期。");
            e.printStackTrace();
        }











    }
}
