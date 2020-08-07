package com.example.hw7.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.hw7.R;

public class MainActivity extends AppCompatActivity {
    private Button btnRed,btnOrange,btnYellow,btnGreen,btnBlue,btnIndigo,btnViolet,
            btnRed2,btnOrange2,btnYellow2,btnGreen2,btnBlue2,btnIndigo2,btnViolet2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();

    }
    private void findViews(){
        btnRed=findViewById(R.id.btn_red);
        btnOrange=findViewById(R.id.btn_orange);
        btnYellow=findViewById(R.id.btn_yellow);
        btnGreen=findViewById(R.id.btn_green);
        btnBlue=findViewById(R.id.btn_blue);
        btnIndigo=findViewById(R.id.btn_indigo);
        btnViolet=findViewById(R.id.btn_violet);
        btnRed2=findViewById(R.id.btn_red2);
        btnOrange2=findViewById(R.id.btn_orange2);
        btnYellow2=findViewById(R.id.btn_yellow2);
        btnGreen2=findViewById(R.id.btn_green2);
        btnBlue2=findViewById(R.id.btn_blue2);
        btnIndigo2=findViewById(R.id.btn_indigo2);
        btnViolet2=findViewById(R.id.btn_violet2);

    }
    private void setListeners(){
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnRed.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnOrange.setText(btnRed.getText());
                        btnYellow.setText(btnRed.getText());
                        btnGreen.setText(btnRed.getText());
                        btnBlue.setText(btnRed.getText());
                        btnIndigo.setText(btnRed.getText());
                        btnViolet.setText(btnRed.getText());
                        btnOrange2.setText(btnRed.getText());
                        btnYellow2.setText(btnRed.getText());
                        btnGreen2.setText(btnRed.getText());
                        btnBlue2.setText(btnRed.getText());
                        btnIndigo2.setText(btnRed.getText());
                        btnViolet2.setText(btnRed.getText());


                    }
                },5000);

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnOrange.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnOrange.getText());
                        btnViolet.setText(btnOrange.getText());
                        btnYellow.setText(btnOrange.getText());
                        btnGreen.setText(btnOrange.getText());
                        btnBlue.setText(btnOrange.getText());
                        btnIndigo.setText(btnOrange.getText());
                        btnRed2.setText(btnOrange.getText());
                        btnViolet2.setText(btnOrange.getText());
                        btnYellow2.setText(btnOrange.getText());
                        btnGreen2.setText(btnOrange.getText());
                        btnBlue2.setText(btnOrange.getText());
                        btnIndigo2.setText(btnOrange.getText());


                    }
                },2000);
            }
        });
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnYellow.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnYellow.getText());
                        btnOrange.setText(btnYellow.getText());
                        btnViolet.setText(btnYellow.getText());
                        btnGreen.setText(btnYellow.getText());
                        btnBlue.setText(btnYellow.getText());
                        btnIndigo.setText(btnYellow.getText());
                        btnRed2.setText(btnYellow.getText());
                        btnOrange2.setText(btnYellow.getText());
                        btnViolet2.setText(btnYellow.getText());
                        btnGreen2.setText(btnYellow.getText());
                        btnBlue2.setText(btnYellow.getText());
                        btnIndigo2.setText(btnYellow.getText());


                    }
                },5000);
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnGreen.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnGreen.getText());
                        btnOrange.setText(btnGreen.getText());
                        btnYellow.setText(btnGreen.getText());
                        btnViolet.setText(btnGreen.getText());
                        btnBlue.setText(btnGreen.getText());
                        btnIndigo.setText(btnGreen.getText());
                        btnRed2.setText(btnGreen2.getText());
                        btnOrange2.setText(btnGreen2.getText());
                        btnYellow2.setText(btnGreen2.getText());
                        btnViolet2.setText(btnGreen2.getText());
                        btnBlue2.setText(btnGreen2.getText());
                        btnIndigo2.setText(btnGreen2.getText());


                    }
                },5000);

            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnBlue.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnBlue.getText());
                        btnOrange.setText(btnBlue.getText());
                        btnYellow.setText(btnBlue.getText());
                        btnViolet.setText(btnBlue.getText());
                        btnGreen.setText(btnBlue.getText());
                        btnIndigo.setText(btnBlue.getText());
                        btnRed2.setText(btnBlue2.getText());
                        btnOrange2.setText(btnBlue2.getText());
                        btnYellow2.setText(btnBlue2.getText());
                        btnViolet2.setText(btnBlue2.getText());
                        btnGreen2.setText(btnBlue2.getText());
                        btnIndigo2.setText(btnBlue2.getText());


                    }
                },5000);

            }
        });
        btnIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnIndigo.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnIndigo.getText());
                        btnOrange.setText(btnIndigo.getText());
                        btnYellow.setText(btnIndigo.getText());
                        btnGreen.setText(btnIndigo.getText());
                        btnBlue.setText(btnIndigo.getText());
                        btnViolet.setText(btnIndigo.getText());
                        btnRed2.setText(btnIndigo2.getText());
                        btnOrange2.setText(btnIndigo2.getText());
                        btnYellow2.setText(btnIndigo2.getText());
                        btnGreen2.setText(btnIndigo2.getText());
                        btnBlue2.setText(btnIndigo2.getText());
                        btnViolet2.setText(btnIndigo2.getText());



                    }
                },5000);

            }
        });

        btnViolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnViolet.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnViolet.getText());
                        btnOrange.setText(btnViolet.getText());
                        btnYellow.setText(btnViolet.getText());
                        btnGreen.setText(btnViolet.getText());
                        btnBlue.setText(btnViolet.getText());
                        btnIndigo.setText(btnViolet.getText());
                        btnRed2.setText(btnViolet2.getText());
                        btnOrange2.setText(btnViolet2.getText());
                        btnYellow2.setText(btnViolet2.getText());
                        btnGreen2.setText(btnViolet2.getText());
                        btnBlue2.setText(btnViolet2.getText());
                        btnIndigo2.setText(btnViolet2.getText());

                    }
                },5000);
            }
        });

        btnRed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnRed2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnOrange.setText(btnRed.getText());
                        btnYellow.setText(btnRed.getText());
                        btnGreen.setText(btnRed.getText());
                        btnBlue.setText(btnRed.getText());
                        btnIndigo.setText(btnRed.getText());
                        btnViolet.setText(btnRed.getText());
                        btnOrange2.setText(btnRed.getText());
                        btnYellow2.setText(btnRed.getText());
                        btnGreen2.setText(btnRed.getText());
                        btnBlue2.setText(btnRed.getText());
                        btnIndigo2.setText(btnRed.getText());
                        btnViolet2.setText(btnRed.getText());


                    }
                },5000);

            }
        });
        btnOrange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnOrange2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnOrange.getText());
                        btnViolet.setText(btnOrange.getText());
                        btnYellow.setText(btnOrange.getText());
                        btnGreen.setText(btnOrange.getText());
                        btnBlue.setText(btnOrange.getText());
                        btnIndigo.setText(btnOrange.getText());
                        btnRed2.setText(btnOrange.getText());
                        btnViolet2.setText(btnOrange.getText());
                        btnYellow2.setText(btnOrange.getText());
                        btnGreen2.setText(btnOrange.getText());
                        btnBlue2.setText(btnOrange.getText());
                        btnIndigo2.setText(btnOrange.getText());


                    }
                },2000);
            }
        });
        btnYellow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnYellow2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnYellow.getText());
                        btnOrange.setText(btnYellow.getText());
                        btnViolet.setText(btnYellow.getText());
                        btnGreen.setText(btnYellow.getText());
                        btnBlue.setText(btnYellow.getText());
                        btnIndigo.setText(btnYellow.getText());
                        btnRed2.setText(btnYellow.getText());
                        btnOrange2.setText(btnYellow.getText());
                        btnViolet2.setText(btnYellow.getText());
                        btnGreen2.setText(btnYellow.getText());
                        btnBlue2.setText(btnYellow.getText());
                        btnIndigo2.setText(btnYellow.getText());


                    }
                },5000);
            }
        });
        btnGreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnGreen2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnGreen.getText());
                        btnOrange.setText(btnGreen.getText());
                        btnYellow.setText(btnGreen.getText());
                        btnViolet.setText(btnGreen.getText());
                        btnBlue.setText(btnGreen.getText());
                        btnIndigo.setText(btnGreen.getText());
                        btnRed2.setText(btnGreen2.getText());
                        btnOrange2.setText(btnGreen2.getText());
                        btnYellow2.setText(btnGreen2.getText());
                        btnViolet2.setText(btnGreen2.getText());
                        btnBlue2.setText(btnGreen2.getText());
                        btnIndigo2.setText(btnGreen2.getText());


                    }
                },5000);

            }
        });
        btnBlue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnBlue2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnBlue.getText());
                        btnOrange.setText(btnBlue.getText());
                        btnYellow.setText(btnBlue.getText());
                        btnViolet.setText(btnBlue.getText());
                        btnGreen.setText(btnBlue.getText());
                        btnIndigo.setText(btnBlue.getText());
                        btnRed2.setText(btnBlue2.getText());
                        btnOrange2.setText(btnBlue2.getText());
                        btnYellow2.setText(btnBlue2.getText());
                        btnViolet2.setText(btnBlue2.getText());
                        btnGreen2.setText(btnBlue2.getText());
                        btnIndigo2.setText(btnBlue2.getText());


                    }
                },5000);

            }
        });
        btnIndigo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnIndigo2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnIndigo.getText());
                        btnOrange.setText(btnIndigo.getText());
                        btnYellow.setText(btnIndigo.getText());
                        btnGreen.setText(btnIndigo.getText());
                        btnBlue.setText(btnIndigo.getText());
                        btnViolet.setText(btnIndigo.getText());
                        btnRed2.setText(btnIndigo2.getText());
                        btnOrange2.setText(btnIndigo2.getText());
                        btnYellow2.setText(btnIndigo2.getText());
                        btnGreen2.setText(btnIndigo2.getText());
                        btnBlue2.setText(btnIndigo2.getText());
                        btnViolet2.setText(btnIndigo2.getText());


                    }
                },5000);

            }
        });
        btnViolet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn=(Button) view;
                btn.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.GONE);
                btnViolet2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnRed.setText(btnViolet.getText());
                        btnOrange.setText(btnViolet.getText());
                        btnYellow.setText(btnViolet.getText());
                        btnGreen.setText(btnViolet.getText());
                        btnBlue.setText(btnViolet.getText());
                        btnIndigo.setText(btnViolet.getText());
                        btnRed2.setText(btnViolet2.getText());
                        btnOrange2.setText(btnViolet2.getText());
                        btnYellow2.setText(btnViolet2.getText());
                        btnGreen2.setText(btnViolet2.getText());
                        btnBlue2.setText(btnViolet2.getText());
                        btnIndigo2.setText(btnViolet2.getText());


                    }
                },5000);
            }
        });


    }

}