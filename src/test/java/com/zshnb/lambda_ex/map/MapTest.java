package com.zshnb.lambda_ex.map;

import static com.zshnb.lambda_ex.map.Map.map;
import static com.zshnb.lambda_ex.map.Map.mapIndex;
import static com.zshnb.lambda_ex.map.Map.mapNotNull;

import com.zshnb.lambda_ex.BaseTest;
import com.zshnb.lambda_ex.Pair;
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

    @Test
    public void mapKeySuccessful() {
        java.util.Map<Integer, Integer> map = java.util.Map.of(1, 1, 2, 2, 3, 3);
        java.util.Map<String, Integer> anotherMap = Map.mapKey(map, entry -> entry.getKey().toString());
        Assertions.assertTrue(anotherMap.containsKey("1"));
        Assertions.assertEquals(1, anotherMap.get("1"));
    }

    @Test
    public void mapValueSuccessful() {
        java.util.Map<Integer, Integer> map = java.util.Map.of(1, 1, 2, 2, 3, 3);
        java.util.Map<Integer, String> anotherMap = Map.mapValue(map, entry -> entry.getKey().toString());
        Assertions.assertEquals("1", anotherMap.get(1));
    }
}
