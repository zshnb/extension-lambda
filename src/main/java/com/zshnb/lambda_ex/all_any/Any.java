package com.zshnb.lambda_ex.all_any;

import java.util.List;
import java.util.function.Predicate;

public class Any {

    public static <T> boolean any(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (predicate.test(t)) {
                return true;
            }
        }
        return false;
    }
}