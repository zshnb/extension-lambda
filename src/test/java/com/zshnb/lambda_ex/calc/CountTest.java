package com.zshnb.lambda_ex.calc;

import com.zshnb.lambda_ex.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountTest extends BaseTest {
    @Test
    public void successful() {
        int result = Count.count(pairs, p -> p.getLeft() % 2 != 0);
        Assertions.assertEquals(2, result);
    }
}
