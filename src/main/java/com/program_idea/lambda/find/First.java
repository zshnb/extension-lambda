package com.program_idea.lambda.find;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class First {
    public static <T> T first(List<T> list, Predicate<T> predicate) {
        boolean find = false;
        T result = null;
        for (T t : list) {
            if (predicate.test(t)) {
                find = true;
                result = t;
                break;
            }
        }

        if (!find) {
            throw new NoSuchElementException();
        }
        return result;
    }
}
