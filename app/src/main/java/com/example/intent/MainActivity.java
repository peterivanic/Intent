package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this,SecondAktivity.class);
        intent.putExtra("meno","Jano");
        intent.putExtra("vek",30);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Si v hlavnej aktivite",Toast.LENGTH_SHORT).show();
    }

    public void push(View view){
        startActivity(intent);
    }

}
