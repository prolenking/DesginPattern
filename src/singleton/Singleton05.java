package singleton;

/**
 * Create with IntelliJ IDEA
 * <p>
 * User: liz
 * Date: 2020/6/9
 * Time: 4:11 下午
 *
 * @author lizhi
 */
public enum Singleton05 {
    /**
     * 单例
     */
    INSTANCE;

    public void m() {
        //do sth
        System.out.println("05执行了某些方法");
    }

    public static void main(String[] args) {
        Singleton05 singleton = Singleton05.INSTANCE;
        singleton.m();
    }
}
