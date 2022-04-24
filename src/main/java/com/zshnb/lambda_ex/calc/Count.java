package com.zshnb.lambda_ex.calc;

import java.util.List;
import java.util.function.Predicate;

public class Count {
    public static <T> int count(List<T> list, Predicate<T> predicate) {
        int result = 0;
        for (T t : list) {
            if (predicate.test(t)) {
                result += 1;
            }
        }
        return result;
    }
}
