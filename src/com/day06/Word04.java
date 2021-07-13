package src.com.day06;

import java.util.Scanner;

public class Word04 {
    public static void main(String[] args) {

        System.out.println("请输入吧你的邮箱");

        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        int a=ss.lastIndexOf("@");
        System.out.println(a);
        System.out.println(ss.substring(0,a));


    }
}
