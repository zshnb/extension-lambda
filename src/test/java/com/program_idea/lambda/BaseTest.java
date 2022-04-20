package com.program_idea.lambda;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {
    public List<Pair<Integer, String>> pairs;

    @BeforeEach
    void setup() {
        pairs = List.of(Pair.pair(1, "1"), Pair.pair(2, "2"), Pair.pair(3, "3"));
    }
}
