package com.anand.withu.Models;

public class CreateUser {
    public CreateUser(){

    }

    public CreateUser(String name, String email, String password, String code, String isSharing, String lat, String lng, String userid, String date, String device_token) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.code = code;
        this.isSharing = isSharing;
        this.lat = lat;
        this.lng = lng;
        this.userid  = userid;
        this.date = date;
        this.device_token = device_token;

    }

    public String name, email, password, isSharing, code, lat, lng, userid, date, device_token;

}
