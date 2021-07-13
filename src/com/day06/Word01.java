package src.com.day06;

public class Word01 {


    public static void main(String[] args) {

        String str="HelloWorld";
        test1(str);
        test2(str);
        test3(str);
        test4(str);
        test5(str);
        test6();
        test7(str);
        test8(str);
        test9(str);


    }

// 1:输出字符串"HelloWorld"的字符串长度
    public static  void test1(String str){

       int s= str.length();
        System.out.println(s);



    }
    //:输出"HelloWorld"中"o"的位置
    public static  void test2(String str){

        int s= str.indexOf("o");
        System.out.println(s);



    }
    //输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
    public static  void test3(String str){

       String  s=str.substring(5);
       int a=s.indexOf("o");
        System.out.println(s);
        System.out.println(a);



    }
    //截取"HelloWorld"中的"Hello"并输出
    public static  void test4(String str){
        String  s=str.substring(0,5);

        System.out.println(s);



    }
    //:截取"HelloWorld"中的"World"并输出
    public static  void test5(String str){
        String  s=str.substring(5);

        System.out.println(s);



    }
    //将字符串"  Hello   "中两边的空白去除后输出
    public static  void test6(){
        String str="  World   ";
        String  s=str.trim();

        System.out.println(s);



    }
    //输出"HelloWorld"中第6个字符"W"
    public static  void test7(String str){
        char s=str.charAt(5);

        System.out.println(s);



    }
    //输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
    public static  void test8(String str){

        System.out.println(str.startsWith("h"));
        System.out.println(str.endsWith("ld"));






    }
    //将"HelloWorld"分别转换为全大写和全小写并输出。
    public static  void test9(String str){

       String s=str.toLowerCase();
       String s1=str.toUpperCase();
        System.out.println(s);
        System.out.println(s1);






    }



}
