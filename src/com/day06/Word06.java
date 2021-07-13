package src.com.day06;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 *
 *
 */
public class Word06 {
    public static void main(String[] args) {
        System.out.println("请输入一个计算表达式，列如：1+2,另外输入的计算表达式遵守运算法则。");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
        if (str.contains("+")) {
            int a=str.indexOf("+");
            String a1=str.substring(0,a);
            String a2=str.substring(a+1);
            int i=Integer.parseInt(a1);
            int i2=Integer.parseInt(a2);
            System.out.println(i+i2);

        } if (str.contains("/")) {
            int a=str.indexOf("/");
            String a1=str.substring(0,a);
            String a2=str.substring(a+1);
            int i=Integer.parseInt(a1);
            int i2=Integer.parseInt(a2);
            if (i >i2) {
                System.out.println("    输入格式错误");

            }else{
                System.out.println(i/i2);
            }


        } if (str.contains("-")) {
            int a=str.indexOf("-");
            String a1=str.substring(0,a);
            String a2=str.substring(a+1);
            int i=Integer.parseInt(a1);
            int i2=Integer.parseInt(a2);
            System.out.println(i-i2);

        } if (str.contains("*")) {
            int a=str.indexOf("*");
            String a1=str.substring(0,a);
            String a2=str.substring(a+1);
            int i=Integer.parseInt(a1);
            int i2=Integer.parseInt(a2);
            System.out.println(i*i2);

        }

    }

}
