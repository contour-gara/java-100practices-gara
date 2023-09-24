package q055;

import com.google.common.collect.Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 応用。
 */
public class ExAnswer055 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Path input = Path.of("./src/main/resources/MyAnswer055.txt");
        Path output = Path.of("./src/main/resources/exoutput055.txt");

        try (
                BufferedReader reader = Files.newBufferedReader(
                        input,
                        StandardCharsets.UTF_8
                );
                BufferedWriter writer = Files.newBufferedWriter(
                        output,
                        StandardCharsets.UTF_8
                )
        ) {
            Streams.mapWithIndex(
                            reader.lines(),
                            (str, idx) -> String.format("%s %s%n", idx + 1, str)
                    )
                    .forEach(i -> write(writer, i));
        } catch (IOException | UncheckedIOException e) {
            e.printStackTrace();
        }
    }

    private static void write(BufferedWriter writer, String line) {
        try {
            writer.write(line);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
