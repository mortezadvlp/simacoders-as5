package com.simacoders.morteza.retrofit1.DataModels;

import com.google.gson.annotations.SerializedName;

public class ClassPost {
    @SerializedName("userId")
    private String uId;
    @SerializedName("id")
    private String pId;
    @SerializedName("title")
    private String title;
    @SerializedName("body")
    private String body;

    public ClassPost(String uId, String pId, String title, String body) {
        this.uId = uId;
        this.pId = pId;
        this.title = title;
        this.body = body;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
