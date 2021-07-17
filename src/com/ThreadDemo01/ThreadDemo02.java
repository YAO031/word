package src.com.ThreadDemo01;

/**
 * 线程的第二种方法
 *
 */
public class ThreadDemo02 {

    public static void main(String[] args) {

        Runnable xiCai=new xicai();
        Runnable Shaoshui=new shaoshui();

        Thread xiaiThread=new Thread(xiCai);
        Thread shaoshuiThread=new Thread(Shaoshui);
        xiaiThread.start();
        shaoshuiThread.start();



    }
}


class  xicai implements  Runnable{


    @Override
    public void run() {

        for (int i = 0; i <1000 ; i++) {

            System.out.println("洗菜 = " + i);

        }

    }
}
class  shaoshui implements  Runnable{


    @Override
    public void run() {

        for (int i = 0; i <1000 ; i++) {

            System.out.println("烧水 = " + i);

        }

    }
}