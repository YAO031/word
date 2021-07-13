package src.com.Stringlei;

import java.util.Scanner;

public class Stringtest2 {

    public static void main(String[] args) {
                    //
        String str ="javasixiang";//java思想

        char c=str.charAt(10);
        System.out.println(c);

        int length=str.length();
        System.out.println(length);

        char[] chars=str.toCharArray();//数组的加密
        int d=chars.length;//数组不带方法就是（）
        System.out.println(d);
        for (char aChar : chars) {
            System.out.println(aChar);

        }


          int i=str.indexOf("j");//查找i的位置
        System.out.println(i);
        //从制定位置，进行检索




        int i1=str.lastIndexOf("v");
        System.out.println(i1);


        String str1="dsfhjvbudfv0";
        boolean th=str1.startsWith("fh");
        System.out.println(th);


        boolean va=str1.endsWith("bu");
        System.out.println(va);


        String str2="sdbuhuwqfqvm";
        String substring=str2.substring(5,8);
        System.out.println(substring);




//        String  aa="www.oracle.com";

        Scanner sc=new Scanner(System.in);
        String aa=sc.nextLine();

//        tiqu(aa);


        String str3="    jdnc    ";
        String str33=str3.trim();
        System.out.println(str33);

        String m="ABF";
        String m1=m.toLowerCase();
        System.out.println(m1);

        String  n="ddh";
        String n1=n.toUpperCase();
        System.out.println(n1);

        System.out.println(m.equals(n));

        System.out.println(m.equalsIgnoreCase(n));


        int oo=131564;
        String oo1=String.valueOf(oo);

        System.out.println(oo1+1);



        String pp="cdhsbcvmdlkvmo.csdjhcb";
       String[]  fff=pp.split("\\.");
        for (String s : fff) {
            System.out.println(s);
        }


        String hhhh="bchdbc";//替换







    }

    private static void tiqu(String aa) {
        int hh=aa.indexOf(".com");
        String   getaa=aa.substring(4,hh);
        System.out.println(hh);
        System.out.println(getaa);
    }
}
