package q044;

import java.time.LocalDateTime;

/**
 * LocalDateTime型のインスタンス変数を持つクラス。
 *
 * @param date 日時
 */
public record MyDate(LocalDateTime date) implements Comparable<MyDate> {
    @Override
    public int compareTo(MyDate myDate) {
        if (date.isAfter(myDate.date())) return 1;
        if (date.isEqual(myDate.date())) return 0;
        if (date.isBefore(myDate.date())) return -1;
        return 0;
    }
}
