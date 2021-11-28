package com.example.birdbsadmin;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {
    @GET("/api/menu")
    Call<GetDataMenu> getKontak();

    @GET("/api/kategori")
    Call<GetTransaksi> getTransaksi();
}
