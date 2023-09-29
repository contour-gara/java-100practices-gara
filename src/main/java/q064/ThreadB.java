package q064;

import java.util.stream.IntStream;

/**
 * 1 から 100 まで MyCache の doSomething に渡し、出力します。
 */
public class ThreadB extends Thread {
    private final MyCache cache;
//    private final MyMap cache;

    /**
     * ThreadB オブジェクトを割り当て、初期化します。
     *
     * @param cache MyCache
     */
    public ThreadB(MyCache cache) {
        this.cache = cache;
    }
//    public ThreadB(MyMap cache) {
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
        System.out.printf("ThreadB: key = %s, %s%n", key, cache.doSomething(key));
    }
}
