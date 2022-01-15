package com.hmp.demoresttemplateproject.service;

import com.hmp.demoresttemplateproject.pojo.User;
import com.hmp.demoresttemplateproject.pojo.UserResponse;
import com.hmp.demoresttemplateproject.repo.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.hmp.demoresttemplateproject.repo.UserRepo.getAllUsersList;

@Service
public class UserService implements UserRepository {
    @Override
    public User findByUserName(String userName) {
        User user = getAllUsersList().stream().filter((l) -> l.getUserName().equals(userName)
        ).findAny().orElse(null);
        return user;

    }
    @Override
    public UserResponse findByUserUserId(int userId) {
         UserResponse userResponse = null;
        User user = getAllUsersList().stream().filter((l) -> l.getUserId()==userId

        ).findAny().orElse(null);
        if (user!=null){
            userResponse = new UserResponse(user, "User Found", HttpStatus.OK.name());
            return userResponse;
        }
        else {
            return new UserResponse(null, "UserNotFound for that Id: "+userId,HttpStatus.NOT_FOUND.name() );
        }
    }

    @Override
    public String addUser(User user) {
        getAllUsersList().add(user);
        return "+(1) Entry added: "+user.toString();
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User removeUser(User user) {
        return null;
    }

    @Override
    public List<User> listAllUsers() {
        return null;
    }

}
