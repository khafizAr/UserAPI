package com.khafiz.apiiii.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUser {
    @SerializedName("Data")
    List<User> data;
    @SerializedName("Total")
    String total;

    public String GetTotal(){
        return total;
    }
    public List<User> GetData(){
        return data;
    }

    public void setData(List<User> data){
        this.data = data;
    }

    public void setTotal(String total){
        this.total = total;
    }

}
