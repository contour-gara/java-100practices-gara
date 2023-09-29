package q064;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

public class MyMap {
    Map<String, Object> map;

    public MyMap() {
        this.map = new HashMap<>();
    }

    public Object doSomething(String key) {
        synchronized (map) {
            Object result = map.get(key);

            if (nonNull(result)) return result;

            result = new Object();
            map.put(key, result);

            return result;
        }
    }
}
