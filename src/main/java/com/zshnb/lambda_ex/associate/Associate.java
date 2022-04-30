package com.zshnb.lambda_ex.associate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Associate {
    /**
     * a list will be transformed to a map. key is mapper function apply in item's result, value is item
     *
     * */
    public static <K, V> Map<K, V> associateBy(List<V> list, Function<? super V, ? extends K> mapper) {
        Map<K, V> map = new HashMap<>();
        for (V v : list) {
            map.put(mapper.apply(v), v);
        }
        return map;
    }

    /**
     * a list will be transformed to a map. value is mapper function apply in item's result, key is item
     * */
    public static <K, V> Map<K, V> associateWith(List<K> list, Function<? super K, ? extends V> mapper) {
        Map<K, V> map = new HashMap<>();
        for (K k : list) {
            map.put(k, mapper.apply(k));
        }
        return map;
    }
}