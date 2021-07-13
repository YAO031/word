package src.com.day06;

public class Word07 {
    public static void main(String[] args) {
        // 假定 大数据获取了 很多网址, 我想要 www -----  com 之间的内容
        // 有一下  几类网址
        // www.oracle.com  ---->  oracle
        // www.oracle.com.cn  ---->  oracle
        // www.java.oracle.com.cn  ---->  java.oracle
        // www.lol.game.qq.com.cn  ---->  lol.game.qq
        // www.game.mycom.com.cn  ---->  game.mycom
        // www.girl.mycom.com.cn  ---->  girl.mycom
        // www.computer.mycom.com.cn  ---->  computer.mycom
        String aa="www.computer.mycom.com.cn";
        tiqu(aa);
    }
    private static void tiqu(String aa) {

        int hh=aa.indexOf(".com",6);
        String   getaa=aa.substring(4,hh);
        System.out.println(hh);
        System.out.println(getaa);
    }
}
