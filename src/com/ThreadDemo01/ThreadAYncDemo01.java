package src.com.ThreadDemo01;

/**
 * 线程并发
 * 比如多个账户抢票
 *
 */
public class ThreadAYncDemo01 {


    public static void main(String[] args) {

        Tickes tickes=new Tickes();

        Thread t1=new Thread(){
            @Override
            public void run() {
                //模拟黄牛一取票
                while (true){
                    tickes.getTicket();
                    Thread.yield();
                    System.out.println(getName()+"线程拿取了"+tickes);
                }

            }
        };


        Thread t2=new Thread(){
            @Override
            public void run() {
                //模拟黄牛一取票
                while (true){
                    tickes.getTicket();
                    Thread.yield();
                    System.out.println(getName()+"线程拿取了"+tickes);
                }

            }
        };
        t1.start();t2.start();


    }
}


class Tickes {
    private int ticket=20;

    public int getTicket() {

        if (ticket==0){
            System.out.println("没票了");

            throw new RuntimeException("票没了");
        }

       // Thread.yield();
        return ticket--;
    }






}