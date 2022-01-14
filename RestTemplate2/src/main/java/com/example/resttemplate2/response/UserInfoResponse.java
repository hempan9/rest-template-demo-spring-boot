package com.example.resttemplate2.response;

import com.example.resttemplate2.pojo.UserInfo;
import com.example.resttemplate2.pojo.UserResponse;

public class UserInfoResponse {
    private UserInfo userInfo;
    private UserResponse userResponse;
    public UserInfoResponse() {
    }

    @Override
    public String toString() {
        return "UserInfoResponse{" +
                "userInfo=" + userInfo +
                ", userResponse=" + userResponse +
                '}';
    }

    public UserInfoResponse(UserResponse userResponse, UserInfo userInfo) {
        this.userInfo = userInfo;
        this.userResponse=userResponse;
    }

    public UserResponse getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(UserResponse userResponse) {
        this.userResponse = userResponse;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

}
