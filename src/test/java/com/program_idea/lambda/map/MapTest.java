package com.program_idea.lambda.map;

import static com.program_idea.lambda.map.Map.map;
import static com.program_idea.lambda.map.Map.mapIndex;
import static com.program_idea.lambda.map.Map.mapNotNull;

import com.program_idea.lambda.BaseTest;
import com.program_idea.lambda.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapTest extends BaseTest {
    @Test
    public void mapSuccessful() {
        List<Integer> integers = map(pairs, Pair::getLeft).collect(Collectors.toList());
        Assertions.assertEquals(3, integers.size());
        Assertions.assertEquals(1, integers.get(0));
    }

    @Test
    public void mapNotNullSuccessful() {
        pairs = new ArrayList<>(Arrays.asList(Pair.pair(1, "1"), null, Pair.pair(3, "3")));
        List<Integer> integers = mapNotNull(pairs, Pair::getLeft).collect(Collectors.toList());
        Assertions.assertEquals(2, integers.size());
        Assertions.assertEquals(1, integers.get(0));
    }

    @Test
    public void mapIndexSuccessful() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        List<Integer> integers = mapIndex(pairs, (index, pair) -> {
            Assertions.assertEquals(index, atomicInteger.getAndIncrement());
            return pair.getLeft();
        }).collect(Collectors.toList());
        Assertions.assertEquals(3, integers.size());
        Assertions.assertEquals(1, integers.get(0));
    }
}
