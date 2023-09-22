package q059;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;

import static java.net.http.HttpResponse.BodyHandlers;

/**
 * 解答。
 */
public class MyAnswer059 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        String url = "https://docs.oracle.com/javase/jp/11/docs/api/java.net.http/java/net/http/HttpClient.html";
        String headerFileName = "header059.json";
        String bodyFileName = "body059.txt";

        HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            System.out.println(response.statusCode());

            Map<String, List<String>> headers = response.headers().map();
            System.out.println(headers);

            Files.writeString(
                    Path.of("./src/main/resources/" + headerFileName),
                    new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(headers),
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );

            Files.writeString(
                    Path.of("./src/main/resources/" + bodyFileName),
                    response.body(),
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
