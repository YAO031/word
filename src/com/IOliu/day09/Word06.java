package src.com.IOliu.day09;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Xiloer
 *
 */
public class Word06 {
    public static void main(String[] args) {
        String basePath="C:\\Users\\曜\\IdeaProjects\\log";
        String[] list=new File(basePath).list();

        for (String s : list) {
            System.out.println("s = " + s);


        }




    }
}
