package src.com.Stringlei;

public class Stringtest {

    public static void main(String[] args) {
        String s1="123";
        String s2="123";
        System.out.println(s1==s2);//true
        //原因：以上为什么是true？因为s2冲用了s1的对象
        s1=s1+"!";
        System.out.println(s1==s2);//false
        //原因：以上为什么是false？因为根本不相等，对象被修改了。

        String s3="1"+"23";
        System.out.println(s2==s3);
        //字符串连接就是没连接

        String s4=new String("123");
        String s5=new String("123");
        System.out.println(s4==s2);//false
        //s2是常量 s4 是类
        System.out.println(s4==s5);//false 原因S4和s5是不同的对象

        System.out.println(s4.equals(s5));//true
        System.out.println(s4.equals(s2));//true
        //==比较的是内存地址 equals比较的是值

    }
}
