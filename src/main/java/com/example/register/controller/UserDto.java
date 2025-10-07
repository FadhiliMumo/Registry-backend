package com.example.register.controller;

import org.springframework.data.annotation.Id;

public class UserDto{
    private String name;
    @Id
    private Long phoneNumber;
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
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

