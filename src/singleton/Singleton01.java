package singleton;

/**
 * 基础的单例模式
 * 
 * 优点：简单、线程安全
 * 缺点：在JVM加载类的时候就生成实例了，浪费资源。
 *
 * @author lizhi
 */
public class Singleton01 {

    private static final Singleton01 INSTANCE = new Singleton01();
    
    static {
        //doSth...
    }

    private Singleton01(){}

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
