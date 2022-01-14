package com.hmp.demoresttemplateproject.controller;

import com.hmp.demoresttemplateproject.pojo.User;
import com.hmp.demoresttemplateproject.pojo.UserResponse;
import com.hmp.demoresttemplateproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user", method = RequestMethod.GET)
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "getByName", method = RequestMethod.GET)
    public ResponseEntity<User> getUserByUserName(@RequestParam(name = "userName") String userName) {
        return new ResponseEntity<>(userService.findByUserName(userName), HttpStatus.OK);
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    public void createNewUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "getByUserId", method = RequestMethod.GET)
    public ResponseEntity<UserResponse> getUserByUserId(@RequestParam(name = "userId") int userId) {
        return new ResponseEntity<>(userService.findByUserUserId(userId), HttpStatus.OK);
    }
}
