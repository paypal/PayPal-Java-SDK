package com.paypal.core.cache;

public interface Cache<T> {

    T get(String key);

    void put(String key, T value);

    boolean contains(String key);
}
