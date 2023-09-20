package q056;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 出力を別スレッドで処理するクラス。
 */
public class InputStreamThread extends Thread {
    private final BufferedReader reader;
    private final List<String> list = new ArrayList<>();

    /**
     * コンストラクタ。
     *
     * @param inputStream 入力ストリーム
     */
    public InputStreamThread(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    @Override
    public void run() {
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //        try {
//            for (; ; ) {
//                String line = reader.readLine();
//                if (line == null) break;
//                list.add(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }

    /**
     * 文字列取得。
     */
    public List<String> getList() {
        return list;
    }
}
