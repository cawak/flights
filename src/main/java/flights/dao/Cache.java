package flights.dao;

import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.map.LinkedMap;

public class Cache<T extends EntityWithId> {

    private final OrderedMap<String, T> cacheContainer = new LinkedMap<>();
    private static final int CACHE_SIZE = 2;

    public Cache() {
    }

    public T get(String id){
        return cacheContainer.get(id);
    }

    public void add(T t){
        if (cacheContainer.size() >= CACHE_SIZE){
            cacheContainer.remove(cacheContainer.lastKey());
        }
        cacheContainer.put(t.getId(), t);
    }
}
