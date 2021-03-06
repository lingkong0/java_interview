package learning.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName redis.java
 * @Description TODO
 * @createTime 2022年06月20日 18:35:00
 */
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@EnableCaching
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
