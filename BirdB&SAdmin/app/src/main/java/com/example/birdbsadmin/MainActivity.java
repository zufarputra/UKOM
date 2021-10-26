package com.example.birdbsadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void itemList(View view) {
        Intent intent = new Intent(MainActivity.this, ItemListActivity.class);
        startActivity(intent);
    }

    public void transaction(View view) {
        Intent intent = new Intent(MainActivity.this, TransactionActivity.class);
        startActivity(intent);
    }
}