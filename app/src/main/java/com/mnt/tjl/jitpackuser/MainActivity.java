package com.mnt.tjl.jitpackuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.tjltech.tjlib.Calcuclator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvResult = findViewById(R.id.tvResult);
        tvResult.setText(new Calcuclator().add(1,2) + "");
    }
}