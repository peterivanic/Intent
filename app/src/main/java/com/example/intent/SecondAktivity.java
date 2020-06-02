package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondAktivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Toast.makeText(this, "Si v second aktivite", Toast.LENGTH_SHORT).show();

        String meno;
        int vek;
        Intent intent2 = getIntent();
        meno = intent2.getStringExtra("meno");
        vek = intent2.getIntExtra("vek",0);
        Toast.makeText(this,"meno: "+ meno+ " a vek je: "+vek,Toast.LENGTH_LONG).show();

    }
}
