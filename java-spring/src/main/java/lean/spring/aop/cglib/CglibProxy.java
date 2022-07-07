package lean.spring.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName CglibProxy.java
 * @Description TODO
 * @createTime 2022年06月15日 14:49:00
 */
public class CglibProxy implements MethodInterceptor {

    private Object proxyObject;


    @Override
    /**
     * @title
     * @description
     * @author admin
     * @param: o 生成的代理类实例
     * @param: method 被代理对象的方法引用
     * @param: objects 方法参数值数组
     * @param: methodProxy 代理类对方法的代理引用
     * @updateTime
     * @return: java.lang.Object
     * @throws
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB动态代理，监听开始");
        Object result = method.invoke(proxyObject,objects);
        System.out.println("CGLIB动态代理，监听结束");
        return null;
    }

    private Object getCglibProxy(Object objectTarget){
        this.proxyObject = objectTarget;
        Enhancer enhancer = new Enhancer();
        //设定父类，因为cglib是针对指定类生成一个子类，所需需要设定父类
        enhancer.setSuperclass(objectTarget.getClass());
        enhancer.setCallback(this);//设置回调

        return enhancer.create();//创建并返回代理对象
    }

    public static void main(String[] args) {
        //实例化cglib对象
        CglibProxy cglibProxy = new CglibProxy();

        //获取代理对象
        AgentServiceImpl agentService = new AgentServiceImpl();
        AgentServiceImpl proxy = (AgentServiceImpl) cglibProxy.getCglibProxy(agentService);
        proxy.addAgent("小薛");


    }


}
