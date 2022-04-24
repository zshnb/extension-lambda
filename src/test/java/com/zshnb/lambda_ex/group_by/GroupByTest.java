package com.zshnb.lambda_ex.group_by;

import com.zshnb.lambda_ex.BaseTest;
import com.zshnb.lambda_ex.Pair;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupByTest extends BaseTest {
    @Test
    public void groupBySuccessful() {
        pairs = List.of(Pair.pair(1, "1"), Pair.pair(2, "2"),
            Pair.pair(3, "3"), Pair.pair(1, "4"));
        Map<Integer, List<Pair<Integer, String>>> map = GroupBy.groupBy(pairs, Pair::getLeft);
        Assertions.assertEquals(3, map.size());
        Assertions.assertEquals(2, map.get(1).size());
        Assertions.assertEquals(Pair.pair(1, "1"), map.get(1).get(0));
    }

    @Test
    public void groupByWithValueTransformerSuccessful() {
        pairs = List.of(Pair.pair(1, "1"), Pair.pair(2, "2"),
            Pair.pair(3, "3"), Pair.pair(1, "4"));
        Map<Integer, List<String>> map = GroupBy.groupBy(pairs, Pair::getLeft, Pair::getRight);
        Assertions.assertEquals(3, map.size());
        Assertions.assertEquals(2, map.get(1).size());
        Assertions.assertEquals("1", map.get(1).get(0));
    }
}
