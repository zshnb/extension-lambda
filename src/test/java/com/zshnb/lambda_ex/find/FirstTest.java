package com.zshnb.lambda_ex.find;

import com.zshnb.lambda_ex.BaseTest;
import com.zshnb.lambda_ex.Pair;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest extends BaseTest {
    @Test
    public void successful() {
        Pair<Integer, String> pair = First.first(pairs, p -> p.getLeft() == 1);
        Assertions.assertEquals(Pair.pair(1, "1"), pair);
    }

    @Test
    public void successfulWhenNotFound() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            First.first(pairs, p -> p.getLeft() == 11);
        });
    }
}
