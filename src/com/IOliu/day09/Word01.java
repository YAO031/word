package src.com.IOliu.day09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 * @author Xiloer
 *
 */

public class Word01 {

    public static void main(String[] args) {

        Date data=new Date();


        File file = new File("io03.txt");
        String name = file.getName();
        long length = file.length();
        long tim = file.lastModified();
        System.out.println("name = " + name);
        System.out.println("l = " + tim);
        System.out.println("length = " + length);
        data.setTime(tim);
        String format = String.format("%tF", data);
        String format1 = String.format("%tT", data);
        System.out.println("format = " + format);
        System.out.println("format1 = " + format1);
        System.out.println(format+" "+format1);


    }
}
