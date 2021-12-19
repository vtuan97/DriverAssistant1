package com.example.driverassistant.ActivityPacket;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.driverassistant.R;

public class DichVuActivity extends AppCompatActivity {
    Button btn_ExitDichVu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dichvu);
        btn_ExitDichVu = findViewById(R.id.btn_exitDichvu);

        btn_ExitDichVu.setOnClickListener(v -> {
            //Toast.makeText(getApplicationContext(), "exit", Toast.LENGTH_LONG).show();
            this.finish();
        });

    }

    @Override
    public void finish() {
        super.finish();
    }
}
