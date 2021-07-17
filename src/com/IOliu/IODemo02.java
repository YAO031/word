package src.com.IOliu;

import java.io.File;

/**
 *
 * filr的而其他，
 */

public class IODemo02 {

    public static void main(String[] args) {
        //创建文件，所有IO底层都不是Java的操作，二十就AVAV调用地层的操作
        File file=new File("io");


        if (!file.exists()) {

            file.mkdir();//不加S创建一层，加S创建多层。


        }else{
            System.out.println("文件存在");
        }

        File file1=new File("io1/io2/io3");
        if (!file1.exists()) {
            file1.mkdirs();
        }else{
            System.out.println("文件存在");
        }
    }



}
