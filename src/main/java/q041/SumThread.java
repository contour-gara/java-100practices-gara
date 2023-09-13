package q041;

import java.util.stream.IntStream;

/**
 * グローバル変数を加算するクラス。
 */
public class SumThread extends Thread {
    private static final int LOOP_NUM = 10000;

    /**
     * グローバル変数に加算する。
     */
    @Override
    public void run() {
        // Answer041.lockのロックを取得
        synchronized (MyAnswer041.lock) {
            System.out.println("sum loop start");
            IntStream.rangeClosed(1, LOOP_NUM).forEach(GlobalNum::addNum);
            System.out.println("sum loop end");
            // 値への加算処理が完了したことを設定する
            GlobalNum.doneCalculation();
            // ロックオブジェクトに対してwait()している他のスレッド1つを再開する
            MyAnswer041.lock.notify();
        }
    }
}
