package com.program_idea.lambda.associate;

import static com.program_idea.lambda.associate.Associate.associateBy;
import static com.program_idea.lambda.associate.Associate.associateWith;

import com.program_idea.lambda.BaseTest;
import com.program_idea.lambda.Pair;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssociateTest extends BaseTest {

    @Test
    public void associateBySuccessful() {
        Map<String, Pair<Integer, String>> map = associateBy(pairs, Pair::getRight);
        Assertions.assertEquals(1, map.get("1").getLeft());
    }

    @Test
    public void associateWithSuccessful() {
        Map<Pair<Integer, String>, Integer> map = associateWith(pairs, Pair::getLeft);
        Assertions.assertEquals(1, map.get(Pair.pair(1, "1")));
    }
}
