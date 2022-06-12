package com.Please.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class WaitActivity extends AppCompatActivity {
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference myRef_1_1;

    TextView sn_tv;
    Button can_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);

        String sub_seatNumber;
        String sub_seatN;
        String hhh;
        String sub_classNn = ((LoginActivity) LoginActivity.context_log).classN;
        String sub_classPp = ((LoginActivity) LoginActivity.context_log).classP;

        Intent intent = getIntent();
        sub_seatNumber = intent.getStringExtra("문자");
        sub_seatN = intent.getStringExtra("문자2");
        sub_classNn = intent.getStringExtra("학번");
        sub_classPp = intent.getStringExtra("비번");

        can_btn=findViewById(R.id.can_btn);
        sn_tv=findViewById(R.id.sn_tv);
        sn_tv.setText(sub_seatNumber);



        can_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (sub_seatN.equals("1")) {
                    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                    myRef_1_1 = FirebaseDatabase.getInstance().getReference();
                    databaseReference.child("seat").child("1").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            String value = dataSnapshot.getValue(String.class);

                            if (value.equals("1")) {
                                myRef_1_1.child("seat").child("1").setValue("0");
                                moveTaskToBack(true); // 태스크를 백그라운드로 이동
                                finishAndRemoveTask(); // 액티비티 종료 + 태스크 리스트에서 지우기
                                android.os.Process.killProcess(android.os.Process.myPid()); // 앱 프로세스 종

                            }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }

                    });
                }
                if (sub_seatN.equals("2")) {
                    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                    myRef_1_1 = FirebaseDatabase.getInstance().getReference();
                    databaseReference.child("seat").child("2").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            String value = dataSnapshot.getValue(String.class);

                            if (value.equals("1")) {
                                myRef_1_1.child("seat").child("2").setValue("0");

                                setContentView(R.layout.activity_main);
                                moveTaskToBack(true); // 태스크를 백그라운드로 이동
                                finishAndRemoveTask(); // 액티비티 종료 + 태스크 리스트에서 지우기
                                android.os.Process.killProcess(android.os.Process.myPid()); // 앱 프로세스 종
                            } else {
                                Toast.makeText(WaitActivity.this, "오류가 발생했습니다.", Toast.LENGTH_SHORT).show();
                            }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }

                    });
                }
                if (sub_seatN.equals("3")) {
                    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                    myRef_1_1 = FirebaseDatabase.getInstance().getReference();
                    databaseReference.child("seat").child("3").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            String value = dataSnapshot.getValue(String.class);

                            if (value.equals("1")) {
                                myRef_1_1.child("seat").child("3").setValue("0");

                                setContentView(R.layout.activity_main);
                                moveTaskToBack(true); // 태스크를 백그라운드로 이동
                                finishAndRemoveTask(); // 액티비티 종료 + 태스크 리스트에서 지우기
                                android.os.Process.killProcess(android.os.Process.myPid()); // 앱 프로세스 종
                            }else {
                                Toast.makeText(WaitActivity.this, "오류가 발생했습니다.", Toast.LENGTH_SHORT).show();
                            }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }

                    });
                }
            }

        });
    }
}