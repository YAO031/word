package src.com.IOliu.day09;

import java.io.File;

public class Word05 {
    /**
     * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
     * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
     * 在该目录中继续创建若干级目录和文件。
     * @author Xiloer
     *
     */
    public static void main(String[] args) {



        File file=new File("C:\\Users\\曜\\IdeaProjects\\log\\ww");//创建要删除的文件的路径
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
