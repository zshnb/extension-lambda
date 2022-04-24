package com.program_idea.lambda.calc;

import com.program_idea.lambda.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountTest extends BaseTest {
    @Test
    public void successful() {
        int result = Count.count(pairs, p -> p.getLeft() % 2 != 0);
        Assertions.assertEquals(2, result);
    }
}
