package com.khafiz.apiiii.Model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("ID")
    private String id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Email")
    private String email;

    public User (String id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void SetID(String id){
        this.id = id;

    }
    public void SetName (String name){
        this.name = name;

    }
    public void SetEmail(String email){
        this.email = email;

    }

    public String GetID(){
        return id;
    }
    public String GetName(){
        return name;
    }
    public String GetEmail(){
        return email;
    }

}
