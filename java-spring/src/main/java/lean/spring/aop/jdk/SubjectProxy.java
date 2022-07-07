package lean.spring.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
*   jdk动态代理模拟
*  */
public class SubjectProxy implements InvocationHandler {
    //目标对象
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    /**
     * @title
     * @description 关联的这个类的方法被调用时将被执行
     * @author admin 
     * @param: proxy 调用这个方法的代理实例
     * @param: method 要调用的方法
     * @param: args 方法调用时所需的参数
     * @updateTime   
     * @return: java.lang.Object
     * @throws 
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //进行method过滤，如果是其他方法就不调用
        if (method.getName().equals("doSomething")){
            System.out.println("JDK动态代理,做某些事前的准备");
            Object object = method.invoke(subject,args);
            System.out.println("JDK动态代理,做某些事后期收尾");
            return object;
        }
        return "调用失败";
    }

    /*
    * 获取被代理接口实例对象
    * */
    public Subject getProxy(){
        return (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(),this);
    }
}
