package src.com.IOliu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *文件的靠背
 */

public class IODemoCopy01 {

    public static void main(String[] args) throws IOException {

        RandomAccessFile raf=new RandomAccessFile("第二组.zip","r");
        RandomAccessFile secondName=new RandomAccessFile("第二组副本.zip","rw");
        int d= -1;
        while (true){
            if ((d=raf.read())!=-1 ) {

                secondName.write(d);

            }


        }
    }
}
