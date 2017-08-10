package com.jackie.json.performance.comparison;

import com.google.gson.Gson;
import com.jackie.json.performance.SerializeTestBase;
import org.junit.Test;

import java.util.List;

/**
 * Created by jackie on 8/10/2017.
 */
public class GsonSerializeTest extends SerializeTestBase {
    @Test
    public void serialize() throws Exception {
        Gson gson = new Gson();
        long start = System.currentTimeMillis();
        gson.toJson(personList);
        System.out.println("gson serialize take :"+(System.currentTimeMillis()-start));
    }
}