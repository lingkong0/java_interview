package learning.juc.synchronizeds;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SynchronizedDemo.java
 * @Description TODO
 * @createTime 2022年06月22日 15:49:00
 */
public class SynchronizedDemo {
    Object object = new Object();
    public void method(){
        synchronized (object){

        }
    }
    private static void method2(){

    }
}
