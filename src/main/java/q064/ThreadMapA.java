package q064;

import java.util.stream.IntStream;

/**
 * 1 から 100 まで MyMap の doSomething に渡し、出力します。
 */
public class ThreadMapA extends Thread {
    private final MyMap map;

    /**
     * ThreadMapA オブジェクトを割り当て、初期化します。
     *
     * @param map MyMap
     */
    public ThreadMapA(MyMap map) {
        this.map = map;
    }

    /**
     * 1 から 100 まで MyMap の doSomething に渡し、出力します。
     */
    @Override
    public void run() {
        System.out.println("Start ThreadA.");
        IntStream.rangeClosed(1, 100).mapToObj(String::valueOf).forEach(this::getAndPrint);
    }

    private void getAndPrint(String key) {
        System.out.printf("ThreadA: key = %s, %s%n", key, map.doSomething(key));
    }
}
