package com.zshnb.lambda_ex.calc;

import com.zshnb.lambda_ex.BaseTest;
import com.zshnb.lambda_ex.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest extends BaseTest {
    @Test
    public void sumOfSuccessful() {
        int result = Sum.sumOf(pairs, Pair::getLeft);
        Assertions.assertEquals(6, result);
    }
}
