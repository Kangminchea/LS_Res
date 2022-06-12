package com.Please.test;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.TimerTask;
import java.util.Timer;

public class SeatActivity extends AppCompatActivity {
    public static Context context_seat; // context 변수 선언
    public String var;
    private DatabaseReference myRef;

    Button button, button2, button3, button26, button6, button7,button8, button9, button10, button11, button12, button13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button26 = findViewById(R.id.button26);
        button6= findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);


        button .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(1);

            }
        });

        button2. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(3);

            }
        });

        //컴퓨터가 못 버텨서 주석처리.
        //주석처리 풀기 위해선 수정 필요(위에랑 다름)
        /*button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(4);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(5);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(6);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(7);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(9);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(9);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(10);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(11);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(12);
            }
        });*/



        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                databaseReference.child("seat").child("1").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value1 = dataSnapshot.getValue(String.class);
                        if (value1.equals("1")) {
                            button.setBackgroundColor(android.R.color.holo_red_light);
                            button.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
                databaseReference.child("seat").child("2").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value2 = dataSnapshot.getValue(String.class);
                        if (value2.equals("1")) {
                            button2.setBackgroundColor(android.R.color.holo_red_light);

                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });

                databaseReference.child("seat").child("3").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value3 = dataSnapshot.getValue(String.class);
                        if(value3.equals("1")) {
                            button3.setBackgroundColor(android.R.color.holo_red_light);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
                /*databaseReference.child("seat").child("4").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value4 = dataSnapshot.getValue(String.class);
                        if(value4.equals("1")) {
                            button26.setBackgroundColor(android.R.color.holo_red_light);
                            button26.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
                databaseReference.child("seat").child("5").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value5 = dataSnapshot.getValue(String.class);
                        if(value5.equals("1")) {
                            button6.setBackgroundColor(android.R.color.holo_red_light);
                            button6.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
                databaseReference.child("seat").child("6").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value6 = dataSnapshot.getValue(String.class);
                        if(value6.equals("1")) {
                            button7.setBackgroundColor(android.R.color.holo_red_light);
                            button7.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });

                databaseReference.child("seat").child("7").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value7 = dataSnapshot.getValue(String.class);
                        if(value7.equals("1")) {
                            button8.setBackgroundColor(android.R.color.holo_red_light);
                            button8.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
                databaseReference.child("seat").child("8").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value8 = dataSnapshot.getValue(String.class);
                        if(value8.equals("1")) {
                            button9.setBackgroundColor(android.R.color.holo_red_light);
                            button9.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });

                databaseReference.child("seat").child("9").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value3 = dataSnapshot.getValue(String.class);
                        if(value3.equals("1")) {
                            button10.setBackgroundColor(android.R.color.holo_red_light);
                            button10.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
                databaseReference.child("seat").child("10").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value10 = dataSnapshot.getValue(String.class);
                        if(value10.equals("1")) {
                            button11.setBackgroundColor(android.R.color.holo_red_light);
                            button11.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
                databaseReference.child("seat").child("11").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value11 = dataSnapshot.getValue(String.class);
                        if(value11.equals("1")) {
                            button12.setBackgroundColor(android.R.color.holo_red_light);
                            button12.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
                databaseReference.child("seat").child("12").addValueEventListener(new ValueEventListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String value12 = dataSnapshot.getValue(String.class);
                        if(value12.equals("1")) {
                            button13.setBackgroundColor(android.R.color.holo_red_light);
                            button13.setEnabled(false);
                        }


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });*/






            }
        };
        timer.schedule(timerTask,1000,1000);

    }

    @Override
    @Deprecated

    protected Dialog onCreateDialog(int id) {
        if (id == 1) {
            AlertDialog.Builder msgBuilder = new AlertDialog.Builder(SeatActivity.this);
                    msgBuilder.setTitle("A-1좌석을 예약하시겠습니까?")
                    .setMessage("선택하십시오")
                    .setPositiveButton("예", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                            myRef = FirebaseDatabase.getInstance().getReference();
                            databaseReference.child("seat").child("1").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    String value = dataSnapshot.getValue(String.class);


                                    if(value.equals("0")) {
                                        myRef.child("seat").child("1").setValue("1");

                                        String seatNumber = "A-1";
                                        String seatN  = "1";
                                        Intent i = new Intent(SeatActivity.this, WaitActivity.class);
                                        i.putExtra("문자", seatNumber);
                                        i.putExtra("문자2", seatN);
                                        startActivity(i);
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }

                            });
                    }
        })
                            .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(SeatActivity.this, "취소됨", Toast.LENGTH_SHORT).show();
                                }
                            });

            AlertDialog msgDlg = msgBuilder.create();
            msgDlg.show();



    }
        if (id == 2) {
            AlertDialog.Builder msgBuilder = new AlertDialog.Builder(SeatActivity.this);
            msgBuilder.setTitle("A-2좌석을 예약하시겠습니까?")
                    .setMessage("선택하십시오")
                    .setPositiveButton("예", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                            myRef = FirebaseDatabase.getInstance().getReference();
                            databaseReference.child("seat").child("2").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    String value = dataSnapshot.getValue(String.class);


                                    if (value.equals("0")) {
                                        myRef.child("seat").child("2").setValue("1");

                                        String seatNumber = "A-2";
                                        String seatN = "2";
                                        Intent i = new Intent(SeatActivity.this, WaitActivity.class);
                                        i.putExtra("문자", seatNumber);
                                        i.putExtra("문자2", seatN);
                                        startActivity(i);
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }

                            });
                        }
                    })
                    .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(SeatActivity.this, "취소됨", Toast.LENGTH_SHORT).show();
                        }
                    });

            AlertDialog msgDlg = msgBuilder.create();
            msgDlg.show();
        }

        if (id == 3) {
            AlertDialog.Builder msgBuilder = new AlertDialog.Builder(SeatActivity.this);
            msgBuilder.setTitle("A-3좌석을 예약하시겠습니까?")
                    .setMessage("선택하십시오")
                    .setPositiveButton("예", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                            myRef = FirebaseDatabase.getInstance().getReference();
                            databaseReference.child("seat").child("3").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    String value = dataSnapshot.getValue(String.class);


                                    if (value.equals("0")) {
                                        myRef.child("seat").child("3").setValue("1");

                                        String seatNumber = "A-3";
                                        String seatN = "3";
                                        Intent i = new Intent(SeatActivity.this, WaitActivity.class);
                                        i.putExtra("문자", seatNumber);
                                        i.putExtra("문자2", seatN);
                                        startActivity(i);
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }

                            });
                        }
                    })
                    .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(SeatActivity.this, "취소됨", Toast.LENGTH_SHORT).show();
                        }
                    });

            AlertDialog msgDlg = msgBuilder.create();
            msgDlg.show();
        }

        /*if (id == 4) {
            AlertDialog.Builder msgBuilder = new AlertDialog.Builder(SeatActivity.this);
            msgBuilder.setTitle("A-4좌석을 예약하시겠습니까?")
                    .setMessage("선택하십시오")
                    .setPositiveButton("예", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                            myRef = FirebaseDatabase.getInstance().getReference();
                            databaseReference.child("seat").child("4").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    String value = dataSnapshot.getValue(String.class);


                                    if (value.equals("0")) {
                                        myRef.child("seat").child("4").setValue("1");

                                        String seatNumber = "A-4";
                                        String seatN = "4";
                                        setContentView(R.layout.activity_wait);
                                        Intent i = new Intent(SeatActivity.this, WaitActivity.class);
                                        i.putExtra("문자", seatNumber);
                                        i.putExtra("문자2", seatN);
                                        startActivity(i);
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }

                            });
                        }
                    })
                    .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(SeatActivity.this, "취소됨", Toast.LENGTH_SHORT).show();
                        }
                    });

            AlertDialog msgDlg = msgBuilder.create();
            msgDlg.show();
        }

        if (id == 5) {
            AlertDialog.Builder msgBuilder = new AlertDialog.Builder(SeatActivity.this);
            msgBuilder.setTitle("A-5좌석을 예약하시겠습니까?")
                    .setMessage("선택하십시오")
                    .setPositiveButton("예", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                            myRef = FirebaseDatabase.getInstance().getReference();
                            databaseReference.child("seat").child("5").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    String value = dataSnapshot.getValue(String.class);


                                    if (value.equals("0")) {
                                        myRef.child("seat").child("5").setValue("1");

                                        String seatNumber = "A-5";
                                        String seatN = "5";
                                        setContentView(R.layout.activity_wait);
                                        Intent i = new Intent(SeatActivity.this, WaitActivity.class);
                                        i.putExtra("문자", seatNumber);
                                        i.putExtra("문자2", seatN);
                                        startActivity(i);
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }

                            });
                        }
                    })
                    .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(SeatActivity.this, "취소됨", Toast.LENGTH_SHORT).show();
                        }
                    });

            AlertDialog msgDlg = msgBuilder.create();
            msgDlg.show();
        }

        if (id == 6) {
            AlertDialog.Builder msgBuilder = new AlertDialog.Builder(SeatActivity.this);
            msgBuilder.setTitle("A-6좌석을 예약하시겠습니까?")
                    .setMessage("선택하십시오")
                    .setPositiveButton("예", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                            myRef = FirebaseDatabase.getInstance().getReference();
                            databaseReference.child("seat").child("6").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    String value = dataSnapshot.getValue(String.class);


                                    if (value.equals("0")) {
                                        myRef.child("seat").child("6").setValue("1");

                                        String seatNumber = "A-6";
                                        String seatN = "6";
                                        setContentView(R.layout.activity_wait);
                                        Intent i = new Intent(SeatActivity.this, WaitActivity.class);
                                        i.putExtra("문자", seatNumber);
                                        i.putExtra("문자2", seatN);
                                        startActivity(i);
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }

                            });
                        }
                    })
                    .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(SeatActivity.this, "취소됨", Toast.LENGTH_SHORT).show();
                        }
                    });

            AlertDialog msgDlg = msgBuilder.create();
            msgDlg.show();
        }
        if (id == 7) {
            AlertDialog.Builder msgBuilder = new AlertDialog.Builder(SeatActivity.this);
            msgBuilder.setTitle("A-7좌석을 예약하시겠습니까?")
                    .setMessage("선택하십시오")
                    .setPositiveButton("예", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                            myRef = FirebaseDatabase.getInstance().getReference();
                            databaseReference.child("seat").child("7").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    String value = dataSnapshot.getValue(String.class);


                                    if (value.equals("0")) {
                                        myRef.child("seat").child("7").setValue("1");

                                        String seatNumber = "A-7";
                                        String seatN = "7";
                                        setContentView(R.layout.activity_wait);
                                        Intent i = new Intent(SeatActivity.this, WaitActivity.class);
                                        i.putExtra("문자", seatNumber);
                                        i.putExtra("문자2", seatN);
                                        startActivity(i);
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }

                            });
                        }
                    })
                    .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(SeatActivity.this, "취소됨", Toast.LENGTH_SHORT).show();
                        }
                    });

            AlertDialog msgDlg = msgBuilder.create();
            msgDlg.show();
        }
        if (id == 8) {
            AlertDialog.Builder msgBuilder = new AlertDialog.Builder(SeatActivity.this);
            msgBuilder.setTitle("A-8좌석을 예약하시겠습니까?")
                    .setMessage("선택하십시오")
                    .setPositiveButton("예", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
                            myRef = FirebaseDatabase.getInstance().getReference();
                            databaseReference.child("seat").child("3").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    String value = dataSnapshot.getValue(String.class);


                                    if (value.equals("0")) {
                                        myRef.child("seat").child("3").setValue("1");

                                        String seatNumber = "A-3";
                                        String seatN = "3";
                                        setContentView(R.layout.activity_wait);
                                        Intent i = new Intent(SeatActivity.this, WaitActivity.class);
                                        i.putExtra("문자", seatNumber);
                                        i.putExtra("문자2", seatN);
                                        startActivity(i);
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }

                            });
                        }
                    })
                    .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(SeatActivity.this, "취소됨", Toast.LENGTH_SHORT).show();
                        }
                    });

            AlertDialog msgDlg = msgBuilder.create();
            msgDlg.show();
        }*/
        return super.onCreateDialog(id);
    }



}