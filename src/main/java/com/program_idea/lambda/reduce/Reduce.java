package com.program_idea.lambda.reduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static <T> T reduce(List<T> list, T initValue, BinaryOperator<T> reducer) {
        T init = initValue;
        for (T t : list) {
            init = reducer.apply(init, t);
        }
        return init;
    }
}
