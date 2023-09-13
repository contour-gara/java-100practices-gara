package q041;

/**
 * 加算処理が終わったあとに値を出力するクラス。
 */
public class ShowThread extends Thread {
    /**
     * グローバル変数の値を出力する。
     */
    @Override
    public void run() {
        synchronized (MyAnswer041.lock) {
            try {
                if (!GlobalNum.isCalculated()) {
                    System.out.println("wait start");
                    MyAnswer041.lock.wait();
                    System.out.println("wait end");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(GlobalNum.getNum());
        }
    }
}
