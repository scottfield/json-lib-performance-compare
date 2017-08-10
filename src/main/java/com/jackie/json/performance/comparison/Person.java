package com.jackie.json.performance.comparison;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackie on 8/10/2017.
 */
public class Person {
    private String username;
    private int age;
    private boolean married;
    private long no;
    private List<String> house;

    public Person() {
        username = "jackie";
        age = 28;
        married = true;
        no = 33535343L;
        house = new ArrayList<>();
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");
        house.add("dakjfdafda");

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    public List<String> getHouse() {
        return house;
    }

    public void setHouse(List<String> house) {
        this.house = house;
    }
}
