package q043;

import java.time.LocalDateTime;

/**
 * java.lang.Objectを直接継承し、java.lang.Cloneableインタフェースを実装した
 * インスタンスの生成時刻を示すjava.util.Date型のインスタンス変数を持つクラス。
 */
public class DataClone implements Cloneable {
    private LocalDateTime date;

    public DataClone() {
        this.date = LocalDateTime.now();
    }

    /**
     * クローンメソッド。
     * ディープコピーするために時間をセットしている。
     *
     * @return 新たなDateCloneオブジェクト
     */
    @Override
    public DataClone clone() {
        DataClone result = null;
        try {
            result = (DataClone) super.clone();
            result.setDate(LocalDateTime.now());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
