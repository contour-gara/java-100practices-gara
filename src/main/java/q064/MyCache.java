package q064;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * キーを値にマッピングするオブジェクトです。
 */
public class MyCache {
    private final LoadingCache<String, Object> cache;

    /**
     * MyCache オブジェクトを割り当て、初期化します。
     */
    public MyCache() {
        cache = CacheBuilder.newBuilder().build(CacheLoader.from(Object::new));
    }

    /**
     * Cache に対して指定された文字列で検索し、オブジェクトを返します。
     *
     * @param key 指定された文字列
     * @return 検索し返ったオブジェクト
     */
    public Object doSomething(String key) {
        return cache.getUnchecked(key);
    }
}
