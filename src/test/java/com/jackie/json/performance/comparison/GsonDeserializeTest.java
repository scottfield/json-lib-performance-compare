package com.jackie.json.performance.comparison;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jackie.json.performance.DeserializeTestBase;
import com.jackie.json.performance.SerializeTestBase;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackie on 8/10/2017.
 */
public class GsonDeserializeTest extends DeserializeTestBase {
    @Test
    public void deserialize() throws Exception {
        Type listType = new TypeToken<ArrayList<Person>>() {
        }.getType();
        Gson gson = new Gson();
        long start = System.currentTimeMillis();
        gson.fromJson(input, listType);
        System.out.println("gson deserialize take :"+(System.currentTimeMillis()-start));
    }
}