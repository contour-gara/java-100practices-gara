package q055;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * 解答。
 */
public class MyAnswer055 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) throws IOException {
        String path = Path.of(".").toFile().getAbsolutePath();
        System.out.println(path);

        Path file = Path.of("./src/main/java/q055/MyAnswer055.txt");
        try (Stream<String> stream = Files.lines(file)) {
            Integer sum = stream.map(String::length).mapToInt(i -> i).sum();
            System.out.println(sum);
        }
    }
}
