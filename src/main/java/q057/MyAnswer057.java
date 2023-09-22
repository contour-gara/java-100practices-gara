package q057;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * 解答。
 */
public class MyAnswer057 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Path input = Path.of("./src/main/resources/MyAnswer057.txt");
        Path output = Path.of("./src/main/resources/MyAnswer057.txt.read");

        try (
                BufferedReader reader = Files.newBufferedReader(input, StandardCharsets.UTF_8)
        ) {
            reader.lines().forEach(System.out::println);

            Files.copy(input, output, REPLACE_EXISTING);

//            Files.delete(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
