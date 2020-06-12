package singleton;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * 懒加载+对INSTANCE加锁+双重检查
 * （这种写法已经趋于完美了）
 * <p>
 * 优点：实现懒加载同时尽量保证了线程安全
 * 缺点：
 *
 * @author: lizhi
 * @date: 2020/6/7
 * @time: 3:19 上午
 */
public class Singleton03 {
    private static Singleton03 INSTANCE;

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        a:
        if (INSTANCE == null) {
            synchronized (Singleton03.class) {
                /*
                 因为加锁过程中可能会有线程已经走进了a层判断，
                 在这层加锁了之后还是会继续new一个新实例
                 所以需要加完锁后进行二次判断
                */
                b:
                if (INSTANCE == null) {
                    //doSth....
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 每个走进来的线程都不管不顾new了一个实例
                    INSTANCE = new Singleton03();
                }
            }
        }
        return INSTANCE;
    }
}
