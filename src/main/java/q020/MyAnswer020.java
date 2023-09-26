package q020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 解答。
 */
public class MyAnswer020 {
    private static final String[] MEDALS = new String[]{
            "GOLD", "SILVER", "BRONZE"
    };

    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        List<String> geneList = new ArrayList<>();
        List nonGeneList = new ArrayList();

        Arrays.stream(MEDALS).forEach(e -> geneList.add(e));
        Arrays.stream(MEDALS).forEach(e -> nonGeneList.add(e));

        geneList.forEach(System.out::println);
        nonGeneList.forEach(System.out::println);
    }
}
