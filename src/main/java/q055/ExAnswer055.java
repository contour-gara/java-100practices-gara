package q055;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.IntStream;

public class ExAnswer055 {
    public static void main(String[] args) {
        Path input = Path.of("./src/main/java/q055/MyAnswer055.txt");
        Path output = Path.of("./src/main/java/q055/output.txt");

        try {
            List<String> inputLines = Files.readAllLines(input);

            List<String> outputLines = IntStream
                    .range(0, inputLines.size())
                    .mapToObj(i -> String.format("%s %s", i + 1, inputLines.get(i)))
                    .toList();

            Files.write(
                    output,
                    outputLines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
