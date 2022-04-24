package com.zshnb.lambda_ex.let;

import com.zshnb.lambda_ex.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetTest {
    @Test
    public void successful() {
        Integer integer = Let.let(Pair.pair(1, 2), Pair::getLeft);
        Assertions.assertEquals(1, integer);
    }
}
