package com.program_idea.lambda.all_any;

import com.program_idea.lambda.reduce.Reduce;
import java.util.List;
import java.util.function.Predicate;

public class All {
    public static <T> boolean all(List<T> list, Predicate<T> predicate) {
         return Reduce.reduce(list, true, (acc, item) -> acc && predicate.test(item));
    }
}
