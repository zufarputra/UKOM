package com.example.birdbsadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    TextView tvDaftar;
    EditText tvUser, tvPass, username, paassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.edtUsernameLogin);
        paassword = findViewById(R.id.edtPasswordLogin);


    }

    public void btnlogin(View view) {
//        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//        startActivity(intent);
        if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(paassword.getText().toString())) {
            String pesan = "All";
            Toast.makeText(LoginActivity.this, pesan, Toast.LENGTH_SHORT).show();
        } else {
            Login login = new Login();
            login.setEmail(username.getText().toString());
            login.setPassword(paassword.getText().toString());
//                    login.setAlamat(paassword.getText().toString());


            LoginUser(login);


        }
//                HomeUtama();
    }

    public void LoginUser(Login login) {
        Call<GetLogin> loginCall = ApiClientLogin.loginRegInterfaace().loginReg(login);
        loginCall.enqueue(new Callback<GetLogin>() {
            @Override
            public void onResponse(Call<GetLogin> call, Response<GetLogin> response) {
                if (response.isSuccessful()) {
                    Login getLogin = response.body().getData();
                    Toast.makeText(LoginActivity.this, "berhasil", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();


                } else {
                    String pesan1 = "gagal";
                    Toast.makeText(LoginActivity.this, pesan1, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetLogin> call, Throwable t) {
                String pesan = "Login Gagal";
                Toast.makeText(LoginActivity.this, pesan, Toast.LENGTH_SHORT).show();

            }
        });
    }


    public void btnregister(View view) {
        TextView tvDaftar = findViewById(R.id.tvSignUp);

        tvDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }

    public void btnforget(View view) {
        TextView tvDaftar = findViewById(R.id.tvForget);

        tvDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ForgetActivity1.class));
            }
        });
    }
}