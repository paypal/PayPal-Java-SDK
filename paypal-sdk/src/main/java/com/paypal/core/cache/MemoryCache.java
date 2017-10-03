package com.paypal.core.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryCache<T> implements Cache<T> {

    private Map<String, T> store = new ConcurrentHashMap<>();

    @Override
    public T get(String key) {
        return store.get(key);
    }

    @Override
    public void put(String key, T value) {
        store.put(key, value);
    }

    @Override
    public boolean contains(String key) {
        return store.containsKey(key);
    }
}
