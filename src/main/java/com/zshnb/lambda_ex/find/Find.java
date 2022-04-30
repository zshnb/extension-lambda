package com.zshnb.lambda_ex.find;

import java.util.List;
import java.util.function.Predicate;

public class Find {
    public static <T> T find(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (predicate.test(t)) {
                return t;
            }
        }
        return null;
    }
}