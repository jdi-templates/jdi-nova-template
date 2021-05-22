package com.jdiai.test.data;

import com.jdiai.entities.User;

public class TestData {
    // TODO: REMOVE Place Test Data here
    public static User Admin = new User().set(u -> {
        u.name = "Roman";
        u.password = "Jdi1234";
    });
}
