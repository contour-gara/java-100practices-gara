package q064;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import static java.util.Objects.nonNull;

/**
 *
 */
public class MyCache {
    //    private final Cache<String, Object> cache;
    private final LoadingCache<String, Object> cache;

    /**
     *
     */
    public MyCache() {
//        cache = CacheBuilder.newBuilder().build();
        cache = CacheBuilder.newBuilder().build(CacheLoader.from(() -> new Object()));
    }

    /**
     * @param key
     * @return
     */
    public Object doSomething(String key) {
//        Object result = cache.getIfPresent(key);
        Object result = cache.getUnchecked(key);

//        if (nonNull(result)) return result;
//
//        result = new Object();
//        cache.put(key, result);

        return result;
    }
}
