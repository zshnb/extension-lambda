package com.zshnb.lambda_ex.all_any;

import com.zshnb.lambda_ex.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllTest extends BaseTest {
    @Test
    public void successfulWhenTrue() {
        boolean result = All.all(pairs, p -> p.getLeft() > 0);
        Assertions.assertTrue(result);
    }

    @Test
    public void successfulWhenFalse() {
        boolean result = All.all(pairs, p -> p.getLeft() % 2 == 0);
        Assertions.assertFalse(result);
    }
}
