package src.com.day06;

public class Word02 {

    public static void main(String[] args) {

        String ss="大家好！";

        StringBuilder sd=new StringBuilder(ss);
        sd.append("我是程序员");
        System.out.println(sd);
        sd.delete(4,sd.length());
        sd.append("我是优秀的程序员");
        System.out.println(sd);
        sd.delete(4,sd.length());
        sd.append("我是牛牛的程序员");
        System.out.println(sd);

    }
}
