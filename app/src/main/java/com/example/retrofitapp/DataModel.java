package com.example.retrofitapp;

import com.google.gson.annotations.SerializedName;

public class DataModel {
    //The class will be as a template for the data that we are going to pass

    private int userId;
    private  int id;
    private String title;


    @SerializedName("completed")
    private boolean status;

}
