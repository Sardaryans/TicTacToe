package com.example.nare.xo;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tf1, tf2;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnnew, btnres;
    boolean bb = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        tf1 = (TextView) findViewById(R.id.play1);
        tf2 = (TextView) findViewById(R.id.play2);
        btnnew = (Button) findViewById(R.id.btnnew);
        btnres = (Button) findViewById(R.id.btnres);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnnew.setOnClickListener(this);
        btnres.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                if (btn1.getText().toString().equals(""))
                    if (bb) {
                        btn1.setTextColor(Color.DKGRAY);
                        btn1.setText("X");
                        bb = false;
                    } else if (!bb) {
                        btn1.setTextColor(Color.WHITE);
                        btn1.setText("O");
                        bb = true;
                    }
                win();
                break;
            case R.id.btn2:
                if (btn2.getText().toString().equals(""))
                    if (bb) {
                        btn2.setTextColor(Color.DKGRAY);
                        btn2.setText("X");
                        bb = false;
                    } else if (!bb) {
                        btn2.setTextColor(Color.WHITE);
                        btn2.setText("O");
                        bb = true;
                    }
                win();
                break;
            case R.id.btn3:
                if (btn3.getText().toString().equals(""))

                    if (bb) {
                        btn3.setTextColor(Color.DKGRAY);
                        btn3.setText("X");
                        bb = false;
                    } else if (!bb) {
                        btn3.setTextColor(Color.WHITE);
                        btn3.setText("O");
                        bb = true;
                    }
                win();
                break;
            case R.id.btn4:
                if (btn4.getText().toString().equals(""))

                    if (bb) {
                        btn4.setTextColor(Color.DKGRAY);
                        btn4.setText("X");
                        bb = false;
                    } else if (!bb) {
                        btn4.setTextColor(Color.WHITE);
                        btn4.setText("O");
                        bb = true;
                    }
                win();
                break;
            case R.id.btn5:
                if (btn5.getText().toString().equals(""))

                    if (bb) {
                        btn5.setTextColor(Color.DKGRAY);
                        btn5.setText("X");
                        bb = false;
                    } else if (!bb) {
                        btn5.setTextColor(Color.WHITE);
                        btn5.setText("O");
                        bb = true;
                    }
                win();
                break;
            case R.id.btn6:
                if (btn6.getText().toString().equals(""))
                    if (bb) {
                        btn6.setTextColor(Color.DKGRAY);
                        btn6.setText("X");
                        bb = false;
                    } else if (!bb) {
                        btn6.setTextColor(Color.WHITE);
                        btn6.setText("O");
                        bb = true;
                    }
                win();
                break;
            case R.id.btn7:
                if (btn7.getText().toString().equals(""))
                    if (bb) {
                        btn7.setTextColor(Color.DKGRAY);
                        btn7.setText("X");
                        bb = false;
                    } else if (!bb) {
                        btn7.setTextColor(Color.WHITE);
                        btn7.setText("O");
                        bb = true;
                    }
                win();
                break;
            case R.id.btn8:
                if (btn8.getText().toString().equals(""))
                    if (bb) {
                        btn8.setTextColor(Color.DKGRAY);
                        btn8.setText("X");
                        bb = false;
                    } else if (!bb) {
                        btn8.setTextColor(Color.WHITE);
                        btn8.setText("O");
                        bb = true;
                    }
                win();
                break;
            case R.id.btn9:
                if (btn9.getText().toString().equals(""))
                    if (bb) {
                        btn9.setTextColor(Color.DKGRAY);
                        btn9.setText("X");
                        bb = false;
                    } else if (!bb) {
                        btn9.setTextColor(Color.WHITE);
                        btn9.setText("O");
                        bb = true;
                    }
                win();
                break;
            case R.id.btnnew:
                clear();
                tf1.setText("0");
                tf2.setText("0");
                Toast.makeText(MainActivity.this, "New Game!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnres:
                clear();
                break;
        }
    }




    public void alert(String a) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("               Player " + a + " Win!!!");

        ImageView img = new ImageView(MainActivity.this);
        img.setImageResource(R.drawable.win1);
        builder.setView(img);

        builder.setNegativeButton("New Game", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                clear();
            }
        });

        builder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void clear() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        bb = true;
    }

    public void win() {
        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")) {
            alert("1");
            int h = Integer.parseInt(tf1.getText().toString()) + 1;
            tf1.setText("" + h);
            clear();
        }
        if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")) {
            alert("1");
            int h = Integer.parseInt(tf1.getText().toString()) + 1;
            tf1.setText("" + h);
            clear();
        }
        if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            alert("1");
            int h = Integer.parseInt(tf1.getText().toString()) + 1;
            tf1.setText("" + h);
            clear();
        }
        if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            alert("1");
            int h = Integer.parseInt(tf1.getText().toString()) + 1;
            tf1.setText("" + h);
            clear();
        }
        if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            alert("1");
            int h = Integer.parseInt(tf1.getText().toString()) + 1;
            tf1.setText("" + h);
            clear();
        }
        if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            alert("1");
            int h = Integer.parseInt(tf1.getText().toString()) + 1;
            tf1.setText("" + h);
            clear();
        }
        if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")) {
            alert("1");
            int h = Integer.parseInt(tf1.getText().toString()) + 1;
            tf1.setText("" + h);
            clear();
        }
        if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            alert("1");
            int h = Integer.parseInt(tf1.getText().toString()) + 1;
            tf1.setText("" + h);
            clear();
        }
        if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")) {
            alert("2");
            int h = Integer.parseInt(tf2.getText().toString()) + 1;
            tf2.setText("" + h);
            clear();
        }
        if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")) {
            alert("2");
            int h = Integer.parseInt(tf2.getText().toString()) + 1;
            tf2.setText("" + h);
            clear();
        }
        if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            alert("2");
            int h = Integer.parseInt(tf2.getText().toString()) + 1;
            tf2.setText("" + h);
            clear();
        }
        if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            alert("2");
            int h = Integer.parseInt(tf2.getText().toString()) + 1;
            tf2.setText("" + h);
            clear();
        }
        if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            alert("2");
            int h = Integer.parseInt(tf2.getText().toString()) + 1;
            tf2.setText("" + h);
            clear();
        }
        if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            alert("2");
            int h = Integer.parseInt(tf2.getText().toString()) + 1;
            tf2.setText("" + h);
            clear();
        }
        if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")) {
            alert("2");
            int h = Integer.parseInt(tf2.getText().toString()) + 1;
            tf2.setText("" + h);
            clear();
        }
        if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            alert("2");
            int h = Integer.parseInt(tf2.getText().toString()) + 1;
            tf2.setText("" + h);
            clear();
        }
    }
}
