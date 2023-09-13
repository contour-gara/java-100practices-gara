package q043;

import java.time.format.DateTimeFormatter;

/**
 * 解答。
 */
public class MyAnswer043 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        DataClone date1 = new DataClone();
        System.out.println(format(date1));
        sleep(3000);
        DataClone date2 = date1.clone();
        System.out.println(format(date2));
    }

    /**
     * 表示のためのメソッド。
     *
     * @param date DateCloneオブジェクト
     * @return
     */
    public static String format(DataClone date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd E hh:mm:ss");
        return date.getDate().format(formatter);
    }

    /**
     * スリープのためのメソッド。
     *
     * @param sleeptime スリープするマイクロ秒数
     */
    public static void sleep(long sleeptime) {
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
