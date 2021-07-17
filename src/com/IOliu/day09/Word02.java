package src.com.IOliu.day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Xiloer
 *
 */

public class Word02 {

    public static void main(String[] args) throws IOException {

//

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String input = scan.nextLine().trim();
        File file = new File(input);
        //判断文件是否存在
        boolean flag = file.exists();

        int dd=input.indexOf(".txt");
        String ss=input.substring(0,dd);
        //若不存在
        if(!flag){
            file.createNewFile();
        }else{
            System.out.println("该文件已经存在！！！");
            int index = 0;
            while(flag){
                index++;

                String s1=ss+"_副本"+index+".txt";
                file = new File(s1);
                flag = file.exists();//判断文件是否存在
            }
            //当flag为false时跳出while循环得到file，接着创建file
            file.createNewFile();
        }
        System.out.println("创建文件的文件名为:"+file.getName());
        scan.close();


    }
}
