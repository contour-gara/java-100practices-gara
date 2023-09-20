package q054;

import java.util.stream.IntStream;

/**
 * 解答。
 */
public class MyAnswer054 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Integer sum = IntStream
                .rangeClosed(1, 100)
                .filter(i -> i % 2 == 0)
                .sum();

        System.out.println(sum);

        IntStream.rangeClosed(1, 100).forEach(System.out::println);
    }
}
