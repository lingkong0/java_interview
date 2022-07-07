package learning.juc.base;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ThreadUnSafe.java
 * @Description TODO
 * @createTime 2022年06月22日 10:15:00
 */
public class ThreadUnSafe {
    private int cnt;
    private void add(){
        cnt++;
    }
    public int get(){
        return cnt;
    }

    public static void main(String[] args) {

        int threadSize = 1000;
        ThreadUnSafe threadUnSafe = new ThreadUnSafe();

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.execute(() -> {
                threadUnSafe.add();
            });
        }
        System.out.println("threadUnSafe.get() = " + threadUnSafe.get());
    }
    /*上述例子：如果是线程安全的，那么结果应该是1000，但是经过测试发现其结果是900多，因此存在线程安全的问题；
    Q： 什么原因造成了上述问题？？（并发的三大要素）
	1）、可见性（cpu缓存）
	2）、原子性（cpu时钟：分时复用的问题）
	3）、有序性（指令重排）
*/

}
