package com.Please.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    Button re_btn, tu_btn;
    EditText id_et, pass_et, na_et;
    TextView data;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_register);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        re_btn = findViewById(R.id.re_btn);
        id_et = findViewById(R.id.id_et);
        pass_et = findViewById(R.id.pass_et);
        na_et = findViewById(R.id.na_et);
        tu_btn = findViewById(R.id.tu_btn);

        re_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getNum = id_et.getText().toString();
                String getName = na_et.getText().toString();
                String getPassword = pass_et.getText().toString();

                HashMap result = new HashMap<>();
                result.put("id_et", getNum);
                result.put("na_et", getName);
                result.put("pass_et", getPassword);

                writeData(getNum, getName, getPassword);
            }

        });
        tu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }

        });
    }


    private void writeData(String num, String name, String pass) {
        Data data = new Data(num, name, pass);

        mDatabase.child("id").child(num).setValue(data)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(getApplicationContext(), "회원가입에 성공했습니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), "회원가입에 실패했습니다.", Toast.LENGTH_SHORT).show();
                    }
                });

    }
}




