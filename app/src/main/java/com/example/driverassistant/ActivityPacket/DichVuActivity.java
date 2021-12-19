package com.example.driverassistant.ActivityPacket;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.driverassistant.R;

public class DichVuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dichvu);
        Button exitBtn = findViewById(R.id.btn_exitDichvu);

        exitBtn.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "exit", Toast.LENGTH_LONG).show();
            this.finish();
        });

    }

    @Override
    public void finish() {
        super.finish();
    }
}
