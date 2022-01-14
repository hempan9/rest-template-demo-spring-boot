package com.hmp.demoresttemplateproject.repo;

import com.hmp.demoresttemplateproject.pojo.User;
import com.hmp.demoresttemplateproject.pojo.UserResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {
    public User findByUserName(String userName);
    public String addUser(User user);
    public User updateUser(User user);
    public User removeUser(User user);
    public List<User> listAllUsers();
    public UserResponse findByUserUserId(int userId);
}
