package src.com.IOliu;

import java.io.File;

/**还能查看文件
 *
 */

public class IoselectFileDemo01 {
   private static long size=0;

    public static void main(String[] args) {
//        File file=new File(".");

//        File[] files=file.listFiles()
                ;
//        for (File file1 : files) {
//            System.out.println(file1);
//        }

        //查看所有的文件？
        File file=new File("C:\\Users\\曜\\IdeaProjects\\log");
        test(file);

    }


    public static  long test(File file){
        File[] files=file.listFiles();


        for (File file1 : files) {
            if (file1.isDirectory() ) {
                test(file1);
            }else{
                System.out.println(file1.length());
                 size+=file1.length();


            }
        }
        return size;

    }
}
