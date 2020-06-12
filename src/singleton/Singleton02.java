package singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * 通过懒加载的方式生成实例
 *
 * 优点：改善了最简单版本的在jvm启动时就生成实例的缺陷。
 * 缺点：可能会出现线程问题
 *
 * @author: lizhi
 * @date: 2020/6/7
 * @time: 3:19 上午
 */
public class Singleton02 {
    private static Singleton02 INSTANCE;

    private Singleton02(){}

    public static Singleton02 getInstance() {
        // 几个线程开始时都取不到INSTANCE所以都会走到代码块里去
        if (INSTANCE ==null){
            {
                //doSth....
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 每个走进来的线程都不管不顾new了一个实例
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }
}
