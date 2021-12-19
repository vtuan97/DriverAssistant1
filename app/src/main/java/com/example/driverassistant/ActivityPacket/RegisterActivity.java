package com.example.driverassistant.ActivityPacket;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.driverassistant.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText pass,email;
    private Button btnRegister;
    private FirebaseAuth fAuth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fAuth = FirebaseAuth.getInstance();

        init();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

    }
    private void init(){
        email = findViewById(R.id.email1);
        pass = findViewById(R.id.password1);
        btnRegister = findViewById(R.id.btnRegister1);
    }

    private void register() {
        String Email,Pass;
        Email = email.getText().toString();
        Pass = pass.getText().toString();
        if(TextUtils.isEmpty(Email)){
            Toast.makeText(this,"Vui long nhap email",Toast.LENGTH_LONG).show();
            return;
        }if(TextUtils.isEmpty(Pass)){
            Toast.makeText(this,"Vui long nhap pass",Toast.LENGTH_LONG).show();
            return;
        }
        fAuth.createUserWithEmailAndPassword(Email,Pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Đăng kí thành công",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent (RegisterActivity.this,MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(),"Đăng kí không thành công",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
