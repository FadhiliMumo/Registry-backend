package com.example.register.model;

import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class User{
    @Id
    private String phone;

    private String name;
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
