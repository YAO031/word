package src.com.ThreadDemo01;

/*

线程的创建 最好用的 匿名内部类。
 */

public class ThreadDemo03 {

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {

                    System.out.println("洗菜 = " + i);

                }


            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {

                    System.out.println("烧水 = " + i);

                }

            }
        }.start();


    }
}
