package learning.juc.synchronizeds;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SynchronizedLock01.java
 * @Description TODO
 * @createTime 2022年06月22日 14:58:00
 */
public class SynchronizedLock01 implements Runnable{

    static SynchronizedLock01 lock01= new SynchronizedLock01();

    @Override
    public void run() {

        //同步代码块，
        //锁的对象是this，两个线程使用的锁一样，线程2必须等待线程1结束
        synchronized (this){
            System.out.println("I am thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "is end");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(lock01);
        Thread thread2 = new Thread(lock01);

        thread1.start();
        thread2.start();
    }
}
