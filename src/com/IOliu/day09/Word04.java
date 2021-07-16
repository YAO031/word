package src.com.IOliu.day09;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 *
 */

public class Word04 {


    public static void main(String[] args) {

                test("C:\\Users\\曜\\IdeaProjects\\log");
    }


    private static void test(String Dir) {
        List<File> fileList = new ArrayList<File>();
        File file = new File(Dir);
        File[] files = file.listFiles();// 获取目录下的所有文件或文件夹
        if (files == null) {// 如果目录为空，直接退出
            return;
        }
        // 遍历，目录下的所有文件
        for (File f : files) {
            if (f.isFile()) {
                fileList.add(f);
            } else if (f.isDirectory()) {
                System.out.println(f.getAbsolutePath());
                test(f.getAbsolutePath());
            }
        }
        for (File f1 : fileList) {
            System.out.println(f1.getName());
        }
    }




}
