package src.com.Stringlei;
/*
StringBuilder（速度快，线程不安全）和 StringBuffer 线程安全，比较慢  解决 字符串频繁修改的问题

String类重点应用性
StringBuilder 、buffer 倾向于字符串的修改
当用到字符串大量时  追加、修改、删除的时候 就是用StringBuilder StringBuffer
StringBuilder  优点：内部有个可变的字符组，速度快，内存消耗小

在工作中，字符串 增删改要用tringBuilder StringBuffer
 */
public class StringBuildertest1 {


    public static void main(String[] args) {
        String str ="好好活着";
        StringBuilder sss=new StringBuilder(str);
        //添加
        sss.append("CD你经常");
        System.out.println(sss);
        sss.replace(2,4,"cdbhbcu");//start起始 end 终止
        //删除
        sss.deleteCharAt(2);

        System.out.println(sss);


        sss.delete(2,5);//sb.delete( 0, sb.length() );删除全部
        System.out.println(sss);
        //添加

        sss.insert(0,"csb");
        System.out.println(sss);
        //反转
        sss.reverse();
        System.out.println(sss);







    }



}
