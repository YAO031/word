package src.com.IOliu.day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Xiloer
 *
 */

public class Word03 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入目录名:");
        String input = scan.nextLine().trim();


        String ss="C:\\Users\\曜\\IdeaProjects\\log\\"+input;
        File file = new File(ss);
        //判断文件是否存在
        boolean flag = file.exists();


        //若不存在
        if(!flag){
            file.mkdir();
        }else{
            System.out.println("该目录已经存在！！！");
            int index = 0;
            while(flag){
                index++;

                String s1=ss+"_副本"+index;
                file = new File(s1);
                flag = file.exists();//判断文件是否存在
            }
            //当flag为false时跳出while循环得到file，接着创建file
            file.mkdir();
        }
        System.out.println("创建文件的文件名为:"+file.getName());
        scan.close();

    }
}
