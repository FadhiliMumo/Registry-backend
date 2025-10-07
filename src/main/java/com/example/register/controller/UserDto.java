package com.example.register.controller;

import org.springframework.data.annotation.Id;

public class UserDto{
    private String name;
    @Id
    private String phoneNumber;
    private String date;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

