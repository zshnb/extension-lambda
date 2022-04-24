package com.zshnb.lambda_ex.with;

import com.zshnb.lambda_ex.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WithTest {
    @Test
    public void successful() {
        Pair<Integer, Integer> pair = With.with(Pair.pair(1, 2), innerPair -> {
            innerPair.setLeft(2);
            innerPair.setRight(3);
            return innerPair;
        });
        Assertions.assertEquals(Pair.pair(2, 3), pair);
    }
}
