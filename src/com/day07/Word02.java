package src.com.day07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 *
 *
 */
public class Word02 {

    public static void main(String[] args) {

        Date data=new Date();

        String  pattern="yyyy-mm-dd HH:mm:ss";


        SimpleDateFormat sdf=new SimpleDateFormat(pattern);

        String   dats=sdf.format(data);
        System.out.println(dats);

    }
}
