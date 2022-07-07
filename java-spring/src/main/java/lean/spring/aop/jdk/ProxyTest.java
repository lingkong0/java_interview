package lean.spring.aop.jdk;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ProxyTest.java
 * @Description TODO
 * @createTime 2022年06月14日 15:49:00
 */
public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new SubjectIpml();

        SubjectProxy subjectProxy = new SubjectProxy(subject);
        Subject proxy = subjectProxy.getProxy();
        proxy.doSomething("改锥");
        proxy.doOtherNotImportantThing("纸片");
    }
}
