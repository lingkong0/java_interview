package leanring.base;

import java.util.function.IntBinaryOperator;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Lambda.java
 * @Description TODO
 * @createTime 2022年06月22日 10:03:00
 */
public class Lambda {
    public int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        final IntBinaryOperator intBinaryOperator = (int x, int y) -> {
            return x + y;
        };
    }

}
