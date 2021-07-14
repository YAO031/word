package src.com.day07;


import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 *
 */
public class Word01 {

    public static void main(String[] args) {

        Date data=new Date();

        long ss=data.getTime();//这是输出当前的系统时间


        System.out.println(ss);

        long ss1=ss+1000*60*60*24*3;//这是三天后的系统时间

        System.out.println(ss1);



    }
}
