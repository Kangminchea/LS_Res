package com.Please.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class MainActivity extends AppCompatActivity {
    ImageButton ne_btn;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ne_btn = findViewById(R.id.ne_btn);


        ne_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Calendar calendar = new GregorianCalendar();
                int c_hour = calendar.get(Calendar.HOUR_OF_DAY);
                int c_min = calendar.get(calendar.MINUTE);

                if(c_hour <24) { // 실제론 13시 30분까지로 설정해야 하지만 시연을 위해 임의로 조정함.
                    if (c_min < 50) ;
                        Intent i = new Intent(MainActivity.this, SeatActivity.class);
                        startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "급식실 예약은 12시 50분부터 1시 30분까지 가능합니다.", Toast.LENGTH_SHORT). show();
                }










            }


        });
    }
}
