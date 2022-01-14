package com.example.resttemplate2.response;


import com.example.resttemplate2.pojo.User;

public class UserResponse {
    private User user;

    public UserResponse(User user, String message, String status) {
        this.user = user;
        this.message = message;
        this.status = status;
    }
public UserResponse(){}
    private String message;

    @Override
    public String toString() {
        return "UserResponse{" +
                "user=" + user +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
}

