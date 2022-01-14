package com.example.resttemplate2.pojo;

public class UserInfo {
    private String phone;
    private String address;
public UserInfo(){}
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserInfo( int userId,String phone, String address) {
        this.phone = phone;
        this.address = address;
        this.userId = userId;
    }

    private int userId;

    public UserInfo(String phone, String address) {
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
