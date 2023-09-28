package q063;

import static java.util.Objects.isNull;

/**
 * このクラスは、文字列の比較をするための static utility メソッドで構成されます。
 */
public final class Checker {
    private Checker() {
    }

    /**
     * 比較される文字列が "value1" の場合は 0、"value2" の場合は 1、それ以外の場合は 2 を返します。
     *
     * @param target 比較される文字列
     * @return 比較される文字列が "value1" の場合は 0、"value2" の場合は 1、それ以外の場合は 2
     */
    public static int check(String target) {
        if (isNull(target)) return 2;
        if (target.equals("value1")) return 0;
        if (target.equals("value2")) return 1;
        return 2;
    }

    public static int badCheck(String target) {
        if (target == "value1") return 0;
        if (target == "value2") return 1;
        return 2;
    }
}
