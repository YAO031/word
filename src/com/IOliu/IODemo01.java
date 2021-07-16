package src.com.IOliu;

//File文件

import java.io.File;
import java.io.IOException;

/**
 * File文件你真行，可读可写可执行
 */

public class IODemo01 {
    public static void main(String[] args) throws IOException {

        File file = new File("io04.txt");//路径


        //查看文件是否存在
        boolean exists = file.exists();
        if ( exists) {

            System.out.println("文件已存在");

        }else{
            System.out.println("文件不存在");
            boolean create = file.createNewFile();

            System.out.println("文件穿件成功");
        }

        boolean file1 = file.isFile();
        System.out.println("是否文件 = " + file1);
        boolean directory = file.isDirectory();
        System.out.println("存不存在 = " + directory);
        boolean hidden = file.isHidden();
        System.out.println("是否隐藏 = " + hidden);

        System.out.println("file = " + file);
        String name = file.getName();
        System.out.println("name = " + name);

        final long length = file.length();

        System.out.println("length = " + length);




    }



}
