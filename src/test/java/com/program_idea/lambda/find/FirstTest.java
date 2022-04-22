package com.program_idea.lambda.find;

import com.program_idea.lambda.BaseTest;
import com.program_idea.lambda.Pair;
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
