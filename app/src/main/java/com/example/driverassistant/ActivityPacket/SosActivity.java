package com.example.driverassistant.ActivityPacket;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.driverassistant.R;

public class SosActivity extends AppCompatActivity {
    Button btn_ExitSos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);

        btn_ExitSos = findViewById(R.id.btn_exitsos);

        btn_ExitSos.setOnClickListener(v -> {
            //Toast.makeText(getApplicationContext(), "exit", Toast.LENGTH_LONG).show();
            this.finish();
        });

    }

    @Override
    public void finish() {
        super.finish();
    }
}
