package com.friend.rxjavaretrofitrecyclerview;

import com.google.gson.annotations.SerializedName;

public class Model {

    @SerializedName("title")
    String title;

    @SerializedName("body")
    String body;

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

}
