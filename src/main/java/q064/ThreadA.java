package q064;

import java.util.stream.IntStream;

/**
 * 1 から 100 まで MyCache の doSomething に渡し、出力します。
 */
public class ThreadA extends Thread {
    private final MyCache cache;
//    private final MyMap cache;

    /**
     * ThreadA オブジェクトを割り当て、初期化します。
     *
     * @param cache MyCache
     */
    public ThreadA(MyCache cache) {
        this.cache = cache;
    }
//    public ThreadA(MyMap cache) {
//        this.cache = cache;
//    }

    /**
     * 1 から 100 まで MyCache の doSomething に渡し、出力します。
     */
    @Override
    public void run() {
        System.out.println("Start ThreadA.");
        IntStream.rangeClosed(1, 100).mapToObj(String::valueOf).forEach(this::getAndPrint);
    }

    private void getAndPrint(String key) {
        System.out.printf("ThreadA: key = %s, %s%n", key, cache.doSomething(key));
    }
}
