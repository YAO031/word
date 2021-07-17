package src.com.ThreadDemo01;

/**
 * 线程的阻塞
 *
 */

public class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 30; i++) {
            Thread.sleep(2);

            System.out.println("i = " + i);
        }

        //其实main方法就是一个主线程

        Thread thread=Thread.currentThread();
        String name=thread.getName();
        System.out.println("name = " + name);

        long id=thread.getId()
                ;
        System.out.println(id);

        boolean daemon = thread.isDaemon();//是否守护线程
        System.out.println("daemon = " + daemon);

        int priority = thread.getPriority();//线程优先级
        System.out.println("priority = " + priority);

        boolean alive = thread.isAlive();//线程是否活着
        System.out.println("alive = " + alive);


    }
}
