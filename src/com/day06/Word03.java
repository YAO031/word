package src.com.day06;

public class Word03 {
    public static void main(String[] args) {
         String str="上海自来水来自海上";


         huiwen(str);
    }

    public static void huiwen(String str) {

        StringBuilder sd = new StringBuilder(str);
        StringBuilder aa = sd.reverse();

        System.out.println(aa);
        StringBuilder a1 = sd.reverse();
        System.out.println(a1);

        System.out.println(a1.equals(sd));


    }
}
