package com.program_idea.lambda.reduce;

import com.program_idea.lambda.BaseTest;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReduceTest extends BaseTest {
    @Test
    public void successful() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        int result = Reduce.reduce(integers, 0, Integer::sum);
        Assertions.assertEquals(15, result);
    }
}
