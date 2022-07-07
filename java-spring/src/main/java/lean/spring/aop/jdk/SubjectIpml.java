package lean.spring.aop.jdk;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName SubjectIpml.java
 * @Description TODO
 * @createTime 2022年06月14日 15:35:00
 */
public class SubjectIpml implements Subject{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        @Override
    public String doSomething(String thingsNeedParm) {
        System.out.println("使用" + thingsNeedParm + "做了一些事情");
        return "调用成功";
    }

    @Override
    public String doOtherNotImportantThing(String otherThingsNeedParm) {
        System.out.println("使用" + otherThingsNeedParm + "做了一些事情");
        return "调用成功";
    }
}
