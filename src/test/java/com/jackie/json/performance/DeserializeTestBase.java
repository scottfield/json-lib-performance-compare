package com.jackie.json.performance;

import org.junit.After;
import org.junit.Before;

/**
 * Created by jackie on 8/10/2017.
 */
public class DeserializeTestBase {
    private final int size = 100_0000;
    protected String input;

    @Before
    public void setup() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append("{\"username\":\"jackie\",\"age\":28,\"married\":true,\"no\":33535343,\"house\":[\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\",\"dakjfdafda\"]}");
            if (i < size - 1) {
                builder.append(",");
            }
        }
        builder.append("]");
        input = builder.toString();

    }

    @After
    public void teardown() {
        input = null;
    }
}
