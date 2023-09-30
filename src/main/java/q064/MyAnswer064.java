package q064;

/**
 * 解答。
 */
public class MyAnswer064 {
    /**
     * メインメソッド。
     *
     * @param args 使用しません
     */
    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        System.out.println("key = a");
        System.out.println(myCache.doSomething("a"));
        System.out.println(myCache.doSomething("a"));
        System.out.println("key = i");
        System.out.println(myCache.doSomething("i"));
        System.out.println(myCache.doSomething("i"));

        ThreadA threadA = new ThreadA(myCache);
        ThreadB threadB = new ThreadB(myCache);

        threadA.start();
        threadB.start();

//        MyMap map = new MyMap();
//
//        ThreadMapA threadMapA = new ThreadMapA(map);
//        ThreadMapB threadMapB = new ThreadMapB(map);
//
//        threadMapA.start();
//        threadMapB.start();
    }
}
