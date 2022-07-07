package learning.juc.volatitle;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName VolatileDemo001.java
 * @Description TODO
 * @createTime 2022年06月27日 11:18:00
 */
public class VolatileDemo002 {
   volatile int i;
   public void add(){
        i++;
   }

    public static void main(String[] args) throws InterruptedException {
        int loopSize = 1000;
        VolatileDemo002 volatileDemo002 = new VolatileDemo002();

        for (int i = 0; i < loopSize; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    volatileDemo002.add();
                }
            }
            ).start();

        }

        //等待10s
        Thread.sleep(10000);
        System.out.println("volatileDemo002.i = " + volatileDemo002.i);
    }
}
