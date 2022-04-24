package com.zshnb.lambda_ex.associate;

import static com.zshnb.lambda_ex.associate.Associate.associateBy;
import static com.zshnb.lambda_ex.associate.Associate.associateWith;

import com.zshnb.lambda_ex.BaseTest;
import com.zshnb.lambda_ex.Pair;
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
