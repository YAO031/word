package src.com.ThreadDemo01;

/*
线程。。。
以前的的代码都是自上倒下的执行，那么 我想有个分支？

创建线程的第一种方式：直接继承继承 Thread ，浪费一次继承的机会
 */

public class ThreadDemo01 {

    public static void main(String[] args) {
        Thread t1=new HotWaterThread();//开辟一个线程这是烧水的线程
        Thread t2=new xiCai();//开辟一个线程这是洗菜的线程

        t1.start();
        t2.start();

        //如果是吧烧水做完，在把洗菜做完，这是同步，异步是没有先后



    }


}


//如果只new Thread ，特只是一个线程，
//需要自己创建一个线程
//对重要的的是方法
class HotWaterThread extends Thread{
        //线程的方法...
    @Override
    public void run() {


        for (int i = 0; i <1000 ; i++) {
            System.out.println("烧水"+i +"瓶");


        }

    }
}


class  xiCai extends Thread{


    @Override
    public void run() {


        for (int i = 0; i <1000 ; i++) {
            System.out.println("洗"+i +"颗白菜");


        }

    }

}
