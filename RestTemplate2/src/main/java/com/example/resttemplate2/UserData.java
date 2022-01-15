package com.example.resttemplate2;

import com.example.resttemplate2.pojo.UserInfo;

import java.util.Arrays;
import java.util.List;

public class UserData {
    public static List<UserInfo> list = Arrays.asList(
            new UserInfo(1,"6667282", "Fort worth"),
            new UserInfo(2,"23122323", "Irving Texas"),
            new UserInfo(3,"239493", "Bedford,Texas")
    );


}
