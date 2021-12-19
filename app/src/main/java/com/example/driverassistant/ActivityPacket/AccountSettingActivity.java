package com.example.driverassistant.ActivityPacket;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.driverassistant.R;

public class AccountSettingActivity extends AppCompatActivity {

    Button btn_Settingaccount;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingaccount);

        btn_Settingaccount = findViewById(R.id.btnXacnhansetting);
        btn_Settingaccount.setOnClickListener(v -> {
            //Toast.makeText(getApplicationContext(), "exit", Toast.LENGTH_LONG).show();
            this.finish();
        });
    }

    
}
