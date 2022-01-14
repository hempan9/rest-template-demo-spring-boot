package com.example.resttemplate2.controller;

import com.example.resttemplate2.response.UserInfoResponse;
import com.example.resttemplate2.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping(value = "/getFromRestById")
    public UserInfoResponse getFromRest(@RequestParam int userId) {
        return userInfoService.getFromRest(userId);

    }

}
