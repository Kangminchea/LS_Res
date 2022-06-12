package com.Please.test;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    Button lo_btn, o_btn;
    EditText id2_et;
    EditText pass2_et;
    EditText tv;
    int i = 1;
    public static Context context_log;
    public String classN;
    public String classP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        context_log = this;


        lo_btn = findViewById(R.id.lo_btn);
        id2_et = findViewById(R.id.id2_et);
        pass2_et = findViewById(R.id.pass2_et);
        o_btn = findViewById(R.id.o_btn);



        o_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });




        lo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                databaseReference.child("id").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        classN = id2_et.getText().toString();
                        classP = pass2_et.getText().toString();

                        if (dataSnapshot.child(classN).exists()) {
                            String nnn = dataSnapshot.child(classN).child("num").getValue().toString();
                            String ppp = dataSnapshot.child(classN).child("password").getValue().toString();
                            if (nnn.equals(classN)) {
                                if (ppp.equals(classP)) {
                                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                    startActivity(intent);
                                }
                                else {
                                    Toast.makeText(LoginActivity.this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                                }
                            }
                        } else {
                            Toast.makeText(LoginActivity.this, "존재하지 않는 학번입니다.", Toast.LENGTH_SHORT).show();
                        }
                    }


                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }


                });




                }


        });





    }
}