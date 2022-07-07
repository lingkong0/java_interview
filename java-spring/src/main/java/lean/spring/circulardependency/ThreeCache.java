package lean.spring.circulardependency;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ThreeCache.java
 * @Description TODO
 * @createTime 2022年06月15日 16:23:00
 */
public class ThreeCache {

/*
    protected Object getSingleton(String beanName, boolean allowEarlyReference) {
        // Quick check for existing instance without full singleton lock
        // 从一级缓存中获取
        Object singletonObject = this.singletonObjects.get(beanName);
        // 如果没有，且依赖的A正在初始化，那我们去尝试看看earlySingletonObjects（二级缓存）是否有对象
        // earlySingletonObjects（二级缓存）存放的是还未实例化好对象
        if (singletonObject == null && isSingletonCurrentlyInCreation(beanName)) {
            // 从二级缓存中获取
            singletonObject = this.earlySingletonObjects.get(beanName);
            // 如果获取不到 但是支持获取EarlyReference
            if (singletonObject == null && allowEarlyReference) {
                // 这里应该是Spring 5.x的优化，只有一二级缓存中都获取不到的时候才进行加锁，相对于5.x以前的一开始就加锁后移了，提高了性能
                synchronized (this.singletonObjects) {
                    // Consistent creation of early reference within full singleton lock
                    // 这里与5.x以前的一致
                    singletonObject = this.singletonObjects.get(beanName);
                    if (singletonObject == null) {
                        singletonObject = this.earlySingletonObjects.get(beanName);
                        if (singletonObject == null) {
                            // 从三级缓存中获取,需要注意的是这里获取的不是singletonObject了，而是一个ObjectFactory
                            // 这个ObjectFactory就是 addSingletonFactory(beanName, () -> getEarlyBeanReference(beanName, mbd, bean)); 中的() -> getEarlyBeanReference(beanName, mbd, bean)
                            ObjectFactory<?> singletonFactory = this.singletonFactories.get(beanName);
                            if (singletonFactory != null) {
                                // 通过从三级缓存中拿到的是一个工厂对象，这个工厂对象可以用于生产singletonObject并放入二级缓存中
                                singletonObject = singletonFactory.getObject();
                                // 把工厂生产出来的singletonObject放入二级缓存中
                                this.earlySingletonObjects.put(beanName, singletonObject);
                                this.singletonFactories.remove(beanName);


                                // 也就是说，这里的逻辑是 从三级缓存中拿到的是一个工厂对象，这个工厂对象可以用于生产singletonObject并放入二级缓存中
                                // 为什么不把原对象直接放入二级缓存中呢？因为可能有AOP，所以需要生成代理对象
                                // 那为什么不直接把生成好的代理对象放入二级缓存中呢？因为为了性能考虑，如果没有循环引用，是不需要生成对象的。如果我们早早的就在doCreateBean方法中生成好了对象并放入二级缓存中，那是不是影响性能呢？
                            }
                        }
                    }
                }
            }
        }
        return singletonObject;
    }

    */

    /*
    * 如果一二三级缓存都没有这个bean，则会走新建方法
    * 1、createBeanInstance：实例化，调用对象的构造参数实例化对象
    * 2.populateBean：填充属性，这一步主要是多bean的依赖属性填充
    * 3.initializeBean：调用spring.xml的init方法
    * */

}
