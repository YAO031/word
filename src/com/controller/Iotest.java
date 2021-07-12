package src.com.controller;

import java.io.File;

public class Iotest {
    public static void main(String[] args) {



        File file=new File("G:\\工作\\实训\\C#OOP项目ATM取款机");//创建要删除的文件的路径
        deleteFile( file);//调用方法


    }
    //创建递归删除的方法
    private static void deleteFile(File file) {
        System.out.println(file.getAbsolutePath());//打印要删除的地址
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath());
            return;
        }
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {//判断是否为文件
            File files[] = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                deleteFile(files[i]);
            }
        }
        file.delete();
        System.out.println("已删除");
    }

}
