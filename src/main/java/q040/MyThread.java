package q040;

/**
 * 非チェック例外を投げるスレッド。
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
