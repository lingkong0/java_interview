package learning.juc.volatitle;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName VolatileDemo001.java
 * @Description TODO
 * @createTime 2022年06月27日 11:18:00
 */
public class VolatileDemo001 {
    int a = 1;
    int b = 2;

    public void change(){
        a = 3;
        b = a;
    }

    public void print(){
        System.out.println("b = " + b+"  a = " + a);
    }

    public static void main(String[] args) {
        while (true){
            VolatileDemo001 volatileDemo001 = new VolatileDemo001();
            //线程1
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    volatileDemo001.change();
                }
            }).start();

            //线程2
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    volatileDemo001.print();
                }
            }).start();
        }
    }
}
