package q041;

/**
 * 解答。
 */
public class MyAnswer041 {
    public static final Object lock = new Object();

    /**
     * メインメソッド。
     *
     * @param arguments コマンドライン引数
     */
    public static void main(String[] arguments) {
        Thread threadA = new SumThread();
        Thread threadB = new ShowThread();

        GlobalNum.clearCalculation();

        threadB.start();
        threadA.start();
    }
}
