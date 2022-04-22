package com.program_idea.lambda.reduce;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Reduce {
    public static <T> T reduce(List<T> list, T initValue, BinaryOperator<T> reducer) {
        T init = initValue;
        for (T t : list) {
            init = reducer.apply(init, t);
        }
        return init;
    }

    public static <T, R> R reduce(List<T> list, R initValue, BiFunction<R, T, R> reducer) {
        R init = initValue;
        for (T t : list) {
            init = reducer.apply(init, t);
        }
        return init;
    }
}
