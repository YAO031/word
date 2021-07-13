package src.com.day06;

import java.util.Scanner;

public class Word05 {

    public static void main(String[] args) {

        int n=2;
        String str="";
        for (int i = 0; i <n ; i++) {

            str=str+(char)(Math.random()*26+'a')+(char)(Math.random()*26+'A');

        }

        System.out.println("请输入验证码："+str);
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
       if(str.equalsIgnoreCase(ss)){
           System.out.println("验证成功");
       }else{
           System.out.println("验证失败");
       }

    }
}
