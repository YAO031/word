package src.com.Stringlei;

/**
 * 测试String的性能
 * 总结：频繁修改字符串 ，会造成性能损失，需要StringBuffer、Build
 * 频繁修改会造成内存溢出的错误
 * String StringBUild
 *
 */


public class Stringtest1 {
    public static void main(String[] args) {
        String str="a";
        System.out.println(System.currentTimeMillis());
        long l=System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            str+=str;//测试频繁修改字符串

        }
        System.out.println(System.currentTimeMillis()-l);
        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space内存不足内存溢出
    }
}
