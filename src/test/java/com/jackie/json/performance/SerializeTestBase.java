package com.jackie.json.performance;

import com.jackie.json.performance.comparison.Person;
import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackie on 8/10/2017.
 */
public class SerializeTestBase {
    private final int size = 1;
    protected List<Person> personList = new ArrayList<Person>(size);

    @Before
    public void setup() {
        for (int i = 0; i < size; i++) {
            Person person = new Person();
            personList.add(person);
        }
    }

    @After
    public void teardown() {
        personList.clear();
    }
}
