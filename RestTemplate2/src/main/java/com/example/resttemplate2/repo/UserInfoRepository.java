package com.example.resttemplate2.repo;

import com.example.resttemplate2.pojo.UserInfo;
import com.example.resttemplate2.response.UserInfoResponse;

public interface UserInfoRepository {
    public UserInfo getUserInfoByPhone(String phone);
    public UserInfoResponse getFromRest(int userName);



    }
