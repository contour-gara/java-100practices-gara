package q044;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 解答。
 */
public class MyAnswer044 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        List<MyDate> myDates = new ArrayList<>();
        myDates.add(new MyDate(LocalDateTime.now()));
        myDates.add(new MyDate(LocalDateTime.of(1998, 9, 13, 10, 10)));
        myDates.add(new MyDate(LocalDateTime.of(2050, 9, 13, 10, 10)));
        myDates.add(new MyDate(LocalDateTime.of(2000, 9, 13, 10, 10)));

        System.out.println(myDates);

        Collections.sort(myDates);

        System.out.println(myDates);
    }
}
