package q062;

import java.util.Map;
import java.util.stream.IntStream;

/**
 * 解答。
 */
public class MyAnswer062 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        MyMap<Integer, Integer> myMap = new MyMap<>();

        IntStream.rangeClosed(1, 110).forEach(e -> myMap.put(e, e));
        System.out.println(myMap.get(10));
        System.out.println(myMap.get(11));

        myMap.put(1, 1);
        System.out.println(myMap.get(11));
        System.out.println(myMap.get(12));
        System.out.println(myMap.get(13));
    }
}
