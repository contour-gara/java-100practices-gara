package q062;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyMap<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_ENTRY = 100;

    public MyMap() {
        super(MAX_ENTRY, 1f, true);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_ENTRY;
    }
}
