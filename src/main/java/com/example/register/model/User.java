package com.example.register.model;

import org.springframework.data.annotation.Id;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Users")
public class User{
    private String name;
    @Id
    private Long phoneNumber;
    private String date;

   public User(){}
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
