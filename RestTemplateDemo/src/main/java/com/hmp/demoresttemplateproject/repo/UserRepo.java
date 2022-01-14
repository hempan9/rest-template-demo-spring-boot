package com.hmp.demoresttemplateproject.repo;

import com.hmp.demoresttemplateproject.pojo.User;


import java.util.Arrays;
import java.util.List;
public class UserRepo {

    public  static  List<User> getAllUsersList() {
        List<User> userList = Arrays.asList(
                new User(1, "Ram", 21),
                new User(2, "Sam", 24),
                new User(3, "John", 21)
        );
        return userList;
    }

}
