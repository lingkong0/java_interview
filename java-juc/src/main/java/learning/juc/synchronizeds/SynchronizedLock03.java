package learning.juc.synchronizeds;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SynchronizedLock01.java
 * @Description TODO
 * @createTime 2022年06月22日 14:58:00
 */
public class SynchronizedLock03 implements Runnable{

    static SynchronizedLock03 lock01= new SynchronizedLock03();

    @Override
    public void run() {
        method();
    }

    public synchronized void method(){

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
