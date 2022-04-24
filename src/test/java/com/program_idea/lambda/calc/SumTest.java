package com.program_idea.lambda.calc;

import com.program_idea.lambda.BaseTest;
import com.program_idea.lambda.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest extends BaseTest {
    @Test
    public void sumOfSuccessful() {
        int result = Sum.sumOf(pairs, Pair::getLeft);
        Assertions.assertEquals(6, result);
    }
}
