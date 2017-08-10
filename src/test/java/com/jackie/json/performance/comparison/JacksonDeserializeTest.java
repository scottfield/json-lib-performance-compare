package com.jackie.json.performance.comparison;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jackie.json.performance.DeserializeTestBase;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackie on 8/10/2017.
 */
public class JacksonDeserializeTest extends DeserializeTestBase {
    @Test
    public void deserialize() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        long start = System.currentTimeMillis();
        objectMapper.readValue(input, new TypeReference<List<Person>>() {
        });
        System.out.println("jackson deserialize take :"+(System.currentTimeMillis()-start));
    }
}