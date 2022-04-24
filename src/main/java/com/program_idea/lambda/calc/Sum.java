package com.program_idea.lambda.calc;

import java.util.List;
import java.util.function.Function;

public class Sum {
    public static <T> int sumOf(List<T> list, Function<? super T, Integer> mapper) {
        int result = 0;
        for (T t : list) {
            int r = mapper.apply(t);
            result += r;
        }
        return result;
    }

    public static <T> long sumOfLong(List<T> list, Function<? super T, Long> mapper) {
        long result = 0;
        for (T t : list) {
            long r = mapper.apply(t);
            result += r;
        }
        return result;
    }
}
