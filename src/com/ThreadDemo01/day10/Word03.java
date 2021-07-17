package src.com.ThreadDemo01.day10;

import java.util.Date;

public class Word03 {

    public static void main(String[] args) throws InterruptedException {



        while (true) {
            Date date=new Date();

            String format = String.format("%tF", date);
            String format1 = String.format("%tT", date);
            String ss=format+" "+format1;
            Thread.sleep(1000);
            System.out.println("ss = " + ss);

        }


    }


}
