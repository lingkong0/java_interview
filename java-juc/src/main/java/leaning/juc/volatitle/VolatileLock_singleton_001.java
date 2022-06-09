package leaning.juc.volatitle;

import java.util.concurrent.ThreadPoolExecutor;

/*
* volatile 有序性
* */
public class VolatileLock_singleton_001 {
    public static volatile VolatileLock_singleton_001 singleton;

    //私有化构造函数
    private VolatileLock_singleton_001(){};

    //获取对象 (单例模式，采用双重检测加锁的方式实现)
    public static VolatileLock_singleton_001 getInstance(){
        if(singleton == null){
            synchronized (VolatileLock_singleton_001.class){
                if(singleton == null){
                    singleton = new VolatileLock_singleton_001();
                }
            }
        }
        return singleton;
    }

    /*
    * 对象实例过程：（指令执行过程） --这三个指令执行
    * 1.分配内存空间（a指令）
    * 2.初始化对象（b指令）
    * 3.将内存空间地址赋值给对象引用（c指令）
    * 由于操作系统可以将指令重排序，也有可能变成下面过程
    * 1.分配内存空间（a指令）
    * 2.将内存空间地址赋值给对象引用（c指令）
    * 3.初始化对象（b指令）
    * 如果以上指令重排序会发生什么呢？
    *   多线程环境下，可能将一个没有初始化的对象给暴露出去（其它线程读取到没有初始化的对象，发生不可预料的后果）
    *   因此为了防止重排序设置了volatile变量
    * */

}
