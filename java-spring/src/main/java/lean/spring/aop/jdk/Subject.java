package lean.spring.aop.jdk;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Subject.java
 * @Description TODO
 * @createTime 2022年06月14日 15:32:00
 * 被代理的主题需要实现的接口
 */
public interface Subject {

    String doSomething(String thingsNeedParm);

    String doOtherNotImportantThing(String otherThingsNeedParm);

}
