package learning.redis.util;

import org.springframework.util.StringUtils;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName RedisUtil.java
 * @Description TODO
 * @createTime 2022年06月21日 10:06:00
 */
public class RedisUtil {
//    public static String getData(String key) throws InterruptedException {
//        //从Redis查询数据
//        String result = getDataByKV(key);
//        //参数校验
//        if (StringUtils.isBlank(result)) {
//            try {
//                //获得锁
//                if (reenLock.tryLock()) {
//                    //去数据库查询
//                    result = getDataByDB(key);
//                    //校验
//                    if (StringUtils.isNotBlank(result)) {
//                        //插进缓存
//                        setDataToKV(key, result);
//                    }
//                } else {
//                    //睡一会再拿
//                    Thread.sleep(100L);
//                    result = getData(key);
//                }
//            } finally {
//                //释放锁
//                reenLock.unlock();
//            }
//        }
//        return result;
//    }
}
