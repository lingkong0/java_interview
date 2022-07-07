package learning.juc.synchronizeds;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SynchronizedLock01.java
 * @Description TODO
 * @createTime 2022年06月22日 14:58:00
 */
public class SynchronizedLock02 implements Runnable{

    static SynchronizedLock02 lock01= new SynchronizedLock02();

    Object lock02 = new Object();
    Object lock03 = new Object();
    @Override
    public void run() {

        synchronized (lock02){
            System.out.println("I am thread lock02 " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " lock02 is end");
        }

        synchronized (lock03){
            System.out.println("I am thread lock03 " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " lock03 is end");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(lock01);
        Thread thread2 = new Thread(lock01);

        thread1.start();
        thread2.start();
    }
}
