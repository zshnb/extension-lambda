package com.program_idea.lambda.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Map {
    public static <T, R> List<R> map(List<T> list, Function<? super T, ? extends R> mapper) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(mapper.apply(t));
        }
        return result;
    }


    public static <T, R> List<R> mapNotNull(List<T> list, Function<? super T, ? extends R> mapper) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            if (t != null) {
                result.add(mapper.apply(t));
            }
        }
        return result;
    }


    public static <T, R> List<R> mapIndex(List<T> list, BiFunction<Integer, ? super T, ? extends R> withIndexMapper) {
        List<R> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(withIndexMapper.apply(i, list.get(i)));
        }
        return result;
    }
}
