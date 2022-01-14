package com.example.resttemplate2.service;

import com.example.resttemplate2.UserData;
import com.example.resttemplate2.pojo.UserInfo;
import com.example.resttemplate2.repo.UserInfoRepository;
import com.example.resttemplate2.response.UserInfoResponse;
import com.example.resttemplate2.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class UserInfoService implements UserInfoRepository {
    @Autowired
    private  RestTemplate restTemplate;

    @Override
    public UserInfo getUserInfoByPhone(String phone) {

        return UserData.list.stream().filter(
                (l) -> l.getPhone().equals(phone)
        ).findAny().orElse(null);
    }
    public UserInfoResponse getFromRest(int userId){
        String getMethodUrl = "http://localhost:8080/user/getByUserId?userId=";
       UserResponse userResponse= restTemplate.getForObject(getMethodUrl+userId, UserResponse.class);

       UserInfo userInfo=  UserData.list.stream().filter(
                (l)->l.getUserId()==userId
        ).findAny().orElse(
                new UserInfo()
       );
       if (userInfo!=null){
        UserInfoResponse userInfoResponse = new UserInfoResponse(userResponse, userInfo);
        return  userInfoResponse;
       }
       else{
           return new UserInfoResponse();
       }
    }
}
