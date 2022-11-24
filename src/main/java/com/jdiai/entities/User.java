package com.jdiai.entities;

import com.jdiai.tools.DataClass;
import com.jdiai.annotations.UI;

// TODO: REMOVE Use your business entities here
public class User extends DataClass<User> {
    @UI("#name") public String name;
    @UI("#password") public String password;

}
