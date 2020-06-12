package singleton;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 静态内部类
 * （完美的写法之一）
 * <p>
 *
 * 原理：JVM在加载外部类的时候不会加载内部类，同时JVM能够保证单例
 * (又简单又安全，嗬你可真是个小天才！)
 *
 * @author: lizhi
 * @date: 2020/6/7
 * @time: 3:19 上午
 */
public class Singleton04 {

    private Singleton04() {
    }

    private static class SingletonHolder{
        private final static Singleton04 INSTANCE = new Singleton04();
    }

    public static Singleton04 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
