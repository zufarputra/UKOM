package com.example.birdbsadmin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetLogin {
    @SerializedName("pesan")
    @Expose
    private String pesan;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("data")
    @Expose
    private Login data;

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Login getData() {
        return data;
    }

    public void setData(Login data) {
        this.data = data;
    }
}
