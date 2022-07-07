package lean.spring.aop.cglib;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName AgentServiceImpl.java
 * @Description TODO
 * @createTime 2022年06月15日 14:47:00
 */
public class AgentServiceImpl {
    public String addAgent(String name) {
        System.out.println("新增代理人：" + name);
        return name;
    }
}
