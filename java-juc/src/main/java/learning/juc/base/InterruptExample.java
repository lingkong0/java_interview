package learning.juc.base;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ThreadMechanism.java
 * @Description TODO
 * @createTime 2022年06月22日 10:36:00
 */
public class InterruptExample {

    public static class MyThread1 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println("current thread is running ......");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        /*Daemon
        * 守护线程：是指程序运行的时候在后台提供服务的线程，不属于程序中不可或缺的部分；
        * 当所有的非守护线程结束时，程序也终止了，同时会杀死所有的守护线程；
        * */
//        Thread thread = new Thread(r);
//        thread.setDaemon(true);

        /*
        *yield
        对静态方法yield的调用：声明了当前线程已经完成生命周期重要的部分，可以切换cpu时间分片给其他线程使用；
        * */
//        Thread thread = new Thread(r);
//        Thread.yield();


        /*
        * 线程中断
一          个线程执行完毕后会自动结束，但是在执行过程中如果发生了什么异常会提前结束（中断）
            InterruptedExcepton: 中断异常
        	通过调用一个线程的interrupte()方法来中断线程，如果该线程处于阻塞，限期等待，或者是无限期等待状态，那么就会抛出InterruptedExcepton异常，从而提前结束线程；但是不能中断i/o 和 synchronized 锁阻塞；
        * */

        MyThread1 thread1 = new MyThread1();
        thread1.start();
        thread1.interrupt();
        System.out.println("main func is running ......");

    }
}
