package com.program_idea.lambda;

import java.util.List;
import org.junit.jupiter.api.BeforeAll;

abstract public class BaseTest {
    public static List<Pair<Integer, String>> pairs;

    @BeforeAll
    static void setup() {
        pairs = List.of(Pair.pair(1, "1"), Pair.pair(2, "2"), Pair.pair(3, "3"));
    }
}
