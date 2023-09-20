package q056;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * コマンドを実行するUtility Class。
 */
public final class CommandExecutor {
    private CommandExecutor() {
    }

    /**
     * 引数に渡されたコマンドを実行します。
     *
     * @param commands 実行するコマンド。スペース区切りでArrayで渡す。
     * @throws IOException 入出力エラーが発生した場合
     */
    public static void executeCommand(String[] commands) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder(commands);
        Process process = processBuilder.start();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream())
        )) {
            reader.lines().forEach(System.out::println);
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getErrorStream())
        )) {
            reader.lines().forEach(System.err::println);
        }

//        InterruptedException
//        InputStreamThread std = new InputStreamThread(process.getInputStream());
//        InputStreamThread err = new InputStreamThread(process.getErrorStream());

//        process.waitFor();
//
//        std.join();
//        err.join();

//        process.exitValue();

//        std.getList().forEach(System.out::println);
//        err.getList().forEach(System.err::println);
    }
}
