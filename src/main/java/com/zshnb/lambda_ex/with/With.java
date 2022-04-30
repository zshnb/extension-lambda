package com.zshnb.lambda_ex.with;

import java.util.function.UnaryOperator;

public class With {
    public static <T> T with(T t, UnaryOperator<T> operator) {
        return operator.apply(t);
    }
}