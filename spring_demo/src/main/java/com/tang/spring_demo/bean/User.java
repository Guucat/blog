package com.tang.spring_demo.bean;

/**
 * @author shengyi
 * @create 2021/8/22 - 21:30
 */
public class User {
    private int userId;

    public User() {};

    public User(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
