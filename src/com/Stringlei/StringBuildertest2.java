package src.com.Stringlei;

public class StringBuildertest2 {
    public static void main(String[] args) {
        String str="a";
        StringBuilder sdd=new StringBuilder(str);
        for (int i = 0; i < 25; i++) {

            sdd.append(str);
            System.out.println();

        }
    }
}
