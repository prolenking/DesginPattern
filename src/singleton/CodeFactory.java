package singleton;

/**
 * 基础的单例模式
 * 
 * 优点：简单、线程安全
 * 缺点：在JVM加载类的时候就生成实例了，浪费资源。
 *
 * @author lizhi
 */
public class CodeFactory {

    private static final CodeFactory INSTANCE = new CodeFactory();
    
    static {
        //doSth...
    }

    private CodeFactory(){}

    public static CodeFactory getInstance() {
        return INSTANCE;
    }
}
