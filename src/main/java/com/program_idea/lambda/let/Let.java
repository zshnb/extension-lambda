package com.program_idea.lambda.let;

import java.util.function.Function;

public class Let {
    public static <T, R> R let(T t, Function<? super T, ? extends R> mapper) {
        return mapper.apply(t);
    }
}
