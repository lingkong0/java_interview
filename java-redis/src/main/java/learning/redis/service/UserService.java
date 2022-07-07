package learning.redis.service;

import learning.redis.entity.User;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2022年06月20日 19:11:00
 */
public interface UserService {
    User save(User user);

    void delete(int id);

    User get(Integer id);
}
