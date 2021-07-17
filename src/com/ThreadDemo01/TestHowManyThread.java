package src.com.ThreadDemo01;

/**
 *
 *
 */

public class TestHowManyThread {

    public static  int o=0;

    public static void main(String[] args) {

        while (true){

            new Thread(){
                @Override
                public void run() {
                    for (int i = 0; i <1000 ; i++) {

//                        System.out.println("洗菜 = " + i);

                    }
                    o++;
                    System.out.println("线程数量"+o);

                }
            }.start();

        }

    }
}
