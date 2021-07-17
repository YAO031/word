package src.com.ThreadDemo01.day10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Word02 {

    public static void main(String[] args) {

        String Dir="./";
        test(Dir);

    }
    private static void test(String Dir) {
        List<File> fileList = new ArrayList<File>();
        File file = new File(Dir);
        List<String > ss=new ArrayList<>();
        File[] files = file.listFiles();// 获取目录下的所有文件或文件夹
        if (files == null) {// 如果目录为空，直接退出
            return;
        }
        // 遍历，目录下的所有文件
        for (File f : files) {
            if (f.isFile()) {


                fileList.add(f);
                if(f.getName().contains(".class")){
                    ss.add(f.getName());

                }

            } else if (f.isDirectory()) {
                System.out.println(f.getAbsolutePath());
                test(f.getAbsolutePath());
            }
        }
//        for (File f1 : fileList) {
//            System.out.println(f1.getName());
//        }
        for (String s : ss) {
            System.out.println("s = " + s);

        }

    }
}
