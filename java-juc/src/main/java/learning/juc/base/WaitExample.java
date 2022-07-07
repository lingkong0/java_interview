package learning.juc.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName WaitExample.java
 * @Description TODO
 * @createTime 2022年06月22日 12:02:00
 */
public class WaitExample {

    public synchronized void before(){
        System.out.println("before func is running ......");
//        notifyAll();
    }

    public synchronized void after(){
        try {
            wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after func is running ......");
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        WaitExample waitExample = new WaitExample();

        executorService.execute(() -> waitExample.after());
        executorService.execute(() -> waitExample.before());
    }

    /**await/signal/signalALL
     Juc类库中提供了Condition类来实现线程之间的协调，
     可以在Condition上调用await方法使得线程等待；其他线程调用signal或 signalAll方法唤醒等待线程；
    */
     }
