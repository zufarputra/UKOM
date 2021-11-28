package com.example.birdbsadmin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetRegistrasi {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("pesan")
    @Expose
    private String pesan;
    @SerializedName("data")
    @Expose
    private RegistrasiModel data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public RegistrasiModel getData() {
        return data;
    }

    public void setData(RegistrasiModel data) {
        this.data = data;
    }
}
