package q040;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.err.println(DateTimeFormatter
                .ofPattern("yyyy/MM/dd E HH:mm:ss")
                .format(LocalDateTime.now()));
        System.err.println(t);
        e.printStackTrace();
    }
}
