package q056;

import java.io.IOException;

import static q056.CommandExecutor.*;

/**
 * 解答。
 */
public class MyAnswer056 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        String[] cmd = {"ls", "-"};

        try {
            executeCommand(cmd);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
