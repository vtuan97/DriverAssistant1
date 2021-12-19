package com.example.driverassistant.ActivityPacket;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.driverassistant.R;

import java.util.Calendar;

public class DoXangActivity extends AppCompatActivity {
    TextView tv_ChonNgay;
    EditText et_ChonNgay;
    Button btn_ExitDoxang;
    DatePickerDialog.OnDateSetListener setListener;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_xang);

        tv_ChonNgay = findViewById(R.id.tv_NgayDoXang);
        et_ChonNgay = findViewById(R.id.ed_ChonNgayDoXang);

        btn_ExitDoxang = findViewById(R.id.btn_exitDoxang);

        btn_ExitDoxang.setOnClickListener(v -> {
            //Toast.makeText(getApplicationContext(), "Exit", Toast.LENGTH_LONG).show();
            this.finish();
        });


        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        tv_ChonNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        DoXangActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, setListener, year, month, day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();

            }
        });
        setListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                String date = day + "/" + month + "/" + year;
                et_ChonNgay.setText(date);
            }
        };
        et_ChonNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        DoXangActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month + 1;
                        String date = day + "/" + month + "/" + year;
                        et_ChonNgay.setText(date);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
    }
}