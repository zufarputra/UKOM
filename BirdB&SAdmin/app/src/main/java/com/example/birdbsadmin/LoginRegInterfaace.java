package com.example.birdbsadmin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginRegInterfaace {
    @POST("/api/login")
    Call<GetLogin> loginReg(@Body Login login);

    @POST("api/register")
    Call<GetRegistrasi> register(@Body RegistrasiModel registerModel);
}
