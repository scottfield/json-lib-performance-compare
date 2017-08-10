package com.jackie.json.performance.comparison;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackie.json.performance.SerializeTestBase;
import org.junit.Test;

import java.util.List;

/**
 * Created by jackie on 8/10/2017.
 */
public class JacksonSerializeTest extends SerializeTestBase {

    @Test
    public void serialize() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        long start = System.currentTimeMillis();
        mapper.writeValueAsString(personList);
        System.out.println("jackson serialize take :"+(System.currentTimeMillis()-start));
    }
}