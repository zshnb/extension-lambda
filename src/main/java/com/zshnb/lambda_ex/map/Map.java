package com.zshnb.lambda_ex.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * short useful methods for Java 8 some lambda api
 * */
public class Map {
    public static <T, R> Stream<R> map(List<T> list, Function<? super T, ? extends R> mapper) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(mapper.apply(t));
        }
        return result.stream();
    }


    public static <T, R> Stream<R> mapNotNull(List<T> list, Function<? super T, ? extends R> mapper) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            if (t != null) {
                result.add(mapper.apply(t));
            }
        }
        return result.stream();
    }


    public static <T, R> Stream<R> mapIndex(List<T> list, BiFunction<Integer, ? super T, ? extends R> withIndexMapper) {
        List<R> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(withIndexMapper.apply(i, list.get(i)));
        }
        return result.stream();
    }

    public static <K, V, R> java.util.Map<R, V> mapKey(java.util.Map<K, V> map, Function<Entry<K, V>, ? extends R> keySelector) {
        java.util.Map<R, V> resultMap = new HashMap<>();
        for (Entry<K, V> kvEntry : map.entrySet()) {
            R key = keySelector.apply(kvEntry);
            resultMap.put(key, kvEntry.getValue());
        }
        return resultMap;
    }

    public static <K, V, R> java.util.Map<K, R> mapValue(java.util.Map<K, V> map, Function<Entry<K, V>, ? extends R> valueTransform) {
        java.util.Map<K, R> resultMap = new HashMap<>();
        for (Entry<K, V> kvEntry : map.entrySet()) {
            R value = valueTransform.apply(kvEntry);
            resultMap.put(kvEntry.getKey(), value);
        }
        return resultMap;
    }
}