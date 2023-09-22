package q058;

import java.io.*;

import org.apache.commons.io.input.BOMInputStream;

/**
 * 解答。
 */
public class MyAnswer058 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
//        hasBom("MyAnswer058_BOM.txt");
        hasBom("MyAnswer058.txt");
    }

    private static void hasBom(String fileName) {
        try (
                InputStream input = new FileInputStream("./src/main/resources/" + fileName)
        ) {
            BOMInputStream bomInputStream = BOMInputStream
                    .builder()
                    .setInputStream(input)
                    .setInclude(true)
                    .get();
            if (bomInputStream.hasBOM()) {
                System.exit(1);
            } else {
                System.exit(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
