package com.program_idea.lambda.find;

import com.program_idea.lambda.BaseTest;
import com.program_idea.lambda.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTest extends BaseTest {
    @Test
    public void successful() {
        Pair<Integer, String> pair = Find.find(pairs, p -> p.getLeft() == 1);
        Assertions.assertEquals(Pair.pair(1, "1"), pair);
    }

    @Test
    public void successfulWhenNotFound() {
        Pair<Integer, String> pair = Find.find(pairs, p -> p.getLeft() == 11);
        Assertions.assertNull(pair);
    }
}
