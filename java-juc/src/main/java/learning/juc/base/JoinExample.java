package learning.juc.base;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName JoinExample.java
 * @Description TODO
 * @createTime 2022年06月22日 11:48:00
 */
public class JoinExample {
    public class A extends Thread{
        @Override
        public void run() {
            System.out.println("A........");
        }
    }

    public class B extends Thread{
        private A a;

        B(A a){
            this.a = a;
        }

        @Override
        public void run() {

            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("B........");
        }
    }

    public void test(){
        A a = new A();
        B b = new B(a);
        b.start();
        a.start();
    }

    public static void main(String[] args) {
        JoinExample joinExample = new JoinExample();
        joinExample.test();
    }
}
